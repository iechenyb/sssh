package com.cyb.sssh.background.sevices.impl;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyb.sssh.background.sevices.ResourcesManageService;
import com.cyb.sssh.common.pages.QueryResult;
import com.cyb.sssh.dao.ResourcesDao;
import com.cyb.sssh.entity.ResourcesInfo;

/**
 * 资源信息业务实现
 * 
 * @author root
 *
 */
@Service
public class ResourcesManageServiceImpl implements ResourcesManageService {
	
	@Autowired
	private ResourcesDao resourcesDao;

	/**
	 * 添加资源信息
	 */
	@Override
	public void save(ResourcesInfo resourcesInfo) {
		resourcesDao.save(resourcesInfo);
	}

	/**
	 * 根据ID 获取资源信息
	 */
	@Override
	public ResourcesInfo getByid(String id) {
		return resourcesDao.getByid(id);
	}

	/**
	 * 获取所有资源信息
	 */
	@Override
	public QueryResult<ResourcesInfo> getAll() {
		return resourcesDao.getScrollData();
	}

	/**
	 * 查询所有的资源信息
	 */
	@Override
	public QueryResult<ResourcesInfo> getAll(int firstResult, int maxResult, LinkedHashMap<String, String> orderby) {
		return resourcesDao.getScrollData(firstResult, maxResult, orderby);
	}
}
