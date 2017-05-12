package com.cyb.sssh.common.impl;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cyb.sssh.common.dao.DaoSupport;
import com.cyb.sssh.common.pages.QueryResult;
import com.cyb.sssh.common.utils.GenericsUtils;

/**
 * 通用数据访问实现
 * 
 * @project 
 * @author blacksalon@163.com
 * @creationTime 2016-1-15 下午5:31:22
 * @version 1.0.0
 * @param <T> 实体类型
 */
@Transactional
@SuppressWarnings("all")
public class DaoSupportImpl<T,ID extends Serializable> implements DaoSupport<T,ID> {
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	/**
	 * 获取Session
	 * 
	 * @return org.hibernate.Session
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * 获取实体类
	 */
	protected Class<T> entityClass = GenericsUtils.getSuperClassGenricType(getClass());

	/**
	 * 获取实体名称
	 * 
	 * @param entityClass 实体类
	 * @return 类得简单名称
	 */
	protected static<E> String getEntityName(Class<E> entityClass){
		String entityName = entityClass.getSimpleName();
		return entityName;
	}
	
	/**
	 * 获取全部数据数据
	 * 
	 * @return
	 */
	public QueryResult<T> getScrollData(){
		return getScrollData(-1,-1,null,null,null);
	}
	
	/**
	 * 分页获取数据
	 * 
	 * @param firstResult 开始索引，如果值为-1，既获全部数据
	 * @param maxResult  每页获取的记录数，如果值为-1，既获全部数据
	 * @return
	 */
	public QueryResult<T> getScrollData(int firstResult,int maxResult){
		return getScrollData(firstResult,maxResult,null,null,null);
	}

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
	public QueryResult<T> getScrollData(int firstResult,int maxResult,LinkedHashMap<String, String> orderby){
		return getScrollData(firstResult,maxResult,null,null,orderby);
	}
	
	/**
	 * 分页获取数据
	 * 
	 * @param firstResult 开始索引 如果值为-1，既获全部数据
	 * @param maxResult  每页获取的记录数 如果值为-1，既获全部数据
	 * @param where 条件语句，不带where关键字，位置参数的开始索引以0开始，如 o.userName=？ and userAccoun = ？
	 * @param params 条件语句出现的参数值
	 * @return
	 */
	public QueryResult<T> getScrollData(int firstResult,int maxResult,String where,List<Object> params){
		return getScrollData(firstResult,maxResult,where,params,null);
	}
	
	/**
	 * 分页获取数据
	 * 
	 * @param firstResult 开始索引 如果值为-1，既获全部数据
	 * @param maxResult  每页获取的记录数 如果值为-1，既获全部数据
	 * @param where 条件语句，不带where关键字，位置参数的开始索引以0开始，如 o.userName=？ and userAccoun=？
	 * @param params 条件语句出现的参数值
	 * @param orderby 排序属性，Key为排序属性,Value为asc/desc 如：
	 *	LinkedHashMap<String,String> orderby = new LinkedHashMap<String,String>();
	 *	orderby.put("userEmail", "asc");
	 *	orderby.put("userPassword", "desc");
	 * @return
	 */
	public QueryResult<T> getScrollData(int firstResult,int maxResult,String where,List<Object> params,LinkedHashMap<String, String> orderby){
		String entityName = getEntityName(entityClass);
		String wherehql = where != null && !"".equals(where.trim()) ? " where " + where : "" ;
		Query query = this.getSession().createQuery("select o from " + entityName + " as o"+ wherehql +buildOrderby(orderby));
		if(firstResult != -1 && maxResult != -1) query.setFirstResult(firstResult).setMaxResults(maxResult);
		setQueryParameter(query, params);
		QueryResult<T> qr = new QueryResult<T>();
		qr.setResultList(query.getResultList());
		query = getSession().createQuery("select count(o) from "+ entityName + " as o"+ wherehql);
		setQueryParameter(query, params);
		qr.setRecordTotal((Long)query.getResultList().get(0));
		return qr;
	}
	
	/**
	 * 设置查询参数
	 * 
	 * @param query 查询对象
	 * @param params 参数
	 */
	public static void setQueryParameter(Query query,List<Object> params){
		if( params != null ){
			for(int i = 0;i < params.size();i ++){
				query.setParameter(i, params.get(i));
			}
		}
	}
	
	/**
	 * 构建order by 排序语句
	 * 
	 * @param orderby 排序属性 asc/desc, Key为属性，Value 为 asc/desc
	 * @return
	 */
	public static String buildOrderby(LinkedHashMap<String, String> orderby){
		StringBuilder sb = new StringBuilder();
		if (orderby != null && !orderby.isEmpty()) {
			sb.append(" order by ");
			for (Map.Entry<String, String> entry : orderby.entrySet()) {
				sb.append("o.").append(entry.getKey()).append(" ").append(entry.getValue()).append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}
	
	/**
	 * 添加实体
	 */
	public void save(T entity) {
		this.getSession().save(entity);
	}

	/**
	 * 删除实体
	 */
	public void delete(List<ID> ids) {
		for (ID id : ids) {
			Object object = getByid(id);
			if (object != null) {
				getSession().delete(object);
			}
		}
	}

	/**
	 * 跟新实体
	 */
	public void update(T entity) {
		this.getSession().update(entity);
	}

	/**
	 * 根据id查询实体
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public T getByid(ID id) {
		if(id == null){
			return null;
		}else{
			return (T)this.getSession()
					.get(entityClass, id);
					//.load(entityClass, id);
		}
	}

	/**
	 * 获取实体的总记录数
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public long getCount() {
		return (Long)getSession().createQuery(//
				"select count(o) from " + getEntityName(entityClass) + " as o ")//
				.getResultList()//
				.get(0);
	}
	
	/**
	 * 禁用
	 */
	public void disable(List<ID> ids) {
		this.setVisible(false, ids);	
	}

	/**
	 * 启用
	 */
	public void enable(List<ID> ids) {
		this.setVisible(true, ids);
	}
	
	/**
	 * 根据id数组查询实体
	 * @return
	 */
	public QueryResult<T> getByids(List<ID> ids){
		QueryResult<T> qr = new QueryResult<T>();
		if(ids!= null && ids.size() > 0){
			StringBuilder sb = new StringBuilder();
			for (Serializable serializable : ids) {
				sb.append("?").append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
			String hql = "select o from " + getEntityName(entityClass) + " as o where o.id in("+ sb +")";
			Query query = this.getSession().createQuery(hql);
			for (int i = 0; i < ids.size(); i++) {
				query.setParameter(i, ids.get(i));
			}
			qr.setResultList(query.getResultList());
			return qr;
		}
		else{
			qr.setResultList(Collections.EMPTY_LIST);
			return qr;
		}
	}
	
	/**
	 * 禁用和启用
	 * 
	 * @param status 状态
	 * @param ids  用户编号
	 */
	private void setVisible(boolean visibale, List<ID> ids) {
		if (ids != null && ids.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (ID id : ids) {
				sb.append("?").append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
			String hql = "update "+ getEntityName(entityClass) +" as o set o.status=? where o.id in(" + sb + ")";
			Query q = getSession().createQuery(hql);
			q.setParameter(0, visibale);
			for (int i = 0; i < ids.size(); i++) {
				q.setParameter(i + 1, ids.get(i));
			}
			q.executeUpdate();
		}
	}
}