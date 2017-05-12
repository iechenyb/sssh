package com.cyb.sssh.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cyb.sssh.common.impl.DaoSupportImpl;
import com.cyb.sssh.dao.AccountDao;
import com.cyb.sssh.entity.AccountInfo;

@Service
@SuppressWarnings("unchecked")
public class AccountDaoImpl extends DaoSupportImpl<AccountInfo, String> implements AccountDao {

	/**
	 * 鏍规嵁email鑾峰彇璐︽埛淇℃伅
	 */
	@Override
	public AccountInfo getByEmail(String email) {
		List<AccountInfo> accountInfos = getSession().createQuery(//
				"select o from AccountInfo as o where o.email = ?")//
				.setParameter(0, email).getResultList();
		if(accountInfos != null && accountInfos.size()>0){
			return accountInfos.get(0);
		}
		return null;
	}

}
