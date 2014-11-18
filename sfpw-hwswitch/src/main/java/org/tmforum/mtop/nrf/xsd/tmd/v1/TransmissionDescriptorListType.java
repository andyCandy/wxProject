
package org.tmforum.mtop.nrf.xsd.tmd.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransmissionDescriptorListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TransmissionDescriptorListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tmd" type="{http://www.tmforum.org/mtop/nrf/xsd/tmd/v1}TransmissionDescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmissionDescriptorListType", propOrder = {
    "tmd"
})
public class TransmissionDescriptorListType {

    @XmlElement(nillable = true)
    protected List<TransmissionDescriptorType> tmd;

    /**
     * Gets the value of the tmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransmissionDescriptorType }
     * 
     * 
     */
    public List<TransmissionDescriptorType> getTmd() {
        if (tmd == null) {
            tmd = new ArrayList<TransmissionDescriptorType>();
        }
        return this.tmd;
    }

}
