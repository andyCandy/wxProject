
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>MaintenanceDomainCreateDataType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MaintenanceDomainCreateDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mdName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="mdDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mdLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mdVlan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mdFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mdFormatDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDomainCreateDataType", propOrder = {
    "mdName",
    "mdDefault",
    "mdLevel",
    "mdVlan",
    "mdFormat",
    "mdFormatDesc"
})
public class MaintenanceDomainCreateDataType {

    @XmlElement(required = true)
    protected NamingAttributeType mdName;
    protected boolean mdDefault;
    protected int mdLevel;
    @XmlElement(required = true)
    protected String mdVlan;
    @XmlElement(required = true)
    protected String mdFormat;
    @XmlElement(required = true)
    protected String mdFormatDesc;

    /**
     * ��ȡmdName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMdName() {
        return mdName;
    }

    /**
     * ����mdName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMdName(NamingAttributeType value) {
        this.mdName = value;
    }

    /**
     * ��ȡmdDefault���Ե�ֵ��
     * 
     */
    public boolean isMdDefault() {
        return mdDefault;
    }

    /**
     * ����mdDefault���Ե�ֵ��
     * 
     */
    public void setMdDefault(boolean value) {
        this.mdDefault = value;
    }

    /**
     * ��ȡmdLevel���Ե�ֵ��
     * 
     */
    public int getMdLevel() {
        return mdLevel;
    }

    /**
     * ����mdLevel���Ե�ֵ��
     * 
     */
    public void setMdLevel(int value) {
        this.mdLevel = value;
    }

    /**
     * ��ȡmdVlan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdVlan() {
        return mdVlan;
    }

    /**
     * ����mdVlan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdVlan(String value) {
        this.mdVlan = value;
    }

    /**
     * ��ȡmdFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdFormat() {
        return mdFormat;
    }

    /**
     * ����mdFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdFormat(String value) {
        this.mdFormat = value;
    }

    /**
     * ��ȡmdFormatDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdFormatDesc() {
        return mdFormatDesc;
    }

    /**
     * ����mdFormatDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdFormatDesc(String value) {
        this.mdFormatDesc = value;
    }

}
