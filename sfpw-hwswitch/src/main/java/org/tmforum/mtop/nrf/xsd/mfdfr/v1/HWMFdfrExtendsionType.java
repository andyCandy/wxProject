
package org.tmforum.mtop.nrf.xsd.mfdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HWMFdfrExtendsionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取shgList属性的值。
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
     * 设置shgList属性的值。
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
