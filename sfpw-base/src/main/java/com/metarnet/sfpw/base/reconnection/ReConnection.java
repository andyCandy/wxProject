package com.metarnet.sfpw.base.reconnection;

import com.metarnet.sfpw.base.util.WxLogger;

/**
 * 用来做重连
 * 当任务执行失败时，调用本对象的notifyDisconnect方法
 * 本对象判断状态，如果是重连中，就抛掉此消息，如果是其他状态
 * 就启动重连线程，如果重连失败就每隔一小时重连一次，直到重连成功
 * @author bcmeng
 *
 */
public abstract class ReConnection implements Ireconnect{

	/**
	 * 连接状态
	 */
	private int connectState ;
	
	/**
	 * 连接状态：已连接
	 */
	private final int connected = 0;
	
	/**
	 * 连接状态：正在连接
	 */
	private final int reConnecting = 1;
	
	/**
	 * 用于连接的线程
	 */
	private Thread reconnectThread ;
	
	
	public synchronized void notifyDisconnect() {
		
		if(this.connectState == this.reConnecting){
			System.out.println("notifyDisconnect正在连接网管。。。");
			return ;
		}
		
		reconnectThread = new Thread(){
			
			public void run(){
				WxLogger.flow.info("重连线程启动，开始重连。。。");
				/**将状态设为正在连接*/
				connectState = reConnecting;
				while(!reconnect()){
					try {
						System.out.println("重连失败，等待一小时后继续重连");
						WxLogger.flow.info("重连失败，等待一小时后继续重连");
						Thread.sleep(5*60*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				/**将状态设为已连接*/
				connectState = connected;
			}
			
		};
		reconnectThread.start();
	}
	
	/**
	 * 具体重连实现由各协议自己做
	 * @return
	 */
	protected abstract boolean reconnect();
	
	
	public int getConnectState() {
		return connectState;
	}
	
	
}
