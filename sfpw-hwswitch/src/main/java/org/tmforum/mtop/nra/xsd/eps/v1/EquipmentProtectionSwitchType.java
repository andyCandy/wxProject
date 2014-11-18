
package org.tmforum.mtop.nra.xsd.eps.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tmforum.mtop.fmw.xsd.cei.v1.CommonEventInformationType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nra.xsd.com.v1.EquipmentProtectionGroupTypeType;
import org.tmforum.mtop.nra.xsd.com.v1.EquipmentSwitchReasonType;


/**
 * <p>EquipmentProtectionSwitchType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EquipmentProtectionSwitchType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/cei/v1}CommonEventInformationType">
 *       &lt;sequence>
 *         &lt;element name="osTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectionType" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}EquipmentProtectionGroupTypeType" minOccurs="0"/>
 *         &lt;element name="switchReason" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}EquipmentSwitchReasonType" minOccurs="0"/>
 *         &lt;element name="epgRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="protectedEquipmentRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="switchAwayFromEquipmentRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="switchToEquipmentRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentProtectionSwitchType", propOrder = {
    "osTime",
    "protectionType",
    "switchReason",
    "epgRef",
    "protectedEquipmentRef",
    "switchAwayFromEquipmentRef",
    "switchToEquipmentRef"
})
public class EquipmentProtectionSwitchType
    extends CommonEventInformationType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar osTime;
    protected EquipmentProtectionGroupTypeType protectionType;
    protected EquipmentSwitchReasonType switchReason;
    protected NamingAttributeType epgRef;
    protected NamingAttributeType protectedEquipmentRef;
    protected NamingAttributeType switchAwayFromEquipmentRef;
    protected NamingAttributeType switchToEquipmentRef;

    /**
     * ��ȡosTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOsTime() {
        return osTime;
    }

    /**
     * ����osTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOsTime(XMLGregorianCalendar value) {
        this.osTime = value;
    }

    /**
     * ��ȡprotectionType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EquipmentProtectionGroupTypeType }
     *     
     */
    public EquipmentProtectionGroupTypeType getProtectionType() {
        return protectionType;
    }

    /**
     * ����protectionType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentProtectionGroupTypeType }
     *     
     */
    public void setProtectionType(EquipmentProtectionGroupTypeType value) {
        this.protectionType = value;
    }

    /**
     * ��ȡswitchReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EquipmentSwitchReasonType }
     *     
     */
    public EquipmentSwitchReasonType getSwitchReason() {
        return switchReason;
    }

    /**
     * ����switchReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentSwitchReasonType }
     *     
     */
    public void setSwitchReason(EquipmentSwitchReasonType value) {
        this.switchReason = value;
    }

    /**
     * ��ȡepgRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getEpgRef() {
        return epgRef;
    }

    /**
     * ����epgRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setEpgRef(NamingAttributeType value) {
        this.epgRef = value;
    }

    /**
     * ��ȡprotectedEquipmentRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getProtectedEquipmentRef() {
        return protectedEquipmentRef;
    }

    /**
     * ����protectedEquipmentRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setProtectedEquipmentRef(NamingAttributeType value) {
        this.protectedEquipmentRef = value;
    }

    /**
     * ��ȡswitchAwayFromEquipmentRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getSwitchAwayFromEquipmentRef() {
        return switchAwayFromEquipmentRef;
    }

    /**
     * ����switchAwayFromEquipmentRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setSwitchAwayFromEquipmentRef(NamingAttributeType value) {
        this.switchAwayFromEquipmentRef = value;
    }

    /**
     * ��ȡswitchToEquipmentRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getSwitchToEquipmentRef() {
        return switchToEquipmentRef;
    }

    /**
     * ����switchToEquipmentRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setSwitchToEquipmentRef(NamingAttributeType value) {
        this.switchToEquipmentRef = value;
    }

}
