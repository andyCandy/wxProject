
package org.tmforum.mtop.nrb.xsd.cri.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>ResourceStateType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ResourceStateType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.tmforum.org/mtop/nrb/xsd/cri/v1>ResourceStateEnumType">
 *       &lt;attribute name="overlap" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceStateType", propOrder = {
    "value"
})
public class ResourceStateType {

    @XmlValue
    protected ResourceStateEnumType value;
    @XmlAttribute(name = "overlap")
    protected String overlap;
    @XmlAttribute(name = "qualifier")
    protected String qualifier;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * ��ȡvalue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResourceStateEnumType }
     *     
     */
    public ResourceStateEnumType getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceStateEnumType }
     *     
     */
    public void setValue(ResourceStateEnumType value) {
        this.value = value;
    }

    /**
     * ��ȡoverlap���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverlap() {
        return overlap;
    }

    /**
     * ����overlap���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverlap(String value) {
        this.overlap = value;
    }

    /**
     * ��ȡqualifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * ����qualifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * ��ȡextension���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * ����extension���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}
