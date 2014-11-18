
package org.tmforum.mtop.vs.xsd.rr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="customerInfos" type="{http://www.tmforum.org/mtop/vs/xsd/rr/v1}CustomerInfoListType" minOccurs="0"/>
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
    "customerInfos"
})
@XmlRootElement(name = "getAttributesByNativeEMSNameResponse")
public class GetAttributesByNativeEMSNameResponse {

    protected CustomerInfoListType customerInfos;

    /**
     * 获取customerInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoListType }
     *     
     */
    public CustomerInfoListType getCustomerInfos() {
        return customerInfos;
    }

    /**
     * 设置customerInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoListType }
     *     
     */
    public void setCustomerInfos(CustomerInfoListType value) {
        this.customerInfos = value;
    }

}
