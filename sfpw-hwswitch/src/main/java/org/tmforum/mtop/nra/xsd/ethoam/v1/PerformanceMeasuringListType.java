
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerformanceMeasuringListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceMeasuringListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="performanceMeasuringList" type="{http://www.tmforum.org/mtop/nra/xsd/ethoam/v1}PerformanceMeasuringType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMeasuringListType", propOrder = {
    "performanceMeasuringList"
})
public class PerformanceMeasuringListType {

    @XmlElement(nillable = true)
    protected List<PerformanceMeasuringType> performanceMeasuringList;

    /**
     * Gets the value of the performanceMeasuringList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceMeasuringList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceMeasuringList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceMeasuringType }
     * 
     * 
     */
    public List<PerformanceMeasuringType> getPerformanceMeasuringList() {
        if (performanceMeasuringList == null) {
            performanceMeasuringList = new ArrayList<PerformanceMeasuringType>();
        }
        return this.performanceMeasuringList;
    }

}
