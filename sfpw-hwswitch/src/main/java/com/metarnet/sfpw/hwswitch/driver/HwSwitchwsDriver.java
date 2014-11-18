package com.metarnet.sfpw.hwswitch.driver;


import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.tmforum.mtop.mri.wsdl.eir.v1_0.EquipmentInventoryRetrievalRPC;
import org.tmforum.mtop.mri.wsdl.mer.v1_0.ManagedElementRetrievalRPC;
import org.tmforum.mtop.mri.wsdl.tlr.v1_0.TopologicalLinkRetrievalRPC;
import org.tmforum.mtop.mri.wsdl.tpr.v1_0.TerminationPointRetrievalRPC;
import org.tmforum.mtop.rpm.wsdl.pmr.v1_0.PerformanceManagementRetrieval;
import org.tmforum.mtop.rtm.wsdl.ar.v1_0.AlarmRetrieval;

import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hwswitch.util.HwConfig;

public class HwSwitchwsDriver {
	
	/**
	 * 用于创建具体代理服务对象的工厂对象
	 */
	private JaxWsProxyFactoryBean factoryBean;
	
	
	/**
	 * 用于获取告警的接口
	 */
	private AlarmRetrieval almRetrieval;
	
	/**
	 * 用于获取性能的接口
	 */
	private PerformanceManagementRetrieval perfMgrRetrieval;
	
	/**
	 * 用于获取拓扑资源的接口
	 */
	private TopologicalLinkRetrievalRPC tlRetrieval;
	
	/**
	 * 用于获取网元信息的接口
	 */
	private ManagedElementRetrievalRPC meRetrieval;
	
	/**
	 * 获取网元下容器信息
	 */
	private EquipmentInventoryRetrievalRPC equipRetrieval;
	
	/**
	 * 用于获取端口信息的接口
	 */
	private TerminationPointRetrievalRPC tpRetrievalRPC;
	
	
	private HwConfig config;
	
	
	
	public void setConfig(HwConfig config) {
		this.config = config;
	}

	public void init(){
		WxLogger.init.info("初始化开始...");
		factoryBean = new JaxWsProxyFactoryBean();
		createServiceProxy();
	}
	
	/**
	 * 根据服务的class和服务地址创建服务代 理对象
	 * @param serviceProxyClass 服务的class
	 * @param url 服务地址
	 * @return 服务代理对象
	 */
	@SuppressWarnings("unchecked")
	private <T> T getSpecificService(Class<T> serviceProxyClass,String url){
		WxLogger.init.info("创建服务代理对象："+serviceProxyClass.getSimpleName()+",服务地址:"+url);
		factoryBean.setServiceClass(serviceProxyClass);
		factoryBean.setAddress(url);
		T t = (T)factoryBean.create();
		WxLogger.init.info("服务代理对象创建成功");
		return t;
	}
	
	/**
	 * 
	 */
	public void createServiceProxy(){
		
		almRetrieval = this.getSpecificService(AlarmRetrieval.class, config.getUrl()+config.getAlarmService());
		
		perfMgrRetrieval = this.getSpecificService(PerformanceManagementRetrieval.class, config.getUrl()+config.getPerfServcie());
		
		tlRetrieval = this.getSpecificService(TopologicalLinkRetrievalRPC.class, config.getUrl()+config.getTopoService());
		
		meRetrieval = this.getSpecificService(ManagedElementRetrievalRPC.class, config.getUrl()+config.getMeService());
		
		tpRetrievalRPC = this.getSpecificService(TerminationPointRetrievalRPC.class, config.getUrl()+config.getPortService());
		
			
	}

	
	
	public AlarmRetrieval getAlmRetrieval() {
		return almRetrieval;
	}

	public PerformanceManagementRetrieval getPerfMgrRetrieval() {
		return perfMgrRetrieval;
	}

	public TopologicalLinkRetrievalRPC getTlRetrieval() {
		return tlRetrieval;
	}

	public ManagedElementRetrievalRPC getMeRetrieval() {
		return meRetrieval;
	}

	public EquipmentInventoryRetrievalRPC getEquipRetrieval() {
		return equipRetrieval;
	}

	public TerminationPointRetrievalRPC getTpRetrievalRPC() {
		return tpRetrievalRPC;
	}

	
	
}
