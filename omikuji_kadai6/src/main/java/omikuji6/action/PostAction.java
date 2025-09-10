package omikuji6.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.util.TokenProcessor;
import org.dbflute.optional.OptionalEntity;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import com.fasterxml.jackson.databind.ObjectMapper;

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
	public HttpServletResponse response;
	public HttpServletRequest request;

	/**
	 * 郵送先登録画面の表示
	 * @return index.jspに遷移
	 */
	@Execute(validator = false)
	public String index() {
		//トークン作成
		TokenProcessor.getInstance().saveToken(request);
		return "index.jsp";

	}

	/**
	 * 入力された情報とおみくじ結果コードをDBに登録
	 * @return submit.jspに遷移
	 */
	@Execute(validator = true, input = "index.jsp")
	public String submit() {
		//トークンをチェック
		if (!TokenProcessor.getInstance().isTokenValid(request, true)) {
			//既に登録済みの場合
			return "already_submitted.jsp";
		}

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
	 * @return 住所
	 * @throws IOException 
	 */
	@Execute(validator = false)
	public String searchAddress() throws IOException {
		//入力された郵便番号を取得
		String postCode = postForm.postCode;
		//郵便番号から住所を取得
		List<PostCodeData> GetAddress = omikujiService.getByPostCode(postCode);

		//該当する住所がなかった場合
		if (GetAddress.isEmpty()) {
			// nullを返す
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			ResponseUtil.write("null");
			return null;
		}

		//住所をListに格納
		String address;
		List<String> addressList = new ArrayList<String>();
		for (PostCodeData data : GetAddress) {
			address = data.getPrefecture() + data.getCity() + data.getTown();
			addressList.add(address);
		}
		//ObjectMapperインスタンス作成
		ObjectMapper objectMapper = new ObjectMapper();
		String addressJson = null;
		//json形式に変換
		try {
			addressJson = objectMapper.writeValueAsString(addressList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//jsonを返す
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		ResponseUtil.write(addressJson);

		return null;

	}

	/**
	 * 住所から郵便番号を取得
	 * @return 郵便番号
	 * @throws IOException 
	 */
	@Execute(validator = false)
	public String searchPostCode() throws IOException {
		//入力された住所を取得
		String address = postForm.address;
		//住所から郵便番号を検索
		OptionalEntity<PostCodeData> optPostCode = omikujiService.getByAddress(address);

		// 該当する郵便番号がなかった場合
		if (!optPostCode.isPresent()) {
			// nullを返す
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			ResponseUtil.write("null");
			return null;
		}

		//郵便番号をStringに変換
		String postCode = optPostCode.get().getPostCode();
		//ObjectMapperインスタンス作成
		ObjectMapper objectMapper = new ObjectMapper();
		String postCodeJson = null;
		//json形式に変換
		try {
			postCodeJson = objectMapper.writeValueAsString(postCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//jsonを返す
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		ResponseUtil.write(postCodeJson);

		return null;

	}

	/**
	 * 途中まで入力された住所文字列から住所を取得
	 * @return
	 */
	@Execute(validator = false)
	public String addressCompletement() {
		//途中まで入力された住所を取得
		String address = postForm.address;
		//途中まで入力された住所文字列を含む住所を検索
		List<PostCodeData> fullAddressList = omikujiService.addressComplete(address);
		// 該当する郵便番号がなかった場合
		if (fullAddressList.isEmpty()) {
			// nullを返す
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			ResponseUtil.write("null");
			return null;
		}

		//取得した住所リストをjson形式に変換
		//住所をListに格納
		String fullAddress;
		List<String> addressList = new ArrayList<String>();
		for (PostCodeData data : fullAddressList) {
			fullAddress = data.getPrefecture() + data.getCity() + data.getTown();
			addressList.add(fullAddress);
		}
		//ObjectMapperインスタンス作成
		ObjectMapper objectMapper = new ObjectMapper();
		String fullAddressJson = null;
		//json形式に変換
		try {
			fullAddressJson = objectMapper.writeValueAsString(addressList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//jsonを返す
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		ResponseUtil.write(fullAddressJson);

		return null;
	}
}
