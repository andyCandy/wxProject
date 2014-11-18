
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISRouteFilter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ISISRouteFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filterPolicyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterPolicyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocolType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instanceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ISISRouteFilter", propOrder = {
    "filterPolicyType",
    "filterPolicyValue",
    "protocolType",
    "instanceID",
    "action"
})
public class ISISRouteFilter {

    @XmlElement(required = true)
    protected String filterPolicyType;
    @XmlElement(required = true)
    protected String filterPolicyValue;
    @XmlElement(required = true)
    protected String protocolType;
    protected int instanceID;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取filterPolicyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterPolicyType() {
        return filterPolicyType;
    }

    /**
     * 设置filterPolicyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterPolicyType(String value) {
        this.filterPolicyType = value;
    }

    /**
     * 获取filterPolicyValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterPolicyValue() {
        return filterPolicyValue;
    }

    /**
     * 设置filterPolicyValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterPolicyValue(String value) {
        this.filterPolicyValue = value;
    }

    /**
     * 获取protocolType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * 设置protocolType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolType(String value) {
        this.protocolType = value;
    }

    /**
     * 获取instanceID属性的值。
     * 
     */
    public int getInstanceID() {
        return instanceID;
    }

    /**
     * 设置instanceID属性的值。
     * 
     */
    public void setInstanceID(int value) {
        this.instanceID = value;
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
