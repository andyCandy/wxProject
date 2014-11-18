
package org.tmforum.mtop.mri.xsd.tlr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.route.v1.RouteType;
import org.tmforum.mtop.nrf.xsd.tl.v1.TopologicalLinkListType;


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
     * 获取route属性的值。
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
     * 设置route属性的值。
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
     * 获取tlList属性的值。
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
     * 设置tlList属性的值。
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
