
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InterfaceCostList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡlevel1InterfaceCost���Ե�ֵ��
     * 
     */
    public int getLevel1InterfaceCost() {
        return level1InterfaceCost;
    }

    /**
     * ����level1InterfaceCost���Ե�ֵ��
     * 
     */
    public void setLevel1InterfaceCost(int value) {
        this.level1InterfaceCost = value;
    }

    /**
     * ��ȡlevel2InterfaceCost���Ե�ֵ��
     * 
     */
    public int getLevel2InterfaceCost() {
        return level2InterfaceCost;
    }

    /**
     * ����level2InterfaceCost���Ե�ֵ��
     * 
     */
    public void setLevel2InterfaceCost(int value) {
        this.level2InterfaceCost = value;
    }

}
