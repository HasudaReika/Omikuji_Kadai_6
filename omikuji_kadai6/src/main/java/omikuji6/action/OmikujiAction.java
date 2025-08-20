package omikuji6.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import omikuji6.form.OmikujiForm;

public class OmikujiAction {

	@ActionForm
	@Resource
	protected OmikujiForm omikujiForm;

	//誕生日入力フォームの表示
	@Execute(validator = false)
	public String inputBirthday() {
		return "birthdayInput.jsp";
		
	}
	
	//結果画面に遷移　入力チェックがエラーの場合は誕生日入力フォームに戻る
	@Execute(validator = true, input = "birthdayInput.jsp")
	public String showResult() {
		
		
		return "result.jsp";
		
	}

}
