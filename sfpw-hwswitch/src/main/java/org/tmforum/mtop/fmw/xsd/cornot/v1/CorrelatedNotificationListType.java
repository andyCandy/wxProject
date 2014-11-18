
package org.tmforum.mtop.fmw.xsd.cornot.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CorrelatedNotificationListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CorrelatedNotificationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correlatedNotifications" type="{http://www.tmforum.org/mtop/fmw/xsd/cornot/v1}CorrelatedNotificationsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrelatedNotificationListType", propOrder = {
    "correlatedNotifications"
})
public class CorrelatedNotificationListType {

    @XmlElement(nillable = true)
    protected List<CorrelatedNotificationsType> correlatedNotifications;

    /**
     * Gets the value of the correlatedNotifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlatedNotifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelatedNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrelatedNotificationsType }
     * 
     * 
     */
    public List<CorrelatedNotificationsType> getCorrelatedNotifications() {
        if (correlatedNotifications == null) {
            correlatedNotifications = new ArrayList<CorrelatedNotificationsType>();
        }
        return this.correlatedNotifications;
    }

}
