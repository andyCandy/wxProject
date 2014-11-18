
package org.tmforum.mtop.nra.xsd.pmdata.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nra.xsd.pmmsrt.v1.PerformanceMonitoringMeasurementListType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;


/**
 * <p>PerformanceMonitoringDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType"/>
 *         &lt;element name="granularity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="retrievalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pmMeasurementList" type="{http://www.tmforum.org/mtop/nra/xsd/pmmsrt/v1}PerformanceMonitoringMeasurementListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringDataType", propOrder = {
    "tpName",
    "layerRate",
    "granularity",
    "retrievalTime",
    "pmMeasurementList"
})
public class PerformanceMonitoringDataType {

    @XmlElement(required = true)
    protected NamingAttributeType tpName;
    @XmlElement(required = true)
    protected LayerRateType layerRate;
    @XmlElement(required = true)
    protected String granularity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retrievalTime;
    @XmlElement(required = true)
    protected PerformanceMonitoringMeasurementListType pmMeasurementList;

    /**
     * 获取tpName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTpName() {
        return tpName;
    }

    /**
     * 设置tpName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTpName(NamingAttributeType value) {
        this.tpName = value;
    }

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
     * 获取retrievalTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetrievalTime() {
        return retrievalTime;
    }

    /**
     * 设置retrievalTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetrievalTime(XMLGregorianCalendar value) {
        this.retrievalTime = value;
    }

    /**
     * 获取pmMeasurementList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMonitoringMeasurementListType }
     *     
     */
    public PerformanceMonitoringMeasurementListType getPmMeasurementList() {
        return pmMeasurementList;
    }

    /**
     * 设置pmMeasurementList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMonitoringMeasurementListType }
     *     
     */
    public void setPmMeasurementList(PerformanceMonitoringMeasurementListType value) {
        this.pmMeasurementList = value;
    }

}
