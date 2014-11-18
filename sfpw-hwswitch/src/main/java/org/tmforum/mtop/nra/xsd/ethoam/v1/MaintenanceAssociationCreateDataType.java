
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>MaintenanceAssociationCreateDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MaintenanceAssociationCreateDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="packetPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ccTestSendInterval" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activeTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bindingType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bindingObject" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="alarmOccurTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmFinishTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmEnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="alarmInterval" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmsendLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmSuppress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pwMeasureMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceAssociationCreateDataType", propOrder = {
    "maName",
    "packetPriority",
    "ccTestSendInterval",
    "activeTime",
    "bindingType",
    "bindingObject",
    "alarmOccurTime",
    "alarmFinishTime",
    "alarmEnable",
    "alarmInterval",
    "alarmsendLevel",
    "alarmSuppress",
    "pwMeasureMode"
})
public class MaintenanceAssociationCreateDataType {

    @XmlElement(required = true)
    protected NamingAttributeType maName;
    protected int packetPriority;
    @XmlElement(required = true)
    protected String ccTestSendInterval;
    protected int activeTime;
    @XmlElement(required = true)
    protected String bindingType;
    @XmlElement(required = true)
    protected NamingAttributeType bindingObject;
    @XmlElement(required = true)
    protected String alarmOccurTime;
    @XmlElement(required = true)
    protected String alarmFinishTime;
    protected boolean alarmEnable;
    @XmlElement(required = true)
    protected String alarmInterval;
    @XmlElement(required = true)
    protected String alarmsendLevel;
    protected boolean alarmSuppress;
    @XmlElement(required = true)
    protected String pwMeasureMode;

    /**
     * 获取maName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMaName() {
        return maName;
    }

    /**
     * 设置maName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMaName(NamingAttributeType value) {
        this.maName = value;
    }

    /**
     * 获取packetPriority属性的值。
     * 
     */
    public int getPacketPriority() {
        return packetPriority;
    }

    /**
     * 设置packetPriority属性的值。
     * 
     */
    public void setPacketPriority(int value) {
        this.packetPriority = value;
    }

    /**
     * 获取ccTestSendInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcTestSendInterval() {
        return ccTestSendInterval;
    }

    /**
     * 设置ccTestSendInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcTestSendInterval(String value) {
        this.ccTestSendInterval = value;
    }

    /**
     * 获取activeTime属性的值。
     * 
     */
    public int getActiveTime() {
        return activeTime;
    }

    /**
     * 设置activeTime属性的值。
     * 
     */
    public void setActiveTime(int value) {
        this.activeTime = value;
    }

    /**
     * 获取bindingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingType() {
        return bindingType;
    }

    /**
     * 设置bindingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingType(String value) {
        this.bindingType = value;
    }

    /**
     * 获取bindingObject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getBindingObject() {
        return bindingObject;
    }

    /**
     * 设置bindingObject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setBindingObject(NamingAttributeType value) {
        this.bindingObject = value;
    }

    /**
     * 获取alarmOccurTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmOccurTime() {
        return alarmOccurTime;
    }

    /**
     * 设置alarmOccurTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmOccurTime(String value) {
        this.alarmOccurTime = value;
    }

    /**
     * 获取alarmFinishTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmFinishTime() {
        return alarmFinishTime;
    }

    /**
     * 设置alarmFinishTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmFinishTime(String value) {
        this.alarmFinishTime = value;
    }

    /**
     * 获取alarmEnable属性的值。
     * 
     */
    public boolean isAlarmEnable() {
        return alarmEnable;
    }

    /**
     * 设置alarmEnable属性的值。
     * 
     */
    public void setAlarmEnable(boolean value) {
        this.alarmEnable = value;
    }

    /**
     * 获取alarmInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmInterval() {
        return alarmInterval;
    }

    /**
     * 设置alarmInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmInterval(String value) {
        this.alarmInterval = value;
    }

    /**
     * 获取alarmsendLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmsendLevel() {
        return alarmsendLevel;
    }

    /**
     * 设置alarmsendLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmsendLevel(String value) {
        this.alarmsendLevel = value;
    }

    /**
     * 获取alarmSuppress属性的值。
     * 
     */
    public boolean isAlarmSuppress() {
        return alarmSuppress;
    }

    /**
     * 设置alarmSuppress属性的值。
     * 
     */
    public void setAlarmSuppress(boolean value) {
        this.alarmSuppress = value;
    }

    /**
     * 获取pwMeasureMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwMeasureMode() {
        return pwMeasureMode;
    }

    /**
     * 设置pwMeasureMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwMeasureMode(String value) {
        this.pwMeasureMode = value;
    }

}
