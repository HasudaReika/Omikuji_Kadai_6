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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.dbflute.bhv.readable.CBCall;
import org.dbflute.optional.OptionalEntity;

import omikuji6.dbflute.cbean.OmikujiCB;
import omikuji6.dbflute.cbean.ResultCB;
import omikuji6.dbflute.exbhv.FortuneMasterBhv;
import omikuji6.dbflute.exbhv.OmikujiBhv;
import omikuji6.dbflute.exbhv.ResultBhv;
import omikuji6.dbflute.exbhv.pmbean.UnseiPastSixMonthsPmb;
import omikuji6.dbflute.exentity.Omikuji;
import omikuji6.dbflute.exentity.Result;
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
		int count = omikujiBhv.selectCount(null);
		//1以上であればfalse
		if (count > 0) {
			return false;
		} else {
			//なければtrue
			return true;
		}

	}

	//おみくじをDBを格納
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

	//占った日と誕生日が一致する結果がテーブルに存在するかチェック
	//テーブルに存在する場合はそのおみくじ結果を取得
	public OptionalEntity<Omikuji> getOmikujiFromResult(LocalDate fortuneTellingDate, LocalDate birthday) {
		//ConditionBean
		ResultCB cb = new ResultCB();

		//ResultとテーブルOmikujiテーブル、さらにFortuneMasterテーブルを結合
		cb.setupSelect_Omikuji().withFortuneMaster();

		//結合先のテーブルでカラムを占い日と誕生日に絞り込み
		cb.specify().columnFortuneTellingDate();
		cb.specify().columnBirthday();

		//一件検索
		@SuppressWarnings("unchecked")
		OptionalEntity<Result> optEntity = resultBhv.selectEntity((CBCall<ResultCB>) cb);

		if (optEntity.isPresent()) {
			Result result = optEntity.get();
			return result.getOmikuji();
		} else {
			return OptionalEntity.empty();
		}
	}

	//DBからおみくじをランダムに取得
	public OptionalEntity<Omikuji> getRandomOmikuji() {
		//おみくじオブジェクトを作成
		OptionalEntity<Omikuji> randomOmikuji = null;
		//ConditionBean
		OmikujiCB cb = new OmikujiCB();
		//omikujiテーブルのレコード数を表す変数
		int omikujiCount = 0;

		//OmikujiテーブルにFortuneMasterテーブルを結合
		cb.setupSelect_FortuneMaster();
		//取得するカラムを指定
		cb.specify().columnOmikujiCode();
		cb.specify().specifyFortuneMaster().columnFortuneName();
		cb.specify().columnNegaigoto();
		cb.specify().columnAkinai();
		cb.specify().columnGakumon();

		//Omikujiテーブルのレコード数を検索　select count(*)
		omikujiCount = omikujiBhv.selectCount(null);

		//omikujiCountからランダムに数字を取得し、おみくじコードとする
		Random random = new Random();
		int omikujiCode = random.nextInt(omikujiCount) + 1;

		//主キーによる一件検索をし、randomOmikujiに代入
		randomOmikuji = omikujiBhv.selectByPK(omikujiCode);
		return randomOmikuji;
	}

	//結果をDBに登録
	public void setResult() {
		Result result = new Result();
		//アクションクラス書き終わってから書く
		result.setFortuneTellingDate(null);
		result.setBirthday(null);
		result.setOmikujiCode(null);
		result.setUpdatedBy("蓮田");
		result.setUpdatedDate(null);
		result.setCreatedBy("蓮田");
		result.setCreatedDate(null);

	}

	//過去半年の運勢の割合を抽出
	public Map<String, Integer> getUnseiPastSixMonths() {
//		Map<String, Integer> resultPastSixMonths = new HashMap<String, Integer>();
//		//ConditionBean
//		ResultCB cb = new ResultCB();
//		//ResultとテーブルOmikujiテーブル、さらにFortuneMasterテーブルを結合
//		cb.setupSelect_Omikuji().withFortuneMaster();
//
//		cb.specify().columnOmikujiCode();
//
		//６ヶ月前の日付を入れる変数
		Calendar sixMonthsAgo = null;
		//今日の日付
		Calendar today = Calendar.getInstance();
		//今日の日付から６ヶ月引いた日付
		today.add(Calendar.MONTH, -6);
		//sixMonthAgoに計算後の日付を代入
		sixMonthsAgo = today;
		
		UnseiPastSixMonthsPmb pmb = new UnseiPastSixMonthsPmb();
		pmb.setSetSixMonthsAgo(sixMonthsAgo);
		
//		List<UnseiPastSixMonths> list = resultBhv.outsideSql().selectList(pmb);
		
		
		
		
		return null;

	}
	

	//本日の運勢の割合を抽出
	@SuppressWarnings("unchecked")
	public Map<String, Integer> getUnseiToday() {
		List<UnseiToday> list = resultBhv.outsideSql().selectList(null);
		

		return (Map<String, Integer>) list;

	}

	//過去半年のおみくじの結果を抽出
	public List<OmikujiResult> getResultPastSixMonths(LocalDate birthday) {
		List<OmikujiResult> results = new ArrayList<OmikujiResult>();

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
		
		//ConditionBean
		ResultCB cb = new ResultCB();
		//OmikujiテーブルにFortuneMasterテーブルを結合
		cb.setupSelect_Omikuji().withFortuneMaster();
		//検索条件
		cb.query().setBirthday_Equal(birthday);
		cb.query().setFortuneTellingDate_GreaterEqual(sixMonthsDate);


		
		return null;

	}
	

}
