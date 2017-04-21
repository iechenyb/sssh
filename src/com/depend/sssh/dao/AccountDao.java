package com.depend.sssh.dao;

import com.depend.sssh.common.dao.DaoSupport;
import com.depend.sssh.entity.AccountInfo;

public interface AccountDao extends DaoSupport<AccountInfo, String> {

	/**
	 * 根据email 获取账户信息
	 * 
	 * @param email
	 * @return
	 */
	AccountInfo getByEmail(String email);

}
