
package org.tmforum.mtop.nra.xsd.pmth.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerformanceMonitoringThresholdListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringThresholdListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmThreshold" type="{http://www.tmforum.org/mtop/nra/xsd/pmth/v1}PerformanceMonitoringThresholdType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringThresholdListType", propOrder = {
    "pmThreshold"
})
public class PerformanceMonitoringThresholdListType {

    @XmlElement(nillable = true)
    protected List<PerformanceMonitoringThresholdType> pmThreshold;

    /**
     * Gets the value of the pmThreshold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmThreshold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmThreshold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceMonitoringThresholdType }
     * 
     * 
     */
    public List<PerformanceMonitoringThresholdType> getPmThreshold() {
        if (pmThreshold == null) {
            pmThreshold = new ArrayList<PerformanceMonitoringThresholdType>();
        }
        return this.pmThreshold;
    }

}
