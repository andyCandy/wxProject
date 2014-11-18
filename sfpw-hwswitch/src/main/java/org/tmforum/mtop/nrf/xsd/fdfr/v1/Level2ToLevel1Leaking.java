
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Level2ToLevel1Leaking complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Level2ToLevel1Leaking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level2ToLevel1" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filterPolicyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterPolicyVaule" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Level2ToLevel1Leaking", propOrder = {
    "level2ToLevel1",
    "filterPolicyType",
    "filterPolicyVaule",
    "action"
})
public class Level2ToLevel1Leaking {

    protected boolean level2ToLevel1;
    @XmlElement(required = true)
    protected String filterPolicyType;
    @XmlElement(required = true)
    protected String filterPolicyVaule;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取level2ToLevel1属性的值。
     * 
     */
    public boolean isLevel2ToLevel1() {
        return level2ToLevel1;
    }

    /**
     * 设置level2ToLevel1属性的值。
     * 
     */
    public void setLevel2ToLevel1(boolean value) {
        this.level2ToLevel1 = value;
    }

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
     * 获取filterPolicyVaule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterPolicyVaule() {
        return filterPolicyVaule;
    }

    /**
     * 设置filterPolicyVaule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterPolicyVaule(String value) {
        this.filterPolicyVaule = value;
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
