
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>StaticRouteType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StaticRouteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outTpName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="nextVrfName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="nextHop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "StaticRouteType", propOrder = {
    "destAddress",
    "mask",
    "outTpName",
    "nextVrfName",
    "nextHop",
    "preference",
    "status",
    "action"
})
public class StaticRouteType {

    @XmlElement(required = true)
    protected String destAddress;
    @XmlElement(required = true)
    protected String mask;
    @XmlElement(required = true)
    protected NamingAttributeType outTpName;
    @XmlElement(required = true)
    protected NamingAttributeType nextVrfName;
    @XmlElement(required = true)
    protected String nextHop;
    protected int preference;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取destAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAddress() {
        return destAddress;
    }

    /**
     * 设置destAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAddress(String value) {
        this.destAddress = value;
    }

    /**
     * 获取mask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * 设置mask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * 获取outTpName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getOutTpName() {
        return outTpName;
    }

    /**
     * 设置outTpName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setOutTpName(NamingAttributeType value) {
        this.outTpName = value;
    }

    /**
     * 获取nextVrfName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getNextVrfName() {
        return nextVrfName;
    }

    /**
     * 设置nextVrfName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setNextVrfName(NamingAttributeType value) {
        this.nextVrfName = value;
    }

    /**
     * 获取nextHop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextHop() {
        return nextHop;
    }

    /**
     * 设置nextHop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextHop(String value) {
        this.nextHop = value;
    }

    /**
     * 获取preference属性的值。
     * 
     */
    public int getPreference() {
        return preference;
    }

    /**
     * 设置preference属性的值。
     * 
     */
    public void setPreference(int value) {
        this.preference = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
