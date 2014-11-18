
package org.tmforum.mtop.mri.xsd.rsd.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;
import org.tmforum.mtop.fmw.xsd.odel.v1.ObjectDeletionType;


/**
 * <p>ResourceSiteObjectDeletionType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ResourceSiteObjectDeletionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/odel/v1}ObjectDeletionType">
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
@XmlType(name = "ResourceSiteObjectDeletionType", propOrder = {
    "resourceSiteName"
})
public class ResourceSiteObjectDeletionType
    extends ObjectDeletionType
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
