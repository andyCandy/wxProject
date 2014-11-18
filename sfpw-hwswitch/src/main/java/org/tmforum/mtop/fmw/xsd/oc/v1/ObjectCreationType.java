
package org.tmforum.mtop.fmw.xsd.oc.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.ei.v1.EventInformationType;
import org.tmforum.mtop.fmw.xsd.gen.v1.AnyListType;
import org.tmforum.mtop.mri.xsd.rsc.v1.ResourceSiteObjectCreationType;
import org.tmforum.mtop.nrb.xsd.rscoc.v1.ResourceObjectCreationType;
import org.tmforum.mtop.sb.xsd.soc.v1.ServiceObjectCreationType;


/**
 * <p>ObjectCreationType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ObjectCreationType">
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
@XmlType(name = "ObjectCreationType", propOrder = {
    "object"
})
@XmlSeeAlso({
    ResourceSiteObjectCreationType.class,
    ServiceObjectCreationType.class,
    ResourceObjectCreationType.class
})
public abstract class ObjectCreationType
    extends EventInformationType
{

    protected AnyListType object;

    /**
     * ��ȡobject���Ե�ֵ��
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
     * ����object���Ե�ֵ��
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
