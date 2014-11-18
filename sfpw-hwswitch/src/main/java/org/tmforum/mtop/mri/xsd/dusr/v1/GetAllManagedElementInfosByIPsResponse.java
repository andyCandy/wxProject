
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
 *         &lt;element name="ipAssociatedMEInfosList" type="{http://www.tmforum.org/mtop/mri/xsd/dusr/v1}IPAssociatedMEInfosListType"/>
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
    "ipAssociatedMEInfosList"
})
@XmlRootElement(name = "getAllManagedElementInfosByIPsResponse")
public class GetAllManagedElementInfosByIPsResponse {

    @XmlElement(required = true)
    protected IPAssociatedMEInfosListType ipAssociatedMEInfosList;

    /**
     * 获取ipAssociatedMEInfosList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IPAssociatedMEInfosListType }
     *     
     */
    public IPAssociatedMEInfosListType getIpAssociatedMEInfosList() {
        return ipAssociatedMEInfosList;
    }

    /**
     * 设置ipAssociatedMEInfosList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IPAssociatedMEInfosListType }
     *     
     */
    public void setIpAssociatedMEInfosList(IPAssociatedMEInfosListType value) {
        this.ipAssociatedMEInfosList = value;
    }

}
