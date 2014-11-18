
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HWMFdfrExtendsionType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="HWMFdfrExtendsionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1}HWMFdfrExtendsionDataType">
 *       &lt;sequence>
 *         &lt;element name="shgList" type="{http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1}SHGListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HWMFdfrExtendsionType", propOrder = {
    "shgList"
})
public class HWMFdfrExtendsionType
    extends HWMFdfrExtendsionDataType
{

    @XmlElement(required = true)
    protected SHGListType shgList;

    /**
     * ��ȡshgList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SHGListType }
     *     
     */
    public SHGListType getShgList() {
        return shgList;
    }

    /**
     * ����shgList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SHGListType }
     *     
     */
    public void setShgList(SHGListType value) {
        this.shgList = value;
    }

}
