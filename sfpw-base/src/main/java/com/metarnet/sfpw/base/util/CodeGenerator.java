package com.metarnet.sfpw.base.util;

import java.util.UUID;

/**
 * @author bcmeng
 * 2013年12月30日
 * CodeGenerator.java
 * com.metarnet.adapter.util
 * TODO 用来生成不重复的字符串，作为数据库表的唯一标识
 */
public class CodeGenerator {

	/**
	 * 唯一码默认长度20
	 */
	private static final int DEFAULT_LEN = 20;
	
	/**
	 * 
	 * @TODO 生成默认长度的唯一码
	 * @return String
	 * @return
	 *
	 */
	public static String genDefaultCode(){
		
		return genSpecificLenCode(DEFAULT_LEN);
	}
	
	/**
	 * 
	 * @TODO 生成指定长度的唯一码
	 * @return String
	 * @param len
	 * @return
	 *
	 */
	public static String genSpecificLenCode(int len){
		UUID uuid = UUID.randomUUID();
		
		String uuidStr = uuid.toString().replaceAll("-", "");
		/**如果指定长度超过唯一码长度，返回此唯一码*/
		if(len > uuidStr.length()){
			return uuidStr;
		}
		
		return uuidStr.substring(uuidStr.length()-len, uuidStr.length());
	}
	
}
