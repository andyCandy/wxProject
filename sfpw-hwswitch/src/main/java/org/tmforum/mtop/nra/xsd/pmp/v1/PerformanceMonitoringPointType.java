
package org.tmforum.mtop.nra.xsd.pmp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringLocationType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringParameterNameListType;
import org.tmforum.mtop.nra.xsd.pmth.v1.PerformanceMonitoringThresholdListType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.itu.v1.X721AdministrativeStateType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;


/**
 * <p>PerformanceMonitoringPointType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType"/>
 *         &lt;element name="pmLocation" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringLocationType"/>
 *         &lt;element name="granularity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supervisionState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}X721.AdministrativeStateType"/>
 *         &lt;element name="monitoringState" type="{http://www.tmforum.org/mtop/nrb/xsd/itu/v1}X721.AdministrativeStateType"/>
 *         &lt;element name="pmParameterList" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringParameterNameListType"/>
 *         &lt;element name="pmThresholdList" type="{http://www.tmforum.org/mtop/nra/xsd/pmth/v1}PerformanceMonitoringThresholdListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringPointType", propOrder = {
    "layerRate",
    "pmLocation",
    "granularity",
    "supervisionState",
    "monitoringState",
    "pmParameterList",
    "pmThresholdList"
})
public class PerformanceMonitoringPointType
    extends CommonResourceInfoType
{

    @XmlElement(required = true)
    protected LayerRateType layerRate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerformanceMonitoringLocationType pmLocation;
    @XmlElement(required = true)
    protected String granularity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected X721AdministrativeStateType supervisionState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected X721AdministrativeStateType monitoringState;
    @XmlElement(required = true)
    protected PerformanceMonitoringParameterNameListType pmParameterList;
    @XmlElement(required = true)
    protected PerformanceMonitoringThresholdListType pmThresholdList;

    /**
     * 获取layerRate属性的值。
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
     * 设置layerRate属性的值。
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
     * 获取supervisionState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public X721AdministrativeStateType getSupervisionState() {
        return supervisionState;
    }

    /**
     * 设置supervisionState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public void setSupervisionState(X721AdministrativeStateType value) {
        this.supervisionState = value;
    }

    /**
     * 获取monitoringState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public X721AdministrativeStateType getMonitoringState() {
        return monitoringState;
    }

    /**
     * 设置monitoringState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link X721AdministrativeStateType }
     *     
     */
    public void setMonitoringState(X721AdministrativeStateType value) {
        this.monitoringState = value;
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
     * 获取pmThresholdList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringThresholdListType }
     *     
     */
    public PerformanceMonitoringThresholdListType getPmThresholdList() {
        return pmThresholdList;
    }

    /**
     * 设置pmThresholdList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringThresholdListType }
     *     
     */
    public void setPmThresholdList(PerformanceMonitoringThresholdListType value) {
        this.pmThresholdList = value;
    }

}
