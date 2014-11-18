
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BGPPgType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡgroupID���Ե�ֵ��
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
     * ����groupID���Ե�ֵ��
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
     * ��ȡgroupName���Ե�ֵ��
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
     * ����groupName���Ե�ֵ��
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
     * ��ȡgrType���Ե�ֵ��
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
     * ����grType���Ե�ֵ��
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
     * ��ȡgrAsNumber���Ե�ֵ��
     * 
     */
    public int getGrAsNumber() {
        return grAsNumber;
    }

    /**
     * ����grAsNumber���Ե�ֵ��
     * 
     */
    public void setGrAsNumber(int value) {
        this.grAsNumber = value;
    }

    /**
     * ��ȡgrAsNumberFourByte���Ե�ֵ��
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
     * ����grAsNumberFourByte���Ե�ֵ��
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
     * ��ȡebgpMaxHop���Ե�ֵ��
     * 
     */
    public int getEbgpMaxHop() {
        return ebgpMaxHop;
    }

    /**
     * ����ebgpMaxHop���Ե�ֵ��
     * 
     */
    public void setEbgpMaxHop(int value) {
        this.ebgpMaxHop = value;
    }

    /**
     * ��ȡpasswordType���Ե�ֵ��
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
     * ����passwordType���Ե�ֵ��
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
     * ��ȡpasswordText���Ե�ֵ��
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
     * ����passwordText���Ե�ֵ��
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
     * ��ȡaction���Ե�ֵ��
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
     * ����action���Ե�ֵ��
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
