
package org.tmforum.mtop.rtm.xsd.ar.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceNameList" type="{http://www.tmforum.org/mtop/rtm/xsd/ar/v1}ServiceNameListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceNameList"
})
@XmlRootElement(name = "getAlarmAffectedServiceNamesResponse")
public class GetAlarmAffectedServiceNamesResponse {

    @XmlElement(required = true)
    protected ServiceNameListType serviceNameList;

    /**
     * ��ȡserviceNameList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ServiceNameListType }
     *     
     */
    public ServiceNameListType getServiceNameList() {
        return serviceNameList;
    }

    /**
     * ����serviceNameList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceNameListType }
     *     
     */
    public void setServiceNameList(ServiceNameListType value) {
        this.serviceNameList = value;
    }

}
