
package org.tmforum.mtop.nra.xsd.pmmsrt.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerformanceMonitoringMeasurementListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringMeasurementListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmMeasurement" type="{http://www.tmforum.org/mtop/nra/xsd/pmmsrt/v1}PerformanceMonitoringMeasurementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringMeasurementListType", propOrder = {
    "pmMeasurement"
})
public class PerformanceMonitoringMeasurementListType {

    @XmlElement(nillable = true)
    protected List<PerformanceMonitoringMeasurementType> pmMeasurement;

    /**
     * Gets the value of the pmMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceMonitoringMeasurementType }
     * 
     * 
     */
    public List<PerformanceMonitoringMeasurementType> getPmMeasurement() {
        if (pmMeasurement == null) {
            pmMeasurement = new ArrayList<PerformanceMonitoringMeasurementType>();
        }
        return this.pmMeasurement;
    }

}
