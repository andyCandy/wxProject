
package org.tmforum.mtop.nra.xsd.atcaid.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AlarmOrTcaIdListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AlarmOrTcaIdListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alarmOrTcaId" type="{http://www.tmforum.org/mtop/nra/xsd/atcaid/v1}AlarmOrTcaIdType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmOrTcaIdListType", propOrder = {
    "alarmOrTcaId"
})
public class AlarmOrTcaIdListType {

    @XmlElement(nillable = true)
    protected List<AlarmOrTcaIdType> alarmOrTcaId;

    /**
     * Gets the value of the alarmOrTcaId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmOrTcaId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmOrTcaId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmOrTcaIdType }
     * 
     * 
     */
    public List<AlarmOrTcaIdType> getAlarmOrTcaId() {
        if (alarmOrTcaId == null) {
            alarmOrTcaId = new ArrayList<AlarmOrTcaIdType>();
        }
        return this.alarmOrTcaId;
    }

}
