package com.cyb.sssh.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cyb.sssh.background.sevices.AccountManageService;
import com.cyb.sssh.entity.AccountInfo;
import com.cyb.sssh.entity.AuthorityInfo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private AccountManageService accountManageService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AccountInfo accountInfo = accountManageService.getByEmail(username);
		if (null == accountInfo) {
			throw new UsernameNotFoundException("用户" + username + "不存在!");
		}
		UserDetails userDetails = new User(accountInfo.getEmail(), accountInfo.getPassword(), accountInfo.isEnabled(),
				accountInfo.isAccountNonExpired(), accountInfo.isCredentialsNonExpired(),
				accountInfo.isAccountNonLocked(), this.getGrantedAuthorities(accountInfo));
		System.err.println("-----------MyUserDetailServiceImpl loadUserByUsername ----------- "+username);
		/*Collection<GrantedAuthority> grantedAuths = getGrantedAuthorities(username);
		// 封装成spring security的user
		User userdetail = new User(
				username, 
				"11",
				true, 
				true, 
				true,
				true, 
				grantedAuths	//用户的权限
			);*/
		return userDetails;
	}

	/**
	 * 获取用户权限
	 * 
	 * @param accountInfo
	 * @return
	 */
	private Collection<GrantedAuthority> getGrantedAuthorities(AccountInfo accountInfo) {
		Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
		Set<AuthorityInfo> authorities = accountInfo.getAuthorityInfos();
		for (AuthorityInfo authoritiesInfo : authorities) {
			System.out.println("当前登录用户的权限：    " +authoritiesInfo.getCode());
			auths.add(new SimpleGrantedAuthority(authoritiesInfo.getCode()));
		}
		/*Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();
		if(username.equals("admin")){
			authSet.add(new SimpleGrantedAuthority("USER"));
			authSet.add(new SimpleGrantedAuthority("ADMIN"));
		}else{
			authSet.add(new SimpleGrantedAuthority("USER"));	
		}*/
		return auths;
	}

}
