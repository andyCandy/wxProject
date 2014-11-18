
package org.tmforum.mtop.fmw.xsd.cei.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tmforum.mtop.fmw.xsd.ei.v1.EventInformationType;
import org.tmforum.mtop.fmw.xsd.fts.v1.FileTransferStatusType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;
import org.tmforum.mtop.nra.xsd.eps.v1.EquipmentProtectionSwitchType;
import org.tmforum.mtop.nra.xsd.ps.v1.ProtectionSwitchType;


/**
 * <p>CommonEventInformationType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CommonEventInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vendorExtensions" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AnyListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonEventInformationType", propOrder = {
    "notificationId",
    "sourceTime",
    "vendorExtensions"
})
@XmlSeeAlso({
    FileTransferStatusType.class,
    ProtectionSwitchType.class,
    EventInformationType.class,
    EquipmentProtectionSwitchType.class
})
public abstract class CommonEventInformationType {

    protected String notificationId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sourceTime;
    protected AnyListType vendorExtensions;

    /**
     * ��ȡnotificationId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationId() {
        return notificationId;
    }

    /**
     * ����notificationId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationId(String value) {
        this.notificationId = value;
    }

    /**
     * ��ȡsourceTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSourceTime() {
        return sourceTime;
    }

    /**
     * ����sourceTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSourceTime(XMLGregorianCalendar value) {
        this.sourceTime = value;
    }

    /**
     * ��ȡvendorExtensions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AnyListType }
     *     
     */
    public AnyListType getVendorExtensions() {
        return vendorExtensions;
    }

    /**
     * ����vendorExtensions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AnyListType }
     *     
     */
    public void setVendorExtensions(AnyListType value) {
        this.vendorExtensions = value;
    }

}
