package com.metarnet.sfpw.hw.mgr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;




import com.metarnet.common.CorrectType;
import com.metarnet.epon.adapter.AdapterException;
import com.metarnet.epon.adapter.Interface;
import com.metarnet.epon.adapter.OLT;
import com.metarnet.epon.adapter.ONU;
import com.metarnet.epon.adapter.ObjectType;
import com.metarnet.epon.adapter.Splitter;
import com.metarnet.epon.adapter.UNI;
import com.metarnet.epon.input.InputCorrect;
import com.metarnet.epon.input.InputException;
import com.metarnet.epon.input.InputInterface;
import com.metarnet.epon.input.InputOLT;
import com.metarnet.epon.input.InputONU;
import com.metarnet.epon.input.InputSplitter;
import com.metarnet.epon.input.InputUNI;
import com.metarnet.epon.manager.mms.EPONAttrAddition;
import com.metarnet.epon.manager.mms.EPONAttrCompare;
import com.metarnet.sfpw.base.exception.ConnectionException;
import com.metarnet.sfpw.base.exception.TaskException;
import com.metarnet.sfpw.base.mgr.ICfgMgr;
import com.metarnet.sfpw.base.util.WxLogger;
import com.metarnet.sfpw.hw.da.HuaweiAdapter;
import com.metarnet.sfpw.hw.database.EponDatabase;

public class HuaweiCfgMgrImpl implements ICfgMgr{

	private EponDatabase database;

	private HuaweiAdapter adapter;
	
	public void setDatabase(EponDatabase database) {
		this.database = database;
	}

