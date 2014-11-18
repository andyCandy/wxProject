
package org.tmforum.mtop.mri.xsd.mer.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.me.v1.ManagedElementListType;


/**
 * <p>MultipleMeObjectsResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultipleMeObjectsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meList" type="{http://www.tmforum.org/mtop/nrf/xsd/me/v1}ManagedElementListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleMeObjectsResponseType", propOrder = {
    "meList"
})
public class MultipleMeObjectsResponseType {

    protected ManagedElementListType meList;

    /**
     * 获取meList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ManagedElementListType }
     *     
     */
    public ManagedElementListType getMeList() {
        return meList;
    }

    /**
     * 设置meList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedElementListType }
     *     
     */
    public void setMeList(ManagedElementListType value) {
        this.meList = value;
    }

}
