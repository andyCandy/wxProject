
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>TestCaseResultInfoType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtestCaseName���Ե�ֵ��
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
     * ����testCaseName���Ե�ֵ��
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
     * ��ȡtestCaseType���Ե�ֵ��
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
     * ����testCaseType���Ե�ֵ��
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
     * ��ȡexecBeginTime���Ե�ֵ��
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
     * ����execBeginTime���Ե�ֵ��
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
     * ��ȡexecEndTime���Ե�ֵ��
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
     * ����execEndTime���Ե�ֵ��
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
     * ��ȡrtdOverThresholds���Ե�ֵ��
     * 
     */
    public int getRTDOverThresholds() {
        return rtdOverThresholds;
    }

    /**
     * ����rtdOverThresholds���Ե�ֵ��
     * 
     */
    public void setRTDOverThresholds(int value) {
        this.rtdOverThresholds = value;
    }

    /**
     * ��ȡrttAvg���Ե�ֵ��
     * 
     */
    public int getRttAvg() {
        return rttAvg;
    }

    /**
     * ����rttAvg���Ե�ֵ��
     * 
     */
    public void setRttAvg(int value) {
        this.rttAvg = value;
    }

    /**
     * ��ȡrttMin���Ե�ֵ��
     * 
     */
    public int getRttMin() {
        return rttMin;
    }

    /**
     * ����rttMin���Ե�ֵ��
     * 
     */
    public void setRttMin(int value) {
        this.rttMin = value;
    }

    /**
     * ��ȡrttMax���Ե�ֵ��
     * 
     */
    public int getRttMax() {
        return rttMax;
    }

    /**
     * ����rttMax���Ե�ֵ��
     * 
     */
    public void setRttMax(int value) {
        this.rttMax = value;
    }

    /**
     * ��ȡtimeouts���Ե�ֵ��
     * 
     */
    public int getTimeouts() {
        return timeouts;
    }

    /**
     * ����timeouts���Ե�ֵ��
     * 
     */
    public void setTimeouts(int value) {
        this.timeouts = value;
    }

    /**
     * ��ȡinitFailureNums���Ե�ֵ��
     * 
     */
    public int getInitFailureNums() {
        return initFailureNums;
    }

    /**
     * ����initFailureNums���Ե�ֵ��
     * 
     */
    public void setInitFailureNums(int value) {
        this.initFailureNums = value;
    }

    /**
     * ��ȡlossPackets���Ե�ֵ��
     * 
     */
    public int getLossPackets() {
        return lossPackets;
    }

    /**
     * ����lossPackets���Ե�ֵ��
     * 
     */
    public void setLossPackets(int value) {
        this.lossPackets = value;
    }

    /**
     * ��ȡreceivePackets���Ե�ֵ��
     * 
     */
    public int getReceivePackets() {
        return receivePackets;
    }

    /**
     * ����receivePackets���Ե�ֵ��
     * 
     */
    public void setReceivePackets(int value) {
        this.receivePackets = value;
    }

    /**
     * ��ȡsendPackets���Ե�ֵ��
     * 
     */
    public int getSendPackets() {
        return sendPackets;
    }

    /**
     * ����sendPackets���Ե�ֵ��
     * 
     */
    public void setSendPackets(int value) {
        this.sendPackets = value;
    }

    /**
     * ��ȡlostPacketRatio���Ե�ֵ��
     * 
     */
    public int getLostPacketRatio() {
        return lostPacketRatio;
    }

    /**
     * ����lostPacketRatio���Ե�ֵ��
     * 
     */
    public void setLostPacketRatio(int value) {
        this.lostPacketRatio = value;
    }

}
