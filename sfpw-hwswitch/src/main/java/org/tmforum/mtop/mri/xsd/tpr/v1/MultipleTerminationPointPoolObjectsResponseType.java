
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tppool.v1.TerminationPointPoolListType;


/**
 * <p>MultipleTerminationPointPoolObjectsResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultipleTerminationPointPoolObjectsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpPoolList" type="{http://www.tmforum.org/mtop/nrf/xsd/tppool/v1}TerminationPointPoolListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleTerminationPointPoolObjectsResponseType", propOrder = {
    "tpPoolList"
})
public class MultipleTerminationPointPoolObjectsResponseType {

    protected TerminationPointPoolListType tpPoolList;

    /**
     * 获取tpPoolList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointPoolListType }
     *     
     */
    public TerminationPointPoolListType getTpPoolList() {
        return tpPoolList;
    }

    /**
     * 设置tpPoolList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointPoolListType }
     *     
     */
    public void setTpPoolList(TerminationPointPoolListType value) {
        this.tpPoolList = value;
    }

}
