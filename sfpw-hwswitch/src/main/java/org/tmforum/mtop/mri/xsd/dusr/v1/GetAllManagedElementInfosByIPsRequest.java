
package org.tmforum.mtop.mri.xsd.dusr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ipAddressList" type="{http://www.tmforum.org/mtop/mri/xsd/dusr/v1}IPAddressListType"/>
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
    "ipAddressList"
})
@XmlRootElement(name = "getAllManagedElementInfosByIPsRequest")
public class GetAllManagedElementInfosByIPsRequest {

    @XmlElement(required = true)
    protected IPAddressListType ipAddressList;

    /**
     * 获取ipAddressList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IPAddressListType }
     *     
     */
    public IPAddressListType getIpAddressList() {
        return ipAddressList;
    }

    /**
     * 设置ipAddressList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddressListType }
     *     
     */
    public void setIpAddressList(IPAddressListType value) {
        this.ipAddressList = value;
    }

}
