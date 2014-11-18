
package org.tmforum.mtop.nrf.xsd.routec.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.ei.v1.EventInformationType;
import org.tmforum.mtop.nrf.xsd.route.v1.RouteType;
import org.tmforum.mtop.nrf.xsd.sc.v1.ServerConnectionListType;


/**
 * <p>RouteChangeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RouteChangeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/ei/v1}EventInformationType">
 *       &lt;sequence>
 *         &lt;element name="routeChangeEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="route" type="{http://www.tmforum.org/mtop/nrf/xsd/route/v1}RouteType" minOccurs="0"/>
 *         &lt;element name="serverConnections" type="{http://www.tmforum.org/mtop/nrf/xsd/sc/v1}ServerConnectionListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteChangeType", propOrder = {
    "routeChangeEvent",
    "route",
    "serverConnections"
})
public class RouteChangeType
    extends EventInformationType
{

    protected String routeChangeEvent;
    protected RouteType route;
    protected ServerConnectionListType serverConnections;

    /**
     * 获取routeChangeEvent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteChangeEvent() {
        return routeChangeEvent;
    }

    /**
     * 设置routeChangeEvent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteChangeEvent(String value) {
        this.routeChangeEvent = value;
    }

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
     * 获取serverConnections属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServerConnectionListType }
     *     
     */
    public ServerConnectionListType getServerConnections() {
        return serverConnections;
    }

    /**
     * 设置serverConnections属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServerConnectionListType }
     *     
     */
    public void setServerConnections(ServerConnectionListType value) {
        this.serverConnections = value;
    }

}
