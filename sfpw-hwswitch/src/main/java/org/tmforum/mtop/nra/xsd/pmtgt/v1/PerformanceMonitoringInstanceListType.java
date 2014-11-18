
package org.tmforum.mtop.nra.xsd.pmtgt.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerformanceMonitoringInstanceListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringInstanceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmInstanceList" type="{http://www.tmforum.org/mtop/nra/xsd/pmtgt/v1}PerformanceMonitoringInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringInstanceListType", propOrder = {
    "pmInstanceList"
})
public class PerformanceMonitoringInstanceListType {

    @XmlElement(nillable = true)
    protected List<PerformanceMonitoringInstanceType> pmInstanceList;

    /**
     * Gets the value of the pmInstanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmInstanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmInstanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceMonitoringInstanceType }
     * 
     * 
     */
    public List<PerformanceMonitoringInstanceType> getPmInstanceList() {
        if (pmInstanceList == null) {
            pmInstanceList = new ArrayList<PerformanceMonitoringInstanceType>();
        }
        return this.pmInstanceList;
    }

}
