
package org.tmforum.mtop.fmw.xsd.gen.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MultiEventInventoryAttributesType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡneTime���Ե�ֵ��
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
     * ����neTime���Ե�ֵ��
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
     * ��ȡeventIndication���Ե�ֵ��
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
     * ����eventIndication���Ե�ֵ��
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
