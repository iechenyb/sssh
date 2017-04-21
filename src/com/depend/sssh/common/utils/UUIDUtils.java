package com.depend.sssh.common.utils;

import java.util.UUID;

/**
 * 
 * @company 重庆蓝莱科技有限公司
 * @project qjtid
 * @description UUID 工具类
 * @type com.lanlai.qjtid.common.utils.UUIDUtils     
 * @author blacksalon@163.com 
 * @date 2016年11月18日 上午9:01:19   
 * @version 1.0.0
 */
public final class UUIDUtils {
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	
	public static void main (String args[]){
		System.out.println(UUIDUtils.getUUID());
	}
	
}
