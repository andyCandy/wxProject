
package org.tmforum.mtop.nrf.xsd.eq_inv.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EquipmentOrEquipmentHolderListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EquipmentOrEquipmentHolderListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eoh" type="{http://www.tmforum.org/mtop/nrf/xsd/eq-inv/v1}EquipmentOrEquipmentHolderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentOrEquipmentHolderListType", propOrder = {
    "eoh"
})
public class EquipmentOrEquipmentHolderListType {

    @XmlElement(nillable = true)
    protected List<EquipmentOrEquipmentHolderType> eoh;

    /**
     * Gets the value of the eoh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eoh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEoh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentOrEquipmentHolderType }
     * 
     * 
     */
    public List<EquipmentOrEquipmentHolderType> getEoh() {
        if (eoh == null) {
            eoh = new ArrayList<EquipmentOrEquipmentHolderType>();
        }
        return this.eoh;
    }

}
