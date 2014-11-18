package com.metarnet.sfpw.kyland.driver;


import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import managedElementManager.ManagedElementMgr_I;
import managedElementManager.ManagedElementMgr_IHelper;
import multiLayerSubnetwork.MultiLayerSubnetworkMgr_I;
import multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper;
import nmsSession.NmsSession_I;
import nmsSession.NmsSession_IOperations;
import nmsSession.NmsSession_IPOATie;

import org.omg.CORBA.IntHolder;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Policy;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosEventChannelAdmin.AlreadyConnected;
import org.omg.CosEventChannelAdmin.TypeError;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNotification.EventType;
import org.omg.CosNotifyChannelAdmin.AdminLimitExceeded;
import org.omg.CosNotifyChannelAdmin.ClientType;
import org.omg.CosNotifyChannelAdmin.ConsumerAdmin;
import org.omg.CosNotifyChannelAdmin.EventChannelHolder;
import org.omg.CosNotifyChannelAdmin.ProxySupplier;
import org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplier;
import org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper;
import org.omg.CosNotifyComm.InvalidEventType;
import org.omg.CosNotifyComm.StructuredPushConsumer;
import org.omg.CosNotifyComm.StructuredPushConsumerPOATie;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAPackage.ServantAlreadyActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

import performance.PerformanceManagementMgr_I;
import performance.PerformanceManagementMgr_IHelper;
import session.Session_I;
import KYLAND_alarmMgr.KYLAND_alarmMgr_I;
import KYLAND_alarmMgr.KYLAND_alarmMgr_IHelper;
import KYLAND_pmMgr.KYLAND_pmMgr_I;
import KYLAND_pmMgr.KYLAND_pmMgr_IHelper;

import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.kyland.manager.Reporter;
import com.metarnet.sfpw.base.util.Config;

import common.Common_I;
import common.Common_IHolder;
import emsMgr.EMSMgr_I;
import emsMgr.EMSMgr_IHelper;
import emsSession.EmsSession_I;
import emsSession.EmsSession_IHolder;
import emsSessionFactory.EmsSessionFactory_I;
import emsSessionFactory.EmsSessionFactory_IHelper;
import equipment.EquipmentInventoryMgr_I;
import equipment.EquipmentInventoryMgr_IHelper;
import globaldefs.ProcessingFailureException;

/**
 * 
 * @author bcmeng
 *
 */
public class KylandCorbaDriver implements NmsSession_IOperations{

	private ORB orb;
	private Config config;
	
	private boolean connected = false;
	/**corba引用*/
	private EmsSession_I               emsSession;
	private EMSMgr_I                   emsMgr;
	private MultiLayerSubnetworkMgr_I  multiLayerSubnetworkMgr;
	private ManagedElementMgr_I        manageElementMgr;
	private EquipmentInventoryMgr_I    equipment;
	private PerformanceManagementMgr_I performanceMgr;
	private KYLAND_alarmMgr_I          kyland_alarmMgr;
	private KYLAND_pmMgr_I             kyland_pmMgr;
	private NmsSession_I               nmsSession_I;
	
	private Reporter reporter = null;
	private Timer timer = null;
	
	private StructuredProxyPushSupplier structuredProxyPushSupplier;
	private StructuredPushConsumer structuredPushConsumer;

	public void setConfig(Config config) {
		this.config = config;
	}

	public void setReporter(Reporter reporter) {
		this.reporter = reporter;
	}

	POA poa = null;
	/**
	 * @TODO 根据配置文件中配的地址初始化orb
	 * @return 初始化成功则返回true，否则返回false
	 */
	boolean initORB(){
	    Properties props = System.getProperties();
	    String[] args = new String[0];
	    if ((config.getLocalHost() != null) && (config.getLocalHost().length() != 0)) {
	      props.put("OAIAddr", config.getLocalHost());
	    }
//	    if ((config.getLocalPort() != null) && (config.getLocalPort().length() != 0)) {
//	      props.put("OAPort", config.getLocalPort());
//	    }
	    if (config.getUrl() != null) {
	      props.put("ORBInitRef.NameService", config.getUrl());
	    }
	    props.put("org.omg.CORBA.ORBClass", "org.jacorb.orb.ORB");
	    props.put("org.omg.CORBA.ORBSingletonClass", "org.jacorb.orb.ORBSingleton");
	    this.orb = ORB.init(args, props);
	    
	    return this.orb != null;
	  }
	
