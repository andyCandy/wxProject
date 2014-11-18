
package org.tmforum.mtop.fmw.xsd.cornot.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NotificationIdentifierListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>CorrelatedNotificationsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CorrelatedNotificationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="notifIds" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NotificationIdentifierListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrelatedNotificationsType", propOrder = {
    "name",
    "notifIds"
})
public class CorrelatedNotificationsType {

    @XmlElement(required = true)
    protected NamingAttributeType name;
    @XmlElement(required = true)
    protected NotificationIdentifierListType notifIds;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setName(NamingAttributeType value) {
        this.name = value;
    }

    /**
     * 获取notifIds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotificationIdentifierListType }
     *     
     */
    public NotificationIdentifierListType getNotifIds() {
        return notifIds;
    }

    /**
     * 设置notifIds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationIdentifierListType }
     *     
     */
    public void setNotifIds(NotificationIdentifierListType value) {
        this.notifIds = value;
    }

}
