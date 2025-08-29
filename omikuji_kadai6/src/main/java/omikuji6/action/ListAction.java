package omikuji6.action;
/*
 * 入力された誕生日の過去半年の結果をリスト化
 */

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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

	public LocalDate birthday;
	public HttpServletRequest request;
	public Date birthdayDate;

	/**
	 * 入力された誕生日の過去半年の結果をListに格納
	 */
	@Execute(validator = false)
	public String index() {
		//誕生日のフォーマットを指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		//誕生日をセット
		birthday = LocalDate.parse(omikujiForm.birthday, formatter);
		//date型に変換
		birthdayDate = Date.from(birthday.atStartOfDay(ZoneId.systemDefault()).toInstant());

		List<OmikujiResult> list = new ArrayList<OmikujiResult>();
		//過去半年の結果を取得しリストに格納
		list = omikujiService.getResultPastSixMonths(birthday);
		//結果を降順にソート
		Collections.sort(list, new Comparator<OmikujiResult>() {
			@Override
			public int compare(OmikujiResult o1, OmikujiResult o2) {
				return o2.getFortuneTellingDate().compareTo(o1.getFortuneTellingDate());
			}
		});

		request.setAttribute("list", list);

		return "listPerBirthday.jsp";
	}
}
