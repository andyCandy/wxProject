
package org.tmforum.mtop.nra.xsd.ethoam.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>AdvancedConfType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取packetNumbers属性的值。
     * 
     */
    public int getPacketNumbers() {
        return packetNumbers;
    }

    /**
     * 设置packetNumbers属性的值。
     * 
     */
    public void setPacketNumbers(int value) {
        this.packetNumbers = value;
    }

    /**
     * 获取packetInterval属性的值。
     * 
     */
    public int getPacketInterval() {
        return packetInterval;
    }

    /**
     * 设置packetInterval属性的值。
     * 
     */
    public void setPacketInterval(int value) {
        this.packetInterval = value;
    }

    /**
     * 获取packetTimeout属性的值。
     * 
     */
    public int getPacketTimeout() {
        return packetTimeout;
    }

    /**
     * 设置packetTimeout属性的值。
     * 
     */
    public void setPacketTimeout(int value) {
        this.packetTimeout = value;
    }

    /**
     * 获取lossRatioThreshold属性的值。
     * 
     */
    public int getLossRatioThreshold() {
        return lossRatioThreshold;
    }

    /**
     * 设置lossRatioThreshold属性的值。
     * 
     */
    public void setLossRatioThreshold(int value) {
        this.lossRatioThreshold = value;
    }

    /**
     * 获取packetSize属性的值。
     * 
     */
    public int getPacketSize() {
        return packetSize;
    }

    /**
     * 设置packetSize属性的值。
     * 
     */
    public void setPacketSize(int value) {
        this.packetSize = value;
    }

    /**
     * 获取paddingData属性的值。
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
     * 设置paddingData属性的值。
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
     * 获取maxTTL属性的值。
     * 
     */
    public int getMaxTTL() {
        return maxTTL;
    }

    /**
     * 设置maxTTL属性的值。
     * 
     */
    public void setMaxTTL(int value) {
        this.maxTTL = value;
    }

    /**
     * 获取dsDomain属性的值。
     * 
     */
    public int getDsDomain() {
        return dsDomain;
    }

    /**
     * 设置dsDomain属性的值。
     * 
     */
    public void setDsDomain(int value) {
        this.dsDomain = value;
    }

    /**
     * 获取rtdThreshold属性的值。
     * 
     */
    public int getRtdThreshold() {
        return rtdThreshold;
    }

    /**
     * 设置rtdThreshold属性的值。
     * 
     */
    public void setRtdThreshold(int value) {
        this.rtdThreshold = value;
    }

    /**
     * 获取outboundInterface属性的值。
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
     * 设置outboundInterface属性的值。
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
     * 获取responseAddress属性的值。
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
     * 设置responseAddress属性的值。
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
     * 获取passRoutingTable属性的值。
     * 
     */
    public boolean isPassRoutingTable() {
        return passRoutingTable;
    }

    /**
     * 设置passRoutingTable属性的值。
     * 
     */
    public void setPassRoutingTable(boolean value) {
        this.passRoutingTable = value;
    }

    /**
     * 获取maxSuccessiveErrors属性的值。
     * 
     */
    public int getMaxSuccessiveErrors() {
        return maxSuccessiveErrors;
    }

    /**
     * 设置maxSuccessiveErrors属性的值。
     * 
     */
    public void setMaxSuccessiveErrors(int value) {
        this.maxSuccessiveErrors = value;
    }

    /**
     * 获取packetFrag属性的值。
     * 
     */
    public boolean isPacketFrag() {
        return packetFrag;
    }

    /**
     * 设置packetFrag属性的值。
     * 
     */
    public void setPacketFrag(boolean value) {
        this.packetFrag = value;
    }

    /**
     * 获取destinationPort属性的值。
     * 
     */
    public int getDestinationPort() {
        return destinationPort;
    }

    /**
     * 设置destinationPort属性的值。
     * 
     */
    public void setDestinationPort(int value) {
        this.destinationPort = value;
    }

    /**
     * 获取initialTTL属性的值。
     * 
     */
    public int getInitialTTL() {
        return initialTTL;
    }

    /**
     * 设置initialTTL属性的值。
     * 
     */
    public void setInitialTTL(int value) {
        this.initialTTL = value;
    }

    /**
     * 获取pathIdentification属性的值。
     * 
     */
    public boolean isPathIdentification() {
        return pathIdentification;
    }

    /**
     * 设置pathIdentification属性的值。
     * 
     */
    public void setPathIdentification(boolean value) {
        this.pathIdentification = value;
    }

    /**
     * 获取packetPriority属性的值。
     * 
     */
    public int getPacketPriority() {
        return packetPriority;
    }

    /**
     * 设置packetPriority属性的值。
     * 
     */
    public void setPacketPriority(int value) {
        this.packetPriority = value;
    }

    /**
     * 获取responseMode属性的值。
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
     * 设置responseMode属性的值。
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
     * 获取paddingIPAddress属性的值。
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
     * 设置paddingIPAddress属性的值。
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
