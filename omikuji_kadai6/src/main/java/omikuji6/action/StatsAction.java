package omikuji6.action;
/*
 * 過去半年と本日の運勢の割合を表示
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import service.OmikujiService;

public class StatsAction {
	@Resource
	protected OmikujiService omikujiService;

	@Execute(validator = false)
	public String index() {
		Map<String, Long> resultPastSixMonths = null;
		Map<String, Long> resultToday = null;

		//過去半年と本日の運勢の割合のマップを取得
		resultPastSixMonths = omikujiService.getUnseiPastSixMonths();
		resultToday = omikujiService.getUnseiToday();

		//過去半年の格運勢の個数を取得
		double total = resultPastSixMonths.values().stream().mapToDouble(Long::doubleValue).sum();
		//それぞれの割合を計算し、大きい順にソート、新しいマップに格納
		@SuppressWarnings("unused")
		Map<String, Double> ratioPSM = resultPastSixMonths.entrySet().stream()
				.sorted(Map.Entry.<String, Long> comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, entry -> {
					double ratio = Math.round((entry.getValue() / total) * 10000.0) / 100.0;
					return ratio;
				},
						(e1, e2) -> e1,
						LinkedHashMap::new));

		//本日の格運勢の個数を取得
		double total2 = resultToday.values().stream().mapToDouble(Long::doubleValue).sum();
		//それぞれの割合を計算し、大きい順にソート、新しいマップに格納
		@SuppressWarnings("unused")
		Map<String, Double> ratioToday = resultToday.entrySet().stream()
				.sorted(Map.Entry.<String, Long> comparingByValue().reversed())
				.collect(Collectors.toMap(
						Map.Entry::getKey, entry -> {
							double ratio = Math.round((entry.getValue() / total2) * 10000.0) / 100.0;
							return ratio;
						},
						(e1, e2) -> e1,
						LinkedHashMap::new));
		
		return "resultRatio.jsp";

	}
}
