
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
 * <p>SubnetworkConnectionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取sncState属性的值。
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
     * 设置sncState属性的值。
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
     * 获取administrativeState属性的值。
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
     * 设置administrativeState属性的值。
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
     * 获取transmissionParametersList属性的值。
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
     * 设置transmissionParametersList属性的值。
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
     * 获取direction属性的值。
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
     * 设置direction属性的值。
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
     * 获取layerRate属性的值。
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
     * 设置layerRate属性的值。
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
     * 获取staticProtectionLevel属性的值。
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
     * 设置staticProtectionLevel属性的值。
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
     * 获取sncType属性的值。
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
     * 设置sncType属性的值。
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
     * 获取aEndTpDataList属性的值。
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
     * 设置aEndTpDataList属性的值。
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
     * 获取zEndTpDataList属性的值。
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
     * 设置zEndTpDataList属性的值。
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
     * 获取rerouteAllowed属性的值。
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
     * 设置rerouteAllowed属性的值。
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
     * 获取networkRouted属性的值。
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
     * 设置networkRouted属性的值。
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
     * 获取isReportingAlarms属性的值。
     * 
     */
    public boolean isIsReportingAlarms() {
        return isReportingAlarms;
    }

    /**
     * 设置isReportingAlarms属性的值。
     * 
     */
    public void setIsReportingAlarms(boolean value) {
        this.isReportingAlarms = value;
    }

    /**
     * 获取isFixed属性的值。
     * 
     */
    public boolean isIsFixed() {
        return isFixed;
    }

    /**
     * 设置isFixed属性的值。
     * 
     */
    public void setIsFixed(boolean value) {
        this.isFixed = value;
    }

    /**
     * 获取asapRef属性的值。
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
     * 设置asapRef属性的值。
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
     * 获取correlationIdentifier属性的值。
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
     * 设置correlationIdentifier属性的值。
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
     * 获取networkReroute属性的值。
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
     * 设置networkReroute属性的值。
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
     * 获取priority属性的值。
     * 
     */
    public long getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     */
    public void setPriority(long value) {
        this.priority = value;
    }

    /**
     * 获取revertive属性的值。
     * 
     */
    public boolean isRevertive() {
        return revertive;
    }

    /**
     * 设置revertive属性的值。
     * 
     */
    public void setRevertive(boolean value) {
        this.revertive = value;
    }

    /**
     * 获取aEndPointsRole属性的值。
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
     * 设置aEndPointsRole属性的值。
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
     * 获取isBundledSnc属性的值。
     * 
     */
    public boolean isIsBundledSnc() {
        return isBundledSnc;
    }

    /**
     * 设置isBundledSnc属性的值。
     * 
     */
    public void setIsBundledSnc(boolean value) {
        this.isBundledSnc = value;
    }

    /**
     * 获取callId属性的值。
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
     * 设置callId属性的值。
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
     * 获取callName属性的值。
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
     * 设置callName属性的值。
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
     * 获取connectionId属性的值。
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
     * 设置connectionId属性的值。
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
     * 获取connectionSetUpType属性的值。
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
     * 设置connectionSetUpType属性的值。
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
     * 获取connectionState属性的值。
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
     * 设置connectionState属性的值。
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
     * 获取maximumCost属性的值。
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
     * 设置maximumCost属性的值。
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
     * 获取isMustRemoveGtpList属性的值。
     * 
     */
    public boolean isIsMustRemoveGtpList() {
        return isMustRemoveGtpList;
    }

    /**
     * 设置isMustRemoveGtpList属性的值。
     * 
     */
    public void setIsMustRemoveGtpList(boolean value) {
        this.isMustRemoveGtpList = value;
    }

    /**
     * 获取protectionEffort属性的值。
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
     * 设置protectionEffort属性的值。
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
     * 获取routeGroupLabel属性的值。
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
     * 设置routeGroupLabel属性的值。
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
     * 获取routingConstraintEffort属性的值。
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
     * 设置routingConstraintEffort属性的值。
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
     * 获取supportedConnectionName属性的值。
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
     * 设置supportedConnectionName属性的值。
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
     * 获取supportingSncList属性的值。
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
     * 设置supportingSncList属性的值。
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
     * 获取zEndPointsRole属性的值。
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
     * 设置zEndPointsRole属性的值。
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
     * 获取additionalInfo属性的值。
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
     * 设置additionalInfo属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
