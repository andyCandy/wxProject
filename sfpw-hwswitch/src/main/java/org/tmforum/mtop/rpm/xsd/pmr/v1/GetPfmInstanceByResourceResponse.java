
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pmtgt.v1.PerformanceMonitoringInstanceListType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmInstanceList" type="{http://www.tmforum.org/mtop/nra/xsd/pmtgt/v1}PerformanceMonitoringInstanceListType" minOccurs="0"/>
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
    "pmInstanceList"
})
@XmlRootElement(name = "getPfmInstanceByResourceResponse")
public class GetPfmInstanceByResourceResponse {

    protected PerformanceMonitoringInstanceListType pmInstanceList;

    /**
     * ��ȡpmInstanceList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringInstanceListType }
     *     
     */
    public PerformanceMonitoringInstanceListType getPmInstanceList() {
        return pmInstanceList;
    }

    /**
     * ����pmInstanceList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringInstanceListType }
     *     
     */
    public void setPmInstanceList(PerformanceMonitoringInstanceListType value) {
        this.pmInstanceList = value;
    }

}
