
package org.tmforum.mtop.nra.xsd.pmtgt.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AliasNameListType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nra.xsd.pm.v1.ActivityStatusEnumType;


/**
 * <p>PerformanceMonitoringInstanceType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="userLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}aliasNameList"/>
 *         &lt;element name="vendorExtensions" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AnyListType"/>
 *         &lt;element name="resourceRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="pmmc" type="{http://www.tmforum.org/mtop/nra/xsd/pmtgt/v1}PmMonitorConditioningType"/>
 *         &lt;element name="status" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}ActivityStatusEnumType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringInstanceType", propOrder = {
    "name",
    "userLabel",
    "aliasNameList",
    "vendorExtensions",
    "resourceRef",
    "pmmc",
    "status"
})
public class PerformanceMonitoringInstanceType {

    @XmlElement(required = true)
    protected NamingAttributeType name;
    @XmlElement(required = true, nillable = true)
    protected String userLabel;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/fmw/xsd/gen/v1", required = true)
    protected AliasNameListType aliasNameList;
    @XmlElement(required = true, nillable = true)
    protected AnyListType vendorExtensions;
    @XmlElement(required = true, nillable = true)
    protected NamingAttributeType resourceRef;
    @XmlElement(required = true)
    protected PmMonitorConditioningType pmmc;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ActivityStatusEnumType status;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setName(NamingAttributeType value) {
        this.name = value;
    }

    /**
     * ��ȡuserLabel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLabel() {
        return userLabel;
    }

    /**
     * ����userLabel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLabel(String value) {
        this.userLabel = value;
    }

    /**
     * ��ȡaliasNameList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AliasNameListType }
     *     
     */
    public AliasNameListType getAliasNameList() {
        return aliasNameList;
    }

    /**
     * ����aliasNameList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AliasNameListType }
     *     
     */
    public void setAliasNameList(AliasNameListType value) {
        this.aliasNameList = value;
    }

    /**
     * ��ȡvendorExtensions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AnyListType }
     *     
     */
    public AnyListType getVendorExtensions() {
        return vendorExtensions;
    }

    /**
     * ����vendorExtensions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AnyListType }
     *     
     */
    public void setVendorExtensions(AnyListType value) {
        this.vendorExtensions = value;
    }

    /**
     * ��ȡresourceRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getResourceRef() {
        return resourceRef;
    }

    /**
     * ����resourceRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setResourceRef(NamingAttributeType value) {
        this.resourceRef = value;
    }

    /**
     * ��ȡpmmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PmMonitorConditioningType }
     *     
     */
    public PmMonitorConditioningType getPmmc() {
        return pmmc;
    }

    /**
     * ����pmmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PmMonitorConditioningType }
     *     
     */
    public void setPmmc(PmMonitorConditioningType value) {
        this.pmmc = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ActivityStatusEnumType }
     *     
     */
    public ActivityStatusEnumType getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityStatusEnumType }
     *     
     */
    public void setStatus(ActivityStatusEnumType value) {
        this.status = value;
    }

}
