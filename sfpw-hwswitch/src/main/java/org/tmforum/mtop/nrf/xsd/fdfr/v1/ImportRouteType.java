
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImportRouteType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImportRouteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protocolType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="procID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bgpMed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="strBgpMed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="routePolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ImportRouteType", propOrder = {
    "protocolType",
    "procID",
    "bgpMed",
    "strBgpMed",
    "cost",
    "routePolicy",
    "action"
})
public class ImportRouteType {

    @XmlElement(required = true)
    protected String protocolType;
    protected int procID;
    protected int bgpMed;
    @XmlElement(required = true)
    protected String strBgpMed;
    protected int cost;
    @XmlElement(required = true)
    protected String routePolicy;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取protocolType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * 设置protocolType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolType(String value) {
        this.protocolType = value;
    }

    /**
     * 获取procID属性的值。
     * 
     */
    public int getProcID() {
        return procID;
    }

    /**
     * 设置procID属性的值。
     * 
     */
    public void setProcID(int value) {
        this.procID = value;
    }

    /**
     * 获取bgpMed属性的值。
     * 
     */
    public int getBgpMed() {
        return bgpMed;
    }

    /**
     * 设置bgpMed属性的值。
     * 
     */
    public void setBgpMed(int value) {
        this.bgpMed = value;
    }

    /**
     * 获取strBgpMed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrBgpMed() {
        return strBgpMed;
    }

    /**
     * 设置strBgpMed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrBgpMed(String value) {
        this.strBgpMed = value;
    }

    /**
     * 获取cost属性的值。
     * 
     */
    public int getCost() {
        return cost;
    }

    /**
     * 设置cost属性的值。
     * 
     */
    public void setCost(int value) {
        this.cost = value;
    }

    /**
     * 获取routePolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePolicy() {
        return routePolicy;
    }

    /**
     * 设置routePolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePolicy(String value) {
        this.routePolicy = value;
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
