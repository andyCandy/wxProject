
package org.tmforum.mtop.mri.xsd.ancp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;


/**
 * <p>ANCPNeighborProfileType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ANCPNeighborProfileType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="profileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tpName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="maxAccessLoop" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="oamTimeOut" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="qosAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agingTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="handshakeTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tcpPortNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="suppressPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adjustFactory" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType" minOccurs="0"/>
 *         &lt;element name="lcTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANCPNeighborProfileType", propOrder = {
    "profileType",
    "state",
    "peerAddress",
    "tpName",
    "maxAccessLoop",
    "oamTimeOut",
    "qosAction",
    "agingTime",
    "handshakeTime",
    "tcpPortNo",
    "suppressPercent",
    "adjustFactory",
    "lcTime"
})
public class ANCPNeighborProfileType
    extends CommonResourceInfoType
{

    protected String profileType;
    protected String state;
    protected String peerAddress;
    protected NamingAttributeType tpName;
    protected Integer maxAccessLoop;
    protected Integer oamTimeOut;
    protected String qosAction;
    protected Integer agingTime;
    protected Integer handshakeTime;
    protected Integer tcpPortNo;
    protected Integer suppressPercent;
    protected NameAndValueStringListType adjustFactory;
    protected Integer lcTime;

    /**
     * 获取profileType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * 设置profileType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

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
     * 获取tpName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTpName() {
        return tpName;
    }

    /**
     * 设置tpName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTpName(NamingAttributeType value) {
        this.tpName = value;
    }

    /**
     * 获取maxAccessLoop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAccessLoop() {
        return maxAccessLoop;
    }

    /**
     * 设置maxAccessLoop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAccessLoop(Integer value) {
        this.maxAccessLoop = value;
    }

    /**
     * 获取oamTimeOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOamTimeOut() {
        return oamTimeOut;
    }

    /**
     * 设置oamTimeOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOamTimeOut(Integer value) {
        this.oamTimeOut = value;
    }

    /**
     * 获取qosAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosAction() {
        return qosAction;
    }

    /**
     * 设置qosAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosAction(String value) {
        this.qosAction = value;
    }

    /**
     * 获取agingTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgingTime() {
        return agingTime;
    }

    /**
     * 设置agingTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgingTime(Integer value) {
        this.agingTime = value;
    }

    /**
     * 获取handshakeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandshakeTime() {
        return handshakeTime;
    }

    /**
     * 设置handshakeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandshakeTime(Integer value) {
        this.handshakeTime = value;
    }

    /**
     * 获取tcpPortNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTcpPortNo() {
        return tcpPortNo;
    }

    /**
     * 设置tcpPortNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTcpPortNo(Integer value) {
        this.tcpPortNo = value;
    }

    /**
     * 获取suppressPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuppressPercent() {
        return suppressPercent;
    }

    /**
     * 设置suppressPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuppressPercent(Integer value) {
        this.suppressPercent = value;
    }

    /**
     * 获取adjustFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getAdjustFactory() {
        return adjustFactory;
    }

    /**
     * 设置adjustFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setAdjustFactory(NameAndValueStringListType value) {
        this.adjustFactory = value;
    }

    /**
     * 获取lcTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLcTime() {
        return lcTime;
    }

    /**
     * 设置lcTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLcTime(Integer value) {
        this.lcTime = value;
    }

}
