
package org.tmforum.mtop.nra.xsd.pmtgt.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tmforum.mtop.nra.xsd.pm.v1.InstanceEnumType;


/**
 * <p>PmMonitorConditioningType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PmMonitorConditioningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="granularity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="pmScheduleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="intanceType" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}InstanceEnumType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmMonitorConditioningType", propOrder = {
    "granularity",
    "startTime",
    "endTime",
    "pmScheduleName",
    "templateID",
    "templateName",
    "intanceType"
})
public class PmMonitorConditioningType {

    @XmlElement(required = true)
    protected String granularity;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(required = true, nillable = true)
    protected String pmScheduleName;
    @XmlElement(required = true, nillable = true)
    protected String templateID;
    @XmlElement(required = true)
    protected String templateName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InstanceEnumType intanceType;

    /**
     * 获取granularity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGranularity() {
        return granularity;
    }

    /**
     * 设置granularity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGranularity(String value) {
        this.granularity = value;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * 获取pmScheduleName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmScheduleName() {
        return pmScheduleName;
    }

    /**
     * 设置pmScheduleName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmScheduleName(String value) {
        this.pmScheduleName = value;
    }

    /**
     * 获取templateID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * 设置templateID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateID(String value) {
        this.templateID = value;
    }

    /**
     * 获取templateName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * 设置templateName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * 获取intanceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InstanceEnumType }
     *     
     */
    public InstanceEnumType getIntanceType() {
        return intanceType;
    }

    /**
     * 设置intanceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceEnumType }
     *     
     */
    public void setIntanceType(InstanceEnumType value) {
        this.intanceType = value;
    }

}
