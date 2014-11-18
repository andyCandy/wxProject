
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RTType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vrfRT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rtType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTType", propOrder = {
    "vrfRT",
    "rtType",
    "action"
})
public class RTType {

    @XmlElement(required = true)
    protected String vrfRT;
    @XmlElement(required = true)
    protected String rtType;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取vrfRT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrfRT() {
        return vrfRT;
    }

    /**
     * 设置vrfRT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrfRT(String value) {
        this.vrfRT = value;
    }

    /**
     * 获取rtType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtType() {
        return rtType;
    }

    /**
     * 设置rtType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtType(String value) {
        this.rtType = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
