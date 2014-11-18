
package org.tmforum.mtop.nrf.xsd.tcp.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrafficClassifierListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrafficClassifierListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tcf" type="{http://www.tmforum.org/mtop/nrf/xsd/tcp/v1}TrafficClassifierType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficClassifierListType", propOrder = {
    "tcf"
})
public class TrafficClassifierListType {

    @XmlElement(nillable = true)
    protected List<TrafficClassifierType> tcf;

    /**
     * Gets the value of the tcf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTcf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficClassifierType }
     * 
     * 
     */
    public List<TrafficClassifierType> getTcf() {
        if (tcf == null) {
            tcf = new ArrayList<TrafficClassifierType>();
        }
        return this.tcf;
    }

}
