
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pmdata.v1.PerformanceMonitoringDataListType;


/**
 * <p>MultiplePerformanceMonitoringDataObjectsResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultiplePerformanceMonitoringDataObjectsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmDataList" type="{http://www.tmforum.org/mtop/nra/xsd/pmdata/v1}PerformanceMonitoringDataListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiplePerformanceMonitoringDataObjectsResponseType", propOrder = {
    "pmDataList"
})
public class MultiplePerformanceMonitoringDataObjectsResponseType {

    protected PerformanceMonitoringDataListType pmDataList;

    /**
     * 获取pmDataList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringDataListType }
     *     
     */
    public PerformanceMonitoringDataListType getPmDataList() {
        return pmDataList;
    }

    /**
     * 设置pmDataList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringDataListType }
     *     
     */
    public void setPmDataList(PerformanceMonitoringDataListType value) {
        this.pmDataList = value;
    }

}
