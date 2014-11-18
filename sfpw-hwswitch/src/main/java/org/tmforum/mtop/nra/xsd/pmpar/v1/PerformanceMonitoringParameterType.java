
package org.tmforum.mtop.nra.xsd.pmpar.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringLocationType;


/**
 * <p>PerformanceMonitoringParameterType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmParameter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pmLocation" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringParameterType", propOrder = {
    "pmParameter",
    "pmLocation"
})
public class PerformanceMonitoringParameterType {

    @XmlElement(nillable = true)
    protected List<String> pmParameter;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<PerformanceMonitoringLocationType> pmLocation;

    /**
     * Gets the value of the pmParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPmParameter() {
        if (pmParameter == null) {
            pmParameter = new ArrayList<String>();
        }
        return this.pmParameter;
    }

    /**
     * Gets the value of the pmLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceMonitoringLocationType }
     * 
     * 
     */
    public List<PerformanceMonitoringLocationType> getPmLocation() {
        if (pmLocation == null) {
            pmLocation = new ArrayList<PerformanceMonitoringLocationType>();
        }
        return this.pmLocation;
    }

}
