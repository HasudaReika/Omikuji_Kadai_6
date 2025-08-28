package omikuji6.form;

import org.seasar.struts.annotation.Required;

public class AddressForm {

	@Required
	public Integer postCode;

	@Required
	public String address;

	@Required
	public String name;

	public Integer getPostCode() {
		return postCode;
	}

	public void setPostCode(Integer postCode) {
		this.postCode = postCode;
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

}
