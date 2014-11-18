
package org.tmforum.mtop.nrf.xsd.tcp.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrafficConditioningProfileAssignListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrafficConditioningProfileAssignListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tcpa" type="{http://www.tmforum.org/mtop/nrf/xsd/tcp/v1}TrafficConditioningProfileAssignType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficConditioningProfileAssignListType", propOrder = {
    "tcpa"
})
public class TrafficConditioningProfileAssignListType {

    @XmlElement(nillable = true)
    protected List<TrafficConditioningProfileAssignType> tcpa;

    /**
     * Gets the value of the tcpa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcpa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTcpa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficConditioningProfileAssignType }
     * 
     * 
     */
    public List<TrafficConditioningProfileAssignType> getTcpa() {
        if (tcpa == null) {
            tcpa = new ArrayList<TrafficConditioningProfileAssignType>();
        }
        return this.tcpa;
    }

}
