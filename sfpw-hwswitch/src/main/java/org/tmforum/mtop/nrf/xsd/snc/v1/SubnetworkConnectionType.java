
package org.tmforum.mtop.nrf.xsd.snc.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.itu.v1.X721AdministrativeStateType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;
import org.tmforum.mtop.nrf.xsd.com.v1.ConnectionDirectionType;
import org.tmforum.mtop.nrf.xsd.com.v1.EndPointRoleType;
import org.tmforum.mtop.nrf.xsd.com.v1.NetworkRoutedType;
import org.tmforum.mtop.nrf.xsd.com.v1.ProtectionEffortType;
import org.tmforum.mtop.nrf.xsd.com.v1.RerouteType;
import org.tmforum.mtop.nrf.xsd.com.v1.StaticProtectionLevelType;
import org.tmforum.mtop.nrf.xsd.com.v1.SubnetworkConnectionStateType;
import org.tmforum.mtop.nrf.xsd.com.v1.SubnetworkConnectionTypeType;
import org.tmforum.mtop.nrf.xsd.tpdata.v1.TerminationPointDataListType;


/**
 * <p>SubnetworkConnectionType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SubnetworkConnectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="sncState" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}SubnetworkConnectionStateType"/>
 *         &lt;element name="administrativeState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}X721.AdministrativeStateType"/>
 *         &lt;element name="transmissionParametersList" type="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}LayeredParametersListType"/>
 *         &lt;element name="direction" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}ConnectionDirectionType"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType"/>
 *         &lt;element name="staticProtectionLevel" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}StaticProtectionLevelType"/>
 *         &lt;element name="sncType" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}SubnetworkConnectionTypeType"/>
 *         &lt;element name="aEndTpDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataListType"/>
 *         &lt;element name="zEndTpDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataListType"/>
 *         &lt;element name="rerouteAllowed" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}RerouteType"/>
 *         &lt;element name="networkRouted" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}NetworkRoutedType"/>
 *         &lt;element name="isReportingAlarms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isFixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="asapRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correlationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkReroute" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}RerouteType"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="revertive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aEndPointsRole">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="role" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}EndPointRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="isBundledSnc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="callId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connectionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connectionSetUpType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connectionState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maximumCost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isMustRemoveGtpList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="protectionEffort" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}ProtectionEffortType"/>
 *         &lt;element name="routeGroupLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routingConstraintEffort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supportedConnectionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supportingSncList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zEndPointsRole">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="role" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}EndPointRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="additionalInfo" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubnetworkConnectionType", propOrder = {
    "sncState",
    "administrativeState",
    "transmissionParametersList",
    "direction",
    "layerRate",
    "staticProtectionLevel",
    "sncType",
    "aEndTpDataList",
    "zEndTpDataList",
    "rerouteAllowed",
    "networkRouted",
    "isReportingAlarms",
    "isFixed",
    "asapRef",
    "correlationIdentifier",
    "networkReroute",
    "priority",
    "revertive",
    "aEndPointsRole",
    "isBundledSnc",
    "callId",
    "callName",
    "connectionId",
    "connectionSetUpType",
    "connectionState",
    "maximumCost",
    "isMustRemoveGtpList",
    "protectionEffort",
    "routeGroupLabel",
    "routingConstraintEffort",
    "supportedConnectionName",
    "supportingSncList",
    "zEndPointsRole",
    "additionalInfo"
})
public class SubnetworkConnectionType
    extends CommonResourceInfoType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SubnetworkConnectionStateType sncState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected X721AdministrativeStateType administrativeState;
    @XmlElement(required = true)
    protected LayeredParametersListType transmissionParametersList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConnectionDirectionType direction;
    @XmlElement(required = true)
    protected LayerRateType layerRate;
    @XmlElement(required = true)
    protected StaticProtectionLevelType staticProtectionLevel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SubnetworkConnectionTypeType sncType;
    @XmlElement(required = true)
    protected TerminationPointDataListType aEndTpDataList;
    @XmlElement(required = true)
    protected TerminationPointDataListType zEndTpDataList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RerouteType rerouteAllowed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NetworkRoutedType networkRouted;
    protected boolean isReportingAlarms;
    protected boolean isFixed;
    @XmlElement(required = true)
    protected String asapRef;
    @XmlElement(required = true)
    protected String correlationIdentifier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RerouteType networkReroute;
    protected long priority;
    protected boolean revertive;
    @XmlElement(required = true)
    protected SubnetworkConnectionType.AEndPointsRole aEndPointsRole;
    protected boolean isBundledSnc;
    @XmlElement(required = true)
    protected String callId;
    @XmlElement(required = true)
    protected String callName;
    @XmlElement(required = true)
    protected String connectionId;
    @XmlElement(required = true)
    protected String connectionSetUpType;
    @XmlElement(required = true)
    protected String connectionState;
    @XmlElement(required = true)
    protected String maximumCost;
    protected boolean isMustRemoveGtpList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProtectionEffortType protectionEffort;
    @XmlElement(required = true)
    protected String routeGroupLabel;
    @XmlElement(required = true)
    protected String routingConstraintEffort;
    @XmlElement(required = true)
    protected String supportedConnectionName;
    @XmlElement(required = true)
    protected String supportingSncList;
    @XmlElement(required = true)
    protected SubnetworkConnectionType.ZEndPointsRole zEndPointsRole;
    protected NameAndValueStringListType additionalInfo;

    /**
     * ��ȡsncState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubnetworkConnectionStateType }
     *     
     */
    public SubnetworkConnectionStateType getSncState() {
        return sncState;
    }

    /**
     * ����sncState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubnetworkConnectionStateType }
     *     
     */
    public void setSncState(SubnetworkConnectionStateType value) {
        this.sncState = value;
    }

    /**
     * ��ȡadministrativeState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public X721AdministrativeStateType getAdministrativeState() {
        return administrativeState;
    }

    /**
     * ����administrativeState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public void setAdministrativeState(X721AdministrativeStateType value) {
        this.administrativeState = value;
    }

    /**
     * ��ȡtransmissionParametersList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LayeredParametersListType }
     *     
     */
    public LayeredParametersListType getTransmissionParametersList() {
        return transmissionParametersList;
    }

    /**
     * ����transmissionParametersList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LayeredParametersListType }
     *     
     */
    public void setTransmissionParametersList(LayeredParametersListType value) {
        this.transmissionParametersList = value;
    }

    /**
     * ��ȡdirection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDirectionType }
     *     
     */
    public ConnectionDirectionType getDirection() {
        return direction;
    }

    /**
     * ����direction���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDirectionType }
     *     
     */
    public void setDirection(ConnectionDirectionType value) {
        this.direction = value;
    }

    /**
     * ��ȡlayerRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LayerRateType }
     *     
     */
    public LayerRateType getLayerRate() {
        return layerRate;
    }

    /**
     * ����layerRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateType }
     *     
     */
    public void setLayerRate(LayerRateType value) {
        this.layerRate = value;
    }

    /**
     * ��ȡstaticProtectionLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StaticProtectionLevelType }
     *     
     */
    public StaticProtectionLevelType getStaticProtectionLevel() {
        return staticProtectionLevel;
    }

    /**
     * ����staticProtectionLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StaticProtectionLevelType }
     *     
     */
    public void setStaticProtectionLevel(StaticProtectionLevelType value) {
        this.staticProtectionLevel = value;
    }

    /**
     * ��ȡsncType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubnetworkConnectionTypeType }
     *     
     */
    public SubnetworkConnectionTypeType getSncType() {
        return sncType;
    }

    /**
     * ����sncType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubnetworkConnectionTypeType }
     *     
     */
    public void setSncType(SubnetworkConnectionTypeType value) {
        this.sncType = value;
    }

    /**
     * ��ȡaEndTpDataList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public TerminationPointDataListType getAEndTpDataList() {
        return aEndTpDataList;
    }

    /**
     * ����aEndTpDataList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public void setAEndTpDataList(TerminationPointDataListType value) {
        this.aEndTpDataList = value;
    }

    /**
     * ��ȡzEndTpDataList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public TerminationPointDataListType getZEndTpDataList() {
        return zEndTpDataList;
    }

    /**
     * ����zEndTpDataList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointDataListType }
     *     
     */
    public void setZEndTpDataList(TerminationPointDataListType value) {
        this.zEndTpDataList = value;
    }

    /**
     * ��ȡrerouteAllowed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RerouteType }
     *     
     */
    public RerouteType getRerouteAllowed() {
        return rerouteAllowed;
    }

    /**
     * ����rerouteAllowed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteType }
     *     
     */
    public void setRerouteAllowed(RerouteType value) {
        this.rerouteAllowed = value;
    }

    /**
     * ��ȡnetworkRouted���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NetworkRoutedType }
     *     
     */
    public NetworkRoutedType getNetworkRouted() {
        return networkRouted;
    }

    /**
     * ����networkRouted���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkRoutedType }
     *     
     */
    public void setNetworkRouted(NetworkRoutedType value) {
        this.networkRouted = value;
    }

    /**
     * ��ȡisReportingAlarms���Ե�ֵ��
     * 
     */
    public boolean isIsReportingAlarms() {
        return isReportingAlarms;
    }

    /**
     * ����isReportingAlarms���Ե�ֵ��
     * 
     */
    public void setIsReportingAlarms(boolean value) {
        this.isReportingAlarms = value;
    }

    /**
     * ��ȡisFixed���Ե�ֵ��
     * 
     */
    public boolean isIsFixed() {
        return isFixed;
    }

    /**
     * ����isFixed���Ե�ֵ��
     * 
     */
    public void setIsFixed(boolean value) {
        this.isFixed = value;
    }

    /**
     * ��ȡasapRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsapRef() {
        return asapRef;
    }

    /**
     * ����asapRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsapRef(String value) {
        this.asapRef = value;
    }

    /**
     * ��ȡcorrelationIdentifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationIdentifier() {
        return correlationIdentifier;
    }

    /**
     * ����correlationIdentifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationIdentifier(String value) {
        this.correlationIdentifier = value;
    }

    /**
     * ��ȡnetworkReroute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RerouteType }
     *     
     */
    public RerouteType getNetworkReroute() {
        return networkReroute;
    }

    /**
     * ����networkReroute���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteType }
     *     
     */
    public void setNetworkReroute(RerouteType value) {
        this.networkReroute = value;
    }

    /**
     * ��ȡpriority���Ե�ֵ��
     * 
     */
    public long getPriority() {
        return priority;
    }

    /**
     * ����priority���Ե�ֵ��
     * 
     */
    public void setPriority(long value) {
        this.priority = value;
    }

    /**
     * ��ȡrevertive���Ե�ֵ��
     * 
     */
    public boolean isRevertive() {
        return revertive;
    }

    /**
     * ����revertive���Ե�ֵ��
     * 
     */
    public void setRevertive(boolean value) {
        this.revertive = value;
    }

    /**
     * ��ȡaEndPointsRole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubnetworkConnectionType.AEndPointsRole }
     *     
     */
    public SubnetworkConnectionType.AEndPointsRole getAEndPointsRole() {
        return aEndPointsRole;
    }

    /**
     * ����aEndPointsRole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubnetworkConnectionType.AEndPointsRole }
     *     
     */
    public void setAEndPointsRole(SubnetworkConnectionType.AEndPointsRole value) {
        this.aEndPointsRole = value;
    }

    /**
     * ��ȡisBundledSnc���Ե�ֵ��
     * 
     */
    public boolean isIsBundledSnc() {
        return isBundledSnc;
    }

    /**
     * ����isBundledSnc���Ե�ֵ��
     * 
     */
    public void setIsBundledSnc(boolean value) {
        this.isBundledSnc = value;
    }

    /**
     * ��ȡcallId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallId() {
        return callId;
    }

    /**
     * ����callId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallId(String value) {
        this.callId = value;
    }

    /**
     * ��ȡcallName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallName() {
        return callName;
    }

    /**
     * ����callName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallName(String value) {
        this.callName = value;
    }

    /**
     * ��ȡconnectionId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * ����connectionId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    /**
     * ��ȡconnectionSetUpType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionSetUpType() {
        return connectionSetUpType;
    }

    /**
     * ����connectionSetUpType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionSetUpType(String value) {
        this.connectionSetUpType = value;
    }

    /**
     * ��ȡconnectionState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionState() {
        return connectionState;
    }

    /**
     * ����connectionState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionState(String value) {
        this.connectionState = value;
    }

    /**
     * ��ȡmaximumCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCost() {
        return maximumCost;
    }

    /**
     * ����maximumCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCost(String value) {
        this.maximumCost = value;
    }

    /**
     * ��ȡisMustRemoveGtpList���Ե�ֵ��
     * 
     */
    public boolean isIsMustRemoveGtpList() {
        return isMustRemoveGtpList;
    }

    /**
     * ����isMustRemoveGtpList���Ե�ֵ��
     * 
     */
    public void setIsMustRemoveGtpList(boolean value) {
        this.isMustRemoveGtpList = value;
    }

    /**
     * ��ȡprotectionEffort���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProtectionEffortType }
     *     
     */
    public ProtectionEffortType getProtectionEffort() {
        return protectionEffort;
    }

    /**
     * ����protectionEffort���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionEffortType }
     *     
     */
    public void setProtectionEffort(ProtectionEffortType value) {
        this.protectionEffort = value;
    }

    /**
     * ��ȡrouteGroupLabel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteGroupLabel() {
        return routeGroupLabel;
    }

    /**
     * ����routeGroupLabel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteGroupLabel(String value) {
        this.routeGroupLabel = value;
    }

    /**
     * ��ȡroutingConstraintEffort���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingConstraintEffort() {
        return routingConstraintEffort;
    }

    /**
     * ����routingConstraintEffort���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingConstraintEffort(String value) {
        this.routingConstraintEffort = value;
    }

    /**
     * ��ȡsupportedConnectionName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedConnectionName() {
        return supportedConnectionName;
    }

    /**
     * ����supportedConnectionName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedConnectionName(String value) {
        this.supportedConnectionName = value;
    }

    /**
     * ��ȡsupportingSncList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportingSncList() {
        return supportingSncList;
    }

    /**
     * ����supportingSncList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportingSncList(String value) {
        this.supportingSncList = value;
    }

    /**
     * ��ȡzEndPointsRole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubnetworkConnectionType.ZEndPointsRole }
     *     
     */
    public SubnetworkConnectionType.ZEndPointsRole getZEndPointsRole() {
        return zEndPointsRole;
    }

    /**
     * ����zEndPointsRole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubnetworkConnectionType.ZEndPointsRole }
     *     
     */
    public void setZEndPointsRole(SubnetworkConnectionType.ZEndPointsRole value) {
        this.zEndPointsRole = value;
    }

    /**
     * ��ȡadditionalInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * ����additionalInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setAdditionalInfo(NameAndValueStringListType value) {
        this.additionalInfo = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="role" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}EndPointRoleType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "role"
    })
    public static class AEndPointsRole {

        @XmlElement(nillable = true)
        protected List<EndPointRoleType> role;

        /**
         * Gets the value of the role property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the role property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EndPointRoleType }
         * 
         * 
         */
        public List<EndPointRoleType> getRole() {
            if (role == null) {
                role = new ArrayList<EndPointRoleType>();
            }
            return this.role;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="role" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}EndPointRoleType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "role"
    })
    public static class ZEndPointsRole {

        @XmlElement(nillable = true)
        protected List<EndPointRoleType> role;

        /**
         * Gets the value of the role property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the role property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EndPointRoleType }
         * 
         * 
         */
        public List<EndPointRoleType> getRole() {
            if (role == null) {
                role = new ArrayList<EndPointRoleType>();
            }
            return this.role;
        }

    }

}
