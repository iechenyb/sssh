package com.cyb.sssh.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class AuthorityInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6247402388872098188L;

	private String id; // id
	private String code; // 权限代码，以：“ROLE_” 为前缀的代码，如：”ROLE_ADMIN“
	private String name; // 权限名称
	private String creator; // 权限创建人
	private Instant createdTime; // 权限创建时间
	private boolean enabled; // 权限是否可用
	private String remark; // 权限备注
	private String modifyPeople; // 权限修改人
	private Instant modifyTime; // 权限修改时间

	private Set<AccountInfo> accountInfos = new HashSet<AccountInfo>(); // 权限用户
	private Set<ResourcesInfo> resourcesInfos = new HashSet<ResourcesInfo>(); // 权限资源

	public AuthorityInfo() {
	}

	public AuthorityInfo(String code, String name, String creator, Instant createdTime, boolean enabled, String remark,
			String modifyPeople, Instant modifyTime, Set<AccountInfo> accountInfos, Set<ResourcesInfo> resourcesInfos) {
		this.code = code;
		this.name = name;
		this.creator = creator;
		this.createdTime = createdTime;
		this.enabled = enabled;
		this.remark = remark;
		this.modifyPeople = modifyPeople;
		this.modifyTime = modifyTime;
		this.accountInfos = accountInfos;
		this.resourcesInfos = resourcesInfos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Instant getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Instant createdTime) {
		this.createdTime = createdTime;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getModifyPeople() {
		return modifyPeople;
	}

	public void setModifyPeople(String modifyPeople) {
		this.modifyPeople = modifyPeople;
	}

	public Instant getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Instant modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Set<AccountInfo> getAccountInfos() {
		return accountInfos;
	}

	public void setAccountInfos(Set<AccountInfo> accountInfos) {
		this.accountInfos = accountInfos;
	}

	public Set<ResourcesInfo> getResourcesInfos() {
		return resourcesInfos;
	}

	public void setResourcesInfos(Set<ResourcesInfo> resourcesInfos) {
		this.resourcesInfos = resourcesInfos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		AuthorityInfo other = (AuthorityInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AuthoritiesInfo [id=" + id + ", code=" + code + ", name=" + name + ", creator=" + creator
				+ ", createdTime=" + createdTime + ", enabled=" + enabled + ", remark=" + remark + ", modifyPeople="
				+ modifyPeople + ", modifyTime=" + modifyTime + ", accountInfos=" + accountInfos + ", resourcesInfos="
				+ resourcesInfos + "]";
	}

}
