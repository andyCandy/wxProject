
package org.tmforum.mtop.rpm.xsd.pmr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringParameterNameListType;
import org.tmforum.mtop.nra.xsd.pmtgt.v1.PerformanceMonitoringObjectSelectListType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmObjectSelectList" type="{http://www.tmforum.org/mtop/nra/xsd/pmtgt/v1}PerformanceMonitoringObjectSelectListType" minOccurs="0"/>
 *         &lt;element name="pmParameterList" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringParameterNameListType" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mustForceUpload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pmObjectSelectList",
    "pmParameterList",
    "startTime",
    "endTime",
    "mustForceUpload"
})
@XmlRootElement(name = "getHistoryPerformanceMonitoringDataRequest")
public class GetHistoryPerformanceMonitoringDataRequest {

    protected PerformanceMonitoringObjectSelectListType pmObjectSelectList;
    protected PerformanceMonitoringParameterNameListType pmParameterList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected Boolean mustForceUpload;

    /**
     * ��ȡpmObjectSelectList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringObjectSelectListType }
     *     
     */
    public PerformanceMonitoringObjectSelectListType getPmObjectSelectList() {
        return pmObjectSelectList;
    }

    /**
     * ����pmObjectSelectList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringObjectSelectListType }
     *     
     */
    public void setPmObjectSelectList(PerformanceMonitoringObjectSelectListType value) {
        this.pmObjectSelectList = value;
    }

    /**
     * ��ȡpmParameterList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringParameterNameListType }
     *     
     */
    public PerformanceMonitoringParameterNameListType getPmParameterList() {
        return pmParameterList;
    }

    /**
     * ����pmParameterList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringParameterNameListType }
     *     
     */
    public void setPmParameterList(PerformanceMonitoringParameterNameListType value) {
        this.pmParameterList = value;
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
     * ��ȡmustForceUpload���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustForceUpload() {
        return mustForceUpload;
    }

    /**
     * ����mustForceUpload���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustForceUpload(Boolean value) {
        this.mustForceUpload = value;
    }

}
