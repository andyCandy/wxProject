
package org.tmforum.mtop.nrf.xsd.fd.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FlowDomainListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlowDomainListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fd" type="{http://www.tmforum.org/mtop/nrf/xsd/fd/v1}FlowDomainType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowDomainListType", propOrder = {
    "fd"
})
public class FlowDomainListType {

    @XmlElement(nillable = true)
    protected List<FlowDomainType> fd;

    /**
     * Gets the value of the fd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowDomainType }
     * 
     * 
     */
    public List<FlowDomainType> getFd() {
        if (fd == null) {
            fd = new ArrayList<FlowDomainType>();
        }
        return this.fd;
    }

}
