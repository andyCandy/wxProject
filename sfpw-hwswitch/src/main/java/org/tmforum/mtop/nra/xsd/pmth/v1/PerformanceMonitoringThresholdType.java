
package org.tmforum.mtop.nra.xsd.pmth.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringThresholdTypeType;
import org.tmforum.mtop.nra.xsd.pm.v1.TriggerType;


/**
 * <p>PerformanceMonitoringThresholdType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡthresholdType���Ե�ֵ��
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
     * ����thresholdType���Ե�ֵ��
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
     * ��ȡtrigger���Ե�ֵ��
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
     * ����trigger���Ե�ֵ��
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
     * ��ȡthresholdValue���Ե�ֵ��
     * 
     */
    public float getThresholdValue() {
        return thresholdValue;
    }

    /**
     * ����thresholdValue���Ե�ֵ��
     * 
     */
    public void setThresholdValue(float value) {
        this.thresholdValue = value;
    }

    /**
     * ��ȡthresholdUnit���Ե�ֵ��
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
     * ����thresholdUnit���Ե�ֵ��
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
