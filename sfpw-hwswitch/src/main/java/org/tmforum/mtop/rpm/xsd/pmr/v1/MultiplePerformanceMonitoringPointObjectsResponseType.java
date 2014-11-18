
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pmp.v1.PerformanceMonitoringPointListType;


/**
 * <p>MultiplePerformanceMonitoringPointObjectsResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpmpList���Ե�ֵ��
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
     * ����pmpList���Ե�ֵ��
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
