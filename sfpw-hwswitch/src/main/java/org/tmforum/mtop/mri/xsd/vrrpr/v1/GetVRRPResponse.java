
package org.tmforum.mtop.mri.xsd.vrrpr.v1;

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
 *         &lt;element name="vrrpInfoList" type="{http://www.tmforum.org/mtop/mri/xsd/vrrpr/v1}VRRPListType" minOccurs="0"/>
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
    "vrrpInfoList"
})
@XmlRootElement(name = "getVRRPResponse")
public class GetVRRPResponse {

    protected VRRPListType vrrpInfoList;

    /**
     * 获取vrrpInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VRRPListType }
     *     
     */
    public VRRPListType getVrrpInfoList() {
        return vrrpInfoList;
    }

    /**
     * 设置vrrpInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VRRPListType }
     *     
     */
    public void setVrrpInfoList(VRRPListType value) {
        this.vrrpInfoList = value;
    }

}
