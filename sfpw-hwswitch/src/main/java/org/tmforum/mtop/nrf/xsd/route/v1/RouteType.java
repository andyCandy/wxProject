
package org.tmforum.mtop.nrf.xsd.route.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.cc.v1.CrossConnectListType;


/**
 * <p>RouteType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RouteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccList" type="{http://www.tmforum.org/mtop/nrf/xsd/cc/v1}CrossConnectListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteType", propOrder = {
    "ccList"
})
public class RouteType {

    protected CrossConnectListType ccList;

    /**
     * 获取ccList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CrossConnectListType }
     *     
     */
    public CrossConnectListType getCcList() {
        return ccList;
    }

    /**
     * 设置ccList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CrossConnectListType }
     *     
     */
    public void setCcList(CrossConnectListType value) {
        this.ccList = value;
    }

}
