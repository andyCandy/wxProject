
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;


/**
 * <p>HWL3VPNExtensionsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡvrfRD���Ե�ֵ��
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
     * ����vrfRD���Ե�ֵ��
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
     * ��ȡrtList���Ե�ֵ��
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
     * ����rtList���Ե�ֵ��
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
     * ��ȡlabelAssignMode���Ե�ֵ��
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
     * ����labelAssignMode���Ե�ֵ��
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
     * ��ȡtunnelSelectionList���Ե�ֵ��
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
     * ����tunnelSelectionList���Ե�ֵ��
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
     * ��ȡstaticRouteList���Ե�ֵ��
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
     * ����staticRouteList���Ե�ֵ��
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
     * ��ȡospfList���Ե�ֵ��
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
     * ����ospfList���Ե�ֵ��
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
     * ��ȡisisList���Ե�ֵ��
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
     * ����isisList���Ե�ֵ��
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
     * ��ȡbgpList���Ե�ֵ��
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
     * ����bgpList���Ե�ֵ��
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
     * ��ȡrouteLimit���Ե�ֵ��
     * 
     */
    public int getRouteLimit() {
        return routeLimit;
    }

    /**
     * ����routeLimit���Ե�ֵ��
     * 
     */
    public void setRouteLimit(int value) {
        this.routeLimit = value;
    }

    /**
     * ��ȡcbsrList���Ե�ֵ��
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
     * ����cbsrList���Ե�ֵ��
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
     * ��ȡstaticRPList���Ե�ֵ��
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
     * ����staticRPList���Ե�ֵ��
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
     * ��ȡdynamicRPList���Ե�ֵ��
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
     * ����dynamicRPList���Ե�ֵ��
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
     * ��ȡparameterList���Ե�ֵ��
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
     * ����parameterList���Ե�ֵ��
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
     * ��ȡmulticastRoutingState���Ե�ֵ��
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
     * ����multicastRoutingState���Ե�ֵ��
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
     * ��ȡmulticastRouteLimit���Ե�ֵ��
     * 
     */
    public int getMulticastRouteLimit() {
        return multicastRouteLimit;
    }

    /**
     * ����multicastRouteLimit���Ե�ֵ��
     * 
     */
    public void setMulticastRouteLimit(int value) {
        this.multicastRouteLimit = value;
    }

    /**
     * ��ȡmulticastDownStreamLimit���Ե�ֵ��
     * 
     */
    public int getMulticastDownStreamLimit() {
        return multicastDownStreamLimit;
    }

    /**
     * ����multicastDownStreamLimit���Ե�ֵ��
     * 
     */
    public void setMulticastDownStreamLimit(int value) {
        this.multicastDownStreamLimit = value;
    }

    /**
     * ��ȡshareGroupAddress���Ե�ֵ��
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
     * ����shareGroupAddress���Ե�ֵ��
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
