
package org.tmforum.mtop.mri.xsd.eir.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.eq_inv.v1.EquipmentOrEquipmentHolderType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipmentOrEhList" type="{http://www.tmforum.org/mtop/nrf/xsd/eq-inv/v1}EquipmentOrEquipmentHolderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "equipmentOrEhList"
})
@XmlRootElement(name = "getEquipmentResponse")
public class GetEquipmentResponse {

    protected EquipmentOrEquipmentHolderType equipmentOrEhList;

    /**
     * ��ȡequipmentOrEhList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EquipmentOrEquipmentHolderType }
     *     
     */
    public EquipmentOrEquipmentHolderType getEquipmentOrEhList() {
        return equipmentOrEhList;
    }

    /**
     * ����equipmentOrEhList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentOrEquipmentHolderType }
     *     
     */
    public void setEquipmentOrEhList(EquipmentOrEquipmentHolderType value) {
        this.equipmentOrEhList = value;
    }

}
