
package org.tmforum.mtop.nra.xsd.pmth.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringThresholdTypeType;
import org.tmforum.mtop.nra.xsd.pm.v1.TriggerType;


/**
 * <p>PerformanceMonitoringThresholdType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringThresholdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thresholdType" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringThresholdTypeType"/>
 *         &lt;element name="trigger" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}TriggerType"/>
 *         &lt;element name="thresholdValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="thresholdUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringThresholdType", propOrder = {
    "thresholdType",
    "trigger",
    "thresholdValue",
    "thresholdUnit"
})
public class PerformanceMonitoringThresholdType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerformanceMonitoringThresholdTypeType thresholdType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TriggerType trigger;
    protected float thresholdValue;
    @XmlElement(required = true)
    protected String thresholdUnit;

    /**
     * 获取thresholdType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringThresholdTypeType }
     *     
     */
    public PerformanceMonitoringThresholdTypeType getThresholdType() {
        return thresholdType;
    }

    /**
     * 设置thresholdType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringThresholdTypeType }
     *     
     */
    public void setThresholdType(PerformanceMonitoringThresholdTypeType value) {
        this.thresholdType = value;
    }

    /**
     * 获取trigger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TriggerType }
     *     
     */
    public TriggerType getTrigger() {
        return trigger;
    }

    /**
     * 设置trigger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerType }
     *     
     */
    public void setTrigger(TriggerType value) {
        this.trigger = value;
    }

    /**
     * 获取thresholdValue属性的值。
     * 
     */
    public float getThresholdValue() {
        return thresholdValue;
    }

    /**
     * 设置thresholdValue属性的值。
     * 
     */
    public void setThresholdValue(float value) {
        this.thresholdValue = value;
    }

    /**
     * 获取thresholdUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThresholdUnit() {
        return thresholdUnit;
    }

    /**
     * 设置thresholdUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThresholdUnit(String value) {
        this.thresholdUnit = value;
    }

}
