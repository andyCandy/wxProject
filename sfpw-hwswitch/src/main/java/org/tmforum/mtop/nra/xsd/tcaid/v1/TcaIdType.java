
package org.tmforum.mtop.nra.xsd.tcaid.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nra.xsd.pm.v1.PerformanceMonitoringLocationType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;


/**
 * <p>TcaIdType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TcaIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType" minOccurs="0"/>
 *         &lt;element name="pmParameterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pmLocation" type="{http://www.tmforum.org/mtop/nra/xsd/pm/v1}PerformanceMonitoringLocationType" minOccurs="0"/>
 *         &lt;element name="granularity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TcaIdType", propOrder = {
    "objectName",
    "layerRate",
    "pmParameterName",
    "pmLocation",
    "granularity"
})
public class TcaIdType {

    protected NamingAttributeType objectName;
    protected LayerRateType layerRate;
    protected String pmParameterName;
    @XmlSchemaType(name = "string")
    protected PerformanceMonitoringLocationType pmLocation;
    protected String granularity;

    /**
     * 获取objectName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getObjectName() {
        return objectName;
    }

    /**
     * 设置objectName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setObjectName(NamingAttributeType value) {
        this.objectName = value;
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

}
