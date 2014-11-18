
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResourceFulfillmentStateEnumType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceFulfillmentStateEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_SERVICE"/>
 *     &lt;enumeration value="OUT_OF_SERVICE"/>
 *     &lt;enumeration value="OUT_OF_SERVICE_BY_MAINTENANCE"/>
 *     &lt;enumeration value="SERV_NA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceFulfillmentStateEnumType")
@XmlEnum
public enum ResourceFulfillmentStateEnumType {

    IN_SERVICE,
    OUT_OF_SERVICE,
    OUT_OF_SERVICE_BY_MAINTENANCE,
    SERV_NA;

    public String value() {
        return name();
    }

    public static ResourceFulfillmentStateEnumType fromValue(String v) {
        return valueOf(v);
    }

}
