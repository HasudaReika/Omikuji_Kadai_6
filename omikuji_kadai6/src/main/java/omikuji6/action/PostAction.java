package omikuji6.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.dbflute.optional.OptionalEntity;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import omikuji6.dbflute.exentity.PostCodeData;
import omikuji6.form.PostForm;
import service.OmikujiService;

public class PostAction {

	@ActionForm
	@Resource
	protected PostForm postForm;

	@Resource
	protected OmikujiService omikujiService;

	public HttpSession session;

	/**
	 * 郵送先登録画面の表示
	 * @return index.jspに遷移
	 */
	@Execute(validator = false)
	public String index() {
		return "index.jsp";

	}

	/**
	 * 入力された情報とおみくじ結果コードをDBに登録
	 * @return submit.jspに遷移
	 */
	@Execute(validator = true, input = "index.jsp")
	public String submit() {
		//住所、名前、電話番号、メールアドレスをリストに格納
		List<String> list = new ArrayList<String>();
		list.add(postForm.getPostCode());
		list.add(postForm.getAddress());
		list.add(postForm.getName());
		list.add(postForm.getPhone());
		list.add(postForm.getMail());
		//セッションからおみくじ結果コードを取得
		Integer resultCode = (Integer) session.getAttribute("resultCode");

		//郵送テーブルに登録
		omikujiService.recordShipping(resultCode, list);

		//登録完了画面へ
		return "submit.jsp";

	}

	/**
	 * 郵便番号から住所を取得
	 * @return 住所のリスト
	 */
	@Execute(validator = false)
	public List<String> searchAddress() {
		//入力された郵便番号を取得
		String postCode = postForm.postCode;
		//郵便番号から住所を取得
		List<PostCodeData> GetAddress = omikujiService.getByPostCode(postCode);
		//住所をListに格納
		String address;
		List<String> addressList = new ArrayList<String>();
		for (PostCodeData data : GetAddress) {
			address = data.getPrefecture() + data.getCity() + data.getTown();
			addressList.add(address);
		}

		return addressList;

	}

	/**
	 * 住所から郵便番号を取得
	 * @return 郵便番号
	 */
	@Execute(validator = false)
	public String searchPostCode() {
		//入力された住所を取得
		String address = postForm.address;
		//住所から郵便番号を検索
		OptionalEntity<PostCodeData> optPostCode = omikujiService.getByAddress(address);
		//郵便番号をStringに変換
		String postCode = optPostCode.get().getPostCode();

		return postCode;

	}

}
