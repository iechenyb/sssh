package com.cyb.sssh.background.sevices.impl;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cyb.sssh.background.sevices.AccountManageService;
import com.cyb.sssh.common.pages.QueryResult;
import com.cyb.sssh.dao.AccountDao;
import com.cyb.sssh.entity.AccountInfo;

@Service
@Transactional
public class AccountManageServiceImpl implements AccountManageService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public void save(AccountInfo accountInfo) {
		accountDao.save(accountInfo);
		
	}

	/**
	 * 根据email获取账户信息
	 */
	@Override
	public AccountInfo getByEmail(String email) {
		return accountDao.getByEmail(email);
	}

	/**
	 * 根据id获取账户信息
	 */
	@Override
	public AccountInfo getByid(String id) {
		return accountDao.getByid(id);
	}

	/**
	 * 跟新账户信息
	 */
	@Override
	public void update(AccountInfo accountInfo) {
		accountDao.update(accountInfo);
	}

	/**
	 * 查询所有的账户信息
	 */
	@Override
	public QueryResult<AccountInfo> getAll(int firstResult, int maxResult, LinkedHashMap<String, String> orderby) {
		return accountDao.getScrollData(firstResult, maxResult, orderby);
	}
	
}
