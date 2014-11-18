
package org.tmforum.mtop.mri.xsd.dusr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AliasNameListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>SimpleMEInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SimpleMEInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}aliasNameList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleMEInfoType", propOrder = {
    "meRef",
    "productName",
    "aliasNameList"
})
public class SimpleMEInfoType {

    @XmlElement(required = true)
    protected NamingAttributeType meRef;
    protected String productName;
    @XmlElement(namespace = "http://www.tmforum.org/mtop/fmw/xsd/gen/v1")
    protected AliasNameListType aliasNameList;

    /**
     * 获取meRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMeRef() {
        return meRef;
    }

    /**
     * 设置meRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMeRef(NamingAttributeType value) {
        this.meRef = value;
    }

    /**
     * 获取productName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置productName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * 获取aliasNameList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AliasNameListType }
     *     
     */
    public AliasNameListType getAliasNameList() {
        return aliasNameList;
    }

    /**
     * 设置aliasNameList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AliasNameListType }
     *     
     */
    public void setAliasNameList(AliasNameListType value) {
        this.aliasNameList = value;
    }

}
