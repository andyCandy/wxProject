
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConfDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ConfDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleOrDualEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="localMepID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="remoteMepID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="macAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sendCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="peerIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vcID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="receiveEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="priority_8021p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfDataType", propOrder = {
    "singleOrDualEnd",
    "localMepID",
    "remoteMepID",
    "macAddress",
    "sendInterval",
    "sendCount",
    "peerIP",
    "vcID",
    "receiveEnable",
    "priority8021P"
})
public class ConfDataType {

    @XmlElement(required = true)
    protected String singleOrDualEnd;
    protected Integer localMepID;
    protected Integer remoteMepID;
    protected String macAddress;
    protected Integer sendInterval;
    protected Integer sendCount;
    protected String peerIP;
    protected Integer vcID;
    protected Boolean receiveEnable;
    @XmlElement(name = "priority_8021p")
    protected String priority8021P;

    /**
     * 获取singleOrDualEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleOrDualEnd() {
        return singleOrDualEnd;
    }

    /**
     * 设置singleOrDualEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleOrDualEnd(String value) {
        this.singleOrDualEnd = value;
    }

    /**
     * 获取localMepID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalMepID() {
        return localMepID;
    }

    /**
     * 设置localMepID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalMepID(Integer value) {
        this.localMepID = value;
    }

    /**
     * 获取remoteMepID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemoteMepID() {
        return remoteMepID;
    }

    /**
     * 设置remoteMepID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemoteMepID(Integer value) {
        this.remoteMepID = value;
    }

    /**
     * 获取macAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * 设置macAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * 获取sendInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendInterval() {
        return sendInterval;
    }

    /**
     * 设置sendInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendInterval(Integer value) {
        this.sendInterval = value;
    }

    /**
     * 获取sendCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendCount() {
        return sendCount;
    }

    /**
     * 设置sendCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendCount(Integer value) {
        this.sendCount = value;
    }

    /**
     * 获取peerIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerIP() {
        return peerIP;
    }

    /**
     * 设置peerIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerIP(String value) {
        this.peerIP = value;
    }

    /**
     * 获取vcID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVcID() {
        return vcID;
    }

    /**
     * 设置vcID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVcID(Integer value) {
        this.vcID = value;
    }

    /**
     * 获取receiveEnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveEnable() {
        return receiveEnable;
    }

    /**
     * 设置receiveEnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveEnable(Boolean value) {
        this.receiveEnable = value;
    }

    /**
     * 获取priority8021P属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority8021P() {
        return priority8021P;
    }

    /**
     * 设置priority8021P属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority8021P(String value) {
        this.priority8021P = value;
    }

}
