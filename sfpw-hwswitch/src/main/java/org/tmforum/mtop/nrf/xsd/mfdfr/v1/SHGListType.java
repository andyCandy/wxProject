
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SHGListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SHGListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shgType" type="{http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1}SHGType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHGListType", propOrder = {
    "shgType"
})
public class SHGListType {

    @XmlElement(namespace = "http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1")
    protected List<SHGType> shgType;

    /**
     * Gets the value of the shgType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shgType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShgType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHGType }
     * 
     * 
     */
    public List<SHGType> getShgType() {
        if (shgType == null) {
            shgType = new ArrayList<SHGType>();
        }
        return this.shgType;
    }

}
