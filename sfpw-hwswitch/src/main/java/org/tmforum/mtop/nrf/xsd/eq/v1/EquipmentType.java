
package org.tmforum.mtop.nrf.xsd.eq.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AliasNameListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.com.v1.ProtectionSchemeStateType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrf.xsd.com.v1.ProtectionRoleType;
import org.tmforum.mtop.nrf.xsd.com.v1.ResourceFulfillmentStateEnumType;


/**
 * <p>EquipmentType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EquipmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="isReportingAlarms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="expectedEquipmentObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="installedEquipmentObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="installedPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="installedSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bomCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceFulfillmentState" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}ResourceFulfillmentStateEnumType"/>
 *         &lt;element name="installedVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protectionRole" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}ProtectionRoleType"/>
 *         &lt;element name="protectionSchemeState" type="{http://www.tmforum.org/mtop/nrb/xsd/com/v1}ProtectionSchemeStateType"/>
 *         &lt;element name="manufactureDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="asapRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="cleiCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sfpInfoList" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AliasNameListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentType", propOrder = {
    "isReportingAlarms",
    "expectedEquipmentObjectType",
    "installedEquipmentObjectType",
    "installedPartNumber",
    "installedSerialNumber",
    "bomCode",
    "resourceFulfillmentState",
    "installedVersion",
    "manufacturer",
    "protectionRole",
    "protectionSchemeState",
    "manufactureDate",
    "asapRef",
    "cleiCode",
    "sfpInfoList"
})
public class EquipmentType
    extends CommonResourceInfoType
{

    protected boolean isReportingAlarms;
    @XmlElement(required = true)
    protected String expectedEquipmentObjectType;
    @XmlElement(required = true)
    protected String installedEquipmentObjectType;
    @XmlElement(required = true)
    protected String installedPartNumber;
    @XmlElement(required = true)
    protected String installedSerialNumber;
    @XmlElement(required = true)
    protected String bomCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResourceFulfillmentStateEnumType resourceFulfillmentState;
    @XmlElement(required = true)
    protected String installedVersion;
    @XmlElement(required = true)
    protected String manufacturer;
    @XmlElement(required = true)
    protected ProtectionRoleType protectionRole;
    @XmlElement(required = true)
    protected ProtectionSchemeStateType protectionSchemeState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object manufactureDate;
    @XmlElement(required = true)
    protected NamingAttributeType asapRef;
    @XmlElement(required = true)
    protected String cleiCode;
    @XmlElement(required = true)
    protected AliasNameListType sfpInfoList;

    /**
     * ��ȡisReportingAlarms���Ե�ֵ��
     * 
     */
    public boolean isIsReportingAlarms() {
        return isReportingAlarms;
    }

    /**
     * ����isReportingAlarms���Ե�ֵ��
     * 
     */
    public void setIsReportingAlarms(boolean value) {
        this.isReportingAlarms = value;
    }

    /**
     * ��ȡexpectedEquipmentObjectType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedEquipmentObjectType() {
        return expectedEquipmentObjectType;
    }

    /**
     * ����expectedEquipmentObjectType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedEquipmentObjectType(String value) {
        this.expectedEquipmentObjectType = value;
    }

    /**
     * ��ȡinstalledEquipmentObjectType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledEquipmentObjectType() {
        return installedEquipmentObjectType;
    }

    /**
     * ����installedEquipmentObjectType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledEquipmentObjectType(String value) {
        this.installedEquipmentObjectType = value;
    }

    /**
     * ��ȡinstalledPartNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledPartNumber() {
        return installedPartNumber;
    }

    /**
     * ����installedPartNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledPartNumber(String value) {
        this.installedPartNumber = value;
    }

    /**
     * ��ȡinstalledSerialNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledSerialNumber() {
        return installedSerialNumber;
    }

    /**
     * ����installedSerialNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledSerialNumber(String value) {
        this.installedSerialNumber = value;
    }

    /**
     * ��ȡbomCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomCode() {
        return bomCode;
    }

    /**
     * ����bomCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomCode(String value) {
        this.bomCode = value;
    }

    /**
     * ��ȡresourceFulfillmentState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceFulfillmentStateEnumType }
     *     
     */
    public ResourceFulfillmentStateEnumType getResourceFulfillmentState() {
        return resourceFulfillmentState;
    }

    /**
     * ����resourceFulfillmentState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceFulfillmentStateEnumType }
     *     
     */
    public void setResourceFulfillmentState(ResourceFulfillmentStateEnumType value) {
        this.resourceFulfillmentState = value;
    }

    /**
     * ��ȡinstalledVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledVersion() {
        return installedVersion;
    }

    /**
     * ����installedVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledVersion(String value) {
        this.installedVersion = value;
    }

    /**
     * ��ȡmanufacturer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * ����manufacturer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * ��ȡprotectionRole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProtectionRoleType }
     *     
     */
    public ProtectionRoleType getProtectionRole() {
        return protectionRole;
    }

    /**
     * ����protectionRole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionRoleType }
     *     
     */
    public void setProtectionRole(ProtectionRoleType value) {
        this.protectionRole = value;
    }

    /**
     * ��ȡprotectionSchemeState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProtectionSchemeStateType }
     *     
     */
    public ProtectionSchemeStateType getProtectionSchemeState() {
        return protectionSchemeState;
    }

    /**
     * ����protectionSchemeState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionSchemeStateType }
     *     
     */
    public void setProtectionSchemeState(ProtectionSchemeStateType value) {
        this.protectionSchemeState = value;
    }

    /**
     * ��ȡmanufactureDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getManufactureDate() {
        return manufactureDate;
    }

    /**
     * ����manufactureDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setManufactureDate(Object value) {
        this.manufactureDate = value;
    }

    /**
     * ��ȡasapRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getAsapRef() {
        return asapRef;
    }

    /**
     * ����asapRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setAsapRef(NamingAttributeType value) {
        this.asapRef = value;
    }

    /**
     * ��ȡcleiCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleiCode() {
        return cleiCode;
    }

    /**
     * ����cleiCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleiCode(String value) {
        this.cleiCode = value;
    }

    /**
     * ��ȡsfpInfoList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AliasNameListType }
     *     
     */
    public AliasNameListType getSfpInfoList() {
        return sfpInfoList;
    }

    /**
     * ����sfpInfoList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AliasNameListType }
     *     
     */
    public void setSfpInfoList(AliasNameListType value) {
        this.sfpInfoList = value;
    }

}
