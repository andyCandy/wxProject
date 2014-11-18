
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InterfaceCostList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InterfaceCostList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level1InterfaceCost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="level2InterfaceCost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceCostList", propOrder = {
    "level1InterfaceCost",
    "level2InterfaceCost"
})
public class InterfaceCostList {

    protected int level1InterfaceCost;
    protected int level2InterfaceCost;

    /**
     * 获取level1InterfaceCost属性的值。
     * 
     */
    public int getLevel1InterfaceCost() {
        return level1InterfaceCost;
    }

    /**
     * 设置level1InterfaceCost属性的值。
     * 
     */
    public void setLevel1InterfaceCost(int value) {
        this.level1InterfaceCost = value;
    }

    /**
     * 获取level2InterfaceCost属性的值。
     * 
     */
    public int getLevel2InterfaceCost() {
        return level2InterfaceCost;
    }

    /**
     * 设置level2InterfaceCost属性的值。
     * 
     */
    public void setLevel2InterfaceCost(int value) {
        this.level2InterfaceCost = value;
    }

}
