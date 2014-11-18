
package org.tmforum.mtop.nrf.xsd.eq_inv.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.eh.v1.EquipmentHolderType;
import org.tmforum.mtop.nrf.xsd.eq.v1.EquipmentType;


/**
 * <p>EquipmentOrEquipmentHolderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EquipmentOrEquipmentHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrf/xsd/eq/v1}eq" minOccurs="0"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/nrf/xsd/eh/v1}eh" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentOrEquipmentHolderType", propOrder = {
    "eq",
    "eh"
})
public class EquipmentOrEquipmentHolderType {

    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/eq/v1")
    protected EquipmentType eq;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/eh/v1")
    protected EquipmentHolderType eh;

    /**
     * 获取eq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EquipmentType }
     *     
     */
    public EquipmentType getEq() {
        return eq;
    }

    /**
     * 设置eq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentType }
     *     
     */
    public void setEq(EquipmentType value) {
        this.eq = value;
    }

    /**
     * 获取eh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EquipmentHolderType }
     *     
     */
    public EquipmentHolderType getEh() {
        return eh;
    }

    /**
     * 设置eh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentHolderType }
     *     
     */
    public void setEh(EquipmentHolderType value) {
        this.eh = value;
    }

}
