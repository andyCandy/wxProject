
package org.tmforum.mtop.mri.xsd.mer.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.nrf.xsd.me.v1.ManagedElementListType;


/**
 * <p>MultipleMeObjectsResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MultipleMeObjectsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meList" type="{http://www.tmforum.org/mtop/nrf/xsd/me/v1}ManagedElementListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleMeObjectsResponseType", propOrder = {
    "meList"
})
public class MultipleMeObjectsResponseType {

    protected ManagedElementListType meList;

    /**
     * ��ȡmeList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ManagedElementListType }
     *     
     */
    public ManagedElementListType getMeList() {
        return meList;
    }

    /**
     * ����meList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedElementListType }
     *     
     */
    public void setMeList(ManagedElementListType value) {
        this.meList = value;
    }

}
