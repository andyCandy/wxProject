
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISAdvancedAttributes complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrouteAggregationList���Ե�ֵ��
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
     * ����routeAggregationList���Ե�ֵ��
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
     * ��ȡglobalCost���Ե�ֵ��
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
     * ����globalCost���Ե�ֵ��
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
     * ��ȡimportRouteFilter���Ե�ֵ��
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
     * ����importRouteFilter���Ե�ֵ��
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
     * ��ȡexportRouteFilterList���Ե�ֵ��
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
     * ����exportRouteFilterList���Ե�ֵ��
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
     * ��ȡrouteOptimization���Ե�ֵ��
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
     * ����routeOptimization���Ե�ֵ��
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
     * ��ȡaction���Ե�ֵ��
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
     * ����action���Ե�ֵ��
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
