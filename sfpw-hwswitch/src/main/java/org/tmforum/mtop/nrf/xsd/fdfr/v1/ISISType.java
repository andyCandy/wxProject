
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ISISType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instanceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="routerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routeLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="costType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkEntityList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}NetworkEntityList"/>
 *         &lt;element name="protocolInterfaceList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ProtocolInterfaceList"/>
 *         &lt;element name="routeImport" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISRouteImport"/>
 *         &lt;element name="advanced" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISAdvancedAttributes"/>
 *         &lt;element name="isisState" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ISISType", propOrder = {
    "instanceID",
    "routerID",
    "routeLevel",
    "costType",
    "networkEntityList",
    "protocolInterfaceList",
    "routeImport",
    "advanced",
    "isisState",
    "action"
})
public class ISISType {

    protected int instanceID;
    @XmlElement(required = true)
    protected String routerID;
    @XmlElement(required = true)
    protected String routeLevel;
    @XmlElement(required = true)
    protected String costType;
    @XmlElement(required = true)
    protected NetworkEntityList networkEntityList;
    @XmlElement(required = true)
    protected ProtocolInterfaceList protocolInterfaceList;
    @XmlElement(required = true)
    protected ISISRouteImport routeImport;
    @XmlElement(required = true)
    protected ISISAdvancedAttributes advanced;
    @XmlElement(required = true)
    protected String isisState;
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
     * 获取routerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouterID() {
        return routerID;
    }

    /**
     * 设置routerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouterID(String value) {
        this.routerID = value;
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
     * 获取costType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostType() {
        return costType;
    }

    /**
     * 设置costType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostType(String value) {
        this.costType = value;
    }

    /**
     * 获取networkEntityList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkEntityList }
     *     
     */
    public NetworkEntityList getNetworkEntityList() {
        return networkEntityList;
    }

    /**
     * 设置networkEntityList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkEntityList }
     *     
     */
    public void setNetworkEntityList(NetworkEntityList value) {
        this.networkEntityList = value;
    }

    /**
     * 获取protocolInterfaceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProtocolInterfaceList }
     *     
     */
    public ProtocolInterfaceList getProtocolInterfaceList() {
        return protocolInterfaceList;
    }

    /**
     * 设置protocolInterfaceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolInterfaceList }
     *     
     */
    public void setProtocolInterfaceList(ProtocolInterfaceList value) {
        this.protocolInterfaceList = value;
    }

    /**
     * 获取routeImport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ISISRouteImport }
     *     
     */
    public ISISRouteImport getRouteImport() {
        return routeImport;
    }

    /**
     * 设置routeImport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ISISRouteImport }
     *     
     */
    public void setRouteImport(ISISRouteImport value) {
        this.routeImport = value;
    }

    /**
     * 获取advanced属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ISISAdvancedAttributes }
     *     
     */
    public ISISAdvancedAttributes getAdvanced() {
        return advanced;
    }

    /**
     * 设置advanced属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ISISAdvancedAttributes }
     *     
     */
    public void setAdvanced(ISISAdvancedAttributes value) {
        this.advanced = value;
    }

    /**
     * 获取isisState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsisState() {
        return isisState;
    }

    /**
     * 设置isisState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsisState(String value) {
        this.isisState = value;
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
