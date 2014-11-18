
package org.tmforum.mtop.mri.xsd.tlr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.route.v1.RouteType;
import org.tmforum.mtop.nrf.xsd.tl.v1.TopologicalLinkListType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="route" type="{http://www.tmforum.org/mtop/nrf/xsd/route/v1}RouteType" minOccurs="0"/>
 *         &lt;element name="tlList" type="{http://www.tmforum.org/mtop/nrf/xsd/tl/v1}TopologicalLinkListType" minOccurs="0"/>
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
    "route",
    "tlList"
})
@XmlRootElement(name = "getRouteAndTopologicalLinksResponse")
public class GetRouteAndTopologicalLinksResponse {

    protected RouteType route;
    protected TopologicalLinkListType tlList;

    /**
     * ��ȡroute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RouteType }
     *     
     */
    public RouteType getRoute() {
        return route;
    }

    /**
     * ����route���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RouteType }
     *     
     */
    public void setRoute(RouteType value) {
        this.route = value;
    }

    /**
     * ��ȡtlList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TopologicalLinkListType }
     *     
     */
    public TopologicalLinkListType getTlList() {
        return tlList;
    }

    /**
     * ����tlList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TopologicalLinkListType }
     *     
     */
    public void setTlList(TopologicalLinkListType value) {
        this.tlList = value;
    }

}
