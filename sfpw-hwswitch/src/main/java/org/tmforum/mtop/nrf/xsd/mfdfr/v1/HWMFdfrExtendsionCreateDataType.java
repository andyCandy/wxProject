
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HWMFdfrExtendsionCreateDataType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="HWMFdfrExtendsionCreateDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1}HWMFdfrExtendsionDataType">
 *       &lt;sequence>
 *         &lt;element name="shgCreateDataList" type="{http://www.tmforum.org/mtop/nrf/xsd/mfdfr/v1}SHGCreateDataListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HWMFdfrExtendsionCreateDataType", propOrder = {
    "shgCreateDataList"
})
public class HWMFdfrExtendsionCreateDataType
    extends HWMFdfrExtendsionDataType
{

    @XmlElement(required = true)
    protected SHGCreateDataListType shgCreateDataList;

    /**
     * ��ȡshgCreateDataList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SHGCreateDataListType }
     *     
     */
    public SHGCreateDataListType getShgCreateDataList() {
        return shgCreateDataList;
    }

    /**
     * ����shgCreateDataList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SHGCreateDataListType }
     *     
     */
    public void setShgCreateDataList(SHGCreateDataListType value) {
        this.shgCreateDataList = value;
    }

}
