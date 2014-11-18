package com.metarnet.sfpw.kyland.util;

import java.util.ArrayList;
import java.util.List;



import com.metarnet.sfpw.kyland.driver.Constant;

import globaldefs.NameAndStringValue_T;

public class NameUtil {

	/**
	 * 
	 * @TODO 构造端口名称
	 * @return List<NameAndStringValue_T[]>
	 * @param emsName 网管名
	 * @param meId    设备id
	 * @param portId  端口id
	 *
	 */
	public static List<NameAndStringValue_T[]> makeUpPortName(NameAndStringValue_T emsName,String meId,String portId){
		/**用于存放结果的list，结束时返回此names*/
		List<NameAndStringValue_T[]> names = new ArrayList<NameAndStringValue_T[]>();
		/**构造me和port的名称对象*/
		NameAndStringValue_T meName = new NameAndStringValue_T();
		NameAndStringValue_T portName = new NameAndStringValue_T();
		/**给名称对象赋值，*/
		meName.name = Constant.MEKEY;
		meName.value = meId;
		portName.name = Constant.PORTKEY;
		portName.value = "/rack=1/shelf=1/slot=1/port=" + portId;
		/**将名称对象放入数组中*/
		NameAndStringValue_T[] port = new NameAndStringValue_T[]{emsName,meName,portName};
		/**将数组放入list中*/
		names.add(port);
		return names;
	}
	
	/**
	 * 
	 * @TODO 构造网元名称，类似构造端口名称
	 * @return List<NameAndStringValue_T[]>
	 * @param emsName
	 * @param meId
	 *
	 */
	public static List<NameAndStringValue_T[]> makeUpMeName(NameAndStringValue_T emsName,String meId){
		List<NameAndStringValue_T[]> names = new ArrayList<NameAndStringValue_T[]>();
		NameAndStringValue_T meName = new NameAndStringValue_T();
		meName.name = Constant.MEKEY;
		meName.value = meId;
		NameAndStringValue_T[] port = new NameAndStringValue_T[]{emsName,meName};
		names.add(port);
		return names;
	}
	
	
}
