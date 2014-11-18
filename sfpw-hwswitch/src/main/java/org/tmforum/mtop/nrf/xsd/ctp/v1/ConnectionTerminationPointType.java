
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
 * <p>ConnectionTerminationPointType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdirection���Ե�ֵ��
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
     * ����direction���Ե�ֵ��
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
     * ��ȡtpProtectionAssociation���Ե�ֵ��
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
     * ����tpProtectionAssociation���Ե�ֵ��
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
     * ��ȡisEdgePoint���Ե�ֵ��
     * 
     */
    public boolean isIsEdgePoint() {
        return isEdgePoint;
    }

    /**
     * ����isEdgePoint���Ե�ֵ��
     * 
     */
    public void setIsEdgePoint(boolean value) {
        this.isEdgePoint = value;
    }

    /**
     * ��ȡisEquipmentProtected���Ե�ֵ��
     * 
     */
    public boolean isIsEquipmentProtected() {
        return isEquipmentProtected;
    }

    /**
     * ����isEquipmentProtected���Ե�ֵ��
     * 
     */
    public void setIsEquipmentProtected(boolean value) {
        this.isEquipmentProtected = value;
    }

    /**
     * ��ȡegressTmdState���Ե�ֵ��
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
     * ����egressTmdState���Ե�ֵ��
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
     * ��ȡingressTmdState���Ե�ֵ��
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
     * ����ingressTmdState���Ե�ֵ��
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
     * ��ȡconnectionState���Ե�ֵ��
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
     * ����connectionState���Ե�ֵ��
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
     * ��ȡtpMappingMode���Ե�ֵ��
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
     * ����tpMappingMode���Ե�ֵ��
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
     * ��ȡingressTmdRef���Ե�ֵ��
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
     * ����ingressTmdRef���Ե�ֵ��
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
     * ��ȡegressTmdRef���Ե�ֵ��
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
     * ����egressTmdRef���Ե�ֵ��
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
     * ��ȡipAddressList���Ե�ֵ��
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
     * ����ipAddressList���Ե�ֵ��
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

}
