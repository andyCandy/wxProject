
package org.tmforum.mtop.nra.xsd.epg.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EquipmentProtectionGroupListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EquipmentProtectionGroupListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="epgp" type="{http://www.tmforum.org/mtop/nra/xsd/epg/v1}EquipmentProtectionGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentProtectionGroupListType", propOrder = {
    "epgp"
})
public class EquipmentProtectionGroupListType {

    @XmlElement(nillable = true)
    protected List<EquipmentProtectionGroupType> epgp;

    /**
     * Gets the value of the epgp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the epgp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEpgp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentProtectionGroupType }
     * 
     * 
     */
    public List<EquipmentProtectionGroupType> getEpgp() {
        if (epgp == null) {
            epgp = new ArrayList<EquipmentProtectionGroupType>();
        }
        return this.epgp;
    }

}
