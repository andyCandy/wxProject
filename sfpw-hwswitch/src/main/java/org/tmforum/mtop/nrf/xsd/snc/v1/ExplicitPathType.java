
package org.tmforum.mtop.nrf.xsd.snc.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>ExplicitPathType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExplicitPathType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="epHopList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="epHop" type="{http://www.tmforum.org/mtop/nrf/xsd/snc/v1}ExplicitPathHopType" maxOccurs="unbounded"/>
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
@XmlType(name = "ExplicitPathType", propOrder = {
    "name",
    "epHopList"
})
public class ExplicitPathType {

    @XmlElement(required = true)
    protected NamingAttributeType name;
    @XmlElement(required = true)
    protected ExplicitPathType.EpHopList epHopList;

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
     * 获取epHopList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExplicitPathType.EpHopList }
     *     
     */
    public ExplicitPathType.EpHopList getEpHopList() {
        return epHopList;
    }

    /**
     * 设置epHopList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExplicitPathType.EpHopList }
     *     
     */
    public void setEpHopList(ExplicitPathType.EpHopList value) {
        this.epHopList = value;
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
     *         &lt;element name="epHop" type="{http://www.tmforum.org/mtop/nrf/xsd/snc/v1}ExplicitPathHopType" maxOccurs="unbounded"/>
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
        "epHop"
    })
    public static class EpHopList {

        @XmlElement(required = true)
        protected List<ExplicitPathHopType> epHop;

        /**
         * Gets the value of the epHop property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the epHop property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEpHop().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExplicitPathHopType }
         * 
         * 
         */
        public List<ExplicitPathHopType> getEpHop() {
            if (epHop == null) {
                epHop = new ArrayList<ExplicitPathHopType>();
            }
            return this.epHop;
        }

    }

}
