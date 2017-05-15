package com.cyb.sssh.background.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping("/customer")
public class UserController {
	@Autowired
	private AuthenticationManager myAuthenticationManager;
	private UserDetails getPrincipal(){
		UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return  principal;
		}
		return null;
	}
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
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPage(
			@RequestParam(value = "error", required = false) String error,
			String username, String password, Model model,
			HttpServletRequest request) {
		Authentication authentication = myAuthenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(username,
						password));
		SecurityContext securityContext = SecurityContextHolder.getContext();
		securityContext.setAuthentication(authentication);
		HttpSession session = request.getSession(true);
		session.setAttribute("SPRING_SECURITY_CONTEXT", securityContext);
		return "index";
	}
	@RequestMapping(value = "/exit", method = RequestMethod.GET)
	public String exit(HttpServletRequest request, HttpServletResponse response) {
		SecurityContextImpl securityContextImpl = (SecurityContextImpl) request
				.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
		// Authentication auth =
		// SecurityContextHolder.getContext().getAuthentication();
		Authentication auth = securityContextImpl.getAuthentication();
		if (auth != null) {
			System.out.println("exit infor:" + auth.getName());
			new SecurityContextLogoutHandler().logout(request, response, auth);
		} else {
			System.out.println("无授权信息！");
		}
		try {
			// 获得当前用户所拥有的权限
			@SuppressWarnings("unchecked")
			List<GrantedAuthority> authorities = (List<GrantedAuthority>) securityContextImpl
					.getAuthentication().getAuthorities();
			for (GrantedAuthority grantedAuthority : authorities) {
				System.out.println("Authority"
						+ grantedAuthority.getAuthority());
			}
			WebAuthenticationDetails details = (WebAuthenticationDetails) securityContextImpl
					.getAuthentication().getDetails();
			// 获得访问地址
			System.out.println("RemoteAddress" + details.getRemoteAddress());
			// 获得sessionid
			System.out.println("SessionId" + details.getSessionId());
			// 登录密码，未加密的
			System.out.println("Credentials:"
					+ securityContextImpl.getAuthentication().getCredentials());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return "login";
	}
}
