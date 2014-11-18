
package org.tmforum.mtop.mri.xsd.vrrpr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VRRPListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VRRPListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vrrp" type="{http://www.tmforum.org/mtop/mri/xsd/vrrpr/v1}VRRPType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VRRPListType", propOrder = {
    "vrrp"
})
public class VRRPListType {

    @XmlElement(nillable = true)
    protected List<VRRPType> vrrp;

    /**
     * Gets the value of the vrrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vrrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVrrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VRRPType }
     * 
     * 
     */
    public List<VRRPType> getVrrp() {
        if (vrrp == null) {
            vrrp = new ArrayList<VRRPType>();
        }
        return this.vrrp;
    }

}
