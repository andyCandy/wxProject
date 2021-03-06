
package org.tmforum.mtop.nrf.xsd.ptp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;
import org.tmforum.mtop.nrf.xsd.com.v1.DirectionalityType;
import org.tmforum.mtop.nrf.xsd.com.v1.TerminationPointProtectionAssociationType;
import org.tmforum.mtop.nrf.xsd.com.v1.TransmissionDescriptorStateType;
import org.tmforum.mtop.nrf.xsd.tpdata.v1.IPAddressListType;


/**
 * <p>PhysicalTerminationPointType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PhysicalTerminationPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}DirectionalityType"/>
 *         &lt;element name="tpProtectionAssociation" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TerminationPointProtectionAssociationType"/>
 *         &lt;element name="isEdgePoint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isEquipmentProtected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="egressTmdState" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TransmissionDescriptorStateType"/>
 *         &lt;element name="ingressTmdState" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TransmissionDescriptorStateType"/>
 *         &lt;element name="ingressTmdRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="egressTmdRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParametersList" minOccurs="0"/>
 *         &lt;element name="ipAddressList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}IPAddressListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalTerminationPointType", propOrder = {
    "direction",
    "tpProtectionAssociation",
    "isEdgePoint",
    "isEquipmentProtected",
    "egressTmdState",
    "ingressTmdState",
    "ingressTmdRef",
    "egressTmdRef",
    "transmissionParametersList",
    "ipAddressList"
})
public class PhysicalTerminationPointType
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
    protected NamingAttributeType ingressTmdRef;
    @XmlElement(required = true)
    protected NamingAttributeType egressTmdRef;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersListType transmissionParametersList;
    @XmlElement(required = true)
    protected IPAddressListType ipAddressList;

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

}
