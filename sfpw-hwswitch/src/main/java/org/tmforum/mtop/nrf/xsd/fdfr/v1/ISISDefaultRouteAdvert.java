
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISDefaultRouteAdvert complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdefaultRouteAdvert���Ե�ֵ��
     * 
     */
    public boolean isDefaultRouteAdvert() {
        return defaultRouteAdvert;
    }

    /**
     * ����defaultRouteAdvert���Ե�ֵ��
     * 
     */
    public void setDefaultRouteAdvert(boolean value) {
        this.defaultRouteAdvert = value;
    }

    /**
     * ��ȡrouteAdvertCondition���Ե�ֵ��
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
     * ����routeAdvertCondition���Ե�ֵ��
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
     * ��ȡrouteAdvertPolicy���Ե�ֵ��
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
     * ����routeAdvertPolicy���Ե�ֵ��
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
     * ��ȡavoidLearningOfDefaultRoute���Ե�ֵ��
     * 
     */
    public boolean isAvoidLearningOfDefaultRoute() {
        return avoidLearningOfDefaultRoute;
    }

    /**
     * ����avoidLearningOfDefaultRoute���Ե�ֵ��
     * 
     */
    public void setAvoidLearningOfDefaultRoute(boolean value) {
        this.avoidLearningOfDefaultRoute = value;
    }

    /**
     * ��ȡcost���Ե�ֵ��
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
     * ����cost���Ե�ֵ��
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
     * ��ȡrouteLevel���Ե�ֵ��
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
     * ����routeLevel���Ե�ֵ��
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
     * ��ȡtag���Ե�ֵ��
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
     * ����tag���Ե�ֵ��
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
     * ��ȡaction���Ե�ֵ��
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
     * ����action���Ե�ֵ��
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
