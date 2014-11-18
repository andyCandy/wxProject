
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISGlobalCost complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ISISGlobalCost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="level2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISISGlobalCost", propOrder = {
    "level1",
    "level2"
})
public class ISISGlobalCost {

    protected int level1;
    protected int level2;

    /**
     * 获取level1属性的值。
     * 
     */
    public int getLevel1() {
        return level1;
    }

    /**
     * 设置level1属性的值。
     * 
     */
    public void setLevel1(int value) {
        this.level1 = value;
    }

    /**
     * 获取level2属性的值。
     * 
     */
    public int getLevel2() {
        return level2;
    }

    /**
     * 设置level2属性的值。
     * 
     */
    public void setLevel2(int value) {
        this.level2 = value;
    }

}
