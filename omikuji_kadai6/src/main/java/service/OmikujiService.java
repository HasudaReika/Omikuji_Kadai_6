package service;
/*
 * サービスクラス
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalEntity;

import omikuji6.dbflute.exbhv.FortuneMasterBhv;
import omikuji6.dbflute.exbhv.OmikujiBhv;
import omikuji6.dbflute.exbhv.PostCodeDataBhv;
import omikuji6.dbflute.exbhv.ResultBhv;
import omikuji6.dbflute.exbhv.ShippingBhv;
import omikuji6.dbflute.exbhv.pmbean.ByAddressPmb;
import omikuji6.dbflute.exbhv.pmbean.ResultPastSixMonthsPmb;
import omikuji6.dbflute.exbhv.pmbean.UnseiPastSixMonthsPmb;
import omikuji6.dbflute.exbhv.pmbean.UnseiTodayPmb;
import omikuji6.dbflute.exentity.Omikuji;
import omikuji6.dbflute.exentity.PostCodeData;
import omikuji6.dbflute.exentity.Result;
import omikuji6.dbflute.exentity.Shipping;
import omikuji6.dbflute.exentity.customize.UnseiPastSixMonths;
import omikuji6.dbflute.exentity.customize.UnseiToday;
import omikuji6.dto.OmikujiResult;

public class OmikujiService {

	@Resource
	protected OmikujiBhv omikujiBhv;
	@Resource
	protected ResultBhv resultBhv;
	@Resource
	protected FortuneMasterBhv fortuneMasterBhv;
	@Resource
	protected PostCodeDataBhv postCodeDataBhv;
	@Resource
	protected ShippingBhv shippingBhv;

	/**
	 * DBにおみくじが格納されているかチェック
	 * @return DBにおみくじが格納されている場合はfalse、そうでない場合はtrueを返す
	 */
	public boolean checkDB() {
		//レコードの数を検索
		int count = omikujiBhv.selectCount(cb -> {
		});
		//1以上であればfalse
		if (count > 0) {
			System.out.println("テーブルにおみくじが格納されています");
			return false;
		} else {
			//なければtrue
			System.out.println("テーブルにおみくじを格納します");
			return true;
		}

	}

	/**
	 * DBにおみくじを格納
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void importOmikujiFromCsv() throws FileNotFoundException, IOException {
		LocalDate today = LocalDate.now();
		//csvを読み込む
		try (
				InputStream is = getClass().getClassLoader().getResourceAsStream("omikuji.csv");
				BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {
			String line;
			//csvを1行ずつ読み込む
			while ((line = br.readLine()) != null) {
				//「,」で区切る
				String[] values = line.split(",");
				String fortuneName = values[0];
				String negaigoto = values[1];
				String akinai = values[2];
				String gakumon = values[3];

				//fortuneNameの値によってfortuneCodeの値を決定
				int fortuneCode = 0;
				switch (fortuneName) {
				case "大吉":
					fortuneCode = 1;
					break;
				case "中吉":
					fortuneCode = 2;
					break;
				case "小吉":
					fortuneCode = 3;
					break;
				case "末吉":
					fortuneCode = 4;
					break;
				case "吉":
					fortuneCode = 5;
					break;
				case "凶":
					fortuneCode = 6;
					break;

				default:
					break;
				}
				Omikuji omikuji = new Omikuji();
				omikuji.setFortuneCode(fortuneCode);
				omikuji.setNegaigoto(negaigoto);
				omikuji.setAkinai(akinai);
				omikuji.setGakumon(gakumon);
				omikuji.setCreatedBy("蓮田");
				omikuji.setCreatedDate(today);
				omikuji.setUpdatedBy("蓮田");
				omikuji.setUpdatedDate(today);
				//レコードを登録
				omikujiBhv.insert(omikuji);

			}

		}

	}

	/**
	 * 占った日と誕生日が一致する結果がテーブルに存在するかチェック
	 * テーブルに存在する場合はそのおみくじ結果を取得
	 * @param fortuneTellingDate　占い日
	 * @param birthday　誕生日
	 * @return　結果テーブルにある場合はそのおみくじを取得
	 */
	public Optional<OmikujiResult> getOmikujiFromResult(LocalDate fortuneTellingDate, LocalDate birthday) {

		//一件検索
		OptionalEntity<Result> optEntity = resultBhv.selectEntity(cb -> {
			//ResultとテーブルOmikujiテーブル、さらにFortuneMasterテーブルを結合
			cb.setupSelect_Omikuji().withFortuneMaster();
			//条件を絞り込み
			cb.query().setFortuneTellingDate_Equal(fortuneTellingDate);
			cb.query().setBirthday_Equal(birthday);
		});

		//テーブルにあった場合
		if (optEntity.isPresent()) {
			Result result = optEntity.get();
			Omikuji omikuji = result.getOmikuji().get();
			//fortuneNameをfortuneMasterテーブルから取得
			String fortuneName = omikuji.getFortuneMaster().get().getFortuneName();
			//dtoに値を代入
			OmikujiResult omikujiDto = new OmikujiResult(result.getFortuneTellingDate(), fortuneName,
					omikuji.getNegaigoto(),
					omikuji.getAkinai(),
					omikuji.getGakumon(), omikuji.getOmikujiCode().toString());

			return Optional.ofNullable(omikujiDto);
		} else {
			return Optional.empty();
		}
	}

	/**
	 * DBからおみくじをランダムに取得
	 * @return　ランダムに取得したおみくじを返す
	 */
	public Optional<OmikujiResult> getRandomOmikuji() {

		//omikujiテーブルのレコード数を表す変数
		int omikujiCount = 0;

		//Omikujiテーブルのレコード数を検索　select count(*)
		omikujiCount = omikujiBhv.selectCount(cb -> {
		});

		//omikujiCountからランダムに数字を取得し、おみくじコードとする
		Random random = new Random();
		int omikujiCode = random.nextInt(omikujiCount) + 1;

		List<Omikuji> randomOmikuji = omikujiBhv.selectList(cb -> {
			//OmikujiテーブルにFortuneMasterテーブルを結合
			cb.setupSelect_FortuneMaster();
			//取得するカラムを指定
			cb.specify().columnOmikujiCode();
			cb.specify().specifyFortuneMaster().columnFortuneName();
			cb.specify().columnNegaigoto();
			cb.specify().columnAkinai();
			cb.specify().columnGakumon();
			cb.query().queryFortuneMaster().addOrderBy_FortuneName_Asc();
			cb.query().setOmikujiCode_Equal(omikujiCode);
		});

		//omikujiに代入
		Omikuji omikuji = randomOmikuji.get(0);
		//fortuneNameを取得
		String fortuneName = omikuji.getFortuneMaster().get().getFortuneName();
		//dtoに値を代入
		OmikujiResult randomOmikujiDto = new OmikujiResult(LocalDate.now(), fortuneName,
				omikuji.getNegaigoto(), omikuji.getAkinai(), omikuji.getGakumon(), omikuji.getOmikujiCode().toString());

		return Optional.ofNullable(randomOmikujiDto);

	}

	/**
	 * 結果をDBに登録
	 * @return resultCodeを返す
	 */
	public Integer setResult(LocalDate fortuneTellingDate, LocalDate birthday, Optional<OmikujiResult> newOmikuji) {
		Result result = new Result();

		//値をセット
		result.setFortuneTellingDate(fortuneTellingDate);
		result.setBirthday(birthday);
		result.setOmikujiCode((Integer.valueOf(newOmikuji.get().getOmikujiCode())));
		result.setUpdatedBy("蓮田");
		result.setUpdatedDate(fortuneTellingDate);
		result.setCreatedBy("蓮田");
		result.setCreatedDate(fortuneTellingDate);

		//resultテーブルに登録
		resultBhv.insert(result);
		//おみくじ結果コードを取得
		Integer resultCode = result.getResultCode();
		return resultCode;
	}

	/**
	 * 過去半年の運勢の割合を抽出
	 * @return　Map<運勢, 数>
	 */
	public Map<String, Long> getUnseiPastSixMonths() {

		//６ヶ月前の日付を入れる変数
		Calendar sixMonthsAgo = null;
		//今日の日付
		Calendar today = Calendar.getInstance();
		//今日の日付から６ヶ月引いた日付
		today.add(Calendar.MONTH, -6);
		//sixMonthAgoに計算後の日付を代入
		sixMonthsAgo = today;
		//Calender型からsqlDate型に変換
		Date sixMonths = new Date(sixMonthsAgo.getTime().getTime());
		//LocalDate型に変換
		LocalDate sixMonthsDate = sixMonths.toLocalDate();

		//pmbに値を設定
		UnseiPastSixMonthsPmb pmb = new UnseiPastSixMonthsPmb();
		pmb.setSixMonthsAgo(sixMonthsDate);

		//外だしSQLを実行
		List<UnseiPastSixMonths> list = resultBhv.outsideSql().traditionalStyle()
				.selectList("sql/omikuji/getUnseiPastSixMonths.sql", pmb, UnseiPastSixMonths.class);

		//listからmapに変換
		Map<String, Long> resultPastSixMonths = new HashMap<String, Long>();
		for (UnseiPastSixMonths unsei : list) {
			resultPastSixMonths.put(unsei.getFortuneName(), unsei.getCount());
		}

		return resultPastSixMonths;

	}

	/**
	 * 本日の運勢の割合を抽出
	 * @return Map<運勢, 数>
	 */
	public Map<String, Long> getUnseiToday() {
		UnseiTodayPmb pmb = new UnseiTodayPmb();

		//外だしSQLを実行
		List<UnseiToday> list = resultBhv.outsideSql().traditionalStyle().selectList("sql/omikuji/getUnseiToday.sql",
				pmb, UnseiToday.class);

		//listからmapに変換
		Map<String, Long> resultToday = new HashMap<String, Long>();
		for (UnseiToday unsei : list) {
			resultToday.put(unsei.getFortuneName(), unsei.getCount());
		}

		return resultToday;

	}

	/**
	 * 過去半年のおみくじの結果を抽出
	 * @param birthday
	 * @return 過去半年の結果のリスト
	 */
	public List<OmikujiResult> getResultPastSixMonths(LocalDate birthday) {

		//６ヶ月前の日付を入れる変数
		Calendar sixMonthsAgo = null;
		//今日の日付
		Calendar today = Calendar.getInstance();
		//今日の日付から６ヶ月引いた日付
		today.add(Calendar.MONTH, -6);
		//sixMonthAgoに計算後の日付を代入
		sixMonthsAgo = today;
		//Calender型からsqlDate型に変換
		Date sixMonths = new Date(sixMonthsAgo.getTime().getTime());
		//LocalDate型に変換
		LocalDate sixMonthsDate = sixMonths.toLocalDate();

		//pmbに値を設定
		ResultPastSixMonthsPmb pmb = new ResultPastSixMonthsPmb();
		pmb.setBirthday(birthday);
		pmb.setSixMonthsAgo(sixMonthsDate);

		//外だしSQLを実行
		List<OmikujiResult> list = resultBhv.outsideSql()
				.traditionalStyle()
				.selectList("sql/omikuji/getResultPastSixMonths.sql", pmb, OmikujiResult.class);

		return list;

	}

	/**
	 * 郵便番号から住所を取得
	 * @param postCode　郵便番号
	 * @return 郵便番号に紐づく住所
	 */
	public OptionalEntity<PostCodeData> getByPostCode(String postCode) {
		//入力された郵便番号が一致する県、市、地名を取得
		OptionalEntity<PostCodeData> optAddress = postCodeDataBhv.selectEntity(cb -> {
			cb.specify().columnPrefecture();
			cb.specify().columnCity();
			cb.specify().columnTown();
			cb.query().setPostCode_Equal(postCode);
		});
		//住所を返す
		return optAddress;
	}

	/**
	 * 住所から郵便番号を取得
	 * @param prefecture　県
	 * @param city　市
	 * @param town　地名
	 * @return　住所に紐づく郵便番号
	 */
	public OptionalEntity<PostCodeData> getByAddress(String address) {
		//pmbを設定
		ByAddressPmb pmb = new ByAddressPmb();
		pmb.setAddress(address);

		//外だしSQLを実行
		OptionalEntity<PostCodeData> optPostCode = postCodeDataBhv.outsideSql().traditionalStyle()
				.selectEntity("sql/omikuji/getByAddress.sql", pmb, PostCodeData.class);

		//郵便番号を返す
		return optPostCode;

	}

	/**
	 * 郵送先情報をshippingテーブルに登録
	 * @param resultCode　おみくじ結果コード
	 * @param form　郵送先登録画面で入力された情報
	 */
	public void recordShipping(Integer resultCode, List<String> list) {
		Shipping shipping = new Shipping();
		//値をセット
		shipping.setResultCode(resultCode);
		shipping.setPostCode(list.get(0));
		shipping.setAddress(list.get(1));
		shipping.setName(list.get(2));
		shipping.setPhone(list.get(3));
		shipping.setMail(list.get(4));
		shipping.setUpdatedDate(LocalDate.now());

		//shippingテーブルに登録
		shippingBhv.insert(shipping);
	}

}
