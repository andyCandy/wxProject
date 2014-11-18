
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Level1ToLevel2Leaking complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Level1ToLevel2Leaking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level1ToLevel2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "Level1ToLevel2Leaking", propOrder = {
    "level1ToLevel2",
    "filterPolicyType",
    "filterPolicyVaule",
    "action"
})
public class Level1ToLevel2Leaking {

    protected boolean level1ToLevel2;
    @XmlElement(required = true)
    protected String filterPolicyType;
    @XmlElement(required = true)
    protected String filterPolicyVaule;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取level1ToLevel2属性的值。
     * 
     */
    public boolean isLevel1ToLevel2() {
        return level1ToLevel2;
    }

    /**
     * 设置level1ToLevel2属性的值。
     * 
     */
    public void setLevel1ToLevel2(boolean value) {
        this.level1ToLevel2 = value;
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
