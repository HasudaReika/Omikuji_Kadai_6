package omikuji6.action;
/*
 * 過去半年と本日の運勢の割合を表示
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.seasar.struts.annotation.Execute;

import service.OmikujiService;

public class StatsAction {
	@Resource
	protected OmikujiService omikujiService;

	public HttpServletRequest request;

	@Execute(validator = false)
	public String index() {
		Map<String, Long> resultPastSixMonths = null;
		Map<String, Long> resultToday = null;

		//過去半年と本日の運勢の割合のマップを取得
		resultPastSixMonths = omikujiService.getUnseiPastSixMonths();
		resultToday = omikujiService.getUnseiToday();

		//過去半年の格運勢の個数を取得
		double total = 0.0;
		for (Long value : resultPastSixMonths.values()) {
			total += value.doubleValue();
		}

		//それぞれの割合を計算し、大きい順にソート、新しいマップに格納
		//ソートするためにMapをListに変換
		List<Map.Entry<String, Long>> entryList = new ArrayList<Map.Entry<String, Long>>(
				resultPastSixMonths.entrySet());
		//多い順にソート
		Collections.sort(entryList, new Comparator<Map.Entry<String, Long>>() {
			@Override
			public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		//割合を%に計算しMaoに格納
		Map<String, Double> ratioPSM = new LinkedHashMap<String, Double>();
		for (Map.Entry<String, Long> entry : entryList) {
			double ratio = Math.round((entry.getValue().doubleValue() / total) * 10000.0) / 100.0;
			ratioPSM.put(entry.getKey(), ratio);
		}

		//リクエストスコープにセット
		request.setAttribute("resultPastSixMonths", ratioPSM);

		//本日の格運勢の個数を取得
		double total2 = 0.0;
		for (Long value : resultToday.values()) {
			total2 += value.doubleValue();
		}

		//それぞれの割合を計算し、大きい順にソート、新しいマップに格納
		//ソートするためにMapをListに変換
		List<Map.Entry<String, Long>> entryList2 = new ArrayList<Map.Entry<String, Long>>(resultToday.entrySet());
		//多い順にソート
		Collections.sort(entryList2, new Comparator<Map.Entry<String, Long>>() {
			@Override
			public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		//割合を%に計算しMaoに格納
		Map<String, Double> ratioToday = new LinkedHashMap<String, Double>();
		for (Map.Entry<String, Long> entry : entryList2) {
			double ratio = Math.round((entry.getValue().doubleValue() / total2) * 10000.0) / 100.0;
			ratioToday.put(entry.getKey(), ratio);
		}

		//リクエストスコープにセット
		request.setAttribute("resultToday", ratioToday);

		return "resultRatio.jsp";

	}
}
