
package org.tmforum.mtop.fmw.xsd.nam.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NamingAttributeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NamingAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rdn" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}RelativeDistinguishNameType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamingAttributeType", propOrder = {
    "rdn"
})
public class NamingAttributeType {

    @XmlElement(required = true)
    protected List<RelativeDistinguishNameType> rdn;

    /**
     * Gets the value of the rdn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rdn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRdn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelativeDistinguishNameType }
     * 
     * 
     */
    public List<RelativeDistinguishNameType> getRdn() {
        if (rdn == null) {
            rdn = new ArrayList<RelativeDistinguishNameType>();
        }
        return this.rdn;
    }

}
