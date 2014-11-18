
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tp.v1.TerminationPointType;


/**
 * <p>SingleTerminationPointObjectResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SingleTerminationPointObjectResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tp" type="{http://www.tmforum.org/mtop/nrf/xsd/tp/v1}TerminationPointType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleTerminationPointObjectResponseType", propOrder = {
    "tp"
})
public class SingleTerminationPointObjectResponseType {

    protected TerminationPointType tp;

    /**
     * 获取tp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointType }
     *     
     */
    public TerminationPointType getTp() {
        return tp;
    }

    /**
     * 设置tp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointType }
     *     
     */
    public void setTp(TerminationPointType value) {
        this.tp = value;
    }

}
