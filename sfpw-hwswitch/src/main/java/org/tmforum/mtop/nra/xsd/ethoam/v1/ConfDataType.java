
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConfDataType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsingleOrDualEnd���Ե�ֵ��
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
     * ����singleOrDualEnd���Ե�ֵ��
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
     * ��ȡlocalMepID���Ե�ֵ��
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
     * ����localMepID���Ե�ֵ��
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
     * ��ȡremoteMepID���Ե�ֵ��
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
     * ����remoteMepID���Ե�ֵ��
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
     * ��ȡmacAddress���Ե�ֵ��
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
     * ����macAddress���Ե�ֵ��
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
     * ��ȡsendInterval���Ե�ֵ��
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
     * ����sendInterval���Ե�ֵ��
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
     * ��ȡsendCount���Ե�ֵ��
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
     * ����sendCount���Ե�ֵ��
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
     * ��ȡpeerIP���Ե�ֵ��
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
     * ����peerIP���Ե�ֵ��
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
     * ��ȡvcID���Ե�ֵ��
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
     * ����vcID���Ե�ֵ��
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
     * ��ȡreceiveEnable���Ե�ֵ��
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
     * ����receiveEnable���Ե�ֵ��
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
     * ��ȡpriority8021P���Ե�ֵ��
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
     * ����priority8021P���Ե�ֵ��
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
