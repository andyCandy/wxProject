
package org.tmforum.mtop.nra.xsd.cmo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>EthLTCheckHopResultType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡhops���Ե�ֵ��
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
     * ����hops���Ե�ֵ��
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
     * ��ȡmac���Ե�ֵ��
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
     * ����mac���Ե�ֵ��
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
     * ��ȡingressPortIndex���Ե�ֵ��
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
     * ����ingressPortIndex���Ե�ֵ��
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
     * ��ȡingressAction���Ե�ֵ��
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
     * ����ingressAction���Ե�ֵ��
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
     * ��ȡreplyAction���Ե�ֵ��
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
     * ����replyAction���Ե�ֵ��
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
     * ��ȡforwarded���Ե�ֵ��
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
     * ����forwarded���Ե�ֵ��
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
     * ��ȡegressPortIndex���Ե�ֵ��
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
     * ����egressPortIndex���Ե�ֵ��
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
     * ��ȡegressAction���Ե�ֵ��
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
     * ����egressAction���Ե�ֵ��
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
     * ��ȡisMep���Ե�ֵ��
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
     * ����isMep���Ե�ֵ��
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
     * ��ȡrspLSRIP���Ե�ֵ��
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
     * ����rspLSRIP���Ե�ֵ��
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
     * ��ȡadditionalInfo���Ե�ֵ��
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
     * ����additionalInfo���Ե�ֵ��
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
