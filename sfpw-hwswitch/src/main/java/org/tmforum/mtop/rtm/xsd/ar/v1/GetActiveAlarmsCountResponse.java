
package org.tmforum.mtop.rtm.xsd.ar.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="activeAlarmCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "activeAlarmCount"
})
@XmlRootElement(name = "getActiveAlarmsCountResponse")
public class GetActiveAlarmsCountResponse {

    @XmlSchemaType(name = "unsignedInt")
    protected long activeAlarmCount;

    /**
     * ��ȡactiveAlarmCount���Ե�ֵ��
     * 
     */
    public long getActiveAlarmCount() {
        return activeAlarmCount;
    }

    /**
     * ����activeAlarmCount���Ե�ֵ��
     * 
     */
    public void setActiveAlarmCount(long value) {
        this.activeAlarmCount = value;
    }

}
