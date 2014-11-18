
package org.tmforum.mtop.nrf.xsd.tcp.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrafficConditioningProfileDeassignListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrafficConditioningProfileDeassignListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tcpd" type="{http://www.tmforum.org/mtop/nrf/xsd/tcp/v1}TrafficConditioningProfileDeassignType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficConditioningProfileDeassignListType", propOrder = {
    "tcpd"
})
public class TrafficConditioningProfileDeassignListType {

    @XmlElement(nillable = true)
    protected List<TrafficConditioningProfileDeassignType> tcpd;

    /**
     * Gets the value of the tcpd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcpd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTcpd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficConditioningProfileDeassignType }
     * 
     * 
     */
    public List<TrafficConditioningProfileDeassignType> getTcpd() {
        if (tcpd == null) {
            tcpd = new ArrayList<TrafficConditioningProfileDeassignType>();
        }
        return this.tcpd;
    }

}
