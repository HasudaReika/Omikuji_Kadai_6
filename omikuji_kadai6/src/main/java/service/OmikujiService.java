package service;
/*
 * サービスクラス
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;

import omikuji6.dbflute.exbhv.FortuneMasterBhv;
import omikuji6.dbflute.exbhv.OmikujiBhv;
import omikuji6.dbflute.exbhv.ResultBhv;
import omikuji6.dbflute.exbhv.pmbean.ResultPastSixMonthsPmb;
import omikuji6.dbflute.exbhv.pmbean.UnseiPastSixMonthsPmb;
import omikuji6.dbflute.exbhv.pmbean.UnseiTodayPmb;
import omikuji6.dbflute.exentity.Omikuji;
import omikuji6.dbflute.exentity.Result;
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
			return false;
		} else {
			//なければtrue
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
		String csv = "omikuji.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(csv))) {
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
				omikuji.setUpdatedBy("蓮田");
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
					omikuji.getGakumon());

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
		//おみくじオブジェクトを作成
		OptionalEntity<Omikuji> randomOmikuji = OptionalEntity.empty();

		//omikujiテーブルのレコード数を表す変数
		int omikujiCount = 0;

		//Omikujiテーブルのレコード数を検索　select count(*)
		omikujiCount = omikujiBhv.selectCount(cb -> {
			//OmikujiテーブルにFortuneMasterテーブルを結合
			cb.setupSelect_FortuneMaster();
			//取得するカラムを指定
			cb.specify().columnOmikujiCode();
			cb.specify().specifyFortuneMaster().columnFortuneName();
			cb.specify().columnNegaigoto();
			cb.specify().columnAkinai();
			cb.specify().columnGakumon();

		});

		//omikujiCountからランダムに数字を取得し、おみくじコードとする
		Random random = new Random();
		int omikujiCode = random.nextInt(omikujiCount) + 1;

		//主キーによる一件検索をし、randomOmikujiに代入
		randomOmikuji = omikujiBhv.selectByPK(omikujiCode);

		Omikuji omikuji = randomOmikuji.get();
		//fortuneNameを取得
		String fortuneName = omikuji.getFortuneMaster().get().getFortuneName();
		//dtoに値を代入
		OmikujiResult randomOmikujiDto = new OmikujiResult(LocalDate.now(), fortuneName,
				omikuji.getNegaigoto(), omikuji.getAkinai(), omikuji.getGakumon());

		return Optional.ofNullable(randomOmikujiDto);

	}

	/**
	 * 結果をDBに登録
	 */
	public void setResult(LocalDate fortuneTellingDate, LocalDate birthday, Optional<OmikujiResult> newOmikuji) {
		Result result = new Result();

		//アクションクラス書き終わってから書く
		result.setFortuneTellingDate(fortuneTellingDate);
		result.setBirthday(birthday);
		result.setOmikujiCode((Integer.valueOf(newOmikuji.get().getOmikujiCode())));
		result.setUpdatedBy("蓮田");
		result.setUpdatedDate(newOmikuji.get().getUpdatedDate());
		result.setCreatedBy("蓮田");
		result.setCreatedDate(newOmikuji.get().getCreatedDate());

		//resultテーブルに登録
		resultBhv.insert(result);

	}

	/**
	 * 過去半年の運勢の割合を抽出
	 * @return
	 */
	public List<UnseiPastSixMonths> getUnseiPastSixMonths() {

		//６ヶ月前の日付を入れる変数
		Calendar sixMonthsAgo = null;
		//今日の日付
		Calendar today = Calendar.getInstance();
		//今日の日付から６ヶ月引いた日付
		today.add(Calendar.MONTH, -6);
		//sixMonthAgoに計算後の日付を代入
		sixMonthsAgo = today;

		//pmbに値を設定
		UnseiPastSixMonthsPmb pmb = new UnseiPastSixMonthsPmb();
		pmb.setSetSixMonthsAgo(sixMonthsAgo);

		//外だしSQLを実行
		List<UnseiPastSixMonths> list = resultBhv.outsideSql().traditionalStyle()
				.selectList("sql/omikuji/getUnseiPastSixMonths.sql", pmb, UnseiPastSixMonths.class);

		return list;

	}

	/**
	 * 本日の運勢の割合を抽出
	 * @return
	 */
	public List<UnseiToday> getUnseiToday() {
		UnseiTodayPmb pmb = new UnseiTodayPmb();

		//外だしSQLを実行
		List<UnseiToday> list = resultBhv.outsideSql().traditionalStyle().selectList("sql/omikuji/getUnseiToday.sql",
				pmb, UnseiToday.class);

		return list;

	}

	/**
	 * 過去半年のおみくじの結果を抽出
	 * @param birthday
	 * @return
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

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		String birthdayString = birthday.format(formatter);
		String sixMonthAgoString = sixMonthsDate.format(formatter);

		//pmbに値を設定
		ResultPastSixMonthsPmb pmb = new ResultPastSixMonthsPmb();
		pmb.setBirthday(birthdayString);
		pmb.setSixMonthsAgo(sixMonthAgoString);

		//外だしSQLを実行
		ListResultBean<OmikujiResult> list = resultBhv.outsideSql().traditionalStyle()
				.selectList("sql/omikuji/getResultPastSixMonths.sql", pmb, OmikujiResult.class);

		return list;

	}

}
