
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SubnetworkConnectionTypeType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="SubnetworkConnectionTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ST_SIMPLE"/>
 *     &lt;enumeration value="ST_ADD_DROP_A"/>
 *     &lt;enumeration value="ST_ADD_DROP_Z"/>
 *     &lt;enumeration value="ST_INTERCONNECT"/>
 *     &lt;enumeration value="ST_DOUBLE_INTERCONNECT"/>
 *     &lt;enumeration value="ST_DOUBLE_ADD_DROP"/>
 *     &lt;enumeration value="ST_OPEN_ADD_DROP"/>
 *     &lt;enumeration value="ST_EXPLICIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubnetworkConnectionTypeType")
@XmlEnum
public enum SubnetworkConnectionTypeType {

    ST_SIMPLE,
    ST_ADD_DROP_A,
    ST_ADD_DROP_Z,
    ST_INTERCONNECT,
    ST_DOUBLE_INTERCONNECT,
    ST_DOUBLE_ADD_DROP,
    ST_OPEN_ADD_DROP,
    ST_EXPLICIT;

    public String value() {
        return name();
    }

    public static SubnetworkConnectionTypeType fromValue(String v) {
        return valueOf(v);
    }

}
