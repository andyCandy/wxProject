
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HelloTimerList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取level1HelloTimer属性的值。
     * 
     */
    public int getLevel1HelloTimer() {
        return level1HelloTimer;
    }

    /**
     * 设置level1HelloTimer属性的值。
     * 
     */
    public void setLevel1HelloTimer(int value) {
        this.level1HelloTimer = value;
    }

    /**
     * 获取level2HelloTimer属性的值。
     * 
     */
    public int getLevel2HelloTimer() {
        return level2HelloTimer;
    }

    /**
     * 设置level2HelloTimer属性的值。
     * 
     */
    public void setLevel2HelloTimer(int value) {
        this.level2HelloTimer = value;
    }

}
