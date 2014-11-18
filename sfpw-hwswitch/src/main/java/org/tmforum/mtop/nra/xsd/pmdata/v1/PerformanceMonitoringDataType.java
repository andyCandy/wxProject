
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
 * <p>PerformanceMonitoringDataType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtpName���Ե�ֵ��
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
     * ����tpName���Ե�ֵ��
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
     * ��ȡretrievalTime���Ե�ֵ��
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
     * ����retrievalTime���Ե�ֵ��
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
     * ��ȡpmMeasurementList���Ե�ֵ��
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
     * ����pmMeasurementList���Ե�ֵ��
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
