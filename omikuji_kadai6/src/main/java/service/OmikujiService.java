package service;
/*
 * サービスクラス
 */

import java.time.LocalDate;

import javax.annotation.Resource;

import omikuji6.dbflute.cbean.ResultCB;
import omikuji6.dbflute.exbhv.FortuneMasterBhv;
import omikuji6.dbflute.exbhv.OmikujiBhv;
import omikuji6.dbflute.exbhv.ResultBhv;
import omikuji6.dbflute.exentity.Omikuji;

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
	public void importOmikujiFromCsv() {
		
	}
	
	//占った日と誕生日が一致する結果がテーブルに存在するかチェック
	//テーブルに存在する場合はそのおみくじ結果を取得
	public Omikuji getOmikujiFromResult(LocalDate fortuneTellingDate, LocalDate birthday) {
		//ConditionBean
		ResultCB cb = new ResultCB();
		
		//ResultとテーブルOmikujiテーブル、さらにFortuneMasterテーブルを結合
		cb.setupSelect_Omikuji().withFortuneMaster();
		
		
		
		return null;
		
	}
}
