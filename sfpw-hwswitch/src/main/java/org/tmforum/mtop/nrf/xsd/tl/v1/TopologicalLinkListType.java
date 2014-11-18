
package org.tmforum.mtop.nrf.xsd.tl.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TopologicalLinkListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TopologicalLinkListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tl" type="{http://www.tmforum.org/mtop/nrf/xsd/tl/v1}TopologicalLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopologicalLinkListType", propOrder = {
    "tl"
})
public class TopologicalLinkListType {

    @XmlElement(nillable = true)
    protected List<TopologicalLinkType> tl;

    /**
     * Gets the value of the tl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopologicalLinkType }
     * 
     * 
     */
    public List<TopologicalLinkType> getTl() {
        if (tl == null) {
            tl = new ArrayList<TopologicalLinkType>();
        }
        return this.tl;
    }

}
