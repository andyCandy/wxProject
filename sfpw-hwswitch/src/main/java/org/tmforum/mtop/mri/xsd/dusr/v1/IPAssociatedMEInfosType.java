
package org.tmforum.mtop.mri.xsd.dusr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IPAssociatedMEInfosType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IPAssociatedMEInfosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meInfoListRef" type="{http://www.tmforum.org/mtop/mri/xsd/dusr/v1}SimpleMEInfoListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPAssociatedMEInfosType", propOrder = {
    "ipAddress",
    "meInfoListRef"
})
public class IPAssociatedMEInfosType {

    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(required = true)
    protected SimpleMEInfoListType meInfoListRef;

    /**
     * 获取ipAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 设置ipAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * 获取meInfoListRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SimpleMEInfoListType }
     *     
     */
    public SimpleMEInfoListType getMeInfoListRef() {
        return meInfoListRef;
    }

    /**
     * 设置meInfoListRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleMEInfoListType }
     *     
     */
    public void setMeInfoListRef(SimpleMEInfoListType value) {
        this.meInfoListRef = value;
    }

}
