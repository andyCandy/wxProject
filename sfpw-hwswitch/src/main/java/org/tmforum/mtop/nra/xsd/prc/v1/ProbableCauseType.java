
package org.tmforum.mtop.nra.xsd.prc.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProbableCauseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡru���Ե�ֵ��
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
     * ����ru���Ե�ֵ��
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
     * ��ȡcontra���Ե�ֵ��
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
     * ����contra���Ե�ֵ��
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
     * ��ȡprobableCause���Ե�ֵ��
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
     * ����probableCause���Ե�ֵ��
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
     * ��ȡextension���Ե�ֵ��
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
     * ����extension���Ե�ֵ��
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
     * ��ȡqualifier���Ե�ֵ��
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
     * ����qualifier���Ե�ֵ��
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
