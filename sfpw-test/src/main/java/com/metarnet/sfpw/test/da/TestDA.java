package com.metarnet.sfpw.test.da;


public class TestDA {

	
	private int connected = 1;
	
	private int disconnected = 0;
	
	private int connState = connected;
	
	private int requiredReConnectCount;
	
	public TestDA(int count){
		this.requiredReConnectCount = count;
		this.start();
		this.printState();
	}
	
	public String getAlarm(){
		
		if(connState == connected)
			return "alarm";
		
		throw new RuntimeException();
	}
	
	public String getCfg(){
		
		if(connState == connected)
			return "cfg";
		
		throw new RuntimeException();
	}
	
	public String getPef(){
		
		if(connState == connected)
			return "perf";
		
		throw new RuntimeException();
	}
	
	private Object lock = new Object();
	
	/**
	 * 模拟在连接多久之后断开连接
	 */
	private void start(){
		
		Thread disconnect = new Thread(){
			
			public void run(){
				
				try {
					Thread.sleep(1000*15);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized(lock){
					connState = disconnected;
				}
			}
			
		};
	
		disconnect.start();
		
	}
	
	/**
	 * 模拟需要多次重连的场景
	 * @return
	 */
	public boolean reconnect (){
		
		if(this.requiredReConnectCount != 0){
			this.requiredReConnectCount--;
			return false;
		}else{
			synchronized(lock){
				this.connState = connected;
			}
			return true;
		}
		
	}
	
	/**
	 * 打印连接状态
	 */
	private void printState(){
		new Thread(){
			
			public void run(){
				
				while(true){
				
					try {
						Thread.sleep(5*1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("TestDA.connState:"+connState);
				}
			}
			
		}.start();
	}
	
	public static void main(String[] args) {
		TestDA tda = new TestDA(4);
	}
	
}
