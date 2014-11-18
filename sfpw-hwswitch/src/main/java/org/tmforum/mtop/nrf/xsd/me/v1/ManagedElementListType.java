
package org.tmforum.mtop.nrf.xsd.me.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ManagedElementListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ManagedElementListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="me" type="{http://www.tmforum.org/mtop/nrf/xsd/me/v1}ManagedElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedElementListType", propOrder = {
    "me"
})
public class ManagedElementListType {

    @XmlElement(nillable = true)
    protected List<ManagedElementType> me;

    /**
     * Gets the value of the me property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the me property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedElementType }
     * 
     * 
     */
    public List<ManagedElementType> getMe() {
        if (me == null) {
            me = new ArrayList<ManagedElementType>();
        }
        return this.me;
    }

}
