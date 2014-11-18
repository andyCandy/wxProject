
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
 *         &lt;element name="ancpLineList" type="{http://www.tmforum.org/mtop/mri/xsd/ancp/v1}ANCPAccessLineListType" minOccurs="0"/>
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
    "ancpLineList"
})
@XmlRootElement(name = "getAllANCPAccessLinesResponse")
public class GetAllANCPAccessLinesResponse {

    protected ANCPAccessLineListType ancpLineList;

    /**
     * 获取ancpLineList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ANCPAccessLineListType }
     *     
     */
    public ANCPAccessLineListType getAncpLineList() {
        return ancpLineList;
    }

    /**
     * 设置ancpLineList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ANCPAccessLineListType }
     *     
     */
    public void setAncpLineList(ANCPAccessLineListType value) {
        this.ancpLineList = value;
    }

}
