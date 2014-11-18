
package org.tmforum.mtop.nrb.xsd.rscavc.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.avc.v1.AttributeValueChangeType;


/**
 * <p>ResourceAttributeValueChangeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResourceAttributeValueChangeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/avc/v1}AttributeValueChangeType">
 *       &lt;sequence>
 *         &lt;element name="isEdgePointRelated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceAttributeValueChangeType", propOrder = {
    "isEdgePointRelated"
})
public class ResourceAttributeValueChangeType
    extends AttributeValueChangeType
{

    protected Boolean isEdgePointRelated;

    /**
     * 获取isEdgePointRelated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEdgePointRelated() {
        return isEdgePointRelated;
    }

    /**
     * 设置isEdgePointRelated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEdgePointRelated(Boolean value) {
        this.isEdgePointRelated = value;
    }

}
