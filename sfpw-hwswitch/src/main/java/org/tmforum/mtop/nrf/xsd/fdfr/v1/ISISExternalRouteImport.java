
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISExternalRouteImport complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡinstanceID���Ե�ֵ��
     * 
     */
    public int getInstanceID() {
        return instanceID;
    }

    /**
     * ����instanceID���Ե�ֵ��
     * 
     */
    public void setInstanceID(int value) {
        this.instanceID = value;
    }

    /**
     * ��ȡprotocolType���Ե�ֵ��
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
     * ����protocolType���Ե�ֵ��
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
     * ��ȡroutingPolicy���Ե�ֵ��
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
     * ����routingPolicy���Ե�ֵ��
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
     * ��ȡimportRouteCostType���Ե�ֵ��
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
     * ����importRouteCostType���Ե�ֵ��
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
     * ��ȡcost���Ե�ֵ��
     * 
     */
    public int getCost() {
        return cost;
    }

    /**
     * ����cost���Ե�ֵ��
     * 
     */
    public void setCost(int value) {
        this.cost = value;
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
