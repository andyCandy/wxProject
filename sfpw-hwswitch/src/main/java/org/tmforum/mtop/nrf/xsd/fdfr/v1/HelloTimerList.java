
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HelloTimerList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="HelloTimerList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level1HelloTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="level2HelloTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HelloTimerList", propOrder = {
    "level1HelloTimer",
    "level2HelloTimer"
})
public class HelloTimerList {

    protected int level1HelloTimer;
    protected int level2HelloTimer;

    /**
     * ��ȡlevel1HelloTimer���Ե�ֵ��
     * 
     */
    public int getLevel1HelloTimer() {
        return level1HelloTimer;
    }

    /**
     * ����level1HelloTimer���Ե�ֵ��
     * 
     */
    public void setLevel1HelloTimer(int value) {
        this.level1HelloTimer = value;
    }

    /**
     * ��ȡlevel2HelloTimer���Ե�ֵ��
     * 
     */
    public int getLevel2HelloTimer() {
        return level2HelloTimer;
    }

    /**
     * ����level2HelloTimer���Ե�ֵ��
     * 
     */
    public void setLevel2HelloTimer(int value) {
        this.level2HelloTimer = value;
    }

}
