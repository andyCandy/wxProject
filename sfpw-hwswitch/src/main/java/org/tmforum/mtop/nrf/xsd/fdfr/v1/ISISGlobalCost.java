
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISISGlobalCost complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡlevel1���Ե�ֵ��
     * 
     */
    public int getLevel1() {
        return level1;
    }

    /**
     * ����level1���Ե�ֵ��
     * 
     */
    public void setLevel1(int value) {
        this.level1 = value;
    }

    /**
     * ��ȡlevel2���Ե�ֵ��
     * 
     */
    public int getLevel2() {
        return level2;
    }

    /**
     * ����level2���Ե�ֵ��
     * 
     */
    public void setLevel2(int value) {
        this.level2 = value;
    }

}
