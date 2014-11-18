
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pmpar.v1.PerformanceMonitoringParameterListType;


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
 *         &lt;element name="pmParameterList" type="{http://www.tmforum.org/mtop/nra/xsd/pmpar/v1}PerformanceMonitoringParameterListType" minOccurs="0"/>
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
    "pmParameterList"
})
@XmlRootElement(name = "getMePerformanceMonitoringCapabilitiesResponse")
public class GetMePerformanceMonitoringCapabilitiesResponse {

    protected PerformanceMonitoringParameterListType pmParameterList;

    /**
     * 获取pmParameterList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringParameterListType }
     *     
     */
    public PerformanceMonitoringParameterListType getPmParameterList() {
        return pmParameterList;
    }

    /**
     * 设置pmParameterList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringParameterListType }
     *     
     */
    public void setPmParameterList(PerformanceMonitoringParameterListType value) {
        this.pmParameterList = value;
    }

}
