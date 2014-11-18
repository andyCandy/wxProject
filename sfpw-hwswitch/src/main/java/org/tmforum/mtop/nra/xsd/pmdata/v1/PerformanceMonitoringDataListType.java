
package org.tmforum.mtop.nra.xsd.pmdata.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerformanceMonitoringDataListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringDataListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmData" type="{http://www.tmforum.org/mtop/nra/xsd/pmdata/v1}PerformanceMonitoringDataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringDataListType", propOrder = {
    "pmData"
})
public class PerformanceMonitoringDataListType {

    @XmlElement(nillable = true)
    protected List<PerformanceMonitoringDataType> pmData;

    /**
     * Gets the value of the pmData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceMonitoringDataType }
     * 
     * 
     */
    public List<PerformanceMonitoringDataType> getPmData() {
        if (pmData == null) {
            pmData = new ArrayList<PerformanceMonitoringDataType>();
        }
        return this.pmData;
    }

}
