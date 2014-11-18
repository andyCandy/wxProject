
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;


/**
 * <p>BGPPeerType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BGPPeerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="peerAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="peerAsNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="peerAsNumberFourByte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ebgpMaxHop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passwordType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passwordText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="md5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keepaliveTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="holdTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bgpPeerParameters" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
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
@XmlType(name = "BGPPeerType", propOrder = {
    "peerAddress",
    "peerAsNumber",
    "peerAsNumberFourByte",
    "groupID",
    "groupName",
    "ebgpMaxHop",
    "passwordType",
    "passwordText",
    "md5",
    "keepaliveTime",
    "holdTime",
    "bgpPeerParameters",
    "action"
})
public class BGPPeerType {

    @XmlElement(required = true)
    protected String peerAddress;
    protected int peerAsNumber;
    @XmlElement(required = true)
    protected String peerAsNumberFourByte;
    @XmlElement(required = true)
    protected String groupID;
    @XmlElement(required = true)
    protected String groupName;
    protected int ebgpMaxHop;
    @XmlElement(required = true)
    protected String passwordType;
    @XmlElement(required = true)
    protected String passwordText;
    @XmlElement(required = true)
    protected String md5;
    protected int keepaliveTime;
    protected int holdTime;
    @XmlElement(required = true)
    protected NameAndValueStringListType bgpPeerParameters;
    @XmlElement(required = true)
    protected String action;

    /**
     * ��ȡpeerAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerAddress() {
        return peerAddress;
    }

    /**
     * ����peerAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerAddress(String value) {
        this.peerAddress = value;
    }

    /**
     * ��ȡpeerAsNumber���Ե�ֵ��
     * 
     */
    public int getPeerAsNumber() {
        return peerAsNumber;
    }

    /**
     * ����peerAsNumber���Ե�ֵ��
     * 
     */
    public void setPeerAsNumber(int value) {
        this.peerAsNumber = value;
    }

    /**
     * ��ȡpeerAsNumberFourByte���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerAsNumberFourByte() {
        return peerAsNumberFourByte;
    }

    /**
     * ����peerAsNumberFourByte���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerAsNumberFourByte(String value) {
        this.peerAsNumberFourByte = value;
    }

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
     * ��ȡmd5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMd5() {
        return md5;
    }

    /**
     * ����md5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMd5(String value) {
        this.md5 = value;
    }

    /**
     * ��ȡkeepaliveTime���Ե�ֵ��
     * 
     */
    public int getKeepaliveTime() {
        return keepaliveTime;
    }

    /**
     * ����keepaliveTime���Ե�ֵ��
     * 
     */
    public void setKeepaliveTime(int value) {
        this.keepaliveTime = value;
    }

    /**
     * ��ȡholdTime���Ե�ֵ��
     * 
     */
    public int getHoldTime() {
        return holdTime;
    }

    /**
     * ����holdTime���Ե�ֵ��
     * 
     */
    public void setHoldTime(int value) {
        this.holdTime = value;
    }

    /**
     * ��ȡbgpPeerParameters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getBgpPeerParameters() {
        return bgpPeerParameters;
    }

    /**
     * ����bgpPeerParameters���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setBgpPeerParameters(NameAndValueStringListType value) {
        this.bgpPeerParameters = value;
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
