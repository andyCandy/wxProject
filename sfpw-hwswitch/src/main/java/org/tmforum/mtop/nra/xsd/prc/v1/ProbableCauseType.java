
package org.tmforum.mtop.nra.xsd.prc.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProbableCauseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProbableCauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ru" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contra" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="probableCause" type="{http://www.tmforum.org/mtop/nra/xsd/prc/v1}ProbableCauseEnumType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProbableCauseType", propOrder = {
    "ru",
    "contra",
    "probableCause"
})
public class ProbableCauseType {

    @XmlElement(defaultValue = "false")
    protected Boolean ru;
    @XmlElement(defaultValue = "false")
    protected Boolean contra;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProbableCauseEnumType probableCause;
    @XmlAttribute(name = "extension")
    protected String extension;
    @XmlAttribute(name = "qualifier")
    protected String qualifier;

    /**
     * 获取ru属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRu() {
        return ru;
    }

    /**
     * 设置ru属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRu(Boolean value) {
        this.ru = value;
    }

    /**
     * 获取contra属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContra() {
        return contra;
    }

    /**
     * 设置contra属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContra(Boolean value) {
        this.contra = value;
    }

    /**
     * 获取probableCause属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProbableCauseEnumType }
     *     
     */
    public ProbableCauseEnumType getProbableCause() {
        return probableCause;
    }

    /**
     * 设置probableCause属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProbableCauseEnumType }
     *     
     */
    public void setProbableCause(ProbableCauseEnumType value) {
        this.probableCause = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * 获取qualifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * 设置qualifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

}
