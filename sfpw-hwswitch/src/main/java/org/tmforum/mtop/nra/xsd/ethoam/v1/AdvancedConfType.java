
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>AdvancedConfType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AdvancedConfType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packetNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="packetInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="packetTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lossRatioThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="packetSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paddingData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxTTL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dsDomain" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rtdThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outboundInterface" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="responseAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passRoutingTable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxSuccessiveErrors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="packetFrag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="destinationPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="initialTTL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pathIdentification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="packetPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="responseMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paddingIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvancedConfType", propOrder = {
    "packetNumbers",
    "packetInterval",
    "packetTimeout",
    "lossRatioThreshold",
    "packetSize",
    "paddingData",
    "maxTTL",
    "dsDomain",
    "rtdThreshold",
    "outboundInterface",
    "responseAddress",
    "passRoutingTable",
    "maxSuccessiveErrors",
    "packetFrag",
    "destinationPort",
    "initialTTL",
    "pathIdentification",
    "packetPriority",
    "responseMode",
    "paddingIPAddress"
})
public class AdvancedConfType {

    protected int packetNumbers;
    protected int packetInterval;
    protected int packetTimeout;
    protected int lossRatioThreshold;
    protected int packetSize;
    @XmlElement(required = true)
    protected String paddingData;
    protected int maxTTL;
    protected int dsDomain;
    protected int rtdThreshold;
    @XmlElement(required = true)
    protected NamingAttributeType outboundInterface;
    @XmlElement(required = true)
    protected String responseAddress;
    protected boolean passRoutingTable;
    protected int maxSuccessiveErrors;
    protected boolean packetFrag;
    protected int destinationPort;
    protected int initialTTL;
    protected boolean pathIdentification;
    protected int packetPriority;
    @XmlElement(required = true)
    protected String responseMode;
    @XmlElement(required = true)
    protected String paddingIPAddress;

    /**
     * ��ȡpacketNumbers���Ե�ֵ��
     * 
     */
    public int getPacketNumbers() {
        return packetNumbers;
    }

    /**
     * ����packetNumbers���Ե�ֵ��
     * 
     */
    public void setPacketNumbers(int value) {
        this.packetNumbers = value;
    }

    /**
     * ��ȡpacketInterval���Ե�ֵ��
     * 
     */
    public int getPacketInterval() {
        return packetInterval;
    }

    /**
     * ����packetInterval���Ե�ֵ��
     * 
     */
    public void setPacketInterval(int value) {
        this.packetInterval = value;
    }

    /**
     * ��ȡpacketTimeout���Ե�ֵ��
     * 
     */
    public int getPacketTimeout() {
        return packetTimeout;
    }

    /**
     * ����packetTimeout���Ե�ֵ��
     * 
     */
    public void setPacketTimeout(int value) {
        this.packetTimeout = value;
    }

    /**
     * ��ȡlossRatioThreshold���Ե�ֵ��
     * 
     */
    public int getLossRatioThreshold() {
        return lossRatioThreshold;
    }

    /**
     * ����lossRatioThreshold���Ե�ֵ��
     * 
     */
    public void setLossRatioThreshold(int value) {
        this.lossRatioThreshold = value;
    }

    /**
     * ��ȡpacketSize���Ե�ֵ��
     * 
     */
    public int getPacketSize() {
        return packetSize;
    }

    /**
     * ����packetSize���Ե�ֵ��
     * 
     */
    public void setPacketSize(int value) {
        this.packetSize = value;
    }

    /**
     * ��ȡpaddingData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingData() {
        return paddingData;
    }

    /**
     * ����paddingData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingData(String value) {
        this.paddingData = value;
    }

    /**
     * ��ȡmaxTTL���Ե�ֵ��
     * 
     */
    public int getMaxTTL() {
        return maxTTL;
    }

    /**
     * ����maxTTL���Ե�ֵ��
     * 
     */
    public void setMaxTTL(int value) {
        this.maxTTL = value;
    }

    /**
     * ��ȡdsDomain���Ե�ֵ��
     * 
     */
    public int getDsDomain() {
        return dsDomain;
    }

    /**
     * ����dsDomain���Ե�ֵ��
     * 
     */
    public void setDsDomain(int value) {
        this.dsDomain = value;
    }

    /**
     * ��ȡrtdThreshold���Ե�ֵ��
     * 
     */
    public int getRtdThreshold() {
        return rtdThreshold;
    }

    /**
     * ����rtdThreshold���Ե�ֵ��
     * 
     */
    public void setRtdThreshold(int value) {
        this.rtdThreshold = value;
    }

    /**
     * ��ȡoutboundInterface���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getOutboundInterface() {
        return outboundInterface;
    }

    /**
     * ����outboundInterface���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setOutboundInterface(NamingAttributeType value) {
        this.outboundInterface = value;
    }

    /**
     * ��ȡresponseAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseAddress() {
        return responseAddress;
    }

    /**
     * ����responseAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseAddress(String value) {
        this.responseAddress = value;
    }

    /**
     * ��ȡpassRoutingTable���Ե�ֵ��
     * 
     */
    public boolean isPassRoutingTable() {
        return passRoutingTable;
    }

    /**
     * ����passRoutingTable���Ե�ֵ��
     * 
     */
    public void setPassRoutingTable(boolean value) {
        this.passRoutingTable = value;
    }

    /**
     * ��ȡmaxSuccessiveErrors���Ե�ֵ��
     * 
     */
    public int getMaxSuccessiveErrors() {
        return maxSuccessiveErrors;
    }

    /**
     * ����maxSuccessiveErrors���Ե�ֵ��
     * 
     */
    public void setMaxSuccessiveErrors(int value) {
        this.maxSuccessiveErrors = value;
    }

    /**
     * ��ȡpacketFrag���Ե�ֵ��
     * 
     */
    public boolean isPacketFrag() {
        return packetFrag;
    }

    /**
     * ����packetFrag���Ե�ֵ��
     * 
     */
    public void setPacketFrag(boolean value) {
        this.packetFrag = value;
    }

    /**
     * ��ȡdestinationPort���Ե�ֵ��
     * 
     */
    public int getDestinationPort() {
        return destinationPort;
    }

    /**
     * ����destinationPort���Ե�ֵ��
     * 
     */
    public void setDestinationPort(int value) {
        this.destinationPort = value;
    }

    /**
     * ��ȡinitialTTL���Ե�ֵ��
     * 
     */
    public int getInitialTTL() {
        return initialTTL;
    }

    /**
     * ����initialTTL���Ե�ֵ��
     * 
     */
    public void setInitialTTL(int value) {
        this.initialTTL = value;
    }

    /**
     * ��ȡpathIdentification���Ե�ֵ��
     * 
     */
    public boolean isPathIdentification() {
        return pathIdentification;
    }

    /**
     * ����pathIdentification���Ե�ֵ��
     * 
     */
    public void setPathIdentification(boolean value) {
        this.pathIdentification = value;
    }

    /**
     * ��ȡpacketPriority���Ե�ֵ��
     * 
     */
    public int getPacketPriority() {
        return packetPriority;
    }

    /**
     * ����packetPriority���Ե�ֵ��
     * 
     */
    public void setPacketPriority(int value) {
        this.packetPriority = value;
    }

    /**
     * ��ȡresponseMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMode() {
        return responseMode;
    }

    /**
     * ����responseMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMode(String value) {
        this.responseMode = value;
    }

    /**
     * ��ȡpaddingIPAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingIPAddress() {
        return paddingIPAddress;
    }

    /**
     * ����paddingIPAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingIPAddress(String value) {
        this.paddingIPAddress = value;
    }

}
