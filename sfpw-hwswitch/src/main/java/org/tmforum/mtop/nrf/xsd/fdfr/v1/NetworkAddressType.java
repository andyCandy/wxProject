
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NetworkAddressType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NetworkAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="netAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netMask" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "NetworkAddressType", propOrder = {
    "netAddr",
    "netMask",
    "action"
})
public class NetworkAddressType {

    @XmlElement(required = true)
    protected String netAddr;
    @XmlElement(required = true)
    protected String netMask;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取netAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetAddr() {
        return netAddr;
    }

    /**
     * 设置netAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetAddr(String value) {
        this.netAddr = value;
    }

    /**
     * 获取netMask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetMask() {
        return netMask;
    }

    /**
     * 设置netMask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetMask(String value) {
        this.netMask = value;
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
