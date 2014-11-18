
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BGPPgType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BGPPgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grAsNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grAsNumberFourByte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ebgpMaxHop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passwordType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passwordText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "BGPPgType", propOrder = {
    "groupID",
    "groupName",
    "grType",
    "grAsNumber",
    "grAsNumberFourByte",
    "ebgpMaxHop",
    "passwordType",
    "passwordText",
    "action"
})
public class BGPPgType {

    @XmlElement(required = true)
    protected String groupID;
    @XmlElement(required = true)
    protected String groupName;
    @XmlElement(required = true)
    protected String grType;
    protected int grAsNumber;
    @XmlElement(required = true)
    protected String grAsNumberFourByte;
    protected int ebgpMaxHop;
    @XmlElement(required = true)
    protected String passwordType;
    @XmlElement(required = true)
    protected String passwordText;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取groupID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * 设置groupID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * 获取groupName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置groupName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * 获取grType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrType() {
        return grType;
    }

    /**
     * 设置grType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrType(String value) {
        this.grType = value;
    }

    /**
     * 获取grAsNumber属性的值。
     * 
     */
    public int getGrAsNumber() {
        return grAsNumber;
    }

    /**
     * 设置grAsNumber属性的值。
     * 
     */
    public void setGrAsNumber(int value) {
        this.grAsNumber = value;
    }

    /**
     * 获取grAsNumberFourByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrAsNumberFourByte() {
        return grAsNumberFourByte;
    }

    /**
     * 设置grAsNumberFourByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrAsNumberFourByte(String value) {
        this.grAsNumberFourByte = value;
    }

    /**
     * 获取ebgpMaxHop属性的值。
     * 
     */
    public int getEbgpMaxHop() {
        return ebgpMaxHop;
    }

    /**
     * 设置ebgpMaxHop属性的值。
     * 
     */
    public void setEbgpMaxHop(int value) {
        this.ebgpMaxHop = value;
    }

    /**
     * 获取passwordType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordType() {
        return passwordType;
    }

    /**
     * 设置passwordType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordType(String value) {
        this.passwordType = value;
    }

    /**
     * 获取passwordText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordText() {
        return passwordText;
    }

    /**
     * 设置passwordText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordText(String value) {
        this.passwordText = value;
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
