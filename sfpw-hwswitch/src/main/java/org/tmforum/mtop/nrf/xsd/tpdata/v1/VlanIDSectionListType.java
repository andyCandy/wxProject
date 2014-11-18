
package org.tmforum.mtop.nrf.xsd.tpdata.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VlanIDSectionListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VlanIDSectionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vlanIDSection" type="{http://www.tmforum.org/mtop/nrf/xsd/tpdata/v1}VlanIDSectionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VlanIDSectionListType", propOrder = {
    "vlanIDSection"
})
public class VlanIDSectionListType {

    @XmlElement(nillable = true)
    protected List<VlanIDSectionType> vlanIDSection;

    /**
     * Gets the value of the vlanIDSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vlanIDSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVlanIDSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VlanIDSectionType }
     * 
     * 
     */
    public List<VlanIDSectionType> getVlanIDSection() {
        if (vlanIDSection == null) {
            vlanIDSection = new ArrayList<VlanIDSectionType>();
        }
        return this.vlanIDSection;
    }

}
