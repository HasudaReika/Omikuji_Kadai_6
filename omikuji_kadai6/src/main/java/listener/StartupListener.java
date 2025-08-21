package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import service.OmikujiService;

public class StartupListener implements ServletContextListener {

	OmikujiService service = new OmikujiService();

	//起動時に一度だけ実行する処理
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			if (service.checkDB()) {
				//テーブルにおみくじがなければcsvから読み込み格納
				service.importOmikujiFromCsv();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
