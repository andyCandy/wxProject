
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tppool.v1.TerminationPointPoolType;


/**
 * <p>SingleTerminationPointPoolObjectResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SingleTerminationPointPoolObjectResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpPool" type="{http://www.tmforum.org/mtop/nrf/xsd/tppool/v1}TerminationPointPoolType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleTerminationPointPoolObjectResponseType", propOrder = {
    "tpPool"
})
public class SingleTerminationPointPoolObjectResponseType {

    protected TerminationPointPoolType tpPool;

    /**
     * 获取tpPool属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointPoolType }
     *     
     */
    public TerminationPointPoolType getTpPool() {
        return tpPool;
    }

    /**
     * 设置tpPool属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointPoolType }
     *     
     */
    public void setTpPool(TerminationPointPoolType value) {
        this.tpPool = value;
    }

}
