package omikuji6.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;

import omikuji6.form.OmikujiForm;

public class OmikujiAction {

	@ActionForm
	@Resource
	protected OmikujiForm omikujiForm;

//	@Execute(validator = false)
//	public String omikuji() {
//		return null;
//		
//	}

}
