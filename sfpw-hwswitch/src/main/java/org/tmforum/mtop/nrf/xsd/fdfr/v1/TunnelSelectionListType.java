
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TunnelSelectionListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TunnelSelectionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tunnelSelection" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}TunnelSelectionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TunnelSelectionListType", propOrder = {
    "tunnelSelection"
})
public class TunnelSelectionListType {

    @XmlElement(nillable = true)
    protected List<TunnelSelectionType> tunnelSelection;

    /**
     * Gets the value of the tunnelSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tunnelSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTunnelSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TunnelSelectionType }
     * 
     * 
     */
    public List<TunnelSelectionType> getTunnelSelection() {
        if (tunnelSelection == null) {
            tunnelSelection = new ArrayList<TunnelSelectionType>();
        }
        return this.tunnelSelection;
    }

}
