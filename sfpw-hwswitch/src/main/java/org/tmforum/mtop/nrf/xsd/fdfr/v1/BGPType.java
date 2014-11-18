
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BGPType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BGPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bgpInstID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enableState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="asNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="asNumberFourByte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grEnable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grRecoveryTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bgpPgList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}BGPPgListType"/>
 *         &lt;element name="bgpPeerList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}BGPPeerListType"/>
 *         &lt;element name="importRouteList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ImportRouteListType"/>
 *         &lt;element name="networkList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}NetworkAddressListType"/>
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
@XmlType(name = "BGPType", propOrder = {
    "bgpInstID",
    "enableState",
    "routerID",
    "asNumber",
    "asNumberFourByte",
    "grEnable",
    "grInterval",
    "grRecoveryTime",
    "bgpPgList",
    "bgpPeerList",
    "importRouteList",
    "networkList",
    "action"
})
public class BGPType {

    @XmlElement(required = true)
    protected String bgpInstID;
    @XmlElement(required = true)
    protected String enableState;
    @XmlElement(required = true)
    protected String routerID;
    protected int asNumber;
    @XmlElement(required = true)
    protected String asNumberFourByte;
    @XmlElement(required = true)
    protected String grEnable;
    protected int grInterval;
    protected int grRecoveryTime;
    @XmlElement(required = true)
    protected BGPPgListType bgpPgList;
    @XmlElement(required = true)
    protected BGPPeerListType bgpPeerList;
    @XmlElement(required = true)
    protected ImportRouteListType importRouteList;
    @XmlElement(required = true)
    protected NetworkAddressListType networkList;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取bgpInstID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgpInstID() {
        return bgpInstID;
    }

    /**
     * 设置bgpInstID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgpInstID(String value) {
        this.bgpInstID = value;
    }

    /**
     * 获取enableState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableState() {
        return enableState;
    }

    /**
     * 设置enableState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableState(String value) {
        this.enableState = value;
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
     * 获取asNumber属性的值。
     * 
     */
    public int getAsNumber() {
        return asNumber;
    }

    /**
     * 设置asNumber属性的值。
     * 
     */
    public void setAsNumber(int value) {
        this.asNumber = value;
    }

    /**
     * 获取asNumberFourByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsNumberFourByte() {
        return asNumberFourByte;
    }

    /**
     * 设置asNumberFourByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsNumberFourByte(String value) {
        this.asNumberFourByte = value;
    }

    /**
     * 获取grEnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrEnable() {
        return grEnable;
    }

    /**
     * 设置grEnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrEnable(String value) {
        this.grEnable = value;
    }

    /**
     * 获取grInterval属性的值。
     * 
     */
    public int getGrInterval() {
        return grInterval;
    }

    /**
     * 设置grInterval属性的值。
     * 
     */
    public void setGrInterval(int value) {
        this.grInterval = value;
    }

    /**
     * 获取grRecoveryTime属性的值。
     * 
     */
    public int getGrRecoveryTime() {
        return grRecoveryTime;
    }

    /**
     * 设置grRecoveryTime属性的值。
     * 
     */
    public void setGrRecoveryTime(int value) {
        this.grRecoveryTime = value;
    }

    /**
     * 获取bgpPgList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BGPPgListType }
     *     
     */
    public BGPPgListType getBgpPgList() {
        return bgpPgList;
    }

    /**
     * 设置bgpPgList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BGPPgListType }
     *     
     */
    public void setBgpPgList(BGPPgListType value) {
        this.bgpPgList = value;
    }

    /**
     * 获取bgpPeerList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BGPPeerListType }
     *     
     */
    public BGPPeerListType getBgpPeerList() {
        return bgpPeerList;
    }

    /**
     * 设置bgpPeerList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BGPPeerListType }
     *     
     */
    public void setBgpPeerList(BGPPeerListType value) {
        this.bgpPeerList = value;
    }

    /**
     * 获取importRouteList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImportRouteListType }
     *     
     */
    public ImportRouteListType getImportRouteList() {
        return importRouteList;
    }

    /**
     * 设置importRouteList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImportRouteListType }
     *     
     */
    public void setImportRouteList(ImportRouteListType value) {
        this.importRouteList = value;
    }

    /**
     * 获取networkList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetworkAddressListType }
     *     
     */
    public NetworkAddressListType getNetworkList() {
        return networkList;
    }

    /**
     * 设置networkList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkAddressListType }
     *     
     */
    public void setNetworkList(NetworkAddressListType value) {
        this.networkList = value;
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
