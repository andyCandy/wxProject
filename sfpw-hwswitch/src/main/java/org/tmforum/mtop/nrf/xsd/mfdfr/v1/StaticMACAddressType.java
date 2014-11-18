
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>StaticMACAddressType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StaticMACAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staticMACType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="macAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="peVID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ceVID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tpName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticMACAddressType", propOrder = {
    "staticMACType",
    "macAddress",
    "peVID",
    "ceVID",
    "tpName",
    "action"
})
public class StaticMACAddressType {

    @XmlElement(required = true)
    protected String staticMACType;
    @XmlElement(required = true)
    protected String macAddress;
    @XmlElement(required = true)
    protected String peVID;
    @XmlElement(required = true)
    protected String ceVID;
    @XmlElement(required = true)
    protected NamingAttributeType tpName;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取staticMACType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticMACType() {
        return staticMACType;
    }

    /**
     * 设置staticMACType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticMACType(String value) {
        this.staticMACType = value;
    }

    /**
     * 获取macAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * 设置macAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * 获取peVID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeVID() {
        return peVID;
    }

    /**
     * 设置peVID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeVID(String value) {
        this.peVID = value;
    }

    /**
     * 获取ceVID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeVID() {
        return ceVID;
    }

    /**
     * 设置ceVID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeVID(String value) {
        this.ceVID = value;
    }

    /**
     * 获取tpName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTpName() {
        return tpName;
    }

    /**
     * 设置tpName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTpName(NamingAttributeType value) {
        this.tpName = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
