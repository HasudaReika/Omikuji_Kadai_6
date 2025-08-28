package omikuji6.action;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import omikuji6.dto.OmikujiResult;
import omikuji6.form.OmikujiForm;
import service.OmikujiService;

public class OmikujiAction {
	//jspに渡すおみくじオブジェクト
	public OmikujiResult omikujiEntity;

	@ActionForm
	@Resource
	protected OmikujiForm omikujiForm;
	
	@Resource 
	protected OmikujiService omikujiService;


	
	/**
	 * 誕生日入力フォームの表示
	 * @return　birthdayInput.jspに遷移
	 */
	@Execute(validator = false)
	public String index() {
		return "index.jsp";

	}

	/**
	 * 入力された誕生日からおみくじを取得　入力チェックがエラーの場合は誕生日入力フォームに戻る
	 * @return 結果画面に遷移
	 */
	
	@Execute(validator = true, input = "index.jsp")
	public String showResult() {
		//フォームに入力された誕生日文字列をセット
		String birthdaysString = omikujiForm.birthday;

		//birthdayをStringからLocalDate型に変換
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate birthday = LocalDate.parse(birthdaysString, formatter);

		//今日の日付を取得
		LocalDate today = LocalDate.now();

		//resultテーブルから取得するおみくじ変数
		Optional<OmikujiResult> omikuji = null;
		//ランダムに新しいおみくじを取得する変数
		Optional<OmikujiResult> newOmikuji = null;
		//今日の日付とと誕生日が一致する結果がテーブルに存在するかチェック
		omikuji = omikujiService.getOmikujiFromResult(today, birthday);

		//あった場合はresult.jspに遷移
		if (omikuji.isPresent()) {
			//おみくじオブジェクトに値を代入
			omikujiEntity = omikuji.get();
			
			return "result.jsp";
		} else {
			//なかった場合はランダムにおみくじを一件取得
			newOmikuji = omikujiService.getRandomOmikuji();
			//結果をDBに登録
			omikujiService.setResult(today, birthday, newOmikuji);
			//おみくじオブジェクトに値を代入
			omikujiEntity = newOmikuji.get();

			return "result.jsp";

		}

	}

}
