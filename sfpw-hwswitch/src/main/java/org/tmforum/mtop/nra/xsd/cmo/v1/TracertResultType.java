
package org.tmforum.mtop.nra.xsd.cmo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>TracertResultType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TracertResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objRef" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="hopResultList" type="{http://www.tmforum.org/mtop/nra/xsd/cmo/v1}TracertHopResultListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TracertResultType", propOrder = {
    "objRef",
    "hopResultList"
})
public class TracertResultType {

    @XmlElement(required = true)
    protected NamingAttributeType objRef;
    @XmlElement(required = true)
    protected TracertHopResultListType hopResultList;

    /**
     * ��ȡobjRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getObjRef() {
        return objRef;
    }

    /**
     * ����objRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setObjRef(NamingAttributeType value) {
        this.objRef = value;
    }

    /**
     * ��ȡhopResultList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TracertHopResultListType }
     *     
     */
    public TracertHopResultListType getHopResultList() {
        return hopResultList;
    }

    /**
     * ����hopResultList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TracertHopResultListType }
     *     
     */
    public void setHopResultList(TracertHopResultListType value) {
        this.hopResultList = value;
    }

}
