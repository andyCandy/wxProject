package com.metarnet.sfpw.hw.entity;

/**
 * 数据库中资源的同步状态标志
 *
 */
public class SyncStatus {

	/**
	 * 新增状态标志
	 */
	public static final String ADD = "ZT02";
	
	/**
	 * 更新状态标志
	 */
	public static final String UPDATE = "ZT00";
	
	/**
	 * 同步中标志位
	 */
	public static final String SYNC = "ZT01";
	
	/**
	 * 删除状态标志位
	 */
	public static final String DELETE = "ZT03";
	
}
