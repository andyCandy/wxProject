
package org.tmforum.mtop.nra.xsd.pg.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProtectionGroupListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProtectionGroupListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pg" type="{http://www.tmforum.org/mtop/nra/xsd/pg/v1}ProtectionGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionGroupListType", propOrder = {
    "pg"
})
public class ProtectionGroupListType {

    @XmlElement(nillable = true)
    protected List<ProtectionGroupType> pg;

    /**
     * Gets the value of the pg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectionGroupType }
     * 
     * 
     */
    public List<ProtectionGroupType> getPg() {
        if (pg == null) {
            pg = new ArrayList<ProtectionGroupType>();
        }
        return this.pg;
    }

}
