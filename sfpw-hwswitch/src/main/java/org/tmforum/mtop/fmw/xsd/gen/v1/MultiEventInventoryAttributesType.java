
package org.tmforum.mtop.fmw.xsd.gen.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MultiEventInventoryAttributesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultiEventInventoryAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="neTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="eventIndication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiEventInventoryAttributesType", propOrder = {
    "neTime",
    "eventIndication"
})
public class MultiEventInventoryAttributesType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object neTime;
    @XmlElement(required = true)
    protected String eventIndication;

    /**
     * 获取neTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNeTime() {
        return neTime;
    }

    /**
     * 设置neTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNeTime(Object value) {
        this.neTime = value;
    }

    /**
     * 获取eventIndication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventIndication() {
        return eventIndication;
    }

    /**
     * 设置eventIndication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventIndication(String value) {
        this.eventIndication = value;
    }

}
