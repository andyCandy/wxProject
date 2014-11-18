
package org.tmforum.mtop.nra.xsd.cmo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>EthLBCheckResultType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EthLBCheckResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="destType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sentPacketNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recPacketNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lostPacketNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lossRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxDelayTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="avgDelayTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minDelayTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sentBytesNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recBytesNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lostBytesNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalInfo" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EthLBCheckResultType", propOrder = {
    "objRef",
    "destType",
    "destValue",
    "result",
    "sentPacketNum",
    "recPacketNum",
    "lostPacketNum",
    "lossRate",
    "maxDelayTime",
    "avgDelayTime",
    "minDelayTime",
    "sentBytesNum",
    "recBytesNum",
    "lostBytesNum",
    "startTime",
    "endTime",
    "reason",
    "additionalInfo"
})
public class EthLBCheckResultType {

    @XmlElement(required = true)
    protected NamingAttributeType objRef;
    @XmlElement(required = true)
    protected String destType;
    @XmlElement(required = true)
    protected String destValue;
    protected Integer result;
    protected Integer sentPacketNum;
    protected Integer recPacketNum;
    protected Integer lostPacketNum;
    protected Integer lossRate;
    protected Integer maxDelayTime;
    protected Integer avgDelayTime;
    protected Integer minDelayTime;
    protected Integer sentBytesNum;
    protected Integer recBytesNum;
    protected Integer lostBytesNum;
    @XmlElement(required = true)
    protected String startTime;
    @XmlElement(required = true)
    protected String endTime;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected NameAndValueStringListType additionalInfo;

    /**
     * 获取objRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getObjRef() {
        return objRef;
    }

    /**
     * 设置objRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setObjRef(NamingAttributeType value) {
        this.objRef = value;
    }

    /**
     * 获取destType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestType() {
        return destType;
    }

    /**
     * 设置destType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestType(String value) {
        this.destType = value;
    }

    /**
     * 获取destValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestValue() {
        return destValue;
    }

    /**
     * 设置destValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestValue(String value) {
        this.destValue = value;
    }

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResult(Integer value) {
        this.result = value;
    }

    /**
     * 获取sentPacketNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSentPacketNum() {
        return sentPacketNum;
    }

    /**
     * 设置sentPacketNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSentPacketNum(Integer value) {
        this.sentPacketNum = value;
    }

    /**
     * 获取recPacketNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecPacketNum() {
        return recPacketNum;
    }

    /**
     * 设置recPacketNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecPacketNum(Integer value) {
        this.recPacketNum = value;
    }

    /**
     * 获取lostPacketNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLostPacketNum() {
        return lostPacketNum;
    }

    /**
     * 设置lostPacketNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLostPacketNum(Integer value) {
        this.lostPacketNum = value;
    }

    /**
     * 获取lossRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLossRate() {
        return lossRate;
    }

    /**
     * 设置lossRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLossRate(Integer value) {
        this.lossRate = value;
    }

    /**
     * 获取maxDelayTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDelayTime() {
        return maxDelayTime;
    }

    /**
     * 设置maxDelayTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDelayTime(Integer value) {
        this.maxDelayTime = value;
    }

    /**
     * 获取avgDelayTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgDelayTime() {
        return avgDelayTime;
    }

    /**
     * 设置avgDelayTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgDelayTime(Integer value) {
        this.avgDelayTime = value;
    }

    /**
     * 获取minDelayTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinDelayTime() {
        return minDelayTime;
    }

    /**
     * 设置minDelayTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDelayTime(Integer value) {
        this.minDelayTime = value;
    }

    /**
     * 获取sentBytesNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSentBytesNum() {
        return sentBytesNum;
    }

    /**
     * 设置sentBytesNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSentBytesNum(Integer value) {
        this.sentBytesNum = value;
    }

    /**
     * 获取recBytesNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecBytesNum() {
        return recBytesNum;
    }

    /**
     * 设置recBytesNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecBytesNum(Integer value) {
        this.recBytesNum = value;
    }

    /**
     * 获取lostBytesNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLostBytesNum() {
        return lostBytesNum;
    }

    /**
     * 设置lostBytesNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLostBytesNum(Integer value) {
        this.lostBytesNum = value;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * 获取reason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置reason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * 获取additionalInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * 设置additionalInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setAdditionalInfo(NameAndValueStringListType value) {
        this.additionalInfo = value;
    }

}
