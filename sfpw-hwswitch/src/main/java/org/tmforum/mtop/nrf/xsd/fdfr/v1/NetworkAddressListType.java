
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NetworkAddressListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NetworkAddressListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="networkAddress" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}NetworkAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkAddressListType", propOrder = {
    "networkAddress"
})
public class NetworkAddressListType {

    @XmlElement(nillable = true)
    protected List<NetworkAddressType> networkAddress;

    /**
     * Gets the value of the networkAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkAddressType }
     * 
     * 
     */
    public List<NetworkAddressType> getNetworkAddress() {
        if (networkAddress == null) {
            networkAddress = new ArrayList<NetworkAddressType>();
        }
        return this.networkAddress;
    }

}
