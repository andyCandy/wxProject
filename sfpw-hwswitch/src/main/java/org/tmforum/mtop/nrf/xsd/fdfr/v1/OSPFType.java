
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OSPFType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OSPFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ospfState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}AreaListType"/>
 *         &lt;element name="importRouteList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ImportRouteListType"/>
 *         &lt;element name="ospfRouteAggrList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}OspfRouteAggrListType"/>
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
@XmlType(name = "OSPFType", propOrder = {
    "procID",
    "routerID",
    "ospfState",
    "areaList",
    "importRouteList",
    "ospfRouteAggrList",
    "action"
})
public class OSPFType {

    @XmlElement(required = true)
    protected String procID;
    @XmlElement(required = true)
    protected String routerID;
    @XmlElement(required = true)
    protected String ospfState;
    @XmlElement(required = true)
    protected AreaListType areaList;
    @XmlElement(required = true)
    protected ImportRouteListType importRouteList;
    @XmlElement(required = true)
    protected OspfRouteAggrListType ospfRouteAggrList;
    @XmlElement(required = true)
    protected String action;

    /**
     * 获取procID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcID() {
        return procID;
    }

    /**
     * 设置procID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcID(String value) {
        this.procID = value;
    }

    /**
     * 获取routerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouterID() {
        return routerID;
    }

    /**
     * 设置routerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouterID(String value) {
        this.routerID = value;
    }

    /**
     * 获取ospfState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOspfState() {
        return ospfState;
    }

    /**
     * 设置ospfState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOspfState(String value) {
        this.ospfState = value;
    }

    /**
     * 获取areaList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaListType }
     *     
     */
    public AreaListType getAreaList() {
        return areaList;
    }

    /**
     * 设置areaList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaListType }
     *     
     */
    public void setAreaList(AreaListType value) {
        this.areaList = value;
    }

    /**
     * 获取importRouteList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImportRouteListType }
     *     
     */
    public ImportRouteListType getImportRouteList() {
        return importRouteList;
    }

    /**
     * 设置importRouteList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImportRouteListType }
     *     
     */
    public void setImportRouteList(ImportRouteListType value) {
        this.importRouteList = value;
    }

    /**
     * 获取ospfRouteAggrList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OspfRouteAggrListType }
     *     
     */
    public OspfRouteAggrListType getOspfRouteAggrList() {
        return ospfRouteAggrList;
    }

    /**
     * 设置ospfRouteAggrList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OspfRouteAggrListType }
     *     
     */
    public void setOspfRouteAggrList(OspfRouteAggrListType value) {
        this.ospfRouteAggrList = value;
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
