
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pm.v1.HoldingTimeType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="holdingTime" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}HoldingTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "holdingTime"
})
@XmlRootElement(name = "getHoldingTimeResponse")
public class GetHoldingTimeResponse {

    @XmlSchemaType(name = "string")
    protected HoldingTimeType holdingTime;

    /**
     * 获取holdingTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HoldingTimeType }
     *     
     */
    public HoldingTimeType getHoldingTime() {
        return holdingTime;
    }

    /**
     * 设置holdingTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingTimeType }
     *     
     */
    public void setHoldingTime(HoldingTimeType value) {
        this.holdingTime = value;
    }

}
