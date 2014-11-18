
package org.tmforum.mtop.mri.xsd.mer.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.me.v1.ManagedElementType;


/**
 * <p>SingleMeObjectResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SingleMeObjectResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="me" type="{http://www.tmforum.org/mtop/nrf/xsd/me/v1}ManagedElementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleMeObjectResponseType", propOrder = {
    "me"
})
public class SingleMeObjectResponseType {

    protected ManagedElementType me;

    /**
     * 获取me属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ManagedElementType }
     *     
     */
    public ManagedElementType getMe() {
        return me;
    }

    /**
     * 设置me属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedElementType }
     *     
     */
    public void setMe(ManagedElementType value) {
        this.me = value;
    }

}
