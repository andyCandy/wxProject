
package org.tmforum.mtop.nrf.xsd.snc.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>TunnelPolicyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TunnelPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="bindingList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="destinationIP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="tunnelIFName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="loadBalanceNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectSequence">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lspType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TunnelPolicyType", propOrder = {
    "name",
    "bindingList",
    "loadBalanceNum",
    "selectSequence"
})
public class TunnelPolicyType {

    @XmlElement(required = true)
    protected NamingAttributeType name;
    @XmlElement(required = true)
    protected TunnelPolicyType.BindingList bindingList;
    @XmlElement(required = true)
    protected String loadBalanceNum;
    @XmlElement(required = true)
    protected TunnelPolicyType.SelectSequence selectSequence;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setName(NamingAttributeType value) {
        this.name = value;
    }

    /**
     * 获取bindingList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TunnelPolicyType.BindingList }
     *     
     */
    public TunnelPolicyType.BindingList getBindingList() {
        return bindingList;
    }

    /**
     * 设置bindingList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TunnelPolicyType.BindingList }
     *     
     */
    public void setBindingList(TunnelPolicyType.BindingList value) {
        this.bindingList = value;
    }

    /**
     * 获取loadBalanceNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadBalanceNum() {
        return loadBalanceNum;
    }

    /**
     * 设置loadBalanceNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadBalanceNum(String value) {
        this.loadBalanceNum = value;
    }

    /**
     * 获取selectSequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TunnelPolicyType.SelectSequence }
     *     
     */
    public TunnelPolicyType.SelectSequence getSelectSequence() {
        return selectSequence;
    }

    /**
     * 设置selectSequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TunnelPolicyType.SelectSequence }
     *     
     */
    public void setSelectSequence(TunnelPolicyType.SelectSequence value) {
        this.selectSequence = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="destinationIP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="tunnelIFName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "destinationIP",
        "tunnelIFName"
    })
    public static class BindingList {

        @XmlElement(required = true)
        protected List<String> destinationIP;
        @XmlElement(required = true)
        protected List<String> tunnelIFName;

        /**
         * Gets the value of the destinationIP property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the destinationIP property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDestinationIP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDestinationIP() {
            if (destinationIP == null) {
                destinationIP = new ArrayList<String>();
            }
            return this.destinationIP;
        }

        /**
         * Gets the value of the tunnelIFName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tunnelIFName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTunnelIFName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTunnelIFName() {
            if (tunnelIFName == null) {
                tunnelIFName = new ArrayList<String>();
            }
            return this.tunnelIFName;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lspType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lspType"
    })
    public static class SelectSequence {

        @XmlElement(required = true)
        protected List<String> lspType;

        /**
         * Gets the value of the lspType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lspType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLspType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLspType() {
            if (lspType == null) {
                lspType = new ArrayList<String>();
            }
            return this.lspType;
        }

    }

}
