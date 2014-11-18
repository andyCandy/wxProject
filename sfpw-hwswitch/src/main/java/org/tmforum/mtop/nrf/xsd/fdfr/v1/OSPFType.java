
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OSPFType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡprocID���Ե�ֵ��
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
     * ����procID���Ե�ֵ��
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
     * ��ȡrouterID���Ե�ֵ��
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
     * ����routerID���Ե�ֵ��
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
     * ��ȡospfState���Ե�ֵ��
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
     * ����ospfState���Ե�ֵ��
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
     * ��ȡareaList���Ե�ֵ��
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
     * ����areaList���Ե�ֵ��
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
     * ��ȡimportRouteList���Ե�ֵ��
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
     * ����importRouteList���Ե�ֵ��
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
     * ��ȡospfRouteAggrList���Ե�ֵ��
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
     * ����ospfRouteAggrList���Ե�ֵ��
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
