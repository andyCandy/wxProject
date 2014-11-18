
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>MaintenanceDomainCreateDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取mdName属性的值。
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
     * 设置mdName属性的值。
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
     * 获取mdDefault属性的值。
     * 
     */
    public boolean isMdDefault() {
        return mdDefault;
    }

    /**
     * 设置mdDefault属性的值。
     * 
     */
    public void setMdDefault(boolean value) {
        this.mdDefault = value;
    }

    /**
     * 获取mdLevel属性的值。
     * 
     */
    public int getMdLevel() {
        return mdLevel;
    }

    /**
     * 设置mdLevel属性的值。
     * 
     */
    public void setMdLevel(int value) {
        this.mdLevel = value;
    }

    /**
     * 获取mdVlan属性的值。
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
     * 设置mdVlan属性的值。
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
     * 获取mdFormat属性的值。
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
     * 设置mdFormat属性的值。
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
     * 获取mdFormatDesc属性的值。
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
     * 设置mdFormatDesc属性的值。
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
