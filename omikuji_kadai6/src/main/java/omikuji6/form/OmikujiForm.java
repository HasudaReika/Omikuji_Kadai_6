package omikuji6.form;

import java.io.Serializable;
import java.text.Normalizer;
import java.text.Normalizer.Form;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.Required;

@Component(instance = InstanceType.SESSION)
public class OmikujiForm implements Serializable{

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
