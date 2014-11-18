
package org.tmforum.mtop.nra.xsd.pmtgt.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>PerformanceCreateResourceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceCreateResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="resourceSLAList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceCreateResourceType", propOrder = {
    "resourceRefList",
    "resourceSLAList"
})
public class PerformanceCreateResourceType {

    protected NamingAttributeType resourceRefList;
    protected NamingAttributeType resourceSLAList;

    /**
     * 获取resourceRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getResourceRefList() {
        return resourceRefList;
    }

    /**
     * 设置resourceRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setResourceRefList(NamingAttributeType value) {
        this.resourceRefList = value;
    }

    /**
     * 获取resourceSLAList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getResourceSLAList() {
        return resourceSLAList;
    }

    /**
     * 设置resourceSLAList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setResourceSLAList(NamingAttributeType value) {
        this.resourceSLAList = value;
    }

}
