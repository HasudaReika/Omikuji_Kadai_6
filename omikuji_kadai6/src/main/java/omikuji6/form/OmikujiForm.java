package omikuji6.form;

import java.text.Normalizer;
import java.text.Normalizer.Form;

import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.Required;

public class OmikujiForm {

	@Required
	@DateType(datePatternStrict = "yyyyMMdd")
	public String birthday;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = Normalizer.normalize(birthday, Form.NFKC);

	}

}
