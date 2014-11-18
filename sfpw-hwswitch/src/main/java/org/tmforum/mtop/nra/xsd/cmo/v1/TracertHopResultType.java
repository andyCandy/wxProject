
package org.tmforum.mtop.nra.xsd.cmo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TracertHopResultType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TracertHopResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packetSeq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="midIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rttMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rttAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rttMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lossPacketRatio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sendPackets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="receivedPackets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overRTDThresholdTimes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TracertHopResultType", propOrder = {
    "packetSeq",
    "midIp",
    "rttMin",
    "rttAvg",
    "rttMax",
    "lossPacketRatio",
    "sendPackets",
    "receivedPackets",
    "overRTDThresholdTimes"
})
public class TracertHopResultType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer packetSeq;
    @XmlElement(required = true, nillable = true)
    protected String midIp;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rttMin;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rttAvg;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rttMax;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer lossPacketRatio;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer sendPackets;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer receivedPackets;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer overRTDThresholdTimes;

    /**
     * 获取packetSeq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPacketSeq() {
        return packetSeq;
    }

    /**
     * 设置packetSeq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPacketSeq(Integer value) {
        this.packetSeq = value;
    }

    /**
     * 获取midIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidIp() {
        return midIp;
    }

    /**
     * 设置midIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidIp(String value) {
        this.midIp = value;
    }

    /**
     * 获取rttMin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRttMin() {
        return rttMin;
    }

    /**
     * 设置rttMin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRttMin(Integer value) {
        this.rttMin = value;
    }

    /**
     * 获取rttAvg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRttAvg() {
        return rttAvg;
    }

    /**
     * 设置rttAvg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRttAvg(Integer value) {
        this.rttAvg = value;
    }

    /**
     * 获取rttMax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRttMax() {
        return rttMax;
    }

    /**
     * 设置rttMax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRttMax(Integer value) {
        this.rttMax = value;
    }

    /**
     * 获取lossPacketRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLossPacketRatio() {
        return lossPacketRatio;
    }

    /**
     * 设置lossPacketRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLossPacketRatio(Integer value) {
        this.lossPacketRatio = value;
    }

    /**
     * 获取sendPackets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendPackets() {
        return sendPackets;
    }

    /**
     * 设置sendPackets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendPackets(Integer value) {
        this.sendPackets = value;
    }

    /**
     * 获取receivedPackets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceivedPackets() {
        return receivedPackets;
    }

    /**
     * 设置receivedPackets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceivedPackets(Integer value) {
        this.receivedPackets = value;
    }

    /**
     * 获取overRTDThresholdTimes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverRTDThresholdTimes() {
        return overRTDThresholdTimes;
    }

    /**
     * 设置overRTDThresholdTimes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverRTDThresholdTimes(Integer value) {
        this.overRTDThresholdTimes = value;
    }

}
