
package org.tmforum.mtop.mri.xsd.rsc.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.fmw.xsd.oc.v1.ObjectCreationType;


/**
 * <p>ResourceSiteObjectCreationType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ResourceSiteObjectCreationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/oc/v1}ObjectCreationType">
 *       &lt;sequence>
 *         &lt;element name="resourceSiteName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceSiteObjectCreationType", propOrder = {
    "resourceSiteName"
})
public class ResourceSiteObjectCreationType
    extends ObjectCreationType
{

    protected NamingAttributeType resourceSiteName;

    /**
     * ��ȡresourceSiteName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getResourceSiteName() {
        return resourceSiteName;
    }

    /**
     * ����resourceSiteName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setResourceSiteName(NamingAttributeType value) {
        this.resourceSiteName = value;
    }

}
