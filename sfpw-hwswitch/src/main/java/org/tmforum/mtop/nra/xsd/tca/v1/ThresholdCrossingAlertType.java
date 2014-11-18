
package org.tmforum.mtop.nra.xsd.tca.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.ei.v1.EventInformationType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AliasNameListType;
import org.tmforum.mtop.nra.xsd.com.v1.PerceivedSeverityType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringLocationType;
import org.tmforum.mtop.nra.xsd.pmth.v1.PerformanceMonitoringThresholdType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;


/**
 * <p>ThresholdCrossingAlertType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ThresholdCrossingAlertType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/ei/v1}EventInformationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}aliasNameList"/>
 *         &lt;element name="isClearable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="perceivedSeverity" type="{http://www.tmforum.org/mtop/nra/xsd/com/v1}PerceivedSeverityType"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType"/>
 *         &lt;element name="granularity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pmParameterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pmLocation" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringLocationType"/>
 *         &lt;element name="thresholdType" type="{http://www.tmforum.org/mtop/nra/xsd/pmth/v1}PerformanceMonitoringThresholdType"/>
 *         &lt;element name="thresholdValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="thresholdUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acknowledgeIndication" type="{http://www.tmforum.org/mtop/nra/xsd/tca/v1}AcknowledgeIndicationType"/>
 *         &lt;element name="isEdgePointRelated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThresholdCrossingAlertType", propOrder = {
    "aliasNameList",
    "isClearable",
    "perceivedSeverity",
    "layerRate",
    "granularity",
    "pmParameterName",
    "pmLocation",
    "thresholdType",
    "thresholdValue",
    "thresholdUnit",
    "acknowledgeIndication",
    "isEdgePointRelated"
})
public class ThresholdCrossingAlertType
    extends EventInformationType
{

    @XmlElement(namespace = "http://www.tmforum.org/mtop/fmw/xsd/gen/v1", required = true)
    protected AliasNameListType aliasNameList;
    protected boolean isClearable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerceivedSeverityType perceivedSeverity;
    @XmlElement(required = true)
    protected LayerRateType layerRate;
    @XmlElement(required = true)
    protected String granularity;
    @XmlElement(required = true)
    protected String pmParameterName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerformanceMonitoringLocationType pmLocation;
    @XmlElement(required = true)
    protected PerformanceMonitoringThresholdType thresholdType;
    protected float thresholdValue;
    @XmlElement(required = true)
    protected String thresholdUnit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AcknowledgeIndicationType acknowledgeIndication;
    protected Boolean isEdgePointRelated;

    /**
     * ��ȡaliasNameList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AliasNameListType }
     *     
     */
    public AliasNameListType getAliasNameList() {
        return aliasNameList;
    }

    /**
     * ����aliasNameList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AliasNameListType }
     *     
     */
    public void setAliasNameList(AliasNameListType value) {
        this.aliasNameList = value;
    }

    /**
     * ��ȡisClearable���Ե�ֵ��
     * 
     */
    public boolean isIsClearable() {
        return isClearable;
    }

    /**
     * ����isClearable���Ե�ֵ��
     * 
     */
    public void setIsClearable(boolean value) {
        this.isClearable = value;
    }

    /**
     * ��ȡperceivedSeverity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PerceivedSeverityType }
     *     
     */
    public PerceivedSeverityType getPerceivedSeverity() {
        return perceivedSeverity;
    }

    /**
     * ����perceivedSeverity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PerceivedSeverityType }
     *     
     */
    public void setPerceivedSeverity(PerceivedSeverityType value) {
        this.perceivedSeverity = value;
    }

    /**
     * ��ȡlayerRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LayerRateType }
     *     
     */
    public LayerRateType getLayerRate() {
        return layerRate;
    }

    /**
     * ����layerRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateType }
     *     
     */
    public void setLayerRate(LayerRateType value) {
        this.layerRate = value;
    }

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
     * ��ȡpmParameterName���Ե�ֵ��
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
     * ����pmParameterName���Ե�ֵ��
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
     * ��ȡpmLocation���Ե�ֵ��
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
     * ����pmLocation���Ե�ֵ��
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
     * ��ȡthresholdType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringThresholdType }
     *     
     */
    public PerformanceMonitoringThresholdType getThresholdType() {
        return thresholdType;
    }

    /**
     * ����thresholdType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringThresholdType }
     *     
     */
    public void setThresholdType(PerformanceMonitoringThresholdType value) {
        this.thresholdType = value;
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

    /**
     * ��ȡacknowledgeIndication���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeIndicationType }
     *     
     */
    public AcknowledgeIndicationType getAcknowledgeIndication() {
        return acknowledgeIndication;
    }

    /**
     * ����acknowledgeIndication���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeIndicationType }
     *     
     */
    public void setAcknowledgeIndication(AcknowledgeIndicationType value) {
        this.acknowledgeIndication = value;
    }

    /**
     * ��ȡisEdgePointRelated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEdgePointRelated() {
        return isEdgePointRelated;
    }

    /**
     * ����isEdgePointRelated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEdgePointRelated(Boolean value) {
        this.isEdgePointRelated = value;
    }

}
