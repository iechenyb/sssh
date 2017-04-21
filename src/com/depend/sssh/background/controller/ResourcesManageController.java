package com.depend.sssh.background.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.depend.sssh.background.sevices.ResourcesManageService;
import com.depend.sssh.common.pages.PageView;
import com.depend.sssh.entity.ResourcesInfo;

@Controller
@RequestMapping("bg/resource")
public class ResourcesManageController {

	@Autowired
	private ResourcesManageService resourcesManageService;

	@RequestMapping("/list")
	public String list(ModelMap modelMap) {
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("createdTime", "desc");
		PageView<ResourcesInfo> pageView = new PageView<>(12, 1);
		pageView.setQueryResult(resourcesManageService.getAll(pageView.getFirstResult(),pageView.getMaxResult(),orderby));
		modelMap.put("pageView", pageView);
		return "bg/resource/list";
	}

}
