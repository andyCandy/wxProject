
package org.tmforum.mtop.nrf.xsd.tpdata.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VlanIDSectionType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡvlan���Ե�ֵ��
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
     * ����vlan���Ե�ֵ��
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
     * ��ȡlowVlan���Ե�ֵ��
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
     * ����lowVlan���Ե�ֵ��
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
     * ��ȡhighVlan���Ե�ֵ��
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
     * ����highVlan���Ե�ֵ��
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
     * ��ȡvlanGroup���Ե�ֵ��
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
     * ����vlanGroup���Ե�ֵ��
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
     * ��ȡisisStatistic���Ե�ֵ��
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
     * ����isisStatistic���Ե�ֵ��
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
