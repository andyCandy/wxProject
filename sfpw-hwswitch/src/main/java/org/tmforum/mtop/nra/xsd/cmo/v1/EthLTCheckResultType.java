
package org.tmforum.mtop.nra.xsd.cmo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>EthLTCheckResultType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EthLTCheckResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="destType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hopList" type="{http://www.tmforum.org/mtop/nra/xsd/cmo/v1}EthLTCheckHopResultListType"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "EthLTCheckResultType", propOrder = {
    "objRef",
    "destType",
    "destValue",
    "hopList",
    "result",
    "reason",
    "additionalInfo"
})
public class EthLTCheckResultType {

    protected NamingAttributeType objRef;
    @XmlElement(required = true)
    protected String destType;
    @XmlElement(required = true)
    protected String destValue;
    @XmlElement(required = true)
    protected EthLTCheckHopResultListType hopList;
    protected Integer result;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected NameAndValueStringListType additionalInfo;

    /**
     * ��ȡobjRef���Ե�ֵ��
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
     * ����objRef���Ե�ֵ��
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
     * ��ȡdestType���Ե�ֵ��
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
     * ����destType���Ե�ֵ��
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
     * ��ȡdestValue���Ե�ֵ��
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
     * ����destValue���Ե�ֵ��
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
     * ��ȡhopList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EthLTCheckHopResultListType }
     *     
     */
    public EthLTCheckHopResultListType getHopList() {
        return hopList;
    }

    /**
     * ����hopList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EthLTCheckHopResultListType }
     *     
     */
    public void setHopList(EthLTCheckHopResultListType value) {
        this.hopList = value;
    }

    /**
     * ��ȡresult���Ե�ֵ��
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
     * ����result���Ե�ֵ��
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
     * ��ȡreason���Ե�ֵ��
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
     * ����reason���Ե�ֵ��
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
