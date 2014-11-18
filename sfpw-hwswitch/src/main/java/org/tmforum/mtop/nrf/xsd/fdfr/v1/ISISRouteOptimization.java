
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISRouteOptimization complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡenableGracefulRestart���Ե�ֵ��
     * 
     */
    public boolean isEnableGracefulRestart() {
        return enableGracefulRestart;
    }

    /**
     * ����enableGracefulRestart���Ե�ֵ��
     * 
     */
    public void setEnableGracefulRestart(boolean value) {
        this.enableGracefulRestart = value;
    }

    /**
     * ��ȡgrInterval���Ե�ֵ��
     * 
     */
    public int getGrInterval() {
        return grInterval;
    }

    /**
     * ����grInterval���Ե�ֵ��
     * 
     */
    public void setGrInterval(int value) {
        this.grInterval = value;
    }

}
