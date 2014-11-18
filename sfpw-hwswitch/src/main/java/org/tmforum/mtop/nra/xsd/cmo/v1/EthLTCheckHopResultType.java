
package org.tmforum.mtop.nra.xsd.cmo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>EthLTCheckHopResultType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EthLTCheckHopResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingressPortIndex" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="ingressAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replyAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forwarded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="egressPortIndex" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="egressAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rspLSRIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "EthLTCheckHopResultType", propOrder = {
    "hops",
    "mac",
    "ingressPortIndex",
    "ingressAction",
    "replyAction",
    "forwarded",
    "egressPortIndex",
    "egressAction",
    "isMep",
    "rspLSRIP",
    "additionalInfo"
})
public class EthLTCheckHopResultType {

    protected Integer hops;
    protected String mac;
    @XmlElement(required = true)
    protected NamingAttributeType ingressPortIndex;
    protected String ingressAction;
    protected String replyAction;
    protected String forwarded;
    @XmlElement(required = true)
    protected NamingAttributeType egressPortIndex;
    protected String egressAction;
    @XmlElement(required = true)
    protected String isMep;
    @XmlElement(required = true)
    protected String rspLSRIP;
    @XmlElement(required = true)
    protected NameAndValueStringListType additionalInfo;

    /**
     * 获取hops属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHops() {
        return hops;
    }

    /**
     * 设置hops属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHops(Integer value) {
        this.hops = value;
    }

    /**
     * 获取mac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * 设置mac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * 获取ingressPortIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getIngressPortIndex() {
        return ingressPortIndex;
    }

    /**
     * 设置ingressPortIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setIngressPortIndex(NamingAttributeType value) {
        this.ingressPortIndex = value;
    }

    /**
     * 获取ingressAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngressAction() {
        return ingressAction;
    }

    /**
     * 设置ingressAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngressAction(String value) {
        this.ingressAction = value;
    }

    /**
     * 获取replyAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyAction() {
        return replyAction;
    }

    /**
     * 设置replyAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyAction(String value) {
        this.replyAction = value;
    }

    /**
     * 获取forwarded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwarded() {
        return forwarded;
    }

    /**
     * 设置forwarded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwarded(String value) {
        this.forwarded = value;
    }

    /**
     * 获取egressPortIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getEgressPortIndex() {
        return egressPortIndex;
    }

    /**
     * 设置egressPortIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setEgressPortIndex(NamingAttributeType value) {
        this.egressPortIndex = value;
    }

    /**
     * 获取egressAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgressAction() {
        return egressAction;
    }

    /**
     * 设置egressAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgressAction(String value) {
        this.egressAction = value;
    }

    /**
     * 获取isMep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMep() {
        return isMep;
    }

    /**
     * 设置isMep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMep(String value) {
        this.isMep = value;
    }

    /**
     * 获取rspLSRIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspLSRIP() {
        return rspLSRIP;
    }

    /**
     * 设置rspLSRIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspLSRIP(String value) {
        this.rspLSRIP = value;
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
