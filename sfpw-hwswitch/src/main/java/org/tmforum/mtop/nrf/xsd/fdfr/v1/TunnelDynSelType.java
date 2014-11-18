
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TunnelDynSelType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TunnelDynSelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nextHop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bandwidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TunnelDynSelType", propOrder = {
    "nextHop",
    "bandwidth",
    "mode"
})
public class TunnelDynSelType {

    @XmlElement(required = true)
    protected String nextHop;
    protected int bandwidth;
    @XmlElement(required = true)
    protected String mode;

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
     * 获取bandwidth属性的值。
     * 
     */
    public int getBandwidth() {
        return bandwidth;
    }

    /**
     * 设置bandwidth属性的值。
     * 
     */
    public void setBandwidth(int value) {
        this.bandwidth = value;
    }

    /**
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

}
