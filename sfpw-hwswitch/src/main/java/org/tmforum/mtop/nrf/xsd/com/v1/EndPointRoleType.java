
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EndPointRoleType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EndPointRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}TerminationPointRole" minOccurs="0"/>
 *         &lt;element name="tpIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndPointRoleType", propOrder = {
    "role",
    "tpIndex"
})
public class EndPointRoleType {

    @XmlSchemaType(name = "string")
    protected TerminationPointRole role;
    @XmlSchemaType(name = "unsignedInt")
    protected Long tpIndex;

    /**
     * 获取role属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TerminationPointRole }
     *     
     */
    public TerminationPointRole getRole() {
        return role;
    }

    /**
     * 设置role属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationPointRole }
     *     
     */
    public void setRole(TerminationPointRole value) {
        this.role = value;
    }

    /**
     * 获取tpIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTpIndex() {
        return tpIndex;
    }

    /**
     * 设置tpIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTpIndex(Long value) {
        this.tpIndex = value;
    }

}
