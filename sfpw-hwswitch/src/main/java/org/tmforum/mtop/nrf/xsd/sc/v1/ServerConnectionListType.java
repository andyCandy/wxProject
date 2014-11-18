
package org.tmforum.mtop.nrf.xsd.sc.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServerConnectionListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServerConnectionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scList" type="{http://www.tmforum.org/mtop/nrf/xsd/sc/v1}ServerConnectionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerConnectionListType", propOrder = {
    "scList"
})
public class ServerConnectionListType {

    @XmlElement(nillable = true)
    protected List<ServerConnectionType> scList;

    /**
     * Gets the value of the scList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerConnectionType }
     * 
     * 
     */
    public List<ServerConnectionType> getScList() {
        if (scList == null) {
            scList = new ArrayList<ServerConnectionType>();
        }
        return this.scList;
    }

}
