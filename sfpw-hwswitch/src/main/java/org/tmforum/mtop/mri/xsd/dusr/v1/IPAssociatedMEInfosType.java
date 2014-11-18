
package org.tmforum.mtop.mri.xsd.dusr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IPAssociatedMEInfosType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IPAssociatedMEInfosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meInfoListRef" type="{http://www.tmforum.org/mtop/mri/xsd/dusr/v1}SimpleMEInfoListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPAssociatedMEInfosType", propOrder = {
    "ipAddress",
    "meInfoListRef"
})
public class IPAssociatedMEInfosType {

    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(required = true)
    protected SimpleMEInfoListType meInfoListRef;

    /**
     * ��ȡipAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * ����ipAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * ��ȡmeInfoListRef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SimpleMEInfoListType }
     *     
     */
    public SimpleMEInfoListType getMeInfoListRef() {
        return meInfoListRef;
    }

    /**
     * ����meInfoListRef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleMEInfoListType }
     *     
     */
    public void setMeInfoListRef(SimpleMEInfoListType value) {
        this.meInfoListRef = value;
    }

}
