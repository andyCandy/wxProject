
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
 * <p>TransmissionDescriptorType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取additionalObjectInformation属性的值。
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
     * 设置additionalObjectInformation属性的值。
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
     * 获取containingTmdRef属性的值。
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
     * 设置containingTmdRef属性的值。
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
     * 获取externalRepresentationReference属性的值。
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
     * 设置externalRepresentationReference属性的值。
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
     * 获取conformanceDefinition属性的值。
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
     * 设置conformanceDefinition属性的值。
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
     * 获取serviceCategory属性的值。
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
     * 设置serviceCategory属性的值。
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
