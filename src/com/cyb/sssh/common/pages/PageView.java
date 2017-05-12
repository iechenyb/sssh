package com.cyb.sssh.common.pages;

import java.util.List;

/**
 * 
 * @company 重庆蓝莱科技有限公司
 * @project qjtid
 * @description 分页数据信息
 * @type com.lanlai.qjtid.common.pages.PageView     
 * @author blacksalon@163.com 
 * @date 2016年11月18日 上午8:58:49   
 * @version 1.0.0
 * @param <T> 实体类型
 */
public class PageView<T> {

	private List<T> records; // 分页数据
	private PageIndex pageIndex; // 页码开始索引和结束索引
	private long totalPage = 1; // 总页数
	private int maxResult = 12; // 每页显示记录数
	private int currentPage = 1; // 当前页
	private long totalRecord; // 总记录数
	private int pageCode = 11; // 页码数量

	/**
	 * 获取开始索引
	 * 
	 * @return
	 */
	public int getFirstResult() {
		return (currentPage - 1) * maxResult;
	}

	/**
	 * 设置查询结果
	 */
	public void setQueryResult(QueryResult<T> qr) {
		setRecords(qr.getResultList());
		setTotalRecord(qr.getRecordTotal());
	}

	public PageView(int maxResult, int currentPage) {
		this.maxResult = maxResult;
		this.currentPage = currentPage;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public PageIndex getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(PageIndex pageIndex) {
		this.pageIndex = pageIndex;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
		this.pageIndex = PageIndex.getPageIndex(pageCode, currentPage, totalPage);
	}

	public int getMaxResult() {
		return maxResult;
	}

	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public long getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(long totalRecord) {
		this.totalRecord = totalRecord;
		setTotalPage(this.totalRecord % this.maxResult == 0 ? this.totalRecord / this.maxResult
				: this.totalRecord / this.maxResult + 1);
	}

	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}

}
