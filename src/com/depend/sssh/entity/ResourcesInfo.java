package com.depend.sssh.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class ResourcesInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8573103934590655500L;

	private String id; // id
	private String name; // 资源名称
	private String url; // 资源路径
	private String creator; // 资源创建人
	private Instant createdTime; // 资源创建时间
	private boolean enabled; // 资源是否可用
	private String remark; // 权限备注
	private String modifyPeople; // 权限修改人
	private Instant modifyTime; // 权限修改时间

	private ResourcesInfo parentResource; // 父级资源
	private Set<ResourcesInfo> childResources = new HashSet<ResourcesInfo>(); // 子集资源
	private Set<AuthorityInfo> authorityInfos = new HashSet<AuthorityInfo>(); // 所属权限

	public ResourcesInfo() {
	}

	public ResourcesInfo(String name, String url, String creator, Instant createdTime, boolean enabled, String remark,
			String modifyPeople, Instant modifyTime, ResourcesInfo parentResource, Set<ResourcesInfo> childResources,
			Set<AuthorityInfo> authorityInfos) {
		this.name = name;
		this.url = url;
		this.creator = creator;
		this.createdTime = createdTime;
		this.enabled = enabled;
		this.remark = remark;
		this.modifyPeople = modifyPeople;
		this.modifyTime = modifyTime;
		this.parentResource = parentResource;
		this.childResources = childResources;
		this.authorityInfos = authorityInfos;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public ResourcesInfo getParentResource() {
		return parentResource;
	}

	public void setParentResource(ResourcesInfo parentResource) {
		this.parentResource = parentResource;
	}

	public Set<ResourcesInfo> getChildResources() {
		return childResources;
	}

	public void setChildResources(Set<ResourcesInfo> childResources) {
		this.childResources = childResources;
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
		ResourcesInfo other = (ResourcesInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResourcesInfo [id=" + id + ", name=" + name + ", url=" + url + ", creator=" + creator + ", createdTime="
				+ createdTime + ", enabled=" + enabled + ", remark=" + remark + ", modifyPeople=" + modifyPeople
				+ ", modifyTime=" + modifyTime + ", parentResource=" + parentResource + ", childResources="
				+ childResources + ", authorityInfos=" + authorityInfos + "]";
	}

}
