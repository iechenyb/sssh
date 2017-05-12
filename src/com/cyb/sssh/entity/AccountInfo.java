package com.cyb.sssh.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class AccountInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6145748725826398125L;

	private String id; // id
	private String email; // 账号
	private String password; // 密码
	private String nikename; // 昵称
	private boolean accountNonExpired; // 账号未过期
	private boolean accountNonLocked; // 账号未锁定
	private boolean credentialsNonExpired; // 凭证未过期
	private boolean enabled; // 账号可用
	private Instant createdTime; // 创建时间
	private String cellphone; // 手机号码
	private String createdIPAddress; // 创建时的IP地址

	private Set<AuthorityInfo> authorityInfos = new HashSet<AuthorityInfo>(); // 用户权限

	public AccountInfo() {
	}

	public AccountInfo(String email, String password, String nikename, boolean accountNonExpired,
			boolean accountNonLocked, boolean credentialsNonExpired, boolean enabled, Instant createdTime,
			String cellphone, String createdIPAddress, Set<AuthorityInfo> authorityInfos) {
		this.email = email;
		this.password = password;
		this.nikename = nikename;
		this.accountNonExpired = accountNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.credentialsNonExpired = credentialsNonExpired;
		this.enabled = enabled;
		this.createdTime = createdTime;
		this.cellphone = cellphone;
		this.createdIPAddress = createdIPAddress;
		this.authorityInfos = authorityInfos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNikename() {
		return nikename;
	}

	public void setNikename(String nikename) {
		this.nikename = nikename;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Instant getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Instant createdTime) {
		this.createdTime = createdTime;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getCreatedIPAddress() {
		return createdIPAddress;
	}

	public void setCreatedIPAddress(String createdIPAddress) {
		this.createdIPAddress = createdIPAddress;
	}

	public Set<AuthorityInfo> getAuthorityInfos() {
		return authorityInfos;
	}

	public void setAuthorityInfos(Set<AuthorityInfo> authorityInfos) {
		this.authorityInfos = authorityInfos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountInfo other = (AccountInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountInfo [id=" + id + ", email=" + email + ", password=" + password + ", nikename=" + nikename
				+ ", accountNonExpired=" + accountNonExpired + ", accountNonLocked=" + accountNonLocked
				+ ", credentialsNonExpired=" + credentialsNonExpired + ", enabled=" + enabled + ", createdTime="
				+ createdTime + ", cellphone=" + cellphone + ", createdIPAddress=" + createdIPAddress
				+ ", authorityInfos=" + authorityInfos + "]";
	}

}
