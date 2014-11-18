
package org.tmforum.mtop.nrb.xsd.cri.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>SourceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SourceType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.tmforum.org/mtop/nrb/xsd/cri/v1>SourceEnumType">
 *       &lt;attribute name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceType", propOrder = {
    "value"
})
public class SourceType {

    @XmlValue
    protected SourceEnumType value;
    @XmlAttribute(name = "qualifier")
    protected String qualifier;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SourceEnumType }
     *     
     */
    public SourceEnumType getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SourceEnumType }
     *     
     */
    public void setValue(SourceEnumType value) {
        this.value = value;
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
