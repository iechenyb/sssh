package com.depend.sssh.security;

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

import com.depend.sssh.background.sevices.AccountManageService;
import com.depend.sssh.entity.AccountInfo;
import com.depend.sssh.entity.AuthorityInfo;

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
		return auths;
	}

}
