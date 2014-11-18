
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
 * <p>EquipmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取isReportingAlarms属性的值。
     * 
     */
    public boolean isIsReportingAlarms() {
        return isReportingAlarms;
    }

    /**
     * 设置isReportingAlarms属性的值。
     * 
     */
    public void setIsReportingAlarms(boolean value) {
        this.isReportingAlarms = value;
    }

    /**
     * 获取expectedEquipmentObjectType属性的值。
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
     * 设置expectedEquipmentObjectType属性的值。
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
     * 获取installedEquipmentObjectType属性的值。
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
     * 设置installedEquipmentObjectType属性的值。
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
     * 获取installedPartNumber属性的值。
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
     * 设置installedPartNumber属性的值。
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
     * 获取installedSerialNumber属性的值。
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
     * 设置installedSerialNumber属性的值。
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
     * 获取bomCode属性的值。
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
     * 设置bomCode属性的值。
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
     * 获取resourceFulfillmentState属性的值。
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
     * 设置resourceFulfillmentState属性的值。
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
     * 获取installedVersion属性的值。
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
     * 设置installedVersion属性的值。
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
     * 获取manufacturer属性的值。
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
     * 设置manufacturer属性的值。
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
     * 获取protectionRole属性的值。
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
     * 设置protectionRole属性的值。
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
     * 获取protectionSchemeState属性的值。
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
     * 设置protectionSchemeState属性的值。
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
     * 获取manufactureDate属性的值。
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
     * 设置manufactureDate属性的值。
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
     * 获取asapRef属性的值。
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
     * 设置asapRef属性的值。
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
     * 获取cleiCode属性的值。
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
     * 设置cleiCode属性的值。
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
     * 获取sfpInfoList属性的值。
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
     * 设置sfpInfoList属性的值。
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