	public void setAdapter(HuaweiAdapter adapter) {
		this.adapter = adapter;
	}

	
	public boolean syncCfg(String domain, String meId)
			 {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean syncAllCfg(String domain) throws TaskException, ConnectionException {
		 List<InputOLT> iOLTList ;
		try {
			iOLTList = this.database.getAllOLTs();
			WxLogger.flow.info("从数据库获取OLT"+iOLTList.size()+"条");
		} catch (InputException e1) {
			WxLogger.flow.error("从数据库获取OLT失败。同步配置失败",e1);
			return false;
		}
		 WxLogger.flow.info("从数据库获取OLT"+iOLTList.size()+"条");
	     List<OLT> lOLTList = null;
		try {
			lOLTList = this.adapter.getAllOLTs();
		} catch (AdapterException e1) {
			WxLogger.flow.error("从厂家接口获取OLT失败。同步配置失败",e1);
			throw new TaskException("连接异常",e1.getMessage(),e1);
		}
	     WxLogger.flow.info("从厂家获取OLT"+lOLTList.size()+"条");
	     correctOLTResource(iOLTList, lOLTList);
	     iOLTList.clear();
	 
	     int index = 0;
	     for (OLT olt : lOLTList)
	     {
	       index++; 
	       WxLogger.flow.info("[" + index + "/" + lOLTList.size() + "]:开始同步OLT(" + olt.oltId() + 
	         ")内部资源...");
	       
	         List<InputInterface> iInterfaceList = null;
			try {
				iInterfaceList = this.database.getAllInterfaces(olt.oltId());
				
			} catch (InputException e1) {
				WxLogger.flow.info("从库里查询端口异常:"+olt.oltId());
				System.out.println(new Date()+":同步olt下端口时，从库里查询端口异常，olt:"+olt.oltId());
				continue;
			}
	         List<Interface> lInterfaceList = null;
			try {
				lInterfaceList = this.adapter.getAllInterfaces(olt);
			} catch (AdapterException e1) {
				WxLogger.flow.info("从厂家网管查询端口异常:"+olt.oltId());
				System.out.println(new Date()+":同步olt下端口时，从厂家网管查询端口异常，olt:"+olt.oltId());
				continue;
			}
	         correctInterfaceResource(olt.oltId(), iInterfaceList, lInterfaceList);
	         iInterfaceList.clear();
	         lInterfaceList.clear();
	 
	         List<InputONU> iONUList = null;;
			try {
				iONUList = this.database.getAllONUs(olt.oltId());
			} catch (InputException e) {
				 WxLogger.flow.info("从库里查询ONU异常:"+olt.oltId());
				 System.out.println(new Date()+":同步olt下端口时，从库里查询ONU异常，olt:"+olt.oltId());
				continue;
			}
	         WxLogger.flow.info("从库里查到ONU"+iONUList.size()+"条");
	         List<ONU> lONUList = null;
			try {
				lONUList = this.adapter.getAllONUs(olt.oltId());
			} catch (AdapterException e) {
				WxLogger.flow.info("从厂家查询ONU异常:"+olt.oltId());
				System.out.println(new Date()+":同步olt下端口时，从厂家网管查询ONU异常，olt:"+olt.oltId());
				continue;
			}
	         WxLogger.flow.info("从厂家查到ONU"+lONUList.size()+"条");
	         correctONUResource(olt.oltId(), iONUList, lONUList);
	         iONUList.clear();
	         lONUList.clear();
	 
//	         List<InputUNI> iUNIList = this.database.getAllUNIs(olt.oltId());
//	         if (iUNIList == null) {
//	           iUNIList = new ArrayList<InputUNI>();
//	         }
//	         List<UNI> lUNIList = this.adapter.getAllUNIs(olt.oltId());
//	         if (lUNIList == null) {
//	           lUNIList = new ArrayList<UNI>();
//	         }
//	         correctUNIResource(olt.oltId(), iUNIList, lUNIList);
//	         iUNIList.clear();
//	         lUNIList.clear();
	       
	 
	     }
	 
	     lOLTList.clear();
		return false;
	}

	
	public boolean syncTopo(String domain) {
		// TODO Auto-generated method stub
		return false;
	}

	
	 private void correctOLTResource(List<InputOLT> input, List<OLT> local)
	   {
	     System.out.println("录入库OLT个数量:" + input.size());
	     System.out.println("设备侧OLT个数量:" + local.size());
	 
	     boolean[] flags = new boolean[input.size()];
	     for (int i = 0; i < flags.length; i++) {
	       flags[i] = false;
	     }
	 
	     InputOLT[] iArray = new InputOLT[input.size()];
	     OLT[] lArray = new OLT[local.size()];
	     iArray = (InputOLT[])input.toArray(iArray);
	     lArray = (OLT[])local.toArray(lArray);
	 
	     for (int l = 0; l < lArray.length; l++)
	     {
	       int i = 0;
	       for (; i < iArray.length; i++)
	       {
	         if (!iArray[i].oltId().equals(lArray[l].oltId()))
	           continue;
	         flags[i] = true;
	 
	         EPONAttrCompare compare = new EPONAttrCompare();
	 
	         compare.add("NAME", iArray[i].name(), lArray[l].name());
	 
	         compare.add("TYPE", iArray[i].type(), lArray[l].type());
	 
	         compare.add("VERSION", iArray[i].version(), lArray[l].version());
	 
	         compare.add("ADDRESS", iArray[i].address(), lArray[l].address());
	 
	         compare.add("VENDOR", iArray[i].vendor(), lArray[l].vendor());
	 
	         if (compare.isEmpty())
	           break;
	         InputOLT equip = new InputOLT();
	 
	         equip.oltId(lArray[l].oltId());
	 
	         equip.address(lArray[l].address());
	 
	         equip.name(lArray[l].name());
	 
	         equip.type(lArray[l].type());
	 
	         equip.version(lArray[l].version());
	 
	         equip.vendor(lArray[l].vendor().value());
	 
	         this.database.modifyOLT(equip);
	 
	         break;
	       }
	 
	       if (i != iArray.length)
	         continue;
	       InputOLT equip = new InputOLT();
	 
	       equip.oltId(lArray[l].oltId());
	 
	       equip.address(lArray[l].address());
	 
	       equip.name(lArray[l].name());
	 
	       equip.type(lArray[l].type());
	 
	       equip.version(lArray[l].version());
	 
	       equip.vendor(lArray[l].vendor().value());
	 
	       this.database.addOLT(equip);
	     }
	 
	     for (int i = 0; i < iArray.length; i++) {
	       if (flags[i] != false)
	         continue;
	       this.database.delOLT(iArray[i].oltId());
	     }
	   }
	 
	   private void correctInterfaceResource(String oltId, List<InputInterface> input, List<Interface> local)
	   {
	     for (InputInterface item : input) {
	       if (!item.oltId().equals(oltId)) {
	         input.remove(item);
	       }
	     }
	 
	     for (Interface item : local) {
	       if (!item.oltId().equals(oltId)) {
	         input.remove(item);
	       }
	 
	     }
	 
	     System.out.println("录入库OLT(" + oltId + ")的接口数量:" + input.size());
	     System.out.println("设备侧OLT(" + oltId + ")的接口数量:" + local.size());
	 
	     boolean[] flags = new boolean[input.size()];
	     for (int i = 0; i < flags.length; i++) {
	       flags[i] = false;
	     }
	 
	     InputInterface[] iArray = new InputInterface[input.size()];
	     Interface[] lArray = new Interface[local.size()];
	     iArray = (InputInterface[])input.toArray(iArray);
	     lArray = (Interface[])local.toArray(lArray);
	 
	     for (int l = 0; l < lArray.length; l++)
	     {
	       int i = 0;
	       for (; i < iArray.length; i++)
	       {
	         if (!iArray[i].interfaceId().equals(lArray[l].interfaceId()))
	           continue;
	         flags[i] = true;
	 
	         EPONAttrCompare compare = new EPONAttrCompare();
	 
	         compare.add("NAME", iArray[i].name(), lArray[l].name());
	 
	         compare.add("TYPE", iArray[i].type(), lArray[l].type());
	 
	         compare.add("SPEED", iArray[i].speed(), lArray[l].speed());
	 
	         compare.add("ADDRESS", iArray[i].address(), lArray[l].address());
	 
	         if (compare.isEmpty()) {
	           break;
	         }
	         InputCorrect correct = new InputCorrect();
	 
	         correct.oltId(lArray[l].oltId());
	 
	         correct.objectType(ObjectType.INTERFACE.value());
	 
	         correct.objectName(lArray[l].oltId() + "=" + lArray[l].interfaceId());
	 
	         correct.type(CorrectType.ATTRIBUTE_CHANGED);
	 
	         correct.attrnames(compare.getNames());
	 
	         correct.attrovalues(compare.getOValues());
	 
	         correct.attrnvalues(compare.getNValues());
	 
	         this.database.addCorrect(correct);
	 
	         InputInterface ini = new InputInterface();
	 
	         ini.oltId(oltId);
	 
	         ini.interfaceId(lArray[l].interfaceId());
	 
	         ini.type(lArray[l].type());
	 
	         ini.name(lArray[l].name());
	 
	         ini.address(lArray[l].address());
	 
	         ini.speed(lArray[l].speed());
	 
	         this.database.updateInterface(ini);
	 
	         break;
	       }
	 
	       if (i != iArray.length)
	       {
	         continue;
	       }
	 
	       InputInterface ini = new InputInterface();
	 
	       ini.oltId(lArray[l].oltId());
	 
	       ini.interfaceId(lArray[l].interfaceId());
	 
	       ini.type(lArray[l].type());
	 
	       ini.name(lArray[l].name());
	 
	       ini.address(lArray[l].address());
	 
	       ini.speed(lArray[l].speed());
	 
	       this.database.addInterface(ini);
	     }
	 
	     for (int i = 0; i < iArray.length; i++) {
	       if (flags[i] != false)
	       {
	         continue;
	       }
	 
	       this.database.removeInterface(iArray[i].oltId(), iArray[i].interfaceId());
	     }
	   }
	 
	   private void correctSplitterResource(String oltId, List<InputSplitter> input, List<Splitter> local)
	   {
	     for (InputSplitter item : input) {
	       if (!item.oltId().equals(oltId)) {
	         input.remove(item);
	       }
	     }
	 
	     for (Splitter item : local) {
	       if (!item.oltId().equals(oltId)) {
	         input.remove(item);
	       }
	 
	     }
	 
	     System.out.println("录入库OLT(" + oltId + ")的分光器数量:" + input.size());
	     System.out.println("设备侧OLT(" + oltId + ")的分光器数量:" + local.size());
	 
	     boolean[] flags = new boolean[input.size()];
	     for (int i = 0; i < flags.length; i++) {
	       flags[i] = false;
	     }
	 
	     InputSplitter[] iArray = new InputSplitter[input.size()];
	     Splitter[] lArray = new Splitter[local.size()];
	     iArray = (InputSplitter[])input.toArray(iArray);
	     lArray = (Splitter[])local.toArray(lArray);
	 
	     for (int l = 0; l < lArray.length; l++)
	     {
	       int i = 0;
	       for (; i < iArray.length; i++)
	       {
	         if (!iArray[i].splitterId().equals(lArray[l].splitterId()))
	           continue;
	         flags[i] = true;
	 
	         EPONAttrCompare compare = new EPONAttrCompare();
	 
	         compare.add("INTERFACEID", iArray[i].interfaceId(), 
	           lArray[l].interfaceId());
	 
	         compare.add("NAME", iArray[i].name(), lArray[l].name());
	 
	         compare.add("TYPE", iArray[i].type(), lArray[l].type());
	 
	         if (compare.isEmpty()) {
	           break;
	         }
	         InputCorrect correct = new InputCorrect();
	 
	         correct.oltId(lArray[l].oltId());
	 
	         correct.objectType(ObjectType.SPLITTER.value());
	 
	         correct.objectName(lArray[l].oltId() + "=" + lArray[l].splitterId());
	 
	         correct.type(CorrectType.ATTRIBUTE_CHANGED);
	 
	         correct.attrnames(compare.getNames());
	 
	         correct.attrovalues(compare.getOValues());
	 
	         correct.attrnvalues(compare.getNValues());
	 
	         this.database.addCorrect(correct);
	 
	         break;
	       }
	 
	       if (i != iArray.length)
	         continue;
	       EPONAttrAddition addition = new EPONAttrAddition();
	 
	       addition.add("INTERFACEID", lArray[l].interfaceId());
	 
	       addition.add("NAME", lArray[l].name());
	 
	       addition.add("TYPE", lArray[l].type());
	 
	       InputCorrect correct = new InputCorrect();
	 
	       correct.oltId(lArray[l].oltId());
	 
	       correct.objectType(ObjectType.SPLITTER.value());
	 
	       correct.objectName(lArray[l].oltId() + "=" + lArray[l].splitterId());
	 
	       correct.type(CorrectType.OBJECT_CREATION);
	 
	       correct.attrnames(addition.getNames());
	 
	       correct.attrovalues("");
	 
	       correct.attrnvalues(addition.getValues());
	 
	       this.database.addCorrect(correct);
	     }
	 
	     for (int i = 0; i < iArray.length; i++) {
	       if (flags[i] != false) {
	         continue;
	       }
	       InputCorrect correct = new InputCorrect();
	 
	       correct.oltId(iArray[i].oltId());
	 
	       correct.objectType(ObjectType.SPLITTER.value());
	 
	       correct.objectName(iArray[i].oltId() + "=" + iArray[i].splitterId());
	 
	       correct.type(CorrectType.OBJECT_DELETION);
	 
	       correct.attrnames("");
	 
	       correct.attrovalues("");
	 
	       correct.attrnvalues("");
	 
	       this.database.addCorrect(correct);
	     }
	   }
	 
	   private void correctONUResource(String oltId, List<InputONU> input, List<ONU> local)
	   {
	     for (InputONU item : input) {
	       if (!item.oltId().equals(oltId)) {
	         input.remove(item);
	       }
	     }
	 
	     for (ONU item : local) {
	       if (!item.oltId().equals(oltId)) {
	         local.remove(item);
	       }
	 
	     }
	 
	     WxLogger.flow.info("录入库OLT(" + oltId + ")的ONU数量:" + input.size());
	     WxLogger.flow.info("设备侧OLT(" + oltId + ")的ONU数量:" + local.size());
	 
	     boolean[] flags = new boolean[input.size()];
	     for (int i = 0; i < flags.length; i++) {
	       flags[i] = false;
	     }
	 
	     InputONU[] iArray = new InputONU[input.size()];
	     ONU[] lArray = new ONU[local.size()];
	     iArray = (InputONU[])input.toArray(iArray);
	     lArray = (ONU[])local.toArray(lArray);
	 
	     for (int l = 0; l < lArray.length; l++)
	     {
	       int i = 0;
	       for (; i < iArray.length; i++)
	       {
	         if (!iArray[i].onuId().equals(lArray[l].onuId())){
	           continue;
	         }
	         flags[i] = true;
	 
	         EPONAttrCompare compare = new EPONAttrCompare();
	 
	         compare.add("splitterId", iArray[i].splitterId(), lArray[l].splitterId());
	 
	         compare.add("interfaceId", iArray[i].interfaceId(), 
	           lArray[l].interfaceId());
	 
	         compare.add("name", iArray[i].name(), lArray[l].name());
	 
	         compare.add("type", iArray[i].type(), lArray[l].type());
	 
	         compare.add("mac", iArray[i].mac(), lArray[l].mac());
	 
	         compare.add("ip", iArray[i].ip(), lArray[l].ip());
	 
	         compare.add("distance", iArray[i].distance(), lArray[l].distance());
	 
	         compare.add("vendor", iArray[i].vendor(), lArray[l].vendor());
	 
	         if (compare.isEmpty())
	         {
	           break;
	         }
	 
	         InputONU inputo = new InputONU();
	 
	         inputo.oltId(oltId);
	 
	         inputo.onuId(lArray[l].onuId());
	 
	         inputo.splitterId(lArray[l].splitterId());
	 
	         inputo.interfaceId(lArray[l].interfaceId());
	 
	         inputo.name(lArray[l].name());
	 
	         inputo.type(lArray[l].type());
	 
	         inputo.mac(lArray[l].mac());
	 
	         inputo.ip(lArray[l].ip());
	 
	         inputo.distance(lArray[l].distance());
	 
	         inputo.vendor(lArray[l].vendor().value());
	 
	         this.database.updateONU(inputo);
	 
	         break;
	       }
	 
	       if (i != iArray.length)
	       {
	         continue;
	       }
	 
	       InputONU inputo = new InputONU();
	 
	       inputo.oltId(oltId);
	 
	       inputo.onuId(lArray[l].onuId());
	 
	       inputo.splitterId(lArray[l].splitterId());
	 
	       inputo.interfaceId(lArray[l].interfaceId());
	 
	       inputo.name(lArray[l].name());
	 
	       inputo.type(lArray[l].type());
	 
	       inputo.mac(lArray[l].mac());
	 
	       inputo.ip(lArray[l].ip());
	 
	       inputo.distance(lArray[l].distance());
	 
	       inputo.vendor(lArray[l].vendor().value());
	       WxLogger.flow.info("新增ONU:"+inputo.name());
	       this.database.addONU(inputo);
	     }
	 
	     for (int i = 0; i < iArray.length; i++) {
	       if (flags[i] != false)
	       {
	         continue;
	       }
	 
	       this.database.removeONU(oltId, iArray[i].onuId());
	     }
	   }
	 
	   private void correctUNIResource(String oltId, List<InputUNI> input, List<UNI> local)
	   {
	     for (InputUNI item : input) {
	       if (!item.oltId().equals(oltId)) {
	         input.remove(item);
	       }
	     }
	 
	     for (UNI item : local) {
	       if (!item.oltId().equals(oltId)) {
	         input.remove(item);
	       }
	 
	     }
	 
	     System.out.println("录入库OLT(" + oltId + ")的UNI数量:" + input.size());
	     System.out.println("设备侧OLT(" + oltId + ")的UNI数量:" + local.size());
	 
	     boolean[] flags = new boolean[input.size()];
	     for (int i = 0; i < flags.length; i++) {
	       flags[i] = false;
	     }
	 
	     InputUNI[] iArray = new InputUNI[input.size()];
	     UNI[] lArray = new UNI[local.size()];
	     iArray = (InputUNI[])input.toArray(iArray);
	     lArray = (UNI[])local.toArray(lArray);
	 
	     for (int l = 0; l < lArray.length; l++)
	     {
	       int i = 0;
	       for (; i < iArray.length; i++)
	       {
	         if ((!iArray[i].onuId().equals(lArray[l].onuId())) || 
	           (!iArray[i].uniId().equals(lArray[l].uniId())))
	           continue;
	         flags[i] = true;
	 
	         EPONAttrCompare compare = new EPONAttrCompare();
	 
	         compare.add("NAME", iArray[i].name(), lArray[l].name());
	 
	         compare.add("TYPE", iArray[i].type(), lArray[l].type());
	 
	         compare.add("SPEED", iArray[i].speed(), lArray[l].speed());
	 
	         compare.add("ADDRESS", iArray[i].address(), lArray[l].address());
	 
	         if (compare.isEmpty())
	         {
	           break;
	         }
	 
	         InputUNI ini = new InputUNI();
	 
	         ini.oltId(lArray[l].oltId());
	 
	         ini.onuId(lArray[l].onuId());
	 
	         ini.uniId(lArray[l].uniId());
	 
	         ini.type(lArray[l].type());
	 
	         ini.name(lArray[l].name());
	 
	         ini.address(lArray[l].address());
	 
	         ini.speed(lArray[l].speed().value());
	 
	         this.database.updateUNI(ini);
	 
	         break;
	       }
	 
	       if (i != iArray.length)
	       {
	         continue;
	       }
	 
	       InputUNI ini = new InputUNI();
	 
	       ini.oltId(lArray[l].oltId());
	 
	       ini.onuId(lArray[l].onuId());
	 
	       ini.uniId(lArray[l].uniId());
	 
	       ini.type(lArray[l].type());
	 
	       ini.name(lArray[l].name());
	 
	       ini.address(lArray[l].address());
	 
	       ini.speed(lArray[l].speed().value());
	 
	       this.database.addUNI(ini);
	     }
	 
	     for (int i = 0; i < iArray.length; i++) {
	       if (flags[i] != false)
	       {
	         continue;
	       }
	 
	       this.database.removeUNI(iArray[i].oltId(), iArray[i].onuId(), iArray[i].uniId());
	     }
	   }

	public void updatePortToEquip(String domain) {
		this.database.updatePortToEquip(domain);
	}
	
}
