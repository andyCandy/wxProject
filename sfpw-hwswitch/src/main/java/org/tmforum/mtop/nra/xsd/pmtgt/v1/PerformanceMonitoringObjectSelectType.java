
package org.tmforum.mtop.nra.xsd.pmtgt.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringGranularityListType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringLocationListType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateListType;


/**
 * <p>PerformanceMonitoringObjectSelectType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringObjectSelectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="layerRateList" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateListType"/>
 *         &lt;element name="pmLocationList" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringLocationListType"/>
 *         &lt;element name="granularityList" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringGranularityListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringObjectSelectType", propOrder = {
    "name",
    "layerRateList",
    "pmLocationList",
    "granularityList"
})
public class PerformanceMonitoringObjectSelectType {

    @XmlElement(required = true)
    protected NamingAttributeType name;
    @XmlElement(required = true)
    protected LayerRateListType layerRateList;
    @XmlElement(required = true)
    protected PerformanceMonitoringLocationListType pmLocationList;
    @XmlElement(required = true)
    protected PerformanceMonitoringGranularityListType granularityList;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setName(NamingAttributeType value) {
        this.name = value;
    }

    /**
     * ��ȡlayerRateList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LayerRateListType }
     *     
     */
    public LayerRateListType getLayerRateList() {
        return layerRateList;
    }

    /**
     * ����layerRateList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateListType }
     *     
     */
    public void setLayerRateList(LayerRateListType value) {
        this.layerRateList = value;
    }

    /**
     * ��ȡpmLocationList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringLocationListType }
     *     
     */
    public PerformanceMonitoringLocationListType getPmLocationList() {
        return pmLocationList;
    }

    /**
     * ����pmLocationList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringLocationListType }
     *     
     */
    public void setPmLocationList(PerformanceMonitoringLocationListType value) {
        this.pmLocationList = value;
    }

    /**
     * ��ȡgranularityList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringGranularityListType }
     *     
     */
    public PerformanceMonitoringGranularityListType getGranularityList() {
        return granularityList;
    }

    /**
     * ����granularityList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringGranularityListType }
     *     
     */
    public void setGranularityList(PerformanceMonitoringGranularityListType value) {
        this.granularityList = value;
    }

}
