
package org.tmforum.mtop.nrf.xsd.tmd.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lp.v1.LayeredParametersListType;


/**
 * <p>TransmissionDescriptorType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TransmissionDescriptorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrb/xsd/lp/v1}transmissionParametersList" minOccurs="0"/>
 *         &lt;element name="additionalObjectInformation" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *         &lt;element name="containingTmdRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="externalRepresentationReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conformanceDefinition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmissionDescriptorType", propOrder = {
    "transmissionParametersList",
    "additionalObjectInformation",
    "containingTmdRef",
    "externalRepresentationReference",
    "conformanceDefinition",
    "serviceCategory"
})
public class TransmissionDescriptorType
    extends CommonResourceInfoType
{

    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrb/xsd/lp/v1")
    protected LayeredParametersListType transmissionParametersList;
    @XmlElement(required = true)
    protected NameAndValueStringListType additionalObjectInformation;
    @XmlElement(required = true)
    protected NamingAttributeType containingTmdRef;
    @XmlElement(required = true)
    protected String externalRepresentationReference;
    @XmlElement(required = true)
    protected String conformanceDefinition;
    @XmlElement(required = true)
    protected String serviceCategory;

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
     * ��ȡadditionalObjectInformation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getAdditionalObjectInformation() {
        return additionalObjectInformation;
    }

    /**
     * ����additionalObjectInformation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setAdditionalObjectInformation(NameAndValueStringListType value) {
        this.additionalObjectInformation = value;
    }

    /**
     * ��ȡcontainingTmdRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getContainingTmdRef() {
        return containingTmdRef;
    }

    /**
     * ����containingTmdRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setContainingTmdRef(NamingAttributeType value) {
        this.containingTmdRef = value;
    }

    /**
     * ��ȡexternalRepresentationReference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRepresentationReference() {
        return externalRepresentationReference;
    }

    /**
     * ����externalRepresentationReference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRepresentationReference(String value) {
        this.externalRepresentationReference = value;
    }

    /**
     * ��ȡconformanceDefinition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformanceDefinition() {
        return conformanceDefinition;
    }

    /**
     * ����conformanceDefinition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformanceDefinition(String value) {
        this.conformanceDefinition = value;
    }

    /**
     * ��ȡserviceCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategory() {
        return serviceCategory;
    }

    /**
     * ����serviceCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategory(String value) {
        this.serviceCategory = value;
    }

}
