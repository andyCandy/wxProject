
package org.tmforum.mtop.nrf.xsd.tpdata.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;
import org.tmforum.mtop.nrf.xsd.com.v1.TerminationModeType;


/**
 * <p>TerminationPointDataType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TerminationPointDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="tpMappingMode" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TerminationModeType"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParametersList" minOccurs="0"/>
 *         &lt;element name="ingressTmdRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="egressTmdRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="ipAddressList" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}IPAddressListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationPointDataType", propOrder = {
    "tpRef",
    "tpMappingMode",
    "transmissionParametersList",
    "ingressTmdRef",
    "egressTmdRef",
    "ipAddressList"
})
public class TerminationPointDataType {

    @XmlElement(required = true)
    protected NamingAttributeType tpRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TerminationModeType tpMappingMode;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersListType transmissionParametersList;
    @XmlElement(required = true)
    protected NamingAttributeType ingressTmdRef;
    @XmlElement(required = true)
    protected NamingAttributeType egressTmdRef;
    @XmlElement(required = true)
    protected IPAddressListType ipAddressList;

    /**
     * ��ȡtpRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTpRef() {
        return tpRef;
    }

    /**
     * ����tpRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTpRef(NamingAttributeType value) {
        this.tpRef = value;
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

}
