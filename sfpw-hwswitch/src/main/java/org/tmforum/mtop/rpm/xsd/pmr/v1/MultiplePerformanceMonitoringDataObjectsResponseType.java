
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pmdata.v1.PerformanceMonitoringDataListType;


/**
 * <p>MultiplePerformanceMonitoringDataObjectsResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpmDataList���Ե�ֵ��
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
     * ����pmDataList���Ե�ֵ��
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
