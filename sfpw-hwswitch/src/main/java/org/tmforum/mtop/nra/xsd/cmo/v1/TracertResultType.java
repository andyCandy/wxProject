
package org.tmforum.mtop.nra.xsd.cmo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>TracertResultType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TracertResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="hopResultList" type="{http://www.tmforum.org/mtop/nra/xsd/cmo/v1}TracertHopResultListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TracertResultType", propOrder = {
    "objRef",
    "hopResultList"
})
public class TracertResultType {

    @XmlElement(required = true)
    protected NamingAttributeType objRef;
    @XmlElement(required = true)
    protected TracertHopResultListType hopResultList;

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
     * 获取hopResultList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TracertHopResultListType }
     *     
     */
    public TracertHopResultListType getHopResultList() {
        return hopResultList;
    }

    /**
     * 设置hopResultList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TracertHopResultListType }
     *     
     */
    public void setHopResultList(TracertHopResultListType value) {
        this.hopResultList = value;
    }

}
