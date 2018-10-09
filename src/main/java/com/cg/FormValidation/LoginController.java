package com.cg.FormValidation;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String ViewLogin(Map<String,Object> model)
	{
		User user = new User();
		model.put("userForm",model);
		return "LoginPage";
	}

	public String doLogin(@ModelAttribute("usrForm") User userForm,BindingResult result,Map<String,Object> model)
	{
		if(result.hasErrors()) {
			return "LoginPage";}
		return "LoginSuccess";
	}
}
	