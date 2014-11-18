
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
 * <p>PerformanceMonitoringPointType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsupervisionState���Ե�ֵ��
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
     * ����supervisionState���Ե�ֵ��
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
     * ��ȡmonitoringState���Ե�ֵ��
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
     * ����monitoringState���Ե�ֵ��
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
     * ��ȡpmThresholdList���Ե�ֵ��
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
     * ����pmThresholdList���Ե�ֵ��
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
