
package org.tmforum.mtop.nra.xsd.emo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.ei.v1.EventInformationType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;


/**
 * <p>MaintenanceOperationResultType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MaintenanceOperationResultType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/ei/v1}EventInformationType">
 *       &lt;sequence>
 *         &lt;element name="object" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}AnyListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceOperationResultType", propOrder = {
    "object"
})
public class MaintenanceOperationResultType
    extends EventInformationType
{

    protected AnyListType object;

    /**
     * 获取object属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnyListType }
     *     
     */
    public AnyListType getObject() {
        return object;
    }

    /**
     * 设置object属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnyListType }
     *     
     */
    public void setObject(AnyListType value) {
        this.object = value;
    }

}
