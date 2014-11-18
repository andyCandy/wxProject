
package org.tmforum.mtop.nra.xsd.eps.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EquipmentProtectionSwitchListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EquipmentProtectionSwitchListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipmentProtectionSwitch" type="{http://www.tmforum.org/mtop/nra/xsd/eps/v1}EquipmentProtectionSwitchType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentProtectionSwitchListType", propOrder = {
    "equipmentProtectionSwitch"
})
public class EquipmentProtectionSwitchListType {

    @XmlElement(nillable = true)
    protected List<EquipmentProtectionSwitchType> equipmentProtectionSwitch;

    /**
     * Gets the value of the equipmentProtectionSwitch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentProtectionSwitch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentProtectionSwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentProtectionSwitchType }
     * 
     * 
     */
    public List<EquipmentProtectionSwitchType> getEquipmentProtectionSwitch() {
        if (equipmentProtectionSwitch == null) {
            equipmentProtectionSwitch = new ArrayList<EquipmentProtectionSwitchType>();
        }
        return this.equipmentProtectionSwitch;
    }

}
