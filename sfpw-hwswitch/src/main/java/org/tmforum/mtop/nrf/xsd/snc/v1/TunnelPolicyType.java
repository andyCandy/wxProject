
package org.tmforum.mtop.nrf.xsd.snc.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>TunnelPolicyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡbindingList���Ե�ֵ��
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
     * ����bindingList���Ե�ֵ��
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
     * ��ȡloadBalanceNum���Ե�ֵ��
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
     * ����loadBalanceNum���Ե�ֵ��
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
     * ��ȡselectSequence���Ե�ֵ��
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
     * ����selectSequence���Ե�ֵ��
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
