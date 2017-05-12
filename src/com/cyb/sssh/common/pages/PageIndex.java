package com.cyb.sssh.common.pages;

/**
 * 
 * @company 重庆蓝莱科技有限公司
 * @project qjtid
 * @description 计算分页页码开始索引
 * @type com.lanlai.qjtid.common.pages.PageIndex     
 * @author blacksalon@163.com 
 * @date 2016年11月18日 上午8:58:12   
 * @version 1.0.0
 */
public class PageIndex {
	
	private long startIndex; // 开始索引
	private long endIndex; // 结束索引
	
	public PageIndex(long startIndex, long endIndex) {
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}
	
	public long getStartIndex() {
		return startIndex;
	}
	
	public void setStartIndex(long startIndex) {
		this.startIndex = startIndex;
	}
	
	public long getEndIndex() {
		return endIndex;
	}
	
	public void setEndindex(long endIndex) {
		this.endIndex = endIndex;
	}
	
	/**
	 * 获取第几页
	 * @param viewPageCount 每页显示多少个页码
	 * @param currentPage 当前页
	 * @param totalPage 总页数
	 * @return
	 */
	public static PageIndex getPageIndex(long viewPageCount, int currentPage, long totalPage){
		long startPage = currentPage - (viewPageCount % 2 == 0 ? viewPageCount / 2 - 1 : viewPageCount / 2);
		long endPage = currentPage + viewPageCount / 2;
		if (startPage < 1) {
			startPage = 1;
			if (totalPage >= viewPageCount)
				endPage = viewPageCount;
			else
				endPage = totalPage;
		}
		if (endPage > totalPage) {
			endPage = totalPage;
			if ((endPage - viewPageCount) > 0)
				startPage = endPage - viewPageCount + 1;
			else
				startPage = 1;
		}
		return new PageIndex(startPage, endPage);
	}
}
