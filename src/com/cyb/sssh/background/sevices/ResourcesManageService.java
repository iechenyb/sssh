package com.cyb.sssh.background.sevices;

import java.util.LinkedHashMap;

import com.cyb.sssh.common.pages.QueryResult;
import com.cyb.sssh.entity.ResourcesInfo;

/**
 * 资源信息业务接口
 * 
 * @author root
 *
 */
public interface ResourcesManageService {
	
	/**
	 * 添加资源信息
	 * 
	 * @param resourcesInfo
	 */
	void save(ResourcesInfo resourcesInfo);

	/**
	 * 根据id获取资源信息
	 * 
	 * @param string
	 * @return
	 */
	ResourcesInfo getByid(String id);

	/**
	 * 获取所有资源信息
	 * 
	 * @return
	 */
	QueryResult<ResourcesInfo> getAll();

	/**
	 * 查询所有的资源信息
	 * 
	 * @param firstResult 开始索引
	 * @param maxResult 结束索引
	 * @param orderby 排序语句
	 * @return
	 */
	QueryResult<ResourcesInfo> getAll(int firstResult, int maxResult, LinkedHashMap<String, String> orderby);

}
