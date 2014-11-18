package com.metarnet.sfpw.base.interactivetask;


import com.metarnet.adapter.ABSDcpHandler;
import com.metarnet.service.ServiceException;
import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.IAlarmMgr;
import com.metarnet.sfpw.base.mgr.ICfgMgr;
import com.metarnet.sfpw.base.mgr.IPerfMgr;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.dcp.alarm.SynchronizeAlarmM2ARequest;
import com.metarnet.dcp.performance.GetCurPerfRequest;
import com.metarnet.dcp.performance.HistoryPerfTrigger;
import com.metarnet.dcp.resource.ResourceType;
import com.metarnet.dcp.resource.SynchronizeResourceM2ARequest;
import com.metarnet.dppapi.MSGBody;
import com.metarnet.dppapi.MSGFrame;

public class DCPHandler extends ABSDcpHandler {

	/**配置管理*/
	private ICfgMgr cfgMgr;
	
	/**告警管理*/
	private IAlarmMgr alarmMgr;
	
	/**性能管理*/
	private IPerfMgr perfMgr;
	
	private String managedElementField = "managedElement";
	
	private String mainField = "domain";
	
	public void setCfgMgr(ICfgMgr cfgMgr) {
		
		this.cfgMgr = cfgMgr;
		
	}
	
	public void setAlarmMgr(IAlarmMgr alarmMgr) {
		this.alarmMgr = alarmMgr;
	}



	public void setPerfMgr(IPerfMgr perfMgr) {
		this.perfMgr = perfMgr;
	}

	public DCPHandler(){
	}
	
	public void init(){
		
		try {
			this.doInit();
			this.doStart();
			WxLogger.init.info("DCPHandler初始化成功。。。");
		} catch (ServiceException e) {
			WxLogger.init.error("DCPHandler初始化异常",e);
		}
	}
	public void destroy(){
		try {
			this.doStop();
		} catch (ServiceException e) {
			WxLogger.init.error("DCPHandler销毁异常",e);
		}
	}
	
	/**
	 * 本类入口，接收消息后触发此方法，进行同步
	 */
	public void onMessage(MSGFrame msg) {
		MSGBody body = msg.getBody();
		
		if(body instanceof GetCurPerfRequest){
			WxLogger.flow.info("OnMessage:同步性能...");
			System.out.println("同步性能...");
			this.getCurPerfRequest((GetCurPerfRequest)body,msg.getSource(),msg.getSerial());
			System.out.println("同步性能完成...");
			WxLogger.flow.info("OnMessage:同步性能完成...");
		}else if(body instanceof SynchronizeResourceM2ARequest){
			/**同步资源*/
			WxLogger.flow.info("OnMessage:同步资源...");
			System.out.println("同步资源...");
			this.syncResource((SynchronizeResourceM2ARequest)body,msg.getSource(),msg.getSerial());
			System.out.println("同步完成...");
			WxLogger.flow.info("OnMessage:同步资源完成...");
		}else if(body instanceof SynchronizeAlarmM2ARequest){
			/**同步告警*/
			System.out.println("同步告警...");
			WxLogger.flow.info("OnMessage:同步告警...");
			this.syncAlarm((SynchronizeAlarmM2ARequest)body,msg.getSource(),msg.getSerial());
			System.out.println("同步告警完成...");
			WxLogger.flow.info("OnMessage:同步告警完成...");
		}else if(body instanceof HistoryPerfTrigger){
			System.out.println("同步历史性能，未实现");
		}else{
			System.out.println("其他未知命令...");
		}

	}

	/**
	 * 
	 * @TODO 同步性能
	 * @return void
	 * @param body
	 * @param source
	 * @param msgid
	 *
	 */
	public void getCurPerfRequest(GetCurPerfRequest body, String source, int msgid){
		/**判断是否支持性能*/
		if(this.perfMgr == null){
			WxLogger.flow.error("未实现性能管理功能");
			//此处应该向前台反馈，本项目暂时没有此功能
		     return;
		}
		try{
			String id = body.getId();
			
			if(id != null){
				/**同步指定设备及其下所有端口性能*/
				WxLogger.flow.info("同步指定设备及其下所有端口性能,id="+id);
				this.perfMgr.syncPerf(id);
			}else{
				/**同步所有设备以及其下所有端口性能*/
				WxLogger.flow.info("同步所有设备以及其下所有端口性能");
				this.perfMgr.syncAllPerf();
			}
			
		}catch(TaskException e){
			WxLogger.flow.error(String.format("手动性能任务失败，原因:%s,%s",e.getReason(),e.getMessage()),e);
			//此处应该向前台反馈，本项目暂时没有此功能
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 
	 * @TODO 同步资源
	 * @return void
	 * @param body
	 * @param source
	 * @param invokeid
	 *
	 */
	public void syncResource(SynchronizeResourceM2ARequest body, String source, int invokeid){
		
		if(this.cfgMgr == null){
			WxLogger.flow.error("配置更新功能未实现");
			//此处应该向前台反馈，本项目暂时没有此功能
		}
		try{
			if(this.managedElementField.equals(body.className)){
				if(body.type == ResourceType.PHYSICAL){
					WxLogger.flow.info("同步指定网元及其下端口，id="+body.id);
					this.cfgMgr.syncCfg(this.domain,body.id);
				}else{
					//同步交叉，暂时不支持交叉
				}
			}else if(this.mainField.equals(body.className)){
				if(body.type == ResourceType.LOGICAL){
					WxLogger.flow.info("同步所有拓扑");
					this.cfgMgr.syncTopo(this.domain);
				}else{
					WxLogger.flow.info("同步所有设备和端口");
					this.cfgMgr.syncAllCfg(this.domain);
					this.cfgMgr.updatePortToEquip(this.domain);
				}
			}else{
				throw new TaskException(String.format("不支持的同步类型对象(%1$s)", new Object[]{body.className}),"不支持前台发来的同步类型");
			}
		}catch(TaskException e){
			WxLogger.flow.error(String.format("手动配置任务失败，原因:%s,%s",e.getReason(),e.getMessage()),e);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void syncAlarm(SynchronizeAlarmM2ARequest body, String source, int invokeid){
		
		if(this.alarmMgr == null){
			WxLogger.flow.error("告警同步功能未实现");
			//此处应该向前台反馈，本项目暂时没有此功能
		}
		try{
			
			/**查看是否是支持的请求*/
			String alarmResType = body.className;
			if(!this.mainField.equals(alarmResType)&&!this.managedElementField.equals(alarmResType)){
				throw new TaskException(String.format("不支持的同步类型对象(%1$s)", new Object[]{alarmResType}),"不支持前台发来的同步类型");
			}
			
			/**同步指定网元的处理*/
			if(this.managedElementField.equals(alarmResType)){
				WxLogger.flow.info("同步"+body.id+"网元的告警。");
				this.alarmMgr.syncMeAlarm(this.domain,body.id);
	
			}else{
				/**同步所有网元的处理*/
				WxLogger.flow.info("同步所有网元的告警。");
				this.alarmMgr.syncAllAlarm(this.domain);
			}
		}catch(TaskException e){
			WxLogger.flow.error(String.format("手动告警同步任务失败，原因:%s,%s",e.getReason(),e.getMessage()),e);
			//此处应该向前台反馈，本项目暂时没有此功能
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
