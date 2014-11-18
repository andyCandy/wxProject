
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BGPType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbgpInstID���Ե�ֵ��
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
     * ����bgpInstID���Ե�ֵ��
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
     * ��ȡenableState���Ե�ֵ��
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
     * ����enableState���Ե�ֵ��
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
     * ��ȡasNumber���Ե�ֵ��
     * 
     */
    public int getAsNumber() {
        return asNumber;
    }

    /**
     * ����asNumber���Ե�ֵ��
     * 
     */
    public void setAsNumber(int value) {
        this.asNumber = value;
    }

    /**
     * ��ȡasNumberFourByte���Ե�ֵ��
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
     * ����asNumberFourByte���Ե�ֵ��
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
     * ��ȡgrEnable���Ե�ֵ��
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
     * ����grEnable���Ե�ֵ��
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
     * ��ȡgrInterval���Ե�ֵ��
     * 
     */
    public int getGrInterval() {
        return grInterval;
    }

    /**
     * ����grInterval���Ե�ֵ��
     * 
     */
    public void setGrInterval(int value) {
        this.grInterval = value;
    }

    /**
     * ��ȡgrRecoveryTime���Ե�ֵ��
     * 
     */
    public int getGrRecoveryTime() {
        return grRecoveryTime;
    }

    /**
     * ����grRecoveryTime���Ե�ֵ��
     * 
     */
    public void setGrRecoveryTime(int value) {
        this.grRecoveryTime = value;
    }

    /**
     * ��ȡbgpPgList���Ե�ֵ��
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
     * ����bgpPgList���Ե�ֵ��
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
     * ��ȡbgpPeerList���Ե�ֵ��
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
     * ����bgpPeerList���Ե�ֵ��
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
     * ��ȡimportRouteList���Ե�ֵ��
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
     * ����importRouteList���Ե�ֵ��
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
     * ��ȡnetworkList���Ե�ֵ��
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
     * ����networkList���Ե�ֵ��
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
