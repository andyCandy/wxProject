package com.metarnet.sfpw.base.util;

import java.io.File;

import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.base.util.IConfig;
import com.metarnet.util.XConfException;
import com.metarnet.util.XPathConfManager;

public class Config implements IConfig{

	
	/**用来初始化orb*/
	private String localHost;
	private String localPort;
	private String url;
	
	private int howmany;
	private int ithowmany;
	private String domain;
	/**通道类型：push，pull，以及是否使用通道*/
	private boolean connectEventchannel;
	private String type;
	
	
	/**用来获取NamingContext,为空则使用"NameService"*/
	private String nsIOR;
	
	/**用来获取推事件提供者代理*/
	private String sppsIor;
	
	
	/**用来获取emsSessionFactory的引用*/
	private String factory;
	
	/**用来获取emsSession*/
	private String user;
	private String password;
	
	/**探测网管的时间间隔*/
	private int period;
	
	
	/**数据中继的ip和端口号，格式：ip:port*/
	private String targetAddr;
	
	/**存放从中继发来的文件路径*/
	private String path;
	private String housekeeping;
	private String minconn;
	private String maxconn;
	private String driver;
	private String uri;
	private String dbuser;
	private String dbpassword;
	
	/**
	 * @throws XConfException 
	 * @throws ServiceException 
	 * @TODO 读取配置，赋值
	 */
	public void readCfg() throws XConfException {
		
			XPathConfManager.createManager("conf/config_kyland_corba.xml");
			XPathConfManager xpath = XPathConfManager.instance();
			targetAddr = xpath.evaluate("//wall/@target", "");
			path = xpath.evaluate("//filepath/@path", "");
			this.localHost = xpath.evaluate("//localhost/@host");
			this.localPort = xpath.evaluate("//localhost/@port","");
			String nshost = xpath.evaluate("//name-service/@addr", "");
			String nsport = xpath.evaluate("//name-service/@port", "");
			this.nsIOR  = xpath.evaluate("//name-service/@ior", "");
			String nsName = xpath.evaluate("//name-service/@name", "NameService");
		
			 if ((nshost.length() != 0) && (nsport.length() != 0))
		      {
		        String ns = "/" + nsName;
		        this.url = ("corbaloc:iiop:" + nshost + ":" + nsport + ns);
		      }
			 this.user = xpath.evaluate("//session/@user");
		      this.password = xpath.evaluate("//session/@password");
		      this.howmany = xpath.evaluate("//session/@howmany", 50);
		      this.ithowmany = xpath.evaluate("//session/@ithowmany", 50);
		      this.factory = xpath.evaluate("//session/factory");
		      this.connectEventchannel = Boolean.parseBoolean(xpath.evaluate("//event-channel/@connect"));
		      type = xpath.evaluate("//event-channel/@type", "push");
		      if (this.connectEventchannel)
		        this.period = xpath.evaluate("//event-channel/ping", 60);
		      this.sppsIor = xpath.evaluate("//session/proxy-supplier", "");
		      this.domain = xpath.evaluate("//common/@domain", "");
		      this.housekeeping = xpath.evaluate("//common/database/@housekeeping");
		      this.minconn = xpath.evaluate("//common/database/@minconn", "1");
		      this.maxconn = xpath.evaluate("//common/database/@maxconn", "3");
		      this.driver = xpath.evaluate("//common/database/@driver");
		      this.uri = xpath.evaluate("//common/database/uri", "");
		      
		      this.dbuser = xpath.evaluate("//common/database/user", "");
		      this.dbpassword = xpath.evaluate("//common/database/password", "");
		      
	}
	
	
	public String getLocalHost() {
		return localHost;
	}

	public String getLocalPort() {
		return localPort;
	}

	public String getUrl() {
		return url;
	}

	public String getNsIOR() {
		return nsIOR;
	}

	public String getFactory() {
		return factory;
	}
	public String getUser() {
		return user;
	}
	public String getPassword() {
		return password;
	}
	public String getSppsIor() {
		return sppsIor;
	}
	public int getPeriod() {
		return period;
	}
	public int getHowmany() {
		return howmany;
	}
	public int getIthowmany() {
		return ithowmany;
	}
	public boolean isConnectEventchannel() {
		return connectEventchannel;
	}
	public String getType() {
		return type;
	}
	
	public String getDomain(){
		return domain;
	}
	
	
	public String getTargetAddr() {
		return targetAddr;
	}
	public String getPath() {
		return path;
	}
	
	
	
	public String getUri() {
		return uri;
	}


	public String getHousekeeping() {
		return housekeeping;
	}


	public String getMinconn() {
		return minconn;
	}


	public String getMaxconn() {
		return maxconn;
	}


	public String getDriver() {
		return driver;
	}


	public String getDbuser() {
		return dbuser;
	}


	public String getDbpassword() {
		return dbpassword;
	}


	@Override
	public String toString() {
		return "Config [localHost=" + localHost + ", localPort=" + localPort
				+ ", url=" + url + ", howmany=" + howmany + ", ithowmany="
				+ ithowmany + ", connectEventchannel=" + connectEventchannel
				+ ", type=" + type + ", nsIOR=" + nsIOR + ", sppsIor="
				+ sppsIor + ", factory=" + factory + ", user=" + user
				+ ", password=" + password + ", period=" + period + ", domain="
				+ domain + ", targetAddr=" + targetAddr + ", path=" + path
				+ "]";
	}
	public static void main(String[] args) throws ServiceException, XConfException {
		
		Config config = new Config();
		config.readCfg();
		System.out.println(config);
	}
	
}
