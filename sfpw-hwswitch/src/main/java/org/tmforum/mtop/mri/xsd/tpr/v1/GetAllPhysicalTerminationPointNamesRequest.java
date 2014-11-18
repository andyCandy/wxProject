
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateListType;


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
 *         &lt;element name="meName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="layerRateList" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateListType" minOccurs="0"/>
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
    "meName",
    "layerRateList"
})
@XmlRootElement(name = "getAllPhysicalTerminationPointNamesRequest")
public class GetAllPhysicalTerminationPointNamesRequest {

    protected NamingAttributeType meName;
    protected LayerRateListType layerRateList;

    /**
     * 获取meName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMeName() {
        return meName;
    }

    /**
     * 设置meName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMeName(NamingAttributeType value) {
        this.meName = value;
    }

    /**
     * 获取layerRateList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayerRateListType }
     *     
     */
    public LayerRateListType getLayerRateList() {
        return layerRateList;
    }

    /**
     * 设置layerRateList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateListType }
     *     
     */
    public void setLayerRateList(LayerRateListType value) {
        this.layerRateList = value;
    }

}
