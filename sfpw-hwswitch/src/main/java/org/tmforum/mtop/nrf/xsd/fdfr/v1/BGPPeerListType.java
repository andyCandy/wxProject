
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BGPPeerListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BGPPeerListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bgpPeer" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}BGPPeerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BGPPeerListType", propOrder = {
    "bgpPeer"
})
public class BGPPeerListType {

    @XmlElement(nillable = true)
    protected List<BGPPeerType> bgpPeer;

    /**
     * Gets the value of the bgpPeer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bgpPeer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBgpPeer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BGPPeerType }
     * 
     * 
     */
    public List<BGPPeerType> getBgpPeer() {
        if (bgpPeer == null) {
            bgpPeer = new ArrayList<BGPPeerType>();
        }
        return this.bgpPeer;
    }

}
