
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>TestCaseResultInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TestCaseResultInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testCaseName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="testCaseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="execBeginTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="execEndTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="rTDOverThresholds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rttAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rttMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rttMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeouts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="initFailureNums" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lossPackets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="receivePackets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sendPackets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lostPacketRatio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestCaseResultInfoType", propOrder = {
    "testCaseName",
    "testCaseType",
    "execBeginTime",
    "execEndTime",
    "rtdOverThresholds",
    "rttAvg",
    "rttMin",
    "rttMax",
    "timeouts",
    "initFailureNums",
    "lossPackets",
    "receivePackets",
    "sendPackets",
    "lostPacketRatio"
})
public class TestCaseResultInfoType {

    @XmlElement(required = true)
    protected NamingAttributeType testCaseName;
    @XmlElement(required = true)
    protected String testCaseType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object execBeginTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object execEndTime;
    @XmlElement(name = "rTDOverThresholds")
    protected int rtdOverThresholds;
    protected int rttAvg;
    protected int rttMin;
    protected int rttMax;
    protected int timeouts;
    protected int initFailureNums;
    protected int lossPackets;
    protected int receivePackets;
    protected int sendPackets;
    protected int lostPacketRatio;

    /**
     * 获取testCaseName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTestCaseName() {
        return testCaseName;
    }

    /**
     * 设置testCaseName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTestCaseName(NamingAttributeType value) {
        this.testCaseName = value;
    }

    /**
     * 获取testCaseType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCaseType() {
        return testCaseType;
    }

    /**
     * 设置testCaseType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCaseType(String value) {
        this.testCaseType = value;
    }

    /**
     * 获取execBeginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExecBeginTime() {
        return execBeginTime;
    }

    /**
     * 设置execBeginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExecBeginTime(Object value) {
        this.execBeginTime = value;
    }

    /**
     * 获取execEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExecEndTime() {
        return execEndTime;
    }

    /**
     * 设置execEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExecEndTime(Object value) {
        this.execEndTime = value;
    }

    /**
     * 获取rtdOverThresholds属性的值。
     * 
     */
    public int getRTDOverThresholds() {
        return rtdOverThresholds;
    }

    /**
     * 设置rtdOverThresholds属性的值。
     * 
     */
    public void setRTDOverThresholds(int value) {
        this.rtdOverThresholds = value;
    }

    /**
     * 获取rttAvg属性的值。
     * 
     */
    public int getRttAvg() {
        return rttAvg;
    }

    /**
     * 设置rttAvg属性的值。
     * 
     */
    public void setRttAvg(int value) {
        this.rttAvg = value;
    }

    /**
     * 获取rttMin属性的值。
     * 
     */
    public int getRttMin() {
        return rttMin;
    }

    /**
     * 设置rttMin属性的值。
     * 
     */
    public void setRttMin(int value) {
        this.rttMin = value;
    }

    /**
     * 获取rttMax属性的值。
     * 
     */
    public int getRttMax() {
        return rttMax;
    }

    /**
     * 设置rttMax属性的值。
     * 
     */
    public void setRttMax(int value) {
        this.rttMax = value;
    }

    /**
     * 获取timeouts属性的值。
     * 
     */
    public int getTimeouts() {
        return timeouts;
    }

    /**
     * 设置timeouts属性的值。
     * 
     */
    public void setTimeouts(int value) {
        this.timeouts = value;
    }

    /**
     * 获取initFailureNums属性的值。
     * 
     */
    public int getInitFailureNums() {
        return initFailureNums;
    }

    /**
     * 设置initFailureNums属性的值。
     * 
     */
    public void setInitFailureNums(int value) {
        this.initFailureNums = value;
    }

    /**
     * 获取lossPackets属性的值。
     * 
     */
    public int getLossPackets() {
        return lossPackets;
    }

    /**
     * 设置lossPackets属性的值。
     * 
     */
    public void setLossPackets(int value) {
        this.lossPackets = value;
    }

    /**
     * 获取receivePackets属性的值。
     * 
     */
    public int getReceivePackets() {
        return receivePackets;
    }

    /**
     * 设置receivePackets属性的值。
     * 
     */
    public void setReceivePackets(int value) {
        this.receivePackets = value;
    }

    /**
     * 获取sendPackets属性的值。
     * 
     */
    public int getSendPackets() {
        return sendPackets;
    }

    /**
     * 设置sendPackets属性的值。
     * 
     */
    public void setSendPackets(int value) {
        this.sendPackets = value;
    }

    /**
     * 获取lostPacketRatio属性的值。
     * 
     */
    public int getLostPacketRatio() {
        return lostPacketRatio;
    }

    /**
     * 设置lostPacketRatio属性的值。
     * 
     */
    public void setLostPacketRatio(int value) {
        this.lostPacketRatio = value;
    }

}
