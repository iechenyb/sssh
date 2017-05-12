package com.cyb.sssh.background.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyb.sssh.background.sevices.AccountManageService;
import com.cyb.sssh.common.pages.PageView;
import com.cyb.sssh.entity.AccountInfo;

@Controller
@Scope("prototype")
@RequestMapping("/bg/user1111")
public class UserManageController {
	
	@Autowired
	private AccountManageService accountManageService;

	@RequestMapping("/disable")
	public String disable(){
		System.out.println("disable");
		return "redirect:/bg/user/list";
	}
	
	/**
	 * 查询所有的用户信息
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ModelMap modelMap){
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String,String>();
		orderby.put("createdTime", "desc");
		PageView<AccountInfo> pageView = new PageView<>(12, 1);
		pageView.setQueryResult(accountManageService.getAll(pageView.getFirstResult(),pageView.getMaxResult(),orderby));
		modelMap.put("pageView", pageView);
		return "bg/user/list";
	}
	
	/**
	 * 退出
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(){
		return "redirect:/bg/user/login?logout";
	}
	
	/**
	 * 添加页面
	 * 
	 * @return
	 */
	@RequestMapping("/addpage")
	public String toAdd(){
		return "bg/add";
	}
	
	/**
	 * 登录页面
	 * 
	 * @return
	 */
	@RequestMapping("/login")
	public String login(){
		return "bg/login";
	}
	
}
