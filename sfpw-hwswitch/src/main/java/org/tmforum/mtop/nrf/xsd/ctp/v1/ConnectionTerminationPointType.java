
package org.tmforum.mtop.nrf.xsd.ctp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;
import org.tmforum.mtop.nrf.xsd.com.v1.DirectionalityType;
import org.tmforum.mtop.nrf.xsd.com.v1.TerminationModeType;
import org.tmforum.mtop.nrf.xsd.com.v1.TerminationPointConnectionStateType;
import org.tmforum.mtop.nrf.xsd.com.v1.TerminationPointProtectionAssociationType;
import org.tmforum.mtop.nrf.xsd.com.v1.TransmissionDescriptorStateType;
import org.tmforum.mtop.nrf.xsd.tpdata.v1.IPAddressListType;


/**
 * <p>ConnectionTerminationPointType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ConnectionTerminationPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}DirectionalityType"/>
 *         &lt;element name="tpProtectionAssociation" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TerminationPointProtectionAssociationType"/>
 *         &lt;element name="isEdgePoint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isEquipmentProtected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="egressTmdState" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TransmissionDescriptorStateType"/>
 *         &lt;element name="ingressTmdState" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TransmissionDescriptorStateType"/>
 *         &lt;element name="connectionState" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TerminationPointConnectionStateType"/>
 *         &lt;element name="tpMappingMode" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TerminationModeType"/>
 *         &lt;element name="ingressTmdRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="egressTmdRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="ipAddressList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}IPAddressListType"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParametersList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTerminationPointType", propOrder = {
    "direction",
    "tpProtectionAssociation",
    "isEdgePoint",
    "isEquipmentProtected",
    "egressTmdState",
    "ingressTmdState",
    "connectionState",
    "tpMappingMode",
    "ingressTmdRef",
    "egressTmdRef",
    "ipAddressList",
    "transmissionParametersList"
})
public class ConnectionTerminationPointType
    extends CommonResourceInfoType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DirectionalityType direction;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TerminationPointProtectionAssociationType tpProtectionAssociation;
    protected boolean isEdgePoint;
    protected boolean isEquipmentProtected;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TransmissionDescriptorStateType egressTmdState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TransmissionDescriptorStateType ingressTmdState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TerminationPointConnectionStateType connectionState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TerminationModeType tpMappingMode;
    @XmlElement(required = true)
    protected NamingAttributeType ingressTmdRef;
    @XmlElement(required = true)
    protected NamingAttributeType egressTmdRef;
    @XmlElement(required = true)
    protected IPAddressListType ipAddressList;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersListType transmissionParametersList;

    /**
     * 获取direction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DirectionalityType }
     *     
     */
    public DirectionalityType getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionalityType }
     *     
     */
    public void setDirection(DirectionalityType value) {
        this.direction = value;
    }

    /**
     * 获取tpProtectionAssociation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointProtectionAssociationType }
     *     
     */
    public TerminationPointProtectionAssociationType getTpProtectionAssociation() {
        return tpProtectionAssociation;
    }

    /**
     * 设置tpProtectionAssociation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointProtectionAssociationType }
     *     
     */
    public void setTpProtectionAssociation(TerminationPointProtectionAssociationType value) {
        this.tpProtectionAssociation = value;
    }

    /**
     * 获取isEdgePoint属性的值。
     * 
     */
    public boolean isIsEdgePoint() {
        return isEdgePoint;
    }

    /**
     * 设置isEdgePoint属性的值。
     * 
     */
    public void setIsEdgePoint(boolean value) {
        this.isEdgePoint = value;
    }

    /**
     * 获取isEquipmentProtected属性的值。
     * 
     */
    public boolean isIsEquipmentProtected() {
        return isEquipmentProtected;
    }

    /**
     * 设置isEquipmentProtected属性的值。
     * 
     */
    public void setIsEquipmentProtected(boolean value) {
        this.isEquipmentProtected = value;
    }

    /**
     * 获取egressTmdState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransmissionDescriptorStateType }
     *     
     */
    public TransmissionDescriptorStateType getEgressTmdState() {
        return egressTmdState;
    }

    /**
     * 设置egressTmdState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransmissionDescriptorStateType }
     *     
     */
    public void setEgressTmdState(TransmissionDescriptorStateType value) {
        this.egressTmdState = value;
    }

    /**
     * 获取ingressTmdState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransmissionDescriptorStateType }
     *     
     */
    public TransmissionDescriptorStateType getIngressTmdState() {
        return ingressTmdState;
    }

    /**
     * 设置ingressTmdState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransmissionDescriptorStateType }
     *     
     */
    public void setIngressTmdState(TransmissionDescriptorStateType value) {
        this.ingressTmdState = value;
    }

    /**
     * 获取connectionState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointConnectionStateType }
     *     
     */
    public TerminationPointConnectionStateType getConnectionState() {
        return connectionState;
    }

    /**
     * 设置connectionState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointConnectionStateType }
     *     
     */
    public void setConnectionState(TerminationPointConnectionStateType value) {
        this.connectionState = value;
    }

    /**
     * 获取tpMappingMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationModeType }
     *     
     */
    public TerminationModeType getTpMappingMode() {
        return tpMappingMode;
    }

    /**
     * 设置tpMappingMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationModeType }
     *     
     */
    public void setTpMappingMode(TerminationModeType value) {
        this.tpMappingMode = value;
    }

    /**
     * 获取ingressTmdRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getIngressTmdRef() {
        return ingressTmdRef;
    }

    /**
     * 设置ingressTmdRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setIngressTmdRef(NamingAttributeType value) {
        this.ingressTmdRef = value;
    }

    /**
     * 获取egressTmdRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getEgressTmdRef() {
        return egressTmdRef;
    }

    /**
     * 设置egressTmdRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setEgressTmdRef(NamingAttributeType value) {
        this.egressTmdRef = value;
    }

    /**
     * 获取ipAddressList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IPAddressListType }
     *     
     */
    public IPAddressListType getIpAddressList() {
        return ipAddressList;
    }

    /**
     * 设置ipAddressList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddressListType }
     *     
     */
    public void setIpAddressList(IPAddressListType value) {
        this.ipAddressList = value;
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

}
