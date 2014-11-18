
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrouterID���Ե�ֵ��
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
     * ����routerID���Ե�ֵ��
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
     * ��ȡcostType���Ե�ֵ��
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
     * ����costType���Ե�ֵ��
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
     * ��ȡnetworkEntityList���Ե�ֵ��
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
     * ����networkEntityList���Ե�ֵ��
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
     * ��ȡprotocolInterfaceList���Ե�ֵ��
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
     * ����protocolInterfaceList���Ե�ֵ��
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
     * ��ȡrouteImport���Ե�ֵ��
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
     * ����routeImport���Ե�ֵ��
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
     * ��ȡadvanced���Ե�ֵ��
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
     * ����advanced���Ե�ֵ��
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
     * ��ȡisisState���Ե�ֵ��
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
     * ����isisState���Ե�ֵ��
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
