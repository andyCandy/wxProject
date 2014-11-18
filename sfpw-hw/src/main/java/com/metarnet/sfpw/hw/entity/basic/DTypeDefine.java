package com.metarnet.sfpw.hw.entity.basic;

import java.util.ArrayList;
import java.util.List;

import com.metarnet.sfpw.hw.util.HuaweiConstants;



/**
 * 设备类型定义
 * 
 * @author Administrator
 * @version 
 * @see com.module.adapter.zte.entity
 * @since
 */
public class DTypeDefine
{
    public static List<String> oltDTypeList = new ArrayList<String>();
    static {
        oltDTypeList.add("MA5680T");
        oltDTypeList.add("MA5683T");
        
    }

    public static List<String> onuDTypeList = new ArrayList<String>();
    static {
        onuDTypeList.add("5621");
        

    }
    /**
     * 根据dType获取网元的类型值
     * @return
     */
    public static String getMeType(String dType){
        if (oltDTypeList.contains(dType))
        {
            return HuaweiConstants.METYPE_OLT;
        } else if (onuDTypeList.contains(dType))
        {
            return HuaweiConstants.METYPE_ONU;
        } else {
            return "";
        }
    }
}