	boolean startORB(){
		final Object lock = new Object();
		new Thread(){
			public void run(){
				try{
					connected = connectPushChannel();
					synchronized (lock) {
						lock.notifyAll();
					}
					orb.run();
				}catch(Exception ex){
					ex.printStackTrace();
					connected = false;
					synchronized (lock) {
						lock.notifyAll();
					}
				}
			}
		}.start();
		synchronized (lock) {
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return this.connected;
	}
	
	boolean connectEMS() throws ServiceException{
		try{
		org.omg.CORBA.Object root_poa = orb.resolve_initial_references("RootPOA");
		POA rpoa = POAHelper.narrow(root_poa);
		poa = rpoa.create_POA("myPolicy", null, new Policy[0]);
		poa.the_POAManager().activate();
		}catch(Exception ex){
			WxLogger.init.error("获取rootPOA异常："+ex.getMessage(),ex);
			throw new ServiceException();
		}
		WxLogger.init.info("开始连接网管。。。");
		/**获取命名服务引用，失败则返回false*/
		NamingContextExt nc = null;
		try{
			nc = this.getNamingRef();
		}catch(Exception ex){
			ex.printStackTrace();
			WxLogger.init.error("获取命名服务失败："+ex.getMessage(),ex);
			return false;
		}
		WxLogger.init.info("获取命名服务成功");
		/**获取网管会话工厂，失败则返回false*/
		EmsSessionFactory_I emsSessionFactory = null;
		NameComponent[] paths = new NameComponent[2];
		paths[0] = new NameComponent("ky","class");
		paths[1] = new NameComponent("instance","EmsSessionFactory");
		try {
			org.omg.CORBA.Object emsSessionl = nc.resolve(paths);
			emsSessionFactory = EmsSessionFactory_IHelper.narrow(emsSessionl);
		} catch (Exception e1) {
			WxLogger.init.info("获取网管会话工厂失败!",e1);
			e1.printStackTrace();
			return false;
		}
		WxLogger.init.info("获取会话工厂成功");
		/**获取网管会话*/
		EmsSession_IHolder emsSession_IHolder = new EmsSession_IHolder();
		NmsSession_IPOATie n_pt = new NmsSession_IPOATie(this,poa);
		try {
			poa.activate_object(n_pt);
		} catch (ServantAlreadyActive e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (WrongPolicy e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		nmsSession_I = n_pt._this();
		try {
			emsSessionFactory.getEmsSession(config.getUser(), config.getPassword(), nmsSession_I, emsSession_IHolder);
		} catch (ProcessingFailureException e) {
			System.out.println("获取会话失败："+e.getMessage());
			System.out.println(e.errorReason);
			WxLogger.init.error(e.errorReason);
			return false;
		}
		emsSession = emsSession_IHolder.value;
		WxLogger.init.info("获取会话成功");
		/**给各类管理器set值*/
		this.SetManager();
		return true;
	}
	
	/**
	 * @TODO 获取命名服务的引用
	 * @return
	 * @throws InvalidName
	 */
	private NamingContextExt getNamingRef() throws InvalidName{
		NamingContextExt nc = null;
		String nsIOR = config.getNsIOR();
		if((nsIOR != null) && (nsIOR.length() > 0))
			nc = NamingContextExtHelper.narrow(this.orb.string_to_object(nsIOR));
		else{
			org.omg.CORBA.Object objRef = this.orb.resolve_initial_references("NameService");
			nc = NamingContextExtHelper.narrow(objRef);
			
		}
		return nc;
	}
	
	private void SetManager() throws ServiceException{
		
		/**通过会话获取emsMgr*/
		emsMgr = EMSMgr_IHelper.narrow(getManager(Constant.EMS));
		
		/**通过会话获取子网管理器*/
		multiLayerSubnetworkMgr = 
				MultiLayerSubnetworkMgr_IHelper.narrow(getManager(Constant.MultiLayerSubnetwork));
		
		/**通过会话获取网元管理器*/
		manageElementMgr = 
				ManagedElementMgr_IHelper.narrow(this.getManager(Constant.ManagedElement));
		
		/**通过会话获取设备管理器*/
		equipment = 
				EquipmentInventoryMgr_IHelper.narrow(this.getManager(Constant.EquipmentInventory));
		
		/**通过会话获取端口性能管理器*/
		performanceMgr = 
				PerformanceManagementMgr_IHelper.narrow(this.getManager(Constant.PerformanceManagement));
		
		/**通过会话获取告警管理器*/
		kyland_alarmMgr = 
				KYLAND_alarmMgr_IHelper.narrow(this.getManager(Constant.KYLAND_alarmMgr));
				
		/**通过会话获取网元性能管理器*/
		kyland_pmMgr = 
				KYLAND_pmMgr_IHelper.narrow(this.getManager(Constant.KYLAND_pmMgr));
	}
	
	/**
	 * @TODO 根据管理器名通过会话获取相应管理器
	 * @param manageName
	 * @return
	 * @throws ServiceException 
	 */
	private Common_I getManager(String manageName) throws ServiceException{
		Common_IHolder common_I = new Common_IHolder();
		try {
			emsSession.getManager(manageName, common_I);
		} catch (ProcessingFailureException e) {
			WxLogger.init.error("获取"+manageName+"失败",e);
			WxLogger.init.error(e.errorReason);
			throw new ServiceException("获取"+manageName+"失败");
		}
		WxLogger.init.info("获取"+manageName+"成功");
		return common_I.value;
	}
	
	/**
	 * 弃用于2014年6月16日
	 */
	private void schedule(){
		timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run() {
				if(connected){
					WxLogger.live.info("连接状态");
					try{
						emsSession.ping();
						WxLogger.live.info("ping网管正常");
					}catch(Exception ex){
						WxLogger.live.error("ping网管失败",ex);
						connected = false;
					}
				}
				if(!connected){
					WxLogger.live.info("断开状态");
					if(structuredProxyPushSupplier != null){
						WxLogger.live.info("通道消息提供者存在，先关闭通道");
						structuredProxyPushSupplier.disconnect_structured_push_supplier();
					}
					try {
						if(connectEMS()&&startORB()){
							connected = true;
							WxLogger.live.info("连接成功");
						}
						WxLogger.live.info("连接失败");
					} catch (ServiceException e) {
						WxLogger.live.error("重连异常",e);
					}
				}
				
			}
		}, config.getPeriod()*1000L, config.getPeriod()*1000L);
	}

	/////////////////////////NmsSession_IOperations接口方法////////////////////////////////
	public Session_I associatedSession() {
		return this.emsSession;
	}

	public void ping() {
		if(this.emsSession != null)
			emsSession.ping();
	}

	public void endSession() {
		if(this.emsSession != null)
			emsSession.endSession();
	}

	public void eventLossOccurred(String startTime, String notificationId) {
		// TODO Auto-generated method stub
		
	}

	public void eventLossCleared(String endTime) {
		// TODO Auto-generated method stub
		
	}
	
	
	/////////////////////事件通道方法//////////////////////////////////////////////
	
	/**
	 * 获取消费者管理
	 * @return
	 * @throws ProcessingFailureException
	 */
	private ConsumerAdmin getConsumerAdmin() throws ProcessingFailureException{
		EventChannelHolder eventChannelHolder = new EventChannelHolder();
		if(this.emsSession == null){
			return null;
		}
		this.emsSession.getEventChannel(eventChannelHolder);
		if(eventChannelHolder.value == null)
			return null;
		
		ConsumerAdmin consumerAdmin = eventChannelHolder.value.default_consumer_admin();
		if(consumerAdmin == null)
			return null;
		
		EventType[] added   = new EventType[1];
		EventType[] removed = new EventType[0];
		
		added[0] = new EventType("*","*");
		
		try {
			consumerAdmin.subscription_change(added, removed);
		} catch (InvalidEventType e) {
			WxLogger.init.error("无效事件类型",e);
		}catch(Exception ex){
			WxLogger.init.error("订阅失败",ex);
		}
		return consumerAdmin;
	}
	
	/**
	 * @TODO 获取推消息提供者代理
	 * @param consumerAdmin
	 * @return 推消息提供者代理
	 * @throws AdminLimitExceeded
	 */
	private StructuredProxyPushSupplier getPushSupplier(ConsumerAdmin consumerAdmin) throws AdminLimitExceeded{
		StructuredProxyPushSupplier structuredProxyPushSupplier = null;
		if((config.getSppsIor() != null) && (config.getSppsIor().length() > 0)){
			structuredProxyPushSupplier = 
					StructuredProxyPushSupplierHelper.narrow(this.orb.string_to_object(config.getSppsIor()));
			
		}else{
			IntHolder intHolder = new IntHolder();
			ClientType clientType = ClientType.STRUCTURED_EVENT;
			ProxySupplier proxySupplier = consumerAdmin.obtain_notification_push_supplier(clientType, intHolder);
			structuredProxyPushSupplier = StructuredProxyPushSupplierHelper.narrow(proxySupplier);
			
		}
		return structuredProxyPushSupplier;
	}
	/**
	 * @TODO 连接推事件通道
	 * @return
	 */
	boolean connectPushChannel(){
		ConsumerAdmin consumerAdmin = null;
		try {
			/**获得消费着管理员*/
			consumerAdmin = getConsumerAdmin();
			/**获得推消息提供者代理*/
			structuredProxyPushSupplier = this.getPushSupplier(consumerAdmin);
			/**获得推消息消费者*/
			StructuredPushConsumerPOATie cpt = new StructuredPushConsumerPOATie(reporter,poa);
			
			poa.activate_object(cpt);
			
			structuredPushConsumer = cpt._this();
			
			/**连接消费者和提供者*/
			structuredProxyPushSupplier.connect_structured_push_consumer(structuredPushConsumer);
		} catch (ProcessingFailureException e) {
			WxLogger.init.error("通道处理失败",e);
			return false;
		} catch (AdminLimitExceeded e) {
			WxLogger.init.error("通道管理员限制",e);
			return false;
		} catch (AlreadyConnected e) {
			WxLogger.init.error("通道已连接",e);
			return false;
		} catch (TypeError e) {
			WxLogger.init.error("类型错误",e);
			return false;
		} catch (ServantAlreadyActive e) {
			WxLogger.init.error("服务已存在",e);
			return false;
		} catch (WrongPolicy e) {
			WxLogger.init.error("错误的策略",e);
			return false;
		}
		return true;
	}
	
	public boolean reConnect(){ 
		boolean result = false;
		WxLogger.flow.info("driver重连网管,先停止driver，在重新初始化");
		this.stop();
		this.init();
		result = connected;
		WxLogger.flow.info("driver重连成功");
		return result;
	}
	
   //////////////////////管理器的get方法//////////////////////////////////////////
	
	public EmsSession_I getEmsSession() {
		return emsSession;
	}

	public EMSMgr_I getEmsMgr() {
		return emsMgr;
	}

	public MultiLayerSubnetworkMgr_I getMultiLayerSubnetworkMgr() {
		return multiLayerSubnetworkMgr;
	}

	public ManagedElementMgr_I getManageElementMgr() {
		return manageElementMgr;
	}

	public EquipmentInventoryMgr_I getEquipment() {
		return equipment;
	}

	public PerformanceManagementMgr_I getPerformanceMgr() {
		return performanceMgr;
	}

	public KYLAND_alarmMgr_I getKyland_alarmMgr() {
		return kyland_alarmMgr;
	}

	public KYLAND_pmMgr_I getKyland_pmMgr() {
		return kyland_pmMgr;
	}


	public void init() {
		WxLogger.init.info("初始化Driver开始。。。");

		if(this.initORB()){
			WxLogger.init.info("初始化ORB完毕。。。");
		}else{
			WxLogger.init.info("初始化ORB失败。。。");
			connected =  false;
		}
		WxLogger.init.info("启动Driver开始。。。");
		try {
			if(!this.connectEMS()){
				WxLogger.init.info("连接网管异常");
				connected = false;
			}
		} catch (ServiceException e) {
			WxLogger.init.info("连接网管异常");
			connected = false;
		}
		
		WxLogger.init.info("连接网管成功");
		if(!this.startORB()){
			WxLogger.init.info("启动orb异常");
			connected = false;
		}
		
		/**定时探测网管连接*/
		/**
		 * 弃用于2014年6月16日
		 * 不在此处重连了，在外部重连
		 */
//		schedule();
		WxLogger.init.info("启动网管探测成功，初始化Driver成功。。。");
		connected = true;
	}


	public void stop() {
		WxLogger.flow.info("开始停止Driver。。。");
//		if(this.nmsSession_I != null)
//			this.nmsSession_I.endSession();
//		WxLogger.flow.info("nms停止完毕");
//		if(this.emsSession != null)
//			this.emsSession.endSession();

		
//		WxLogger.flow.info("会话停止完成");
		if(this.orb != null)
			this.orb.destroy();
		
		WxLogger.flow.info("orb销毁完毕，driver停止完毕");
	}
	
}
