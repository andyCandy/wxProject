
package org.tmforum.mtop.nra.xsd.ps.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tmforum.mtop.fmw.xsd.cei.v1.CommonEventInformationType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nra.xsd.com.v1.ProtectionTypeType;
import org.tmforum.mtop.nra.xsd.com.v1.SwitchReasonType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;


/**
 * <p>ProtectionSwitchType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ProtectionSwitchType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/cei/v1}CommonEventInformationType">
 *       &lt;sequence>
 *         &lt;element name="osTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protectionType" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}ProtectionTypeType" minOccurs="0"/>
 *         &lt;element name="switchReason" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}SwitchReasonType" minOccurs="0"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType"/>
 *         &lt;element name="pgRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="protectedTpRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="switchAwayFromTpRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="switchToTpRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="protectedList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="switchToList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionSwitchType", propOrder = {
    "osTime",
    "protectionType",
    "switchReason",
    "layerRate",
    "pgRef",
    "protectedTpRef",
    "switchAwayFromTpRef",
    "switchToTpRef",
    "protectedList",
    "switchToList"
})
public class ProtectionSwitchType
    extends CommonEventInformationType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar osTime;
    protected ProtectionTypeType protectionType;
    @XmlSchemaType(name = "string")
    protected SwitchReasonType switchReason;
    @XmlElement(required = true)
    protected LayerRateType layerRate;
    protected NamingAttributeType pgRef;
    @XmlElement(required = true)
    protected NamingAttributeType protectedTpRef;
    @XmlElement(required = true)
    protected NamingAttributeType switchAwayFromTpRef;
    protected NamingAttributeType switchToTpRef;
    @XmlElement(required = true)
    protected NamingAttributeListType protectedList;
    @XmlElement(required = true)
    protected NamingAttributeListType switchToList;

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
     *     {@link ProtectionTypeType }
     *     
     */
    public ProtectionTypeType getProtectionType() {
        return protectionType;
    }

    /**
     * ����protectionType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionTypeType }
     *     
     */
    public void setProtectionType(ProtectionTypeType value) {
        this.protectionType = value;
    }

    /**
     * ��ȡswitchReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SwitchReasonType }
     *     
     */
    public SwitchReasonType getSwitchReason() {
        return switchReason;
    }

    /**
     * ����switchReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchReasonType }
     *     
     */
    public void setSwitchReason(SwitchReasonType value) {
        this.switchReason = value;
    }

    /**
     * ��ȡlayerRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LayerRateType }
     *     
     */
    public LayerRateType getLayerRate() {
        return layerRate;
    }

    /**
     * ����layerRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateType }
     *     
     */
    public void setLayerRate(LayerRateType value) {
        this.layerRate = value;
    }

    /**
     * ��ȡpgRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getPgRef() {
        return pgRef;
    }

    /**
     * ����pgRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setPgRef(NamingAttributeType value) {
        this.pgRef = value;
    }

    /**
     * ��ȡprotectedTpRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getProtectedTpRef() {
        return protectedTpRef;
    }

    /**
     * ����protectedTpRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setProtectedTpRef(NamingAttributeType value) {
        this.protectedTpRef = value;
    }

    /**
     * ��ȡswitchAwayFromTpRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getSwitchAwayFromTpRef() {
        return switchAwayFromTpRef;
    }

    /**
     * ����switchAwayFromTpRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setSwitchAwayFromTpRef(NamingAttributeType value) {
        this.switchAwayFromTpRef = value;
    }

    /**
     * ��ȡswitchToTpRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getSwitchToTpRef() {
        return switchToTpRef;
    }

    /**
     * ����switchToTpRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setSwitchToTpRef(NamingAttributeType value) {
        this.switchToTpRef = value;
    }

    /**
     * ��ȡprotectedList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getProtectedList() {
        return protectedList;
    }

    /**
     * ����protectedList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setProtectedList(NamingAttributeListType value) {
        this.protectedList = value;
    }

    /**
     * ��ȡswitchToList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getSwitchToList() {
        return switchToList;
    }

    /**
     * ����switchToList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setSwitchToList(NamingAttributeListType value) {
        this.switchToList = value;
    }

}
