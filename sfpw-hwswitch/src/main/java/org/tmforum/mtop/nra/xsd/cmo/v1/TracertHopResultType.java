
package org.tmforum.mtop.nra.xsd.cmo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TracertHopResultType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpacketSeq���Ե�ֵ��
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
     * ����packetSeq���Ե�ֵ��
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
     * ��ȡmidIp���Ե�ֵ��
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
     * ����midIp���Ե�ֵ��
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
     * ��ȡrttMin���Ե�ֵ��
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
     * ����rttMin���Ե�ֵ��
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
     * ��ȡrttAvg���Ե�ֵ��
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
     * ����rttAvg���Ե�ֵ��
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
     * ��ȡrttMax���Ե�ֵ��
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
     * ����rttMax���Ե�ֵ��
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
     * ��ȡlossPacketRatio���Ե�ֵ��
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
     * ����lossPacketRatio���Ե�ֵ��
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
     * ��ȡsendPackets���Ե�ֵ��
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
     * ����sendPackets���Ե�ֵ��
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
     * ��ȡreceivedPackets���Ե�ֵ��
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
     * ����receivedPackets���Ե�ֵ��
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
     * ��ȡoverRTDThresholdTimes���Ե�ֵ��
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
     * ����overRTDThresholdTimes���Ե�ֵ��
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
