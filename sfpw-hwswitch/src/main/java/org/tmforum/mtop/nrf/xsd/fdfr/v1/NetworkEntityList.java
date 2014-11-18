
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NetworkEntityList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NetworkEntityList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityOne" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityTwo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityThree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkEntityList", propOrder = {
    "entityOne",
    "entityTwo",
    "entityThree"
})
public class NetworkEntityList {

    @XmlElement(required = true)
    protected String entityOne;
    @XmlElement(required = true)
    protected String entityTwo;
    @XmlElement(required = true)
    protected String entityThree;

    /**
     * 获取entityOne属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityOne() {
        return entityOne;
    }

    /**
     * 设置entityOne属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityOne(String value) {
        this.entityOne = value;
    }

    /**
     * 获取entityTwo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityTwo() {
        return entityTwo;
    }

    /**
     * 设置entityTwo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityTwo(String value) {
        this.entityTwo = value;
    }

    /**
     * 获取entityThree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityThree() {
        return entityThree;
    }

    /**
     * 设置entityThree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityThree(String value) {
        this.entityThree = value;
    }

}
