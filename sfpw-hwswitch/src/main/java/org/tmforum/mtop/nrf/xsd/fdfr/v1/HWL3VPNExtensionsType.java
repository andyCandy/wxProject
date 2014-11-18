
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;


/**
 * <p>HWL3VPNExtensionsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HWL3VPNExtensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vrfRD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rtList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}RTListType"/>
 *         &lt;element name="labelAssignMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tunnelSelectionList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}TunnelSelectionListType"/>
 *         &lt;element name="staticRouteList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}StaticRouteListType"/>
 *         &lt;element name="ospfList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}OSPFListType"/>
 *         &lt;element name="isisList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISListType"/>
 *         &lt;element name="bgpList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}BGPListType"/>
 *         &lt;element name="routeLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cbsrList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}CBSRListType"/>
 *         &lt;element name="staticRPList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}StaticRPListType"/>
 *         &lt;element name="dynamicRPList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}DynamicRPListType"/>
 *         &lt;element name="parameterList" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *         &lt;element name="multicastRoutingState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multicastRouteLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="multicastDownStreamLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shareGroupAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HWL3VPNExtensionsType", propOrder = {
    "vrfRD",
    "rtList",
    "labelAssignMode",
    "tunnelSelectionList",
    "staticRouteList",
    "ospfList",
    "isisList",
    "bgpList",
    "routeLimit",
    "cbsrList",
    "staticRPList",
    "dynamicRPList",
    "parameterList",
    "multicastRoutingState",
    "multicastRouteLimit",
    "multicastDownStreamLimit",
    "shareGroupAddress"
})
public class HWL3VPNExtensionsType {

    @XmlElement(required = true)
    protected String vrfRD;
    @XmlElement(required = true)
    protected RTListType rtList;
    @XmlElement(required = true)
    protected String labelAssignMode;
    @XmlElement(required = true)
    protected TunnelSelectionListType tunnelSelectionList;
    @XmlElement(required = true)
    protected StaticRouteListType staticRouteList;
    @XmlElement(required = true)
    protected OSPFListType ospfList;
    @XmlElement(required = true)
    protected ISISListType isisList;
    @XmlElement(required = true)
    protected BGPListType bgpList;
    protected int routeLimit;
    @XmlElement(required = true)
    protected CBSRListType cbsrList;
    @XmlElement(required = true)
    protected StaticRPListType staticRPList;
    @XmlElement(required = true)
    protected DynamicRPListType dynamicRPList;
    @XmlElement(required = true)
    protected NameAndValueStringListType parameterList;
    @XmlElement(required = true)
    protected String multicastRoutingState;
    protected int multicastRouteLimit;
    protected int multicastDownStreamLimit;
    @XmlElement(required = true)
    protected String shareGroupAddress;

    /**
     * 获取vrfRD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrfRD() {
        return vrfRD;
    }

    /**
     * 设置vrfRD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrfRD(String value) {
        this.vrfRD = value;
    }

    /**
     * 获取rtList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RTListType }
     *     
     */
    public RTListType getRtList() {
        return rtList;
    }

    /**
     * 设置rtList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RTListType }
     *     
     */
    public void setRtList(RTListType value) {
        this.rtList = value;
    }

    /**
     * 获取labelAssignMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelAssignMode() {
        return labelAssignMode;
    }

    /**
     * 设置labelAssignMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelAssignMode(String value) {
        this.labelAssignMode = value;
    }

    /**
     * 获取tunnelSelectionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TunnelSelectionListType }
     *     
     */
    public TunnelSelectionListType getTunnelSelectionList() {
        return tunnelSelectionList;
    }

    /**
     * 设置tunnelSelectionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TunnelSelectionListType }
     *     
     */
    public void setTunnelSelectionList(TunnelSelectionListType value) {
        this.tunnelSelectionList = value;
    }

    /**
     * 获取staticRouteList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StaticRouteListType }
     *     
     */
    public StaticRouteListType getStaticRouteList() {
        return staticRouteList;
    }

    /**
     * 设置staticRouteList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StaticRouteListType }
     *     
     */
    public void setStaticRouteList(StaticRouteListType value) {
        this.staticRouteList = value;
    }

    /**
     * 获取ospfList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OSPFListType }
     *     
     */
    public OSPFListType getOspfList() {
        return ospfList;
    }

    /**
     * 设置ospfList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OSPFListType }
     *     
     */
    public void setOspfList(OSPFListType value) {
        this.ospfList = value;
    }

    /**
     * 获取isisList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ISISListType }
     *     
     */
    public ISISListType getIsisList() {
        return isisList;
    }

    /**
     * 设置isisList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ISISListType }
     *     
     */
    public void setIsisList(ISISListType value) {
        this.isisList = value;
    }

    /**
     * 获取bgpList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BGPListType }
     *     
     */
    public BGPListType getBgpList() {
        return bgpList;
    }

    /**
     * 设置bgpList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BGPListType }
     *     
     */
    public void setBgpList(BGPListType value) {
        this.bgpList = value;
    }

    /**
     * 获取routeLimit属性的值。
     * 
     */
    public int getRouteLimit() {
        return routeLimit;
    }

    /**
     * 设置routeLimit属性的值。
     * 
     */
    public void setRouteLimit(int value) {
        this.routeLimit = value;
    }

    /**
     * 获取cbsrList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CBSRListType }
     *     
     */
    public CBSRListType getCbsrList() {
        return cbsrList;
    }

    /**
     * 设置cbsrList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CBSRListType }
     *     
     */
    public void setCbsrList(CBSRListType value) {
        this.cbsrList = value;
    }

    /**
     * 获取staticRPList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StaticRPListType }
     *     
     */
    public StaticRPListType getStaticRPList() {
        return staticRPList;
    }

    /**
     * 设置staticRPList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StaticRPListType }
     *     
     */
    public void setStaticRPList(StaticRPListType value) {
        this.staticRPList = value;
    }

    /**
     * 获取dynamicRPList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DynamicRPListType }
     *     
     */
    public DynamicRPListType getDynamicRPList() {
        return dynamicRPList;
    }

    /**
     * 设置dynamicRPList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicRPListType }
     *     
     */
    public void setDynamicRPList(DynamicRPListType value) {
        this.dynamicRPList = value;
    }

    /**
     * 获取parameterList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getParameterList() {
        return parameterList;
    }

    /**
     * 设置parameterList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setParameterList(NameAndValueStringListType value) {
        this.parameterList = value;
    }

    /**
     * 获取multicastRoutingState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulticastRoutingState() {
        return multicastRoutingState;
    }

    /**
     * 设置multicastRoutingState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulticastRoutingState(String value) {
        this.multicastRoutingState = value;
    }

    /**
     * 获取multicastRouteLimit属性的值。
     * 
     */
    public int getMulticastRouteLimit() {
        return multicastRouteLimit;
    }

    /**
     * 设置multicastRouteLimit属性的值。
     * 
     */
    public void setMulticastRouteLimit(int value) {
        this.multicastRouteLimit = value;
    }

    /**
     * 获取multicastDownStreamLimit属性的值。
     * 
     */
    public int getMulticastDownStreamLimit() {
        return multicastDownStreamLimit;
    }

    /**
     * 设置multicastDownStreamLimit属性的值。
     * 
     */
    public void setMulticastDownStreamLimit(int value) {
        this.multicastDownStreamLimit = value;
    }

    /**
     * 获取shareGroupAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareGroupAddress() {
        return shareGroupAddress;
    }

    /**
     * 设置shareGroupAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareGroupAddress(String value) {
        this.shareGroupAddress = value;
    }

}
