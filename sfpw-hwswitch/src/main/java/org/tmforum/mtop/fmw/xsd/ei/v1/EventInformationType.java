
package org.tmforum.mtop.fmw.xsd.ei.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tmforum.mtop.fmw.xsd.avc.v1.AttributeValueChangeType;
import org.tmforum.mtop.fmw.xsd.cei.v1.CommonEventInformationType;
import org.tmforum.mtop.fmw.xsd.hbt.v1.HeartbeatType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.fmw.xsd.oc.v1.ObjectCreationType;
import org.tmforum.mtop.fmw.xsd.odel.v1.ObjectDeletionType;
import org.tmforum.mtop.fmw.xsd.sc.v1.StateChangeType;
import org.tmforum.mtop.nra.xsd.alm.v1.AlarmType;
import org.tmforum.mtop.nra.xsd.emo.v1.MaintenanceOperationResultType;
import org.tmforum.mtop.nra.xsd.tca.v1.ThresholdCrossingAlertType;
import org.tmforum.mtop.nrf.xsd.routec.v1.RouteChangeType;


/**
 * <p>EventInformationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EventInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/cei/v1}CommonEventInformationType">
 *       &lt;sequence>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="osTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventInformationType", propOrder = {
    "objectType",
    "objectName",
    "osTime"
})
@XmlSeeAlso({
    RouteChangeType.class,
    AlarmType.class,
    ObjectCreationType.class,
    ObjectDeletionType.class,
    StateChangeType.class,
    HeartbeatType.class,
    ThresholdCrossingAlertType.class,
    AttributeValueChangeType.class,
    MaintenanceOperationResultType.class
})
public abstract class EventInformationType
    extends CommonEventInformationType
{

    protected String objectType;
    protected NamingAttributeType objectName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar osTime;

    /**
     * 获取objectType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * 设置objectType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * 获取objectName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getObjectName() {
        return objectName;
    }

    /**
     * 设置objectName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setObjectName(NamingAttributeType value) {
        this.objectName = value;
    }

    /**
     * 获取osTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOsTime() {
        return osTime;
    }

    /**
     * 设置osTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOsTime(XMLGregorianCalendar value) {
        this.osTime = value;
    }

}
