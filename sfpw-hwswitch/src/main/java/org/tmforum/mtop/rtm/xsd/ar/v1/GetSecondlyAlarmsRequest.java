
package org.tmforum.mtop.rtm.xsd.ar.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.atcaid.v1.AlarmOrTcaIdListType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rootAlarmIdList" type="{http://www.tmforum.org/mtop/nra/xsd/atcaid/v1}AlarmOrTcaIdListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rootAlarmIdList"
})
@XmlRootElement(name = "getSecondlyAlarmsRequest")
public class GetSecondlyAlarmsRequest {

    protected AlarmOrTcaIdListType rootAlarmIdList;

    /**
     * 获取rootAlarmIdList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AlarmOrTcaIdListType }
     *     
     */
    public AlarmOrTcaIdListType getRootAlarmIdList() {
        return rootAlarmIdList;
    }

    /**
     * 设置rootAlarmIdList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmOrTcaIdListType }
     *     
     */
    public void setRootAlarmIdList(AlarmOrTcaIdListType value) {
        this.rootAlarmIdList = value;
    }

}
