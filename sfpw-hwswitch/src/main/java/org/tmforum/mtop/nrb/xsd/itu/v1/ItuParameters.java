
package org.tmforum.mtop.nrb.xsd.itu.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="x721.OperationalState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="x721.AdministrativeState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}X721.AdministrativeStateType" minOccurs="0"/>
 *         &lt;element name="x721.UsageState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}X721.UsageStateType" minOccurs="0"/>
 *         &lt;element name="x721.AvailabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="x721.ControlStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="m3100.HolderStatus" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}M3100.HolderStatusType" minOccurs="0"/>
 *         &lt;element name="m3100.CircuitPackType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="m3100.AlarmStatus" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}M3100.AlarmStatusType" minOccurs="0"/>
 *         &lt;element name="m3100.ArcState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}M3100.ArcStateType" minOccurs="0"/>
 *         &lt;element name="m3100.NALMTIInterval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="m3100.NALMQIInterval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="m3100.ArcQIStatus" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}M3100.ArcQIStatusType" minOccurs="0"/>
 *         &lt;element name="x721.Unkownstatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="x721.State" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}X721.StateType" minOccurs="0"/>
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
    "x721OperationalState",
    "x721AdministrativeState",
    "x721UsageState",
    "x721AvailabilityStatus",
    "x721ControlStatus",
    "m3100HolderStatus",
    "m3100CircuitPackType",
    "m3100AlarmStatus",
    "m3100ArcState",
    "m3100NALMTIInterval",
    "m3100NALMQIInterval",
    "m3100ArcQIStatus",
    "x721Unkownstatus",
    "x721State"
})
@XmlRootElement(name = "ituParameters")
public class ItuParameters {

    @XmlElement(name = "x721.OperationalState")
    protected Boolean x721OperationalState;
    @XmlElement(name = "x721.AdministrativeState")
    @XmlSchemaType(name = "string")
    protected X721AdministrativeStateType x721AdministrativeState;
    @XmlElement(name = "x721.UsageState")
    @XmlSchemaType(name = "string")
    protected X721UsageStateType x721UsageState;
    @XmlElement(name = "x721.AvailabilityStatus")
    protected String x721AvailabilityStatus;
    @XmlElement(name = "x721.ControlStatus")
    protected String x721ControlStatus;
    @XmlElement(name = "m3100.HolderStatus")
    @XmlSchemaType(name = "string")
    protected M3100HolderStatusType m3100HolderStatus;
    @XmlElement(name = "m3100.CircuitPackType")
    protected String m3100CircuitPackType;
    @XmlElement(name = "m3100.AlarmStatus")
    @XmlSchemaType(name = "string")
    protected M3100AlarmStatusType m3100AlarmStatus;
    @XmlElement(name = "m3100.ArcState")
    @XmlSchemaType(name = "string")
    protected M3100ArcStateType m3100ArcState;
    @XmlElement(name = "m3100.NALMTIInterval")
    protected String m3100NALMTIInterval;
    @XmlElement(name = "m3100.NALMQIInterval")
    protected String m3100NALMQIInterval;
    @XmlElement(name = "m3100.ArcQIStatus")
    @XmlSchemaType(name = "string")
    protected M3100ArcQIStatusType m3100ArcQIStatus;
    @XmlElement(name = "x721.Unkownstatus")
    protected Boolean x721Unkownstatus;
    @XmlElement(name = "x721.State")
    protected X721StateType x721State;

    /**
     * 获取x721OperationalState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isX721OperationalState() {
        return x721OperationalState;
    }

    /**
     * 设置x721OperationalState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setX721OperationalState(Boolean value) {
        this.x721OperationalState = value;
    }

    /**
     * 获取x721AdministrativeState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public X721AdministrativeStateType getX721AdministrativeState() {
        return x721AdministrativeState;
    }

    /**
     * 设置x721AdministrativeState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public void setX721AdministrativeState(X721AdministrativeStateType value) {
        this.x721AdministrativeState = value;
    }

    /**
     * 获取x721UsageState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link X721UsageStateType }
     *     
     */
    public X721UsageStateType getX721UsageState() {
        return x721UsageState;
    }

