
package org.tmforum.mtop.fmw.xsd.odel.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.ei.v1.EventInformationType;
import org.tmforum.mtop.mri.xsd.rsd.v1.ResourceSiteObjectDeletionType;
import org.tmforum.mtop.nrb.xsd.rscodel.v1.ResourceObjectDeletionType;
import org.tmforum.mtop.sb.xsd.sodel.v1.ServiceObjectDeletionType;


/**
 * <p>ObjectDeletionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ObjectDeletionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/ei/v1}EventInformationType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectDeletionType")
@XmlSeeAlso({
    ServiceObjectDeletionType.class,
    ResourceSiteObjectDeletionType.class,
    ResourceObjectDeletionType.class
})
public abstract class ObjectDeletionType
    extends EventInformationType
{


}
