package com.cyb.sssh.background.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/1")
	@ResponseBody
	public String any(){
		return "any";
	}
	@RequestMapping("/2")
	@ResponseBody
	public String user(){
		return "2";
	}
	@RequestMapping("/3")
	@ResponseBody
	public String login(){
		return "3";
	}	
}
