package com.cyb.sssh.background.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping("/ano")
public class AnoController {
	
	@RequestMapping("/1")
	@ResponseBody
	@PostAuthorize("1 != 1")  
	public String any(){
		return "any";
	}
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping("/2")
	@ResponseBody
	public String user(){
		return "user";
	}
	@PreAuthorize("hasRole('ROLE_USER')")
	@RequestMapping("/3")
	@ResponseBody
	public String login(){
		return "admin";
	}	
}
