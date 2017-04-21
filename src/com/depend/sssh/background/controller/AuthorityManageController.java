package com.depend.sssh.background.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.depend.sssh.background.sevices.AuthorityManageService;
import com.depend.sssh.common.pages.PageView;
import com.depend.sssh.entity.AuthorityInfo;

@Controller
@Scope("prototype")
@RequestMapping("bg/auth")
public class AuthorityManageController {

	@Autowired
	private AuthorityManageService authorityManageService;

	/**
	 * 查询所有的权限信息
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ModelMap modelMap) {
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("createdTime", "desc");
		PageView<AuthorityInfo> pageView = new PageView<>(12, 1);
		pageView.setQueryResult(
				authorityManageService.getAll(pageView.getFirstResult(), pageView.getMaxResult(), orderby));
		modelMap.put("pageView", pageView);
		return "bg/auth/list";
	}

}
