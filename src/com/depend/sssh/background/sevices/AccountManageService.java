package com.depend.sssh.background.sevices;

import java.util.LinkedHashMap;

import com.depend.sssh.common.pages.QueryResult;
import com.depend.sssh.entity.AccountInfo;

public interface AccountManageService {

	void save(AccountInfo accountInfo);
	
	/**
	 * 根据账号获取账户信息
	 * 
	 * @param username
	 * @return
	 */
	AccountInfo getByEmail(String email);

	/**
	 * 根据id 获取账户信息
	 * @param id
	 * @return
	 */
	AccountInfo getByid(String id);

	/**
	 * 跟新账户信息
	 * 
	 * @param accountInfo
	 */
	void update(AccountInfo accountInfo);

	/**
	 * 查询所有的账户信息
	 * 
	 * @param firstResult 开始索引
	 * @param maxResult 结束索引
	 * @param orderby 排序语句
	 * @return
	 */
	QueryResult<AccountInfo> getAll(int firstResult, int maxResult, LinkedHashMap<String, String> orderby);

}
