
package org.tmforum.mtop.fmw.xsd.gen.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nvs" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndStringValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nvs"
})
@XmlRootElement(name = "additionalInfo")
public class AdditionalInfo {

    @XmlElement(nillable = true)
    protected List<NameAndStringValueType> nvs;

    /**
     * Gets the value of the nvs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nvs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNvs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameAndStringValueType }
     * 
     * 
     */
    public List<NameAndStringValueType> getNvs() {
        if (nvs == null) {
            nvs = new ArrayList<NameAndStringValueType>();
        }
        return this.nvs;
    }

}
