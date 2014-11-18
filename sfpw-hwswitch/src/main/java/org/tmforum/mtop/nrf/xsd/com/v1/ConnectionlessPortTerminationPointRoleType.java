
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConnectionlessPortTerminationPointRoleType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionlessPortTerminationPointRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CPTPR_FD_EDGE"/>
 *     &lt;enumeration value="CPTPR_FD_INTERNAL"/>
 *     &lt;enumeration value="CPTPR_ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectionlessPortTerminationPointRoleType")
@XmlEnum
public enum ConnectionlessPortTerminationPointRoleType {

    CPTPR_FD_EDGE,
    CPTPR_FD_INTERNAL,
    CPTPR_ALL;

    public String value() {
        return name();
    }

    public static ConnectionlessPortTerminationPointRoleType fromValue(String v) {
        return valueOf(v);
    }

}
