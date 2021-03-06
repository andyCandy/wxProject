
package org.tmforum.mtop.mri.xsd.ancp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ancp" type="{http://www.tmforum.org/mtop/mri/xsd/ancp/v1}ANCPParameterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ancp"
})
@XmlRootElement(name = "getANCPParameterResponse")
public class GetANCPParameterResponse {

    protected ANCPParameterType ancp;

    /**
     * 获取ancp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ANCPParameterType }
     *     
     */
    public ANCPParameterType getAncp() {
        return ancp;
    }

    /**
     * 设置ancp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ANCPParameterType }
     *     
     */
    public void setAncp(ANCPParameterType value) {
        this.ancp = value;
    }

}
