package com.depend.sssh.common.utils;

/**
 * 
 * @company 重庆蓝莱科技有限公司
 * @project qjtid
 * @description 常量池
 * @type com.lanlai.qjtid.common.utils.Constant     
 * @author blacksalon@163.com 
 * @date 2016年12月17日 下午4:35:35   
 * @version 1.0.0
 */
public interface Constant {
	
	public static final String SALT = "{ll-lt}";
	
	public final String TYPE = "type";

	public final String REQUEST_ERROR_MESSAGE = "errorMsg"; // 错误信息
	public final String REQUEST_ALERT_MESSAGE = "message"; // 提示消息(request)
	public final String RESPONSE_ALERT_MESSAGE = "message"; // 提示消息(response)
	public final String REQUEST_ALERT_URL = "alertUrl"; // 跳转路径
	public final String REQUEST_ALERT_DIRECTURL = "directUrl"; // 来源路径
	public final String REQUEST_LOGIN_EXCEPTION = "loginMsg"; // 登录异常信息
	public final String APPLICATION_TOP_PRIVILGE_LIST = "topList"; // 保存在application中的所有顶级权限
	public final String APPLICATION_ALL_PRIVILEGE_URLS = "allPrivilegeUrls"; // 保存在application中的所有权限地址

	public final String SESSION_LOGIN_ACCOUNTINFO_BEAN = "accountInfoBean";// 用户信息
	public final String SESSION_CAPTCHA_BEAN = "captchaBean"; // 验证码对象
	public final String REQUEST_PAGE_PAGEVIEW = "pageView"; // 分页信息

	/** 前台 */
	public final String REQUEST_USERINFO_BEAN = "userInfoBean"; // 详细信息
	public final String REQUEST_ACCOUNTINFO_BEAN = "accountBean"; // 个人信息对象
	public final String REQUEST_FORUMINFO_BEAN = "forumBean"; // 板块对象
	public final String REQUEST_TOPICINFO_BEAN = "topicBean"; // 帖子对象
	
	public final String APPLICATION_NEW_JDNEWSINFO = "jdPageView"; // 旅游景点
	public final String APPLICATION_NEW_TANEWSINFO = "taPageView"; // 旅游资讯
	public final String APPLICATION_NEW_COMNEWSINFO = "comPageView"; // 公司动态
	public final String APPLICATION_NEW_MFNEWSINFO = "mfPageView"; // 媒体关注
	public final String APPLICATION_NEW_TGNEWSINFO = "tgPageView"; // 旅游图库
	public final String APPLICATION_NEW_RANEWSINFO = "raPageView"; // 轮播新闻
	public final String APPLICATION_NEW_TRNEWSINFO = "trPageView"; // 旅游攻略
	public final String APPLICATION_NEW_CCNEWSINFO = "ccPageView"; // 旅投文化

	/** 后台 */
	public final String REQUEST_MANAGE_ROLE_BEAN = "roleBean"; // 岗位对象
	public final String REQUEST_MANAGE_DEPT_BEAN = "deptBean"; // 部门对象
	public final String REQUEST_MANAGE_PRIVILEGE_BEAN = "privilegeBean"; // 权限对象
	public final String APPLICATION_ALL_FORUM_BEAN = "pageView"; // 保存在application中的所有的版块信息
	public final String APPLICATION_ALL_TOPIC_BEAN = "pageViewTopic"; // 保存在application中的所有的最新的帖子信息
}
