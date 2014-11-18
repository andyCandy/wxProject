
package org.tmforum.mtop.nrb.xsd.itu.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>X721.StateType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="X721.StateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X721.OperationalState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="X721.AdministrativeState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}X721.AdministrativeStateType" minOccurs="0"/>
 *         &lt;element name="X721.UsageState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}X721.UsageStateType" minOccurs="0"/>
 *         &lt;element name="X721.AvailabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X721.ControlStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="M3100.HolderStatus" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}M3100.HolderStatusType" minOccurs="0"/>
 *         &lt;element name="M3100.AlarmStatus" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}M3100.AlarmStatusType" minOccurs="0"/>
 *         &lt;element name="M3100.ArcState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}M3100.ArcStateType" minOccurs="0"/>
 *         &lt;element name="M3100.ArcQIStatus" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}M3100.ArcQIStatusType" minOccurs="0"/>
 *         &lt;element name="X721.Unkownstatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X721.StateType", propOrder = {
    "x721OperationalState",
    "x721AdministrativeState",
    "x721UsageState",
    "x721AvailabilityStatus",
    "x721ControlStatus",
    "m3100HolderStatus",
    "m3100AlarmStatus",
    "m3100ArcState",
    "m3100ArcQIStatus",
    "x721Unkownstatus",
    "any"
})
public class X721StateType {

    @XmlElement(name = "X721.OperationalState")
    protected Boolean x721OperationalState;
    @XmlElement(name = "X721.AdministrativeState")
    @XmlSchemaType(name = "string")
    protected X721AdministrativeStateType x721AdministrativeState;
    @XmlElement(name = "X721.UsageState")
    @XmlSchemaType(name = "string")
    protected X721UsageStateType x721UsageState;
    @XmlElement(name = "X721.AvailabilityStatus")
    protected String x721AvailabilityStatus;
    @XmlElement(name = "X721.ControlStatus")
    protected String x721ControlStatus;
    @XmlElement(name = "M3100.HolderStatus")
    @XmlSchemaType(name = "string")
    protected M3100HolderStatusType m3100HolderStatus;
    @XmlElement(name = "M3100.AlarmStatus")
    @XmlSchemaType(name = "string")
    protected M3100AlarmStatusType m3100AlarmStatus;
    @XmlElement(name = "M3100.ArcState")
    @XmlSchemaType(name = "string")
    protected M3100ArcStateType m3100ArcState;
    @XmlElement(name = "M3100.ArcQIStatus")
    @XmlSchemaType(name = "string")
    protected M3100ArcQIStatusType m3100ArcQIStatus;
    @XmlElement(name = "X721.Unkownstatus")
    protected Boolean x721Unkownstatus;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * ��ȡx721OperationalState���Ե�ֵ��
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
     * ����x721OperationalState���Ե�ֵ��
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
     * ��ȡx721AdministrativeState���Ե�ֵ��
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
     * ����x721AdministrativeState���Ե�ֵ��
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
     * ��ȡx721UsageState���Ե�ֵ��
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
     * ����x721UsageState���Ե�ֵ��
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
     * ��ȡx721AvailabilityStatus���Ե�ֵ��
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
     * ����x721AvailabilityStatus���Ե�ֵ��
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
     * ��ȡx721ControlStatus���Ե�ֵ��
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
     * ����x721ControlStatus���Ե�ֵ��
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
     * ��ȡm3100HolderStatus���Ե�ֵ��
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
     * ����m3100HolderStatus���Ե�ֵ��
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
     * ��ȡm3100AlarmStatus���Ե�ֵ��
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
     * ����m3100AlarmStatus���Ե�ֵ��
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
     * ��ȡm3100ArcState���Ե�ֵ��
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
     * ����m3100ArcState���Ե�ֵ��
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
     * ��ȡm3100ArcQIStatus���Ե�ֵ��
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
     * ����m3100ArcQIStatus���Ե�ֵ��
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
     * ��ȡx721Unkownstatus���Ե�ֵ��
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
     * ����x721Unkownstatus���Ե�ֵ��
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
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
