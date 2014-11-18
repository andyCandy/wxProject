
package org.tmforum.mtop.nra.xsd.alm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AlarmListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AlarmListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alarm" type="{http://www.tmforum.org/mtop/nra/xsd/alm/v1}AlarmType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmListType", propOrder = {
    "alarm"
})
public class AlarmListType {

    @XmlElement(nillable = true)
    protected List<AlarmType> alarm;

    /**
     * Gets the value of the alarm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmType }
     * 
     * 
     */
    public List<AlarmType> getAlarm() {
        if (alarm == null) {
            alarm = new ArrayList<AlarmType>();
        }
        return this.alarm;
    }

}
