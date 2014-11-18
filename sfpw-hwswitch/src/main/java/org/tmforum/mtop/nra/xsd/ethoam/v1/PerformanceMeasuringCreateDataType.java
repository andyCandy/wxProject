
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>PerformanceMeasuringCreateDataType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmeName���Ե�ֵ��
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
     * ����meName���Ե�ֵ��
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
     * ��ȡperformanceMeasuringName���Ե�ֵ��
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
     * ����performanceMeasuringName���Ե�ֵ��
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
     * ��ȡmeasureType���Ե�ֵ��
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
     * ����measureType���Ե�ֵ��
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
     * ��ȡmeasureMode���Ե�ֵ��
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
     * ����measureMode���Ե�ֵ��
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
     * ��ȡmaName���Ե�ֵ��
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
     * ����maName���Ե�ֵ��
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
     * ��ȡmaBindingServiceName���Ե�ֵ��
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
     * ����maBindingServiceName���Ե�ֵ��
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
     * ��ȡthreshold���Ե�ֵ��
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
     * ����threshold���Ե�ֵ��
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
     * ��ȡlstParamInfo���Ե�ֵ��
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
     * ����lstParamInfo���Ե�ֵ��
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
