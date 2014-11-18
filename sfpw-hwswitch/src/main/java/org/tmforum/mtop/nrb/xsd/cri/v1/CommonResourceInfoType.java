
package org.tmforum.mtop.nrb.xsd.cri.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.coi.v1.CommonObjectInfoType;
import org.tmforum.mtop.fmw.xsd.gen.v1.MultiEventInventoryAttributesType;
import org.tmforum.mtop.nra.xsd.tnp.v1.TrailNetworkProtectionType;
import org.tmforum.mtop.nrf.xsd.ctp.v1.ConnectionTerminationPointType;
import org.tmforum.mtop.nrf.xsd.fd.v1.FlowDomainType;
import org.tmforum.mtop.nrf.xsd.ftp.v1.FloatingTerminationPointType;
import org.tmforum.mtop.nrf.xsd.gtp.v1.GroupTerminationPointType;
import org.tmforum.mtop.nrf.xsd.ptp.v1.PhysicalTerminationPointType;
import org.tmforum.mtop.nrf.xsd.tppool.v1.TerminationPointPoolType;
import org.w3c.dom.Element;


/**
 * <p>CommonResourceInfoType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CommonResourceInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tmforum.org/mtop/fmw/xsd/coi/v1}CommonObjectInfoType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}SourceType"/>
 *         &lt;element name="networkAccessDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meiAttributes" type="{http://www.tmforum.org/mtop/fmw/xsd/gen/v1}MultiEventInventoryAttributesType"/>
 *         &lt;element name="resourceState" type="{http://www.tmforum.org/mtop/nrb/xsd/cri/v1}ResourceStateType"/>
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonResourceInfoType", propOrder = {
    "source",
    "networkAccessDomain",
    "meiAttributes",
    "resourceState",
    "any"
})
@XmlSeeAlso({
    TerminationPointPoolType.class,
    GroupTerminationPointType.class,
    PhysicalTerminationPointType.class,
    TrailNetworkProtectionType.class,
    FlowDomainType.class,
    FloatingTerminationPointType.class,
    ConnectionTerminationPointType.class
})
public abstract class CommonResourceInfoType
    extends CommonObjectInfoType
{

    @XmlElement(required = true)
    protected SourceType source;
    @XmlElement(required = true)
    protected String networkAccessDomain;
    @XmlElement(required = true)
    protected MultiEventInventoryAttributesType meiAttributes;
    @XmlElement(required = true)
    protected ResourceStateType resourceState;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
    }

    /**
     * ��ȡnetworkAccessDomain���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkAccessDomain() {
        return networkAccessDomain;
    }

    /**
     * ����networkAccessDomain���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkAccessDomain(String value) {
        this.networkAccessDomain = value;
    }

    /**
     * ��ȡmeiAttributes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MultiEventInventoryAttributesType }
     *     
     */
    public MultiEventInventoryAttributesType getMeiAttributes() {
        return meiAttributes;
    }

    /**
     * ����meiAttributes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MultiEventInventoryAttributesType }
     *     
     */
    public void setMeiAttributes(MultiEventInventoryAttributesType value) {
        this.meiAttributes = value;
    }

    /**
     * ��ȡresourceState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceStateType }
     *     
     */
    public ResourceStateType getResourceState() {
        return resourceState;
    }

    /**
     * ����resourceState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceStateType }
     *     
     */
    public void setResourceState(ResourceStateType value) {
        this.resourceState = value;
    }

    /**
     * ��ȡany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * ����any���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
