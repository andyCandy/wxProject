
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.tp.v1.TerminationPointListType;


/**
 * <p>MultipleTerminationPointObjectsResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultipleTerminationPointObjectsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpList" type="{http://www.tmforum.org/mtop/nrf/xsd/tp/v1}TerminationPointListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleTerminationPointObjectsResponseType", propOrder = {
    "tpList"
})
public class MultipleTerminationPointObjectsResponseType {

    protected TerminationPointListType tpList;

    /**
     * 获取tpList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointListType }
     *     
     */
    public TerminationPointListType getTpList() {
        return tpList;
    }

    /**
     * 设置tpList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointListType }
     *     
     */
    public void setTpList(TerminationPointListType value) {
        this.tpList = value;
    }

}
