
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISDefaultRouteAdvert complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ISISDefaultRouteAdvert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultRouteAdvert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="routeAdvertCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routeAdvertPolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="avoidLearningOfDefaultRoute" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routeLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ISISDefaultRouteAdvert", propOrder = {
    "defaultRouteAdvert",
    "routeAdvertCondition",
    "routeAdvertPolicy",
    "avoidLearningOfDefaultRoute",
    "cost",
    "routeLevel",
    "tag",
    "action"
})
public class ISISDefaultRouteAdvert {

    protected boolean defaultRouteAdvert;
    @XmlElement(required = true)
    protected String routeAdvertCondition;
    @XmlElement(required = true)
    protected String routeAdvertPolicy;
    protected boolean avoidLearningOfDefaultRoute;
    @XmlElement(required = true)
    protected String cost;
    @XmlElement(required = true)
    protected String routeLevel;
    @XmlElement(required = true)
    protected String tag;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取defaultRouteAdvert属性的值。
     * 
     */
    public boolean isDefaultRouteAdvert() {
        return defaultRouteAdvert;
    }

    /**
     * 设置defaultRouteAdvert属性的值。
     * 
     */
    public void setDefaultRouteAdvert(boolean value) {
        this.defaultRouteAdvert = value;
    }

    /**
     * 获取routeAdvertCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteAdvertCondition() {
        return routeAdvertCondition;
    }

    /**
     * 设置routeAdvertCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteAdvertCondition(String value) {
        this.routeAdvertCondition = value;
    }

    /**
     * 获取routeAdvertPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteAdvertPolicy() {
        return routeAdvertPolicy;
    }

    /**
     * 设置routeAdvertPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteAdvertPolicy(String value) {
        this.routeAdvertPolicy = value;
    }

    /**
     * 获取avoidLearningOfDefaultRoute属性的值。
     * 
     */
    public boolean isAvoidLearningOfDefaultRoute() {
        return avoidLearningOfDefaultRoute;
    }

    /**
     * 设置avoidLearningOfDefaultRoute属性的值。
     * 
     */
    public void setAvoidLearningOfDefaultRoute(boolean value) {
        this.avoidLearningOfDefaultRoute = value;
    }

    /**
     * 获取cost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * 设置cost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
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
     * 获取tag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * 设置tag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
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
