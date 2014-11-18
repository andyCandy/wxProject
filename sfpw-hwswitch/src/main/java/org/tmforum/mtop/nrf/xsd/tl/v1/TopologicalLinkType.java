
package org.tmforum.mtop.nrf.xsd.tl.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeListType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.cri.v1.CommonResourceInfoType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateType;
import org.tmforum.mtop.nrf.xsd.com.v1.ConnectionDirectionType;


/**
 * <p>TopologicalLinkType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TopologicalLinkType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}CommonResourceInfoType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.tmforum.org/mtop/nrf/xsd/com/v1}ConnectionDirectionType"/>
 *         &lt;element name="layerRate" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateType"/>
 *         &lt;element name="aEndTpRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="zEndTpRefList" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeListType"/>
 *         &lt;element name="isReportingAlarms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="asapRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wane" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopologicalLinkType", propOrder = {
    "direction",
    "layerRate",
    "aEndTpRefList",
    "zEndTpRefList",
    "isReportingAlarms",
    "asapRef",
    "type",
    "level",
    "length",
    "wane"
})
public class TopologicalLinkType
    extends CommonResourceInfoType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConnectionDirectionType direction;
    @XmlElement(required = true)
    protected LayerRateType layerRate;
    @XmlElement(required = true)
    protected NamingAttributeListType aEndTpRefList;
    @XmlElement(required = true)
    protected NamingAttributeListType zEndTpRefList;
    protected boolean isReportingAlarms;
    @XmlElement(required = true)
    protected NamingAttributeType asapRef;
    protected String type;
    protected String level;
    protected String length;
    protected String wane;

    /**
     * 获取direction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDirectionType }
     *     
     */
    public ConnectionDirectionType getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDirectionType }
     *     
     */
    public void setDirection(ConnectionDirectionType value) {
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
     * 获取aEndTpRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getAEndTpRefList() {
        return aEndTpRefList;
    }

    /**
     * 设置aEndTpRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setAEndTpRefList(NamingAttributeListType value) {
        this.aEndTpRefList = value;
    }

    /**
     * 获取zEndTpRefList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeListType }
     *     
     */
    public NamingAttributeListType getZEndTpRefList() {
        return zEndTpRefList;
    }

    /**
     * 设置zEndTpRefList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeListType }
     *     
     */
    public void setZEndTpRefList(NamingAttributeListType value) {
        this.zEndTpRefList = value;
    }

    /**
     * 获取isReportingAlarms属性的值。
     * 
     */
    public boolean isIsReportingAlarms() {
        return isReportingAlarms;
    }

    /**
     * 设置isReportingAlarms属性的值。
     * 
     */
    public void setIsReportingAlarms(boolean value) {
        this.isReportingAlarms = value;
    }

    /**
     * 获取asapRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getAsapRef() {
        return asapRef;
    }

    /**
     * 设置asapRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setAsapRef(NamingAttributeType value) {
        this.asapRef = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取level属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置level属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * 获取length属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * 设置length属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * 获取wane属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWane() {
        return wane;
    }

    /**
     * 设置wane属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWane(String value) {
        this.wane = value;
    }

}
