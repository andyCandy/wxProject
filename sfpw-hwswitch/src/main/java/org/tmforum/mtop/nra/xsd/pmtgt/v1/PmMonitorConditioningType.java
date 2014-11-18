
package org.tmforum.mtop.nra.xsd.pmtgt.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tmforum.mtop.nra.xsd.pm.v1.InstanceEnumType;


/**
 * <p>PmMonitorConditioningType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡgranularity���Ե�ֵ��
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
     * ����granularity���Ե�ֵ��
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
     * ��ȡstartTime���Ե�ֵ��
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
     * ����startTime���Ե�ֵ��
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
     * ��ȡendTime���Ե�ֵ��
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
     * ����endTime���Ե�ֵ��
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
     * ��ȡpmScheduleName���Ե�ֵ��
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
     * ����pmScheduleName���Ե�ֵ��
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
     * ��ȡtemplateID���Ե�ֵ��
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
     * ����templateID���Ե�ֵ��
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
     * ��ȡtemplateName���Ե�ֵ��
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
     * ����templateName���Ե�ֵ��
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
     * ��ȡintanceType���Ե�ֵ��
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
     * ����intanceType���Ե�ֵ��
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