    /**
     * 设置x721UsageState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link X721UsageStateType }
     *     
     */
    public void setX721UsageState(X721UsageStateType value) {
        this.x721UsageState = value;
    }

    /**
     * 获取x721AvailabilityStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX721AvailabilityStatus() {
        return x721AvailabilityStatus;
    }

    /**
     * 设置x721AvailabilityStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX721AvailabilityStatus(String value) {
        this.x721AvailabilityStatus = value;
    }

    /**
     * 获取x721ControlStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX721ControlStatus() {
        return x721ControlStatus;
    }

    /**
     * 设置x721ControlStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX721ControlStatus(String value) {
        this.x721ControlStatus = value;
    }

    /**
     * 获取m3100HolderStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link M3100HolderStatusType }
     *     
     */
    public M3100HolderStatusType getM3100HolderStatus() {
        return m3100HolderStatus;
    }

    /**
     * 设置m3100HolderStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link M3100HolderStatusType }
     *     
     */
    public void setM3100HolderStatus(M3100HolderStatusType value) {
        this.m3100HolderStatus = value;
    }

    /**
     * 获取m3100CircuitPackType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM3100CircuitPackType() {
        return m3100CircuitPackType;
    }

    /**
     * 设置m3100CircuitPackType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM3100CircuitPackType(String value) {
        this.m3100CircuitPackType = value;
    }

    /**
     * 获取m3100AlarmStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link M3100AlarmStatusType }
     *     
     */
    public M3100AlarmStatusType getM3100AlarmStatus() {
        return m3100AlarmStatus;
    }

    /**
     * 设置m3100AlarmStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link M3100AlarmStatusType }
     *     
     */
    public void setM3100AlarmStatus(M3100AlarmStatusType value) {
        this.m3100AlarmStatus = value;
    }

    /**
     * 获取m3100ArcState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link M3100ArcStateType }
     *     
     */
    public M3100ArcStateType getM3100ArcState() {
        return m3100ArcState;
    }

    /**
     * 设置m3100ArcState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link M3100ArcStateType }
     *     
     */
    public void setM3100ArcState(M3100ArcStateType value) {
        this.m3100ArcState = value;
    }

    /**
     * 获取m3100NALMTIInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM3100NALMTIInterval() {
        return m3100NALMTIInterval;
    }

    /**
     * 设置m3100NALMTIInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM3100NALMTIInterval(String value) {
        this.m3100NALMTIInterval = value;
    }

    /**
     * 获取m3100NALMQIInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM3100NALMQIInterval() {
        return m3100NALMQIInterval;
    }

    /**
     * 设置m3100NALMQIInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM3100NALMQIInterval(String value) {
        this.m3100NALMQIInterval = value;
    }

    /**
     * 获取m3100ArcQIStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link M3100ArcQIStatusType }
     *     
     */
    public M3100ArcQIStatusType getM3100ArcQIStatus() {
        return m3100ArcQIStatus;
    }

    /**
     * 设置m3100ArcQIStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link M3100ArcQIStatusType }
     *     
     */
    public void setM3100ArcQIStatus(M3100ArcQIStatusType value) {
        this.m3100ArcQIStatus = value;
    }

    /**
     * 获取x721Unkownstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isX721Unkownstatus() {
        return x721Unkownstatus;
    }

    /**
     * 设置x721Unkownstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setX721Unkownstatus(Boolean value) {
        this.x721Unkownstatus = value;
    }

    /**
     * 获取x721State属性的值。
     * 
     * @return
     *     possible object is
     *     {@link X721StateType }
     *     
     */
    public X721StateType getX721State() {
        return x721State;
    }

    /**
     * 设置x721State属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link X721StateType }
     *     
     */
    public void setX721State(X721StateType value) {
        this.x721State = value;
    }

}
