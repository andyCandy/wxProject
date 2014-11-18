
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pmp.v1.PerformanceMonitoringPointListType;


/**
 * <p>MultiplePerformanceMonitoringPointObjectsResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultiplePerformanceMonitoringPointObjectsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmpList" type="{http://www.tmforum.org/mtop/nra/xsd/pmp/v1}PerformanceMonitoringPointListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiplePerformanceMonitoringPointObjectsResponseType", propOrder = {
    "pmpList"
})
public class MultiplePerformanceMonitoringPointObjectsResponseType {

    protected PerformanceMonitoringPointListType pmpList;

    /**
     * 获取pmpList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringPointListType }
     *     
     */
    public PerformanceMonitoringPointListType getPmpList() {
        return pmpList;
    }

    /**
     * 设置pmpList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringPointListType }
     *     
     */
    public void setPmpList(PerformanceMonitoringPointListType value) {
        this.pmpList = value;
    }

}
