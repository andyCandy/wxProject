package com.metarnet.sfpw.hw.da;

import java.io.IOException;
import java.net.UnknownHostException;

import com.metarnet.epon.adapter.AdapterException;
import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hw.driver.EponSocket;
import com.metarnet.sfpw.hw.util.ConfigManager;


/**
 * EPON公用业务处理类
 * 
 * @author Administrator
 * @version 
 * @see com.metarnet.epon.huawei.operation
 * @since
 */
public class EponOper{
    /** 日志对象 */
    
    private EponSocket eponSocket;
    private ConfigManager configManager;
    
    
    public void setConfigManager(ConfigManager configManager) {
		this.configManager = configManager;
	}

	public void init(){
    	
    	try {
    		eponSocket = new EponSocket(configManager);
			this.login();
			this.startShakehandThread();
		} catch (AdapterException e) {
			
		} catch (ConnectionException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    
    
    
    
    /***************************************************************************
     * 登录
     * @throws ConnectionException 
     **************************************************************************/
    public void login() throws AdapterException, ConnectionException
    {
        
         String commString = configManager.loginComm.replace("${username}", configManager.username).replace("${password}", configManager.password);
         String messageReturn = eponSocket.sendComm( commString);
         if(!checkMessage(messageReturn))
         {
             WxLogger.flow.info("用户登录失败,请检查登录命令或用户名密码是否正确");
             throw new AdapterException("用户登录失败,请检查登录命令或用户名密码是否正确");
         }else{
             WxLogger.flow.info("用户登录成功");
         }
        
    }
    
    /***************************************************************************
     * 退出
     * @throws ConnectionException 
     **************************************************************************/
    public void logout() throws AdapterException, ConnectionException
    {
            String messageReturn = eponSocket.sendComm(	configManager.logoutComm);
            if(!checkMessage(messageReturn))
            {
                WxLogger.flow.info("用户退出失败,请检查退出命令是否正确");
                throw new AdapterException("用户退出失败,请检查退出命令是否正确");
            }else{
                WxLogger.flow.info("用户退出成功");
            }
    }
    
    /***************************************************************************
     * 握手
     **************************************************************************/
    public void shakeHand()
    {
           String messageReturn = null;
		try {
			messageReturn = eponSocket.sendComm( configManager.shakeHandComm);
		} catch (ConnectionException e) {
			System.out.println("连接异常,握手失败,等待重连");
			return;
		} catch (AdapterException e) {
			System.out.println("流异常，握手失败，等待下次握手");
			return;
		}
           if(!checkMessage(messageReturn))
            {
                WxLogger.flow.info("与厂家网管握手失败,请检查握手命令是否正确");
            }else{
                WxLogger.flow.info("与厂家网管握手成功");
            }
    }
    
    /**
     * 启动握手线程
     */
    public void startShakehandThread()
    {
        new Thread(){
            @Override
            public void run()
            {
                while (true)
                {
                    
                        shakeHand();
                        try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
						}
                    }
                   
                }
            
        }.start();
    }
    /**
     * 从数据中返回信息是否成功
     * @param message 返回信息
     * @return 信息是否成功
     * */
    public boolean checkMessage(String message)
    {
        boolean result=false;
        if(message.indexOf("EN=0")!=-1)
        {
            result=true;
        }
        return result;
    }
    
    /**
     * 发命令采集数据，并检查数据
     * @return string类型数据
     * @throws AdapterException
     * @throws ConnectionException 
     */
    public String collect(String command) throws AdapterException, ConnectionException{
    	
    	String message = this.eponSocket.sendComm(command);
    	
    	if(this.checkMessage(message)){
    		return message;
    	}

    	WxLogger.flow.info("为返回正确数据（EN不为0）");
    	throw new AdapterException("数据不正确，不处理");
    }
    
    /**
     * 重连
     * @throws AdapterException
     */
    public boolean reConnect(){
    	
    	try {
			this.eponSocket.reConnect();
		} catch (UnknownHostException e1) {
			WxLogger.flow.error("EponOper reConnect UnknownHostException",e1);
			return false;
		} catch (IOException e1) {
			
			WxLogger.flow.error("EponOper reConnect IOException",e1);
			return false;
		}
    	
    	try {
			this.login();
			this.startShakehandThread();
		} catch (AdapterException e) {
			WxLogger.flow.error("EponOper reConnect login and ShakeHand Exception",e);
			return false;
		} catch (ConnectionException e) {
			return false;
		}
    	return true;
    }
}
