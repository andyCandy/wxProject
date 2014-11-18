
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>MaintenanceAssociationCreateDataType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmaName���Ե�ֵ��
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
     * ����maName���Ե�ֵ��
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
     * ��ȡpacketPriority���Ե�ֵ��
     * 
     */
    public int getPacketPriority() {
        return packetPriority;
    }

    /**
     * ����packetPriority���Ե�ֵ��
     * 
     */
    public void setPacketPriority(int value) {
        this.packetPriority = value;
    }

    /**
     * ��ȡccTestSendInterval���Ե�ֵ��
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
     * ����ccTestSendInterval���Ե�ֵ��
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
     * ��ȡactiveTime���Ե�ֵ��
     * 
     */
    public int getActiveTime() {
        return activeTime;
    }

    /**
     * ����activeTime���Ե�ֵ��
     * 
     */
    public void setActiveTime(int value) {
        this.activeTime = value;
    }

    /**
     * ��ȡbindingType���Ե�ֵ��
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
     * ����bindingType���Ե�ֵ��
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
     * ��ȡbindingObject���Ե�ֵ��
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
     * ����bindingObject���Ե�ֵ��
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
     * ��ȡalarmOccurTime���Ե�ֵ��
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
     * ����alarmOccurTime���Ե�ֵ��
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
     * ��ȡalarmFinishTime���Ե�ֵ��
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
     * ����alarmFinishTime���Ե�ֵ��
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
     * ��ȡalarmEnable���Ե�ֵ��
     * 
     */
    public boolean isAlarmEnable() {
        return alarmEnable;
    }

    /**
     * ����alarmEnable���Ե�ֵ��
     * 
     */
    public void setAlarmEnable(boolean value) {
        this.alarmEnable = value;
    }

    /**
     * ��ȡalarmInterval���Ե�ֵ��
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
     * ����alarmInterval���Ե�ֵ��
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
     * ��ȡalarmsendLevel���Ե�ֵ��
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
     * ����alarmsendLevel���Ե�ֵ��
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
     * ��ȡalarmSuppress���Ե�ֵ��
     * 
     */
    public boolean isAlarmSuppress() {
        return alarmSuppress;
    }

    /**
     * ����alarmSuppress���Ե�ֵ��
     * 
     */
    public void setAlarmSuppress(boolean value) {
        this.alarmSuppress = value;
    }

    /**
     * ��ȡpwMeasureMode���Ե�ֵ��
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
     * ����pwMeasureMode���Ե�ֵ��
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
