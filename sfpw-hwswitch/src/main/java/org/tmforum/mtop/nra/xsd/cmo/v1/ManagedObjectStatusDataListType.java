
package org.tmforum.mtop.nra.xsd.cmo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ManagedObjectStatusDataListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ManagedObjectStatusDataListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectStatus" type="{http://www.tmforum.org/mtop/nra/xsd/cmo/v1}ManagedObjectStatusDataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedObjectStatusDataListType", propOrder = {
    "objectStatus"
})
public class ManagedObjectStatusDataListType {

    @XmlElement(nillable = true)
    protected List<ManagedObjectStatusDataType> objectStatus;

    /**
     * Gets the value of the objectStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectStatusDataType }
     * 
     * 
     */
    public List<ManagedObjectStatusDataType> getObjectStatus() {
        if (objectStatus == null) {
            objectStatus = new ArrayList<ManagedObjectStatusDataType>();
        }
        return this.objectStatus;
    }

}
