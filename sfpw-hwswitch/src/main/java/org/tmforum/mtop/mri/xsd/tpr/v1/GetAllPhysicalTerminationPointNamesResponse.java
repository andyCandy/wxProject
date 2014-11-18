
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;


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
 *         &lt;element name="tpNameList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType" minOccurs="0"/>
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
    "tpNameList"
})
@XmlRootElement(name = "getAllPhysicalTerminationPointNamesResponse")
public class GetAllPhysicalTerminationPointNamesResponse {

    protected NamingAttributeListType tpNameList;

    /**
     * 获取tpNameList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getTpNameList() {
        return tpNameList;
    }

    /**
     * 设置tpNameList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setTpNameList(NamingAttributeListType value) {
        this.tpNameList = value;
    }

}
