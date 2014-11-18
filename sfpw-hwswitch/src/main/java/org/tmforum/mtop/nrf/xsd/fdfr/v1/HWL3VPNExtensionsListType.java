
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HWL3VPNExtensionsListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HWL3VPNExtensionsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hwL3VPNExtensions" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}HWL3VPNExtensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HWL3VPNExtensionsListType", propOrder = {
    "hwL3VPNExtensions"
})
public class HWL3VPNExtensionsListType {

    @XmlElement(nillable = true)
    protected List<HWL3VPNExtensionsType> hwL3VPNExtensions;

    /**
     * Gets the value of the hwL3VPNExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hwL3VPNExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHwL3VPNExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HWL3VPNExtensionsType }
     * 
     * 
     */
    public List<HWL3VPNExtensionsType> getHwL3VPNExtensions() {
        if (hwL3VPNExtensions == null) {
            hwL3VPNExtensions = new ArrayList<HWL3VPNExtensionsType>();
        }
        return this.hwL3VPNExtensions;
    }

}
