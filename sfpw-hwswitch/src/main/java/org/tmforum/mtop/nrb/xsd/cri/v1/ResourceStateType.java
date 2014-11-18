
package org.tmforum.mtop.nrb.xsd.cri.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>ResourceStateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResourceStateType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.tmforum.org/mtop/nrb/xsd/cri/v1>ResourceStateEnumType">
 *       &lt;attribute name="overlap" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceStateType", propOrder = {
    "value"
})
public class ResourceStateType {

    @XmlValue
    protected ResourceStateEnumType value;
    @XmlAttribute(name = "overlap")
    protected String overlap;
    @XmlAttribute(name = "qualifier")
    protected String qualifier;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourceStateEnumType }
     *     
     */
    public ResourceStateEnumType getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceStateEnumType }
     *     
     */
    public void setValue(ResourceStateEnumType value) {
        this.value = value;
    }

    /**
     * 获取overlap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverlap() {
        return overlap;
    }

    /**
     * 设置overlap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverlap(String value) {
        this.overlap = value;
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

}
