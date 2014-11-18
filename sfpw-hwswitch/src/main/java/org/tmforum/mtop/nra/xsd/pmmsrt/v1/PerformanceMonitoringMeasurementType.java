
package org.tmforum.mtop.nra.xsd.pmmsrt.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringIntervalStatusType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringLocationType;


/**
 * <p>PerformanceMonitoringMeasurementType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringMeasurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmParameterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pmLocation" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringLocationType"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="measurementUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pmIntervalStatus" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringIntervalStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringMeasurementType", propOrder = {
    "pmParameterName",
    "pmLocation",
    "value",
    "measurementUnits",
    "pmIntervalStatus"
})
public class PerformanceMonitoringMeasurementType {

    @XmlElement(required = true)
    protected String pmParameterName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerformanceMonitoringLocationType pmLocation;
    protected float value;
    @XmlElement(required = true)
    protected String measurementUnits;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerformanceMonitoringIntervalStatusType pmIntervalStatus;

    /**
     * 获取pmParameterName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmParameterName() {
        return pmParameterName;
    }

    /**
     * 设置pmParameterName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmParameterName(String value) {
        this.pmParameterName = value;
    }

    /**
     * 获取pmLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringLocationType }
     *     
     */
    public PerformanceMonitoringLocationType getPmLocation() {
        return pmLocation;
    }

    /**
     * 设置pmLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringLocationType }
     *     
     */
    public void setPmLocation(PerformanceMonitoringLocationType value) {
        this.pmLocation = value;
    }

    /**
     * 获取value属性的值。
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * 获取measurementUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementUnits() {
        return measurementUnits;
    }

    /**
     * 设置measurementUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementUnits(String value) {
        this.measurementUnits = value;
    }

    /**
     * 获取pmIntervalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringIntervalStatusType }
     *     
     */
    public PerformanceMonitoringIntervalStatusType getPmIntervalStatus() {
        return pmIntervalStatus;
    }

    /**
     * 设置pmIntervalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringIntervalStatusType }
     *     
     */
    public void setPmIntervalStatus(PerformanceMonitoringIntervalStatusType value) {
        this.pmIntervalStatus = value;
    }

}
