
package org.tmforum.mtop.mri.xsd.tpr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.nrb.xsd.lay.v1.LayerRateListType;


/**
 * <p>GetAllEdgePointsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAllEdgePointsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mlsnRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *         &lt;element name="tpLayerRateList" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateListType" minOccurs="0"/>
 *         &lt;element name="connectionLayerRateList" type="{http://www.tmforum.org/mtop/nrb/xsd/lay/v1}LayerRateListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllEdgePointsType", propOrder = {
    "mlsnRef",
    "tpLayerRateList",
    "connectionLayerRateList"
})
public class GetAllEdgePointsType {

    protected NamingAttributeType mlsnRef;
    protected LayerRateListType tpLayerRateList;
    protected LayerRateListType connectionLayerRateList;

    /**
     * 获取mlsnRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getMlsnRef() {
        return mlsnRef;
    }

    /**
     * 设置mlsnRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setMlsnRef(NamingAttributeType value) {
        this.mlsnRef = value;
    }

    /**
     * 获取tpLayerRateList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayerRateListType }
     *     
     */
    public LayerRateListType getTpLayerRateList() {
        return tpLayerRateList;
    }

    /**
     * 设置tpLayerRateList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateListType }
     *     
     */
    public void setTpLayerRateList(LayerRateListType value) {
        this.tpLayerRateList = value;
    }

    /**
     * 获取connectionLayerRateList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LayerRateListType }
     *     
     */
    public LayerRateListType getConnectionLayerRateList() {
        return connectionLayerRateList;
    }

    /**
     * 设置connectionLayerRateList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRateListType }
     *     
     */
    public void setConnectionLayerRateList(LayerRateListType value) {
        this.connectionLayerRateList = value;
    }

}
