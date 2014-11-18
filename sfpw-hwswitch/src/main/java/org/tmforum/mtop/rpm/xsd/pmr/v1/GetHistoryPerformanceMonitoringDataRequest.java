
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
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取pmObjectSelectList属性的值。
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
     * 设置pmObjectSelectList属性的值。
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
     * 获取pmParameterList属性的值。
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
     * 设置pmParameterList属性的值。
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
     * 获取mustForceUpload属性的值。
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
     * 设置mustForceUpload属性的值。
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
