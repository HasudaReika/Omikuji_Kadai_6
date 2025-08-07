package omikuji6.form;

import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.Required;

public class OmikujiForm {
	
	@Required
	@DateType(datePatternStrict = "yyyyMMdd")
	public String birthday;

}

