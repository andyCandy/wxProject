
package org.tmforum.mtop.nra.xsd.com.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PerceivedSeverityListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PerceivedSeverityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="perceivedSeverity" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}PerceivedSeverityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerceivedSeverityListType", propOrder = {
    "perceivedSeverity"
})
public class PerceivedSeverityListType {

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<PerceivedSeverityType> perceivedSeverity;

    /**
     * Gets the value of the perceivedSeverity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perceivedSeverity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerceivedSeverity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerceivedSeverityType }
     * 
     * 
     */
    public List<PerceivedSeverityType> getPerceivedSeverity() {
        if (perceivedSeverity == null) {
            perceivedSeverity = new ArrayList<PerceivedSeverityType>();
        }
        return this.perceivedSeverity;
    }

}
