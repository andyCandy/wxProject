
package org.tmforum.mtop.mri.xsd.ancp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;


/**
 * <p>ANCPParameterType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ANCPParameterType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="retrieveTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tpName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANCPParameterType", propOrder = {
    "state",
    "timeout",
    "retrieveTimes",
    "tpName"
})
public class ANCPParameterType
    extends CommonResourceInfoType
{

    protected String state;
    protected Integer timeout;
    protected Integer retrieveTimes;
    protected NamingAttributeType tpName;

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
     * 获取timeout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * 设置timeout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeout(Integer value) {
        this.timeout = value;
    }

    /**
     * 获取retrieveTimes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetrieveTimes() {
        return retrieveTimes;
    }

    /**
     * 设置retrieveTimes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetrieveTimes(Integer value) {
        this.retrieveTimes = value;
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

}
