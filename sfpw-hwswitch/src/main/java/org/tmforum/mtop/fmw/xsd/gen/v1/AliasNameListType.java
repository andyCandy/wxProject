
package org.tmforum.mtop.fmw.xsd.gen.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AliasNameListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AliasNameListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alias" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aliasName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="aliasValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "AliasNameListType", propOrder = {
    "alias"
})
public class AliasNameListType {

    @XmlElement(nillable = true)
    protected List<AliasNameListType.Alias> alias;

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AliasNameListType.Alias }
     * 
     * 
     */
    public List<AliasNameListType.Alias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<AliasNameListType.Alias>();
        }
        return this.alias;
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
     *         &lt;element name="aliasName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="aliasValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "aliasName",
        "aliasValue"
    })
    public static class Alias {

        @XmlElement(required = true)
        protected String aliasName;
        @XmlElement(required = true, nillable = true)
        protected String aliasValue;

        /**
         * 获取aliasName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAliasName() {
            return aliasName;
        }

        /**
         * 设置aliasName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAliasName(String value) {
            this.aliasName = value;
        }

        /**
         * 获取aliasValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAliasValue() {
            return aliasValue;
        }

        /**
         * 设置aliasValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAliasValue(String value) {
            this.aliasValue = value;
        }

    }

}
