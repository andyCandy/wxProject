
package org.tmforum.mtop.nra.xsd.pmp.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerformanceMonitoringPointListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringPointListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmp" type="{http://www.tmforum.org/mtop/nra/xsd/pmp/v1}PerformanceMonitoringPointType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringPointListType", propOrder = {
    "pmp"
})
public class PerformanceMonitoringPointListType {

    @XmlElement(nillable = true)
    protected List<PerformanceMonitoringPointType> pmp;

    /**
     * Gets the value of the pmp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceMonitoringPointType }
     * 
     * 
     */
    public List<PerformanceMonitoringPointType> getPmp() {
        if (pmp == null) {
            pmp = new ArrayList<PerformanceMonitoringPointType>();
        }
        return this.pmp;
    }

}
