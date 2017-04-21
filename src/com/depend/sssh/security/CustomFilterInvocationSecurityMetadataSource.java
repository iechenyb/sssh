package com.depend.sssh.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;

import com.depend.sssh.background.sevices.AuthorityManageService;
import com.depend.sssh.entity.AuthorityInfo;
import com.depend.sssh.entity.ResourcesInfo;

/**
 * 加载权限与资源的对应关系
 * 
 * @author root
 *
 */
@Service
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

	@Autowired
	private AuthorityManageService authorityManageService;
	
	private static Map<String, Collection<ConfigAttribute>> resourceMap = null;
	
	/**
	 * 初始化权限数据
	 * 加载所有资源与权限的对应关系
	 * 系统启动时加载
	 */
	@PostConstruct
	private void loadResourceDefine() {
		resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
		System.out.println("---------------------> 开始初始化权限数据 <---------------------");
		// 获取所有的权限（角色）
		List<AuthorityInfo> qr = authorityManageService.getAll().getResultList();
		for (AuthorityInfo authoritiesInfo : qr) {
			System.out.println("权限:"+authoritiesInfo.getCode());
			ConfigAttribute configAttribute = new SecurityConfig(authoritiesInfo.getCode());
			Set<ResourcesInfo> resourcesInfos = authoritiesInfo.getResourcesInfos();
			for (ResourcesInfo resourcesInfo : resourcesInfos) {
				System.out.println("    资源:"+resourcesInfo.getName() +"---->" + resourcesInfo.getUrl());
				
				if (resourceMap.containsKey(resourcesInfo.getUrl())) {
					Collection<ConfigAttribute> value = resourceMap.get(resourcesInfo.getUrl());
					value.add(configAttribute);
					resourceMap.put(resourcesInfo.getUrl(), value);
				}
				else{                    
					Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();  
					atts.add(configAttribute);
					resourceMap.put(resourcesInfo.getUrl(), atts);	
				}
			}
		}
		System.out.println("-----------------初始化系统权限数据完成---------------");
	}
	
	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	/**
	 * 返回请求资源所需要的权限
	 */
	@Override
	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
		// 当前请求的资源
		String requestUrl = ((FilterInvocation) object).getRequestUrl();
		if (requestUrl == null) {
			loadResourceDefine();
		}
		if(requestUrl.indexOf("?")>-1){
			requestUrl=requestUrl.substring(0,requestUrl.indexOf("?"));
		}
		Collection<ConfigAttribute> configAttributes = resourceMap.get(requestUrl);
		return configAttributes;
	}

	@Override
	public boolean supports(Class<?> arg0) {
		return true;
	}

}
