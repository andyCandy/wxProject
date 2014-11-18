
package org.tmforum.mtop.nra.xsd.cmo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>EthLTCheckResultType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取hopList属性的值。
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
     * 设置hopList属性的值。
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
