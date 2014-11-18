
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISRouteImport complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ISISRouteImport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routeLeaking" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISRouteLeaking"/>
 *         &lt;element name="externalRouteImportList" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISExternalRouteImportList"/>
 *         &lt;element name="defaultRouteAdvert" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}ISISDefaultRouteAdvert"/>
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
@XmlType(name = "ISISRouteImport", propOrder = {
    "routeLeaking",
    "externalRouteImportList",
    "defaultRouteAdvert",
    "action"
})
public class ISISRouteImport {

    @XmlElement(required = true)
    protected ISISRouteLeaking routeLeaking;
    @XmlElement(required = true)
    protected ISISExternalRouteImportList externalRouteImportList;
    @XmlElement(required = true)
    protected ISISDefaultRouteAdvert defaultRouteAdvert;
    @XmlElement(required = true)
    protected String action;

    /**
     * ��ȡrouteLeaking���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ISISRouteLeaking }
     *     
     */
    public ISISRouteLeaking getRouteLeaking() {
        return routeLeaking;
    }

    /**
     * ����routeLeaking���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ISISRouteLeaking }
     *     
     */
    public void setRouteLeaking(ISISRouteLeaking value) {
        this.routeLeaking = value;
    }

    /**
     * ��ȡexternalRouteImportList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ISISExternalRouteImportList }
     *     
     */
    public ISISExternalRouteImportList getExternalRouteImportList() {
        return externalRouteImportList;
    }

    /**
     * ����externalRouteImportList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ISISExternalRouteImportList }
     *     
     */
    public void setExternalRouteImportList(ISISExternalRouteImportList value) {
        this.externalRouteImportList = value;
    }

    /**
     * ��ȡdefaultRouteAdvert���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ISISDefaultRouteAdvert }
     *     
     */
    public ISISDefaultRouteAdvert getDefaultRouteAdvert() {
        return defaultRouteAdvert;
    }

    /**
     * ����defaultRouteAdvert���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ISISDefaultRouteAdvert }
     *     
     */
    public void setDefaultRouteAdvert(ISISDefaultRouteAdvert value) {
        this.defaultRouteAdvert = value;
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
