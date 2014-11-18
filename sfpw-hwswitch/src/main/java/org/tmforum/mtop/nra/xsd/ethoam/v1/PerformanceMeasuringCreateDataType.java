
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>PerformanceMeasuringCreateDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceMeasuringCreateDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="performanceMeasuringName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="measureMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="maBindingServiceName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lstParamInfo" type="{http://www.tmforum.org/mtop/nra/xsd/ethoam/v1}ConfDataListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMeasuringCreateDataType", propOrder = {
    "meName",
    "performanceMeasuringName",
    "measureType",
    "measureMode",
    "maName",
    "maBindingServiceName",
    "threshold",
    "lstParamInfo"
})
public class PerformanceMeasuringCreateDataType {

    @XmlElement(required = true)
    protected NamingAttributeType meName;
    @XmlElement(required = true)
    protected String performanceMeasuringName;
    @XmlElement(required = true)
    protected String measureType;
    @XmlElement(required = true)
    protected String measureMode;
    @XmlElement(required = true)
    protected NamingAttributeType maName;
    @XmlElement(required = true)
    protected NamingAttributeType maBindingServiceName;
    @XmlElement(required = true)
    protected String threshold;
    @XmlElement(required = true)
    protected ConfDataListType lstParamInfo;

    /**
     * 获取meName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMeName() {
        return meName;
    }

    /**
     * 设置meName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMeName(NamingAttributeType value) {
        this.meName = value;
    }

    /**
     * 获取performanceMeasuringName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceMeasuringName() {
        return performanceMeasuringName;
    }

    /**
     * 设置performanceMeasuringName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceMeasuringName(String value) {
        this.performanceMeasuringName = value;
    }

    /**
     * 获取measureType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureType() {
        return measureType;
    }

    /**
     * 设置measureType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureType(String value) {
        this.measureType = value;
    }

    /**
     * 获取measureMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureMode() {
        return measureMode;
    }

    /**
     * 设置measureMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureMode(String value) {
        this.measureMode = value;
    }

    /**
     * 获取maName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMaName() {
        return maName;
    }

    /**
     * 设置maName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMaName(NamingAttributeType value) {
        this.maName = value;
    }

    /**
     * 获取maBindingServiceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMaBindingServiceName() {
        return maBindingServiceName;
    }

    /**
     * 设置maBindingServiceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMaBindingServiceName(NamingAttributeType value) {
        this.maBindingServiceName = value;
    }

    /**
     * 获取threshold属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreshold() {
        return threshold;
    }

    /**
     * 设置threshold属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreshold(String value) {
        this.threshold = value;
    }

    /**
     * 获取lstParamInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConfDataListType }
     *     
     */
    public ConfDataListType getLstParamInfo() {
        return lstParamInfo;
    }

    /**
     * 设置lstParamInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConfDataListType }
     *     
     */
    public void setLstParamInfo(ConfDataListType value) {
        this.lstParamInfo = value;
    }

}
