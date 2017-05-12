package com.cyb.sssh.background.sevices.impl;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyb.sssh.background.sevices.AuthorityManageService;
import com.cyb.sssh.common.pages.QueryResult;
import com.cyb.sssh.dao.AuthorityDao;
import com.cyb.sssh.entity.AuthorityInfo;

/**
 * 权限管理业务实现
 * @author root
 *
 */
@Service
public class AuthorityManageServiceImpl implements AuthorityManageService {

	@Autowired
	private AuthorityDao authorityDao;

	/**
	 * 添加权限
	 */
	@Override
	public void save(AuthorityInfo authorityInfo) {
		authorityDao.save(authorityInfo);
	}

	/**
	 * 获取所有的权限信息
	 */
	@Override
	public QueryResult<AuthorityInfo> getAll() {
		return authorityDao.getScrollData();
	}

	/**
	 * 根据ID获取权限信息
	 */
	@Override
	public AuthorityInfo getByid(String id) {
		return authorityDao.getByid(id);
	}

	/**
	 * 修改权限
	 */
	@Override
	public void update(AuthorityInfo authorityInfo) {
		authorityDao.update(authorityInfo);
	}

	/**
	 * 查询所有的权限信息
	 */
	@Override
	public QueryResult<AuthorityInfo> getAll(int firstResult, int maxResult, LinkedHashMap<String, String> orderby) {
		return authorityDao.getScrollData(firstResult, maxResult, orderby);
	}
	
}
