
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.gtp.v1.GroupTerminationPointListType;


/**
 * <p>MultipleGroupTerminationPointObjectsResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultipleGroupTerminationPointObjectsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gtpList" type="{http://www.tmforum.org/mtop/nrf/xsd/gtp/v1}GroupTerminationPointListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleGroupTerminationPointObjectsResponseType", propOrder = {
    "gtpList"
})
public class MultipleGroupTerminationPointObjectsResponseType {

    protected GroupTerminationPointListType gtpList;

    /**
     * 获取gtpList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GroupTerminationPointListType }
     *     
     */
    public GroupTerminationPointListType getGtpList() {
        return gtpList;
    }

    /**
     * 设置gtpList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GroupTerminationPointListType }
     *     
     */
    public void setGtpList(GroupTerminationPointListType value) {
        this.gtpList = value;
    }

}
