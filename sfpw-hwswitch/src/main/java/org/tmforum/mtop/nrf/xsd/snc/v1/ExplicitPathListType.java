
package org.tmforum.mtop.nrf.xsd.snc.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExplicitPathListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExplicitPathListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ep" type="{http://www.tmforum.org/mtop/nrf/xsd/snc/v1}ExplicitPathType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExplicitPathListType", propOrder = {
    "ep"
})
public class ExplicitPathListType {

    @XmlElement(nillable = true)
    protected List<ExplicitPathType> ep;

    /**
     * Gets the value of the ep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExplicitPathType }
     * 
     * 
     */
    public List<ExplicitPathType> getEp() {
        if (ep == null) {
            ep = new ArrayList<ExplicitPathType>();
        }
        return this.ep;
    }

}
