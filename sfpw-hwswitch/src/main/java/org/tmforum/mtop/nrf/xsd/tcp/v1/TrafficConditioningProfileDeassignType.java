
package org.tmforum.mtop.nrf.xsd.tcp.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.gen.v1.NameAndValueStringListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;
import org.tmforum.mtop.nrf.xsd.com.v1.DirectionalityType;


/**
 * <p>TrafficConditioningProfileDeassignType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrafficConditioningProfileDeassignType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tcpRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="resourceName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="direction" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}DirectionalityType"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType"/>
 *         &lt;element name="parameterList" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}NameAndValueStringListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficConditioningProfileDeassignType", propOrder = {
    "tcpRef",
    "resourceName",
    "direction",
    "layerRate",
    "parameterList"
})
public class TrafficConditioningProfileDeassignType {

    @XmlElement(required = true)
    protected NamingAttributeType tcpRef;
    @XmlElement(required = true)
    protected NamingAttributeType resourceName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DirectionalityType direction;
    @XmlElement(required = true)
    protected LayerRateType layerRate;
    @XmlElement(required = true)
    protected NameAndValueStringListType parameterList;

    /**
     * 获取tcpRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getTcpRef() {
        return tcpRef;
    }

    /**
     * 设置tcpRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setTcpRef(NamingAttributeType value) {
        this.tcpRef = value;
    }

    /**
     * 获取resourceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getResourceName() {
        return resourceName;
    }

    /**
     * 设置resourceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setResourceName(NamingAttributeType value) {
        this.resourceName = value;
    }

    /**
     * 获取direction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DirectionalityType }
     *     
     */
    public DirectionalityType getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionalityType }
     *     
     */
    public void setDirection(DirectionalityType value) {
        this.direction = value;
    }

    /**
     * 获取layerRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayerRateType }
     *     
     */
    public LayerRateType getLayerRate() {
        return layerRate;
    }

    /**
     * 设置layerRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateType }
     *     
     */
    public void setLayerRate(LayerRateType value) {
        this.layerRate = value;
    }

    /**
     * 获取parameterList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public NameAndValueStringListType getParameterList() {
        return parameterList;
    }

    /**
     * 设置parameterList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndValueStringListType }
     *     
     */
    public void setParameterList(NameAndValueStringListType value) {
        this.parameterList = value;
    }

}
