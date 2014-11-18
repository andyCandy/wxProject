package com.metarnet.sfpw.hw.entity.basic;

public class DevTypeMap {

	public static int getDevType(String devTypeStr){
		if(devTypeStr.contentEquals("MA5680T")){
			return 40102;
		}else if(devTypeStr.contentEquals("5621") || devTypeStr.contentEquals("MA5621")){
			return 40103;
		}else{
			return 40101;
		}	
	}
}
