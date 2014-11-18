
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISExternalRouteImport complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ISISExternalRouteImport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instanceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="protocolType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routeLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routingPolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="importRouteCostType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ISISExternalRouteImport", propOrder = {
    "instanceID",
    "protocolType",
    "routeLevel",
    "routingPolicy",
    "importRouteCostType",
    "cost",
    "action"
})
public class ISISExternalRouteImport {

    protected int instanceID;
    @XmlElement(required = true)
    protected String protocolType;
    @XmlElement(required = true)
    protected String routeLevel;
    @XmlElement(required = true)
    protected String routingPolicy;
    @XmlElement(required = true)
    protected String importRouteCostType;
    protected int cost;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取instanceID属性的值。
     * 
     */
    public int getInstanceID() {
        return instanceID;
    }

    /**
     * 设置instanceID属性的值。
     * 
     */
    public void setInstanceID(int value) {
        this.instanceID = value;
    }

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
     * 获取routeLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteLevel() {
        return routeLevel;
    }

    /**
     * 设置routeLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteLevel(String value) {
        this.routeLevel = value;
    }

    /**
     * 获取routingPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingPolicy() {
        return routingPolicy;
    }

    /**
     * 设置routingPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingPolicy(String value) {
        this.routingPolicy = value;
    }

    /**
     * 获取importRouteCostType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportRouteCostType() {
        return importRouteCostType;
    }

    /**
     * 设置importRouteCostType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportRouteCostType(String value) {
        this.importRouteCostType = value;
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
