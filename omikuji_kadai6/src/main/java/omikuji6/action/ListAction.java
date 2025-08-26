package omikuji6.action;
/*
 * 入力された誕生日の過去半年の結果をリスト化
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import omikuji6.dto.OmikujiResult;
import omikuji6.form.OmikujiForm;
import service.OmikujiService;

public class ListAction {
	@ActionForm
	@Resource
	protected OmikujiForm omikujiForm;

	@Resource
	protected OmikujiService omikujiService;
	
	public String birthday;

	@Execute(validator = false)
	public String index() {
		//誕生日をセット
		birthday = omikujiForm.birthday;
		//LocalDateに変換
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate birthdayLocalDate = LocalDate.parse(birthday, formatter);
		
		List<OmikujiResult> list = new ArrayList<OmikujiResult>();
		//過去半年の結果を取得しリストに格納
		list = omikujiService.getResultPastSixMonths(birthdayLocalDate);
		//結果を降順にソート
//		Collections.sort(list, Comparator.comparing(OmikujiResult::getFortuneTellingDate).reversed());

		//
		Collections.sort(list, new Comparator<OmikujiResult>() {
			@Override
			public int compare(OmikujiResult o1, OmikujiResult o2) {
				return o2.getFortuneTellingDate().compareTo(o1.getFortuneTellingDate());
			}
		});

		return "listPerBirthday.jsp";
	}
}
