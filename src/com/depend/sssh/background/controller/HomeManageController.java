package com.depend.sssh.background.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
@RequestMapping("bg/home")
public class HomeManageController {

	@RequestMapping("/index")
	public String home(ModelMap modelMap){
		modelMap.addAttribute("user", getPrincipal());
		return "bg/index";
	}
	
	
	private Object getPrincipal(){
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return  principal;
		}
		return null;
	}
	
}
