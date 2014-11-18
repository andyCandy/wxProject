
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;


/**
 * <p>MultiplePerformanceMonitoringPointObjectNamesResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultiplePerformanceMonitoringPointObjectNamesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiplePerformanceMonitoringPointObjectNamesResponseType", propOrder = {
    "nameList"
})
public class MultiplePerformanceMonitoringPointObjectNamesResponseType {

    protected NamingAttributeListType nameList;

    /**
     * 获取nameList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getNameList() {
        return nameList;
    }

    /**
     * 设置nameList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setNameList(NamingAttributeListType value) {
        this.nameList = value;
    }

}
