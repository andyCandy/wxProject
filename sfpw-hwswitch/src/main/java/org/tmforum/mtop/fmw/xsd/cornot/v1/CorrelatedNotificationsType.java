
package org.tmforum.mtop.fmw.xsd.cornot.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NotificationIdentifierListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>CorrelatedNotificationsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡnotifIds���Ե�ֵ��
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
     * ����notifIds���Ե�ֵ��
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
