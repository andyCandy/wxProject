
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISAdvancedAttributes complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ISISAdvancedAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routeAggregationList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISRouteAggregationList"/>
 *         &lt;element name="globalCost" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISGlobalCost"/>
 *         &lt;element name="importRouteFilter" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISRouteFilter"/>
 *         &lt;element name="exportRouteFilterList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISRouteFilterList"/>
 *         &lt;element name="routeOptimization" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISRouteOptimization"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISISAdvancedAttributes", propOrder = {
    "routeAggregationList",
    "globalCost",
    "importRouteFilter",
    "exportRouteFilterList",
    "routeOptimization",
    "action"
})
public class ISISAdvancedAttributes {

    @XmlElement(required = true)
    protected ISISRouteAggregationList routeAggregationList;
    @XmlElement(required = true)
    protected ISISGlobalCost globalCost;
    @XmlElement(required = true)
    protected ISISRouteFilter importRouteFilter;
    @XmlElement(required = true)
    protected ISISRouteFilterList exportRouteFilterList;
    @XmlElement(required = true)
    protected ISISRouteOptimization routeOptimization;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取routeAggregationList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ISISRouteAggregationList }
     *     
     */
    public ISISRouteAggregationList getRouteAggregationList() {
        return routeAggregationList;
    }

    /**
     * 设置routeAggregationList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ISISRouteAggregationList }
     *     
     */
    public void setRouteAggregationList(ISISRouteAggregationList value) {
        this.routeAggregationList = value;
    }

    /**
     * 获取globalCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ISISGlobalCost }
     *     
     */
    public ISISGlobalCost getGlobalCost() {
        return globalCost;
    }

    /**
     * 设置globalCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ISISGlobalCost }
     *     
     */
    public void setGlobalCost(ISISGlobalCost value) {
        this.globalCost = value;
    }

    /**
     * 获取importRouteFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ISISRouteFilter }
     *     
     */
    public ISISRouteFilter getImportRouteFilter() {
        return importRouteFilter;
    }

    /**
     * 设置importRouteFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ISISRouteFilter }
     *     
     */
    public void setImportRouteFilter(ISISRouteFilter value) {
        this.importRouteFilter = value;
    }

    /**
     * 获取exportRouteFilterList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ISISRouteFilterList }
     *     
     */
    public ISISRouteFilterList getExportRouteFilterList() {
        return exportRouteFilterList;
    }

    /**
     * 设置exportRouteFilterList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ISISRouteFilterList }
     *     
     */
    public void setExportRouteFilterList(ISISRouteFilterList value) {
        this.exportRouteFilterList = value;
    }

    /**
     * 获取routeOptimization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ISISRouteOptimization }
     *     
     */
    public ISISRouteOptimization getRouteOptimization() {
        return routeOptimization;
    }

    /**
     * 设置routeOptimization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ISISRouteOptimization }
     *     
     */
    public void setRouteOptimization(ISISRouteOptimization value) {
        this.routeOptimization = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
