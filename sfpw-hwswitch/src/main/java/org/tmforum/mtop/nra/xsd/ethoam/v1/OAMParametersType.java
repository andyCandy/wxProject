
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>OAMParametersType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OAMParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oamName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="oamParaList" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAMParametersType", propOrder = {
    "oamName",
    "oamParaList"
})
public class OAMParametersType {

    @XmlElement(required = true)
    protected NamingAttributeType oamName;
    @XmlElement(required = true)
    protected NameAndValueStringListType oamParaList;

    /**
     * 获取oamName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getOamName() {
        return oamName;
    }

    /**
     * 设置oamName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setOamName(NamingAttributeType value) {
        this.oamName = value;
    }

    /**
     * 获取oamParaList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getOamParaList() {
        return oamParaList;
    }

    /**
     * 设置oamParaList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setOamParaList(NameAndValueStringListType value) {
        this.oamParaList = value;
    }

}
