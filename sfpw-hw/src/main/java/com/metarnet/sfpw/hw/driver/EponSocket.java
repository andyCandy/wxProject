package com.metarnet.sfpw.hw.driver;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;




import java.net.UnknownHostException;

import com.metarnet.epon.adapter.AdapterException;
import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hw.util.ConfigManager;
import com.metarnet.sfpw.hw.util.HuaweiHelper;



/**
 * 与网管Socket连接会话处理类 
 * 
 * @author Administrator
 * @version 
 * @see com.metarnet.epon.huawei.socket
 * @since
 */
public class EponSocket
{
    private ConfigManager configManager;    // 配置文件
    private Socket client = null;   // Socket会话
    
    
    /***************************************************************************
     * 重写构造函数(CONFIG)
     * @throws IOException 
     * @throws UnknownHostException 
     **************************************************************************/
    public EponSocket(ConfigManager config) throws UnknownHostException, IOException{
        this.configManager = config;
        this.socketConn();
    }
    
    
    
    /***************************************************************************
     * 建立SOCKET连接
     * @throws IOException 
     * @throws UnknownHostException 
     **************************************************************************/
    public void socketConn() throws UnknownHostException, IOException{
        WxLogger.flow.info("开始建立Socket连接...");
        
        client = new Socket(configManager.serverHost, configManager.serverPort);//获取客户端连接实例
               
        WxLogger.flow.info("Socket连接完毕");
    }
    /**
     * 发送命令
     * @param session 会话
     * @param commString 需要发送的命令
     * @return messageReturn 返回的消息
     * @throws AdapterException 
     * @throws ConnectionException 
     */
    public synchronized String sendComm(String commString) throws AdapterException, ConnectionException
    {
        String title = "向厂家网管发送命令";
        WxLogger.res_config.info("开始" + title + ":" + commString + "...");
        
        if (client != null && client.isConnected()){
            String messageReturn = "";
            InputStream inputStream = null;
            PrintWriter out = null;
            try{
                out = new PrintWriter(client.getOutputStream(),true);
                out.println(commString);//要发往服务器端的命令行的数据流
                out.flush();
                
                inputStream = client.getInputStream();//从服务器端返回的数据流
                messageReturn = HuaweiHelper.inputStream2String(inputStream);
            }catch (IOException e){
                WxLogger.flow.error("流异常"+e.getMessage(),e);
                throw new AdapterException("流异常，发送命令:" + commString + "失败");
            }catch(Exception ex){
            	WxLogger.flow.error("未知运行时异常，可能是连接异常，将要重连"+ex.getMessage(),ex);
            	throw new ConnectionException();
            }
            WxLogger.res_config.info("接收到网管的反馈信息：" + messageReturn + ";\r\n");
            return messageReturn;
        }else{
            WxLogger.flow.info("未与厂家网管建立tcp连接，发送命令:" + commString + "失败");
            throw new AdapterException("未与厂家网管建立tcp连接，发送命令:" + commString + "失败");
        }
    }
    /***************************************************************************
     * 释放SOCKET连接
     **************************************************************************/
    public void socketDestroy() 
    {
        if(client!=null && client.isConnected())
        {
            try
            {
                client.close();
            }
            catch (IOException e)
            {
                WxLogger.flow.error("关闭socket连接失败：" + e.getMessage());
            }
        }
    }
    /***************************************************************************
     * 重连
     * @throws IOException 
     * @throws UnknownHostException 
     **************************************************************************/
    public void reConnect() throws UnknownHostException, IOException{
    	
    	this.socketDestroy();
    	
		this.socketConn();
    	
    }
    
}
