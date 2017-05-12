package com.cyb.sssh.dao;

import org.springframework.security.access.annotation.Secured;

import com.cyb.sssh.common.dao.DaoSupport;
import com.cyb.sssh.entity.AccountInfo;

public interface AccountDao extends DaoSupport<AccountInfo, String> {

	/**
	 * 根据email 获取账户信息
	 * 
	 * @param email
	 * @return
	 */
	@Secured("ROLE_ADMIN")
	AccountInfo getByEmail(String email);

}
