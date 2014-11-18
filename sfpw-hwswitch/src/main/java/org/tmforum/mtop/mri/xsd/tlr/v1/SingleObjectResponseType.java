
package org.tmforum.mtop.mri.xsd.tlr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tl.v1.TopologicalLinkType;


/**
 * <p>SingleObjectResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SingleObjectResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tl" type="{http://www.tmforum.org/mtop/nrf/xsd/tl/v1}TopologicalLinkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleObjectResponseType", propOrder = {
    "tl"
})
public class SingleObjectResponseType {

    protected TopologicalLinkType tl;

    /**
     * 获取tl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TopologicalLinkType }
     *     
     */
    public TopologicalLinkType getTl() {
        return tl;
    }

    /**
     * 设置tl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TopologicalLinkType }
     *     
     */
    public void setTl(TopologicalLinkType value) {
        this.tl = value;
    }

}
