
package org.tmforum.mtop.nrf.xsd.ctp.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConnectionTerminationPointListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ConnectionTerminationPointListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ctp" type="{http://www.tmforum.org/mtop/nrf/xsd/ctp/v1}ConnectionTerminationPointType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTerminationPointListType", propOrder = {
    "ctp"
})
public class ConnectionTerminationPointListType {

    @XmlElement(nillable = true)
    protected List<ConnectionTerminationPointType> ctp;

    /**
     * Gets the value of the ctp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionTerminationPointType }
     * 
     * 
     */
    public List<ConnectionTerminationPointType> getCtp() {
        if (ctp == null) {
            ctp = new ArrayList<ConnectionTerminationPointType>();
        }
        return this.ctp;
    }

}
