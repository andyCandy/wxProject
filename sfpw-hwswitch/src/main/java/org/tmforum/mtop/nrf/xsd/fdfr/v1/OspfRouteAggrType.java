
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OspfRouteAggrType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OspfRouteAggrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="announce" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="areaID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "OspfRouteAggrType", propOrder = {
    "routerType",
    "ipAddress",
    "mask",
    "announce",
    "cost",
    "areaID",
    "action"
})
public class OspfRouteAggrType {

    @XmlElement(required = true)
    protected String routerType;
    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(required = true)
    protected String mask;
    protected boolean announce;
    protected int cost;
    @XmlElement(required = true)
    protected String areaID;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取routerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouterType() {
        return routerType;
    }

    /**
     * 设置routerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouterType(String value) {
        this.routerType = value;
    }

    /**
     * 获取ipAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 设置ipAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
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
     * 获取announce属性的值。
     * 
     */
    public boolean isAnnounce() {
        return announce;
    }

    /**
     * 设置announce属性的值。
     * 
     */
    public void setAnnounce(boolean value) {
        this.announce = value;
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
     * 获取areaID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * 设置areaID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
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
