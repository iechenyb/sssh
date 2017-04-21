package com.depend.sssh.common.dao;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

import com.depend.sssh.common.pages.QueryResult;

/**
 * 通用数据访问接口
 * 
 * @project 
 * @author blacksalon@163.com
 * @creationTime 2016-1-15 下午5:30:58
 * @version 1.0.0
 * @param <T> 实体类型
 */
public interface DaoSupport<T,ID extends Serializable> {
    
	/**
	 * 获取全部数据数据
	 * 
	 * @return
	 */
    QueryResult<T> getScrollData();
	
	/**
	 * 分页获取数据
	 * 
	 * @param firstResult 开始索引，如果值为-1，既获全部数据
	 * @param maxResult  每页获取的记录数，如果值为-1，既获全部数据
	 * @return
	 */
	 QueryResult<T> getScrollData(int firstResult,int maxResult);
	
	/**
	 * 分页获取数据
	 * 
	 * @param firstResult 开始索引 如果值为-1，既获全部数据
	 * @param maxResult  每页获取的记录数 如果值为-1，既获全部数据
	 * @param orderby 排序属性，Key为排序属性,Value为asc/desc 如：
	 *	LinkedHashMap<String,String> orderby = new LinkedHashMap<String,String>();
	 *	orderby.put("userEmail", "asc");
	 *	orderby.put("userPassword", "desc");
	 * @return
	 */
	 QueryResult<T> getScrollData(int firstResult,int maxResult,LinkedHashMap<String, String> orderby);
	
	/**
	 * 分页获取数据
	 * 
	 * @param firstResult 开始索引 如果值为-1，既获全部数据
	 * @param maxResult  每页获取的记录数 如果值为-1，既获全部数据
	 * @param where 条件语句，不带where关键字，位置参数的开始索引以0开始，如 o.userName=？ and userAccoun = ？
	 * @param params 条件语句出现的参数值
	 * @return
	 */
	 QueryResult<T> getScrollData(int firstResult,int maxResult,String where,List<Object> params);
	
	/**
	 * 分页获取数据
	 * 
	 * @param firstResult 开始索引 如果值为-1，既获全部数据
	 * @param maxResult  每页获取的记录数 如果值为-1，既获全部数据
	 * @param where 条件语句，不带where关键字，位置参数的开始索引以0开始，如 o.userName=？ and userAccoun = ？
	 * @param params 条件语句出现的参数值
	 * @param orderby 排序属性，Key为排序属性,Value为asc/desc 如：
	 *	LinkedHashMap<String,String> orderby = new LinkedHashMap<String,String>();
	 *	orderby.put("userEmail", "asc");
	 *	orderby.put("userPassword", "desc");
	 * @return
	 */
	 QueryResult<T> getScrollData(int firstResult,int maxResult,String where,List<Object> params,LinkedHashMap<String, String> orderby);
	
	/**
	 * 保存实体
	 * 
	 * @param entity 实体对象
	 */
	 void save(T entity);
	
	/**
	 * 删除实体
	 * 
	 * @param id 编号
	 */
	 void delete(List<ID> ids);
	
	/**
	 * 跟新实体
	 * 
	 * @param entity 实体对象
	 */
	 void update(T entity);
	
	/**
	 * 根据id查询实体
	 * 
	 * @param id 实体编号
	 * @return
	 */
	 T getByid(ID id);
	
	/**
	 * 根据id数组查询实体
	 * 
	 * @param ids
	 * @return
	 */
	 QueryResult<T> getByids(List<ID> ids);
	
	/**
	 * 获取实体总记录数
	 * 
	 * @return
	 */
	 long getCount();
	
	/**
	 * 禁用
	 * 
	 * @param ids
	 */
	 void disable(List<ID> ids);

	/**
	 * 启用
	 * 
	 * @param ids
	 */
	 void enable(List<ID> ids);
	
}