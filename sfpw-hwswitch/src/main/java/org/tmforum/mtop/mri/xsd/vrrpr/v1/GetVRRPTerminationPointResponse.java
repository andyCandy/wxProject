
package org.tmforum.mtop.mri.xsd.vrrpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tpdata.v1.TerminationPointDataType;


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
 *         &lt;element name="tp" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}TerminationPointDataType" minOccurs="0"/>
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
    "tp"
})
@XmlRootElement(name = "getVRRPTerminationPointResponse")
public class GetVRRPTerminationPointResponse {

    protected TerminationPointDataType tp;

    /**
     * 获取tp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointDataType }
     *     
     */
    public TerminationPointDataType getTp() {
        return tp;
    }

    /**
     * 设置tp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointDataType }
     *     
     */
    public void setTp(TerminationPointDataType value) {
        this.tp = value;
    }

}
