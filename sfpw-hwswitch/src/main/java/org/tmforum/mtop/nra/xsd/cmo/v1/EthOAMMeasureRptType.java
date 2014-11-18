
package org.tmforum.mtop.nra.xsd.cmo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>EthOAMMeasureRptType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EthOAMMeasureRptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="statistic" type="{http://www.tmforum.org/mtop/nra/xsd/cmo/v1}OAMMeasureStatisticType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EthOAMMeasureRptType", propOrder = {
    "index",
    "statistic"
})
public class EthOAMMeasureRptType {

    @XmlElement(required = true)
    protected NamingAttributeType index;
    @XmlElement(required = true)
    protected OAMMeasureStatisticType statistic;

    /**
     * 获取index属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getIndex() {
        return index;
    }

    /**
     * 设置index属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setIndex(NamingAttributeType value) {
        this.index = value;
    }

    /**
     * 获取statistic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OAMMeasureStatisticType }
     *     
     */
    public OAMMeasureStatisticType getStatistic() {
        return statistic;
    }

    /**
     * 设置statistic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OAMMeasureStatisticType }
     *     
     */
    public void setStatistic(OAMMeasureStatisticType value) {
        this.statistic = value;
    }

}
