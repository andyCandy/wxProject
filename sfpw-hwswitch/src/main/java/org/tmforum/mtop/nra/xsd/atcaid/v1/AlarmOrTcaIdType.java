
package org.tmforum.mtop.nra.xsd.atcaid.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.alarmid.v1.AlarmIdType;
import org.tmforum.mtop.nra.xsd.tcaid.v1.TcaIdType;


/**
 * <p>AlarmOrTcaIdType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AlarmOrTcaIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alarmId" type="{http://www.tmforum.org/mtop/nra/xsd/alarmid/v1}AlarmIdType" minOccurs="0"/>
 *         &lt;element name="tcaId" type="{http://www.tmforum.org/mtop/nra/xsd/tcaid/v1}TcaIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmOrTcaIdType", propOrder = {
    "alarmId",
    "tcaId"
})
public class AlarmOrTcaIdType {

    protected AlarmIdType alarmId;
    protected TcaIdType tcaId;

    /**
     * 获取alarmId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AlarmIdType }
     *     
     */
    public AlarmIdType getAlarmId() {
        return alarmId;
    }

    /**
     * 设置alarmId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmIdType }
     *     
     */
    public void setAlarmId(AlarmIdType value) {
        this.alarmId = value;
    }

    /**
     * 获取tcaId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TcaIdType }
     *     
     */
    public TcaIdType getTcaId() {
        return tcaId;
    }

    /**
     * 设置tcaId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TcaIdType }
     *     
     */
    public void setTcaId(TcaIdType value) {
        this.tcaId = value;
    }

}
