
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;


/**
 * <p>BGPPeerType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取peerAddress属性的值。
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
     * 设置peerAddress属性的值。
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
     * 获取peerAsNumber属性的值。
     * 
     */
    public int getPeerAsNumber() {
        return peerAsNumber;
    }

    /**
     * 设置peerAsNumber属性的值。
     * 
     */
    public void setPeerAsNumber(int value) {
        this.peerAsNumber = value;
    }

    /**
     * 获取peerAsNumberFourByte属性的值。
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
     * 设置peerAsNumberFourByte属性的值。
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
     * 获取md5属性的值。
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
     * 设置md5属性的值。
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
     * 获取keepaliveTime属性的值。
     * 
     */
    public int getKeepaliveTime() {
        return keepaliveTime;
    }

    /**
     * 设置keepaliveTime属性的值。
     * 
     */
    public void setKeepaliveTime(int value) {
        this.keepaliveTime = value;
    }

    /**
     * 获取holdTime属性的值。
     * 
     */
    public int getHoldTime() {
        return holdTime;
    }

    /**
     * 设置holdTime属性的值。
     * 
     */
    public void setHoldTime(int value) {
        this.holdTime = value;
    }

    /**
     * 获取bgpPeerParameters属性的值。
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
     * 设置bgpPeerParameters属性的值。
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
