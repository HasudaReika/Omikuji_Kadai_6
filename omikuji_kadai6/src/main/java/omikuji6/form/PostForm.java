package omikuji6.form;

import java.text.Normalizer;
import java.text.Normalizer.Form;

import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Required;

public class PostForm {

	@Required
	@Mask(mask = "^[0-9]{7}$", msg = @Msg(key = "errors.invalid"))
	public String postCode;

	@Required
	public String address;

	@Required
	public String name;

	@Required
	@Mask(mask = "^[0-9]{10,11}$", msg = @Msg(key = "errors.phone"))
	public String phone;

	@Required
	@EmailType
	public String mail;

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = Normalizer.normalize(postCode, Form.NFKC);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = Normalizer.normalize(phone, Form.NFKC);
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
