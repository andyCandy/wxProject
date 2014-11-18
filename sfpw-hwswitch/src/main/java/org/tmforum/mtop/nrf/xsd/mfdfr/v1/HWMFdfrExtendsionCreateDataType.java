
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HWMFdfrExtendsionCreateDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取shgCreateDataList属性的值。
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
     * 设置shgCreateDataList属性的值。
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
