
package org.tmforum.mtop.nrf.xsd.snc.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SubnetworkConnectionListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SubnetworkConnectionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snc" type="{http://www.tmforum.org/mtop/nrf/xsd/snc/v1}SubnetworkConnectionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubnetworkConnectionListType", propOrder = {
    "snc"
})
public class SubnetworkConnectionListType {

    @XmlElement(nillable = true)
    protected List<SubnetworkConnectionType> snc;

    /**
     * Gets the value of the snc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubnetworkConnectionType }
     * 
     * 
     */
    public List<SubnetworkConnectionType> getSnc() {
        if (snc == null) {
            snc = new ArrayList<SubnetworkConnectionType>();
        }
        return this.snc;
    }

}
