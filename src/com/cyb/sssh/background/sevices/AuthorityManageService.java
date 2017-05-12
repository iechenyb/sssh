package com.cyb.sssh.background.sevices;

import java.util.LinkedHashMap;

import com.cyb.sssh.common.pages.QueryResult;
import com.cyb.sssh.entity.AuthorityInfo;

/**
 * 权限管理业务接口
 * 
 * @author root
 *
 */
public interface AuthorityManageService {

	/**
	 * 添加权限
	 * @param authoritiesInfo
	 */
	void save(AuthorityInfo authoritiesInfo);

	/**
	 * 获取所有的权限信息
	 * 
	 * @return
	 */
	QueryResult<AuthorityInfo> getAll();

	/**
	 * 根据ID获取权限信息
	 * 
	 * @param id
	 * @return
	 */
	AuthorityInfo getByid(String id);

	/**
	 * 修改权限信息
	 * 
	 * @param authoritiesInfo
	 */
	void update(AuthorityInfo authoritiesInfo);

	/**
	 * 查询所有的权限信息
	 * 
	 * @param firstResult 开始索引
	 * @param maxResult 结束索引
	 * @param orderby 排序语句
	 * @return
	 */
	QueryResult<AuthorityInfo> getAll(int firstResult, int maxResult, LinkedHashMap<String, String> orderby);

}
