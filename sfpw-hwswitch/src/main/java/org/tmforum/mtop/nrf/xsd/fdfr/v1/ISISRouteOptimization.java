
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISRouteOptimization complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ISISRouteOptimization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableGracefulRestart" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="grInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISISRouteOptimization", propOrder = {
    "enableGracefulRestart",
    "grInterval"
})
public class ISISRouteOptimization {

    protected boolean enableGracefulRestart;
    protected int grInterval;

    /**
     * 获取enableGracefulRestart属性的值。
     * 
     */
    public boolean isEnableGracefulRestart() {
        return enableGracefulRestart;
    }

    /**
     * 设置enableGracefulRestart属性的值。
     * 
     */
    public void setEnableGracefulRestart(boolean value) {
        this.enableGracefulRestart = value;
    }

    /**
     * 获取grInterval属性的值。
     * 
     */
    public int getGrInterval() {
        return grInterval;
    }

    /**
     * 设置grInterval属性的值。
     * 
     */
    public void setGrInterval(int value) {
        this.grInterval = value;
    }

}
