package com.cyb.sssh.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 权限组
 * 
 * @author root
 *
 */
public class GroupAuthority implements Serializable {
	
	private static final long serialVersionUID = -3358911009578912241L;
	
	private String id; // id
	private String name; // 组名称
	private String creator; // 创建人
	private Date createdTime; // 创建时间
	private boolean enabled; // 是否启用
	private String remark; // 备注
	private String modifyPeople; // 修改人
	private Date modifyTime; // 修改时间

	private Set<AuthorityInfo> authorityInfos = new HashSet<AuthorityInfo>(); // 组权限

	public GroupAuthority() {
	}

	public GroupAuthority(String id, String name, String creator, Date createdTime, boolean enabled, String remark,
			String modifyPeople, Date modifyTime) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createdTime = createdTime;
		this.enabled = enabled;
		this.remark = remark;
		this.modifyPeople = modifyPeople;
		this.modifyTime = modifyTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
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

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
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
		GroupAuthority other = (GroupAuthority) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroupAuthority [id=" + id + ", name=" + name + ", creator=" + creator + ", createdTime=" + createdTime
				+ ", enabled=" + enabled + ", remark=" + remark + ", modifyPeople=" + modifyPeople + ", modifyTime="
				+ modifyTime + ", authorityInfos=" + authorityInfos + "]";
	}

}
