
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MaintenanceDomainListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MaintenanceDomainListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="md" type="{http://www.tmforum.org/mtop/nra/xsd/ethoam/v1}MaintenanceDomainType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDomainListType", propOrder = {
    "md"
})
public class MaintenanceDomainListType {

    @XmlElement(nillable = true)
    protected List<MaintenanceDomainType> md;

    /**
     * Gets the value of the md property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the md property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceDomainType }
     * 
     * 
     */
    public List<MaintenanceDomainType> getMd() {
        if (md == null) {
            md = new ArrayList<MaintenanceDomainType>();
        }
        return this.md;
    }

}
