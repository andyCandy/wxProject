
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;


/**
 * <p>StaticRPType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StaticRPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parameterList" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticRPType", propOrder = {
    "rpAddress",
    "parameterList"
})
public class StaticRPType {

    @XmlElement(required = true)
    protected String rpAddress;
    @XmlElement(required = true)
    protected NameAndValueStringListType parameterList;

    /**
     * 获取rpAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpAddress() {
        return rpAddress;
    }

    /**
     * 设置rpAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpAddress(String value) {
        this.rpAddress = value;
    }

    /**
     * 获取parameterList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getParameterList() {
        return parameterList;
    }

    /**
     * 设置parameterList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setParameterList(NameAndValueStringListType value) {
        this.parameterList = value;
    }

}
