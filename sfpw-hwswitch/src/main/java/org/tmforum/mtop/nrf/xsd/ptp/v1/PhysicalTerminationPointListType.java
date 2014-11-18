
package org.tmforum.mtop.nrf.xsd.ptp.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PhysicalTerminationPointListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PhysicalTerminationPointListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ptp" type="{http://www.tmforum.org/mtop/nrf/xsd/ptp/v1}PhysicalTerminationPointType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalTerminationPointListType", propOrder = {
    "ptp"
})
public class PhysicalTerminationPointListType {

    @XmlElement(nillable = true)
    protected List<PhysicalTerminationPointType> ptp;

    /**
     * Gets the value of the ptp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalTerminationPointType }
     * 
     * 
     */
    public List<PhysicalTerminationPointType> getPtp() {
        if (ptp == null) {
            ptp = new ArrayList<PhysicalTerminationPointType>();
        }
        return this.ptp;
    }

}
