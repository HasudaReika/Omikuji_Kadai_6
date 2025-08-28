package omikuji6.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import omikuji6.form.AddressForm;
import service.OmikujiService;

public class PostAction {
	
	@ActionForm
	@Resource
	protected AddressForm addressForm;
	
	@Resource
	protected OmikujiService omikujiService;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";

	}
	
	@Execute(validator = false)
	public String submit() {
		
		return "submit.jsp";
		
	}

}
