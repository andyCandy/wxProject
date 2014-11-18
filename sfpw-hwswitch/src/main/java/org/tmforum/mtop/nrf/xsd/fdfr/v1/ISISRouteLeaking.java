
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISRouteLeaking complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ISISRouteLeaking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level1ToLevel2" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}Level1ToLevel2Leaking"/>
 *         &lt;element name="level2ToLevel1" type="{http://www.tmforum.org/mtop/nrf/xsd/fdfr/v1}Level2ToLevel1Leaking"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISISRouteLeaking", propOrder = {
    "level1ToLevel2",
    "level2ToLevel1"
})
public class ISISRouteLeaking {

    @XmlElement(required = true)
    protected Level1ToLevel2Leaking level1ToLevel2;
    @XmlElement(required = true)
    protected Level2ToLevel1Leaking level2ToLevel1;

    /**
     * 获取level1ToLevel2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Level1ToLevel2Leaking }
     *     
     */
    public Level1ToLevel2Leaking getLevel1ToLevel2() {
        return level1ToLevel2;
    }

    /**
     * 设置level1ToLevel2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Level1ToLevel2Leaking }
     *     
     */
    public void setLevel1ToLevel2(Level1ToLevel2Leaking value) {
        this.level1ToLevel2 = value;
    }

    /**
     * 获取level2ToLevel1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Level2ToLevel1Leaking }
     *     
     */
    public Level2ToLevel1Leaking getLevel2ToLevel1() {
        return level2ToLevel1;
    }

    /**
     * 设置level2ToLevel1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Level2ToLevel1Leaking }
     *     
     */
    public void setLevel2ToLevel1(Level2ToLevel1Leaking value) {
        this.level2ToLevel1 = value;
    }

}
