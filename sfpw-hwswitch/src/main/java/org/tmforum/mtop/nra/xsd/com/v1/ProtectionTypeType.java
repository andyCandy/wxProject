
package org.tmforum.mtop.nra.xsd.com.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>ProtectionTypeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProtectionTypeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.tmforum.org/mtop/nra/xsd/com/v1>ProtectionTypeEnumType">
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionTypeType", propOrder = {
    "value"
})
public class ProtectionTypeType {

    @XmlValue
    protected ProtectionTypeEnumType value;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProtectionTypeEnumType }
     *     
     */
    public ProtectionTypeEnumType getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionTypeEnumType }
     *     
     */
    public void setValue(ProtectionTypeEnumType value) {
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
