package omikuji6.action;
/*
 * 起動時にDBにおみくじが格納されているかチェック
 */
import javax.annotation.Resource;

import service.OmikujiService;

public class Init{

	
	@Resource
	OmikujiService omikujiService;

	//起動時に一度だけ実行する処理
	public void initialize() {
		try {	// テーブルにおみくじが格納されているかチェック
			if (omikujiService.checkDB()) {
				//テーブルにおみくじがなければcsvから読み込み格納
				omikujiService.importOmikujiFromCsv();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
