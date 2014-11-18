
package org.tmforum.mtop.vs.xsd.rr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;


/**
 * <p>CustomerInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerAttr1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerAttr2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalInfo" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfoType", propOrder = {
    "customer",
    "customerAttr1",
    "customerAttr2",
    "remarks",
    "additionalInfo"
})
public class CustomerInfoType {

    @XmlElement(required = true)
    protected String customer;
    @XmlElement(required = true)
    protected String customerAttr1;
    @XmlElement(required = true)
    protected String customerAttr2;
    @XmlElement(required = true)
    protected String remarks;
    protected NamingAttributeListType additionalInfo;

    /**
     * 获取customer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * 设置customer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * 获取customerAttr1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAttr1() {
        return customerAttr1;
    }

    /**
     * 设置customerAttr1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAttr1(String value) {
        this.customerAttr1 = value;
    }

    /**
     * 获取customerAttr2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAttr2() {
        return customerAttr2;
    }

    /**
     * 设置customerAttr2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAttr2(String value) {
        this.customerAttr2 = value;
    }

    /**
     * 获取remarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置remarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * 获取additionalInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * 设置additionalInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setAdditionalInfo(NamingAttributeListType value) {
        this.additionalInfo = value;
    }

}
