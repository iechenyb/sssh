package com.depend.sssh.common.pages;

import java.util.List;

/**
 * 
 * @company 重庆蓝莱科技有限公司
 * @project qjtid
 * @description 查询结果集
 * @type com.lanlai.qjtid.common.pages.QueryResult     
 * @author blacksalon@163.com 
 * @date 2016年11月18日 上午9:00:16   
 * @version 1.0.0
 * @param <T>
 */
public class QueryResult<T> {

	private List<T> resultList; // 结果集
	private long recordTotal; // 记录总数

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

	public long getRecordTotal() {
		return recordTotal;
	}

	public void setRecordTotal(long recordTotal) {
		this.recordTotal = recordTotal;
	}

}
