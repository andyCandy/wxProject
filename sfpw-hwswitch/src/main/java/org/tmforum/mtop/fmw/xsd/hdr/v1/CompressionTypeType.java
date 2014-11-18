
package org.tmforum.mtop.fmw.xsd.hdr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>CompressionTypeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompressionTypeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.tmforum.org/mtop/fmw/xsd/hdr/v1>CompressionEnumType">
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompressionTypeType", propOrder = {
    "value"
})
public class CompressionTypeType {

    @XmlValue
    protected CompressionEnumType value;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompressionEnumType }
     *     
     */
    public CompressionEnumType getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionEnumType }
     *     
     */
    public void setValue(CompressionEnumType value) {
        this.value = value;
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
