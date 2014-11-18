
package org.tmforum.mtop.nrf.xsd.tpdata.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VlanIDSectionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VlanIDSectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowVlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highVlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vlanGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isisStatistic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VlanIDSectionType", propOrder = {
    "vlan",
    "lowVlan",
    "highVlan",
    "vlanGroup",
    "isisStatistic"
})
public class VlanIDSectionType {

    protected String vlan;
    protected String lowVlan;
    protected String highVlan;
    protected String vlanGroup;
    protected String isisStatistic;

    /**
     * 获取vlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlan() {
        return vlan;
    }

    /**
     * 设置vlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlan(String value) {
        this.vlan = value;
    }

    /**
     * 获取lowVlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowVlan() {
        return lowVlan;
    }

    /**
     * 设置lowVlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowVlan(String value) {
        this.lowVlan = value;
    }

    /**
     * 获取highVlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighVlan() {
        return highVlan;
    }

    /**
     * 设置highVlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighVlan(String value) {
        this.highVlan = value;
    }

    /**
     * 获取vlanGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlanGroup() {
        return vlanGroup;
    }

    /**
     * 设置vlanGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlanGroup(String value) {
        this.vlanGroup = value;
    }

    /**
     * 获取isisStatistic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsisStatistic() {
        return isisStatistic;
    }

    /**
     * 设置isisStatistic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsisStatistic(String value) {
        this.isisStatistic = value;
    }

}
