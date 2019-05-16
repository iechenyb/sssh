package com.cyb.sssh.background.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@EnableGlobalMethodSecurity(prePostEnabled=true)
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
	@GetMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_VOL') or hasRole('ROLE_ORG')")//是否具备其中一个角色
	public ResponseEntity<?> cacheable(@PathVariable Integer id) {
		return new ResponseEntity<>("sss", HttpStatus.OK);
	}

}
