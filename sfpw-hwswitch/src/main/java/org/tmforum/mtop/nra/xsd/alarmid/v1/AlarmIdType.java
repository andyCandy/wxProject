
package org.tmforum.mtop.nra.xsd.alarmid.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nra.xsd.prc.v1.ProbableCauseType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;


/**
 * <p>AlarmIdType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AlarmIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType" minOccurs="0"/>
 *         &lt;element name="probableCause" type="{http://www.tmforum.org/mtop/nra/xsd/prc/v1}ProbableCauseType" minOccurs="0"/>
 *         &lt;element name="probableCauseQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmIdType", propOrder = {
    "objectName",
    "layerRate",
    "probableCause",
    "probableCauseQualifier"
})
public class AlarmIdType {

    protected NamingAttributeType objectName;
    protected LayerRateType layerRate;
    protected ProbableCauseType probableCause;
    protected String probableCauseQualifier;

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
     * 获取probableCause属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProbableCauseType }
     *     
     */
    public ProbableCauseType getProbableCause() {
        return probableCause;
    }

    /**
     * 设置probableCause属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProbableCauseType }
     *     
     */
    public void setProbableCause(ProbableCauseType value) {
        this.probableCause = value;
    }

    /**
     * 获取probableCauseQualifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbableCauseQualifier() {
        return probableCauseQualifier;
    }

    /**
     * 设置probableCauseQualifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbableCauseQualifier(String value) {
        this.probableCauseQualifier = value;
    }

}
