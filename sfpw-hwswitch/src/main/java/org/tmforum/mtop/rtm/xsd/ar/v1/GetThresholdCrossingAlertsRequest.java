
package org.tmforum.mtop.rtm.xsd.ar.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="filter" type="{http://www.tmforum.org/mtop/rtm/xsd/ar/v1}ActiveAlarmFilterType" minOccurs="0"/>
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
    "filter"
})
@XmlRootElement(name = "getThresholdCrossingAlertsRequest")
public class GetThresholdCrossingAlertsRequest {

    protected ActiveAlarmFilterType filter;

    /**
     * ��ȡfilter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ActiveAlarmFilterType }
     *     
     */
    public ActiveAlarmFilterType getFilter() {
        return filter;
    }

    /**
     * ����filter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveAlarmFilterType }
     *     
     */
    public void setFilter(ActiveAlarmFilterType value) {
        this.filter = value;
    }

}
