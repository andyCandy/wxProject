
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>TunnelSelectionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TunnelSelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tnlPolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tnlName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="tnlDynSel" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}TunnelDynSelType"/>
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
@XmlType(name = "TunnelSelectionType", propOrder = {
    "type",
    "tnlPolicy",
    "tnlName",
    "tnlDynSel",
    "action"
})
public class TunnelSelectionType {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String tnlPolicy;
    @XmlElement(required = true)
    protected NamingAttributeType tnlName;
    @XmlElement(required = true)
    protected TunnelDynSelType tnlDynSel;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取tnlPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnlPolicy() {
        return tnlPolicy;
    }

    /**
     * 设置tnlPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnlPolicy(String value) {
        this.tnlPolicy = value;
    }

    /**
     * 获取tnlName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTnlName() {
        return tnlName;
    }

    /**
     * 设置tnlName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTnlName(NamingAttributeType value) {
        this.tnlName = value;
    }

    /**
     * 获取tnlDynSel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TunnelDynSelType }
     *     
     */
    public TunnelDynSelType getTnlDynSel() {
        return tnlDynSel;
    }

    /**
     * 设置tnlDynSel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TunnelDynSelType }
     *     
     */
    public void setTnlDynSel(TunnelDynSelType value) {
        this.tnlDynSel = value;
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
