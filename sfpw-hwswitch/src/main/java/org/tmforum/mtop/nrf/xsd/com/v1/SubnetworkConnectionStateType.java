
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SubnetworkConnectionStateType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="SubnetworkConnectionStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SNCS_NONEXISTENT"/>
 *     &lt;enumeration value="SNCS_PENDING"/>
 *     &lt;enumeration value="SNCS_ACTIVE"/>
 *     &lt;enumeration value="SNCS_PARTIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubnetworkConnectionStateType")
@XmlEnum
public enum SubnetworkConnectionStateType {

    SNCS_NONEXISTENT,
    SNCS_PENDING,
    SNCS_ACTIVE,
    SNCS_PARTIAL;

    public String value() {
        return name();
    }

    public static SubnetworkConnectionStateType fromValue(String v) {
        return valueOf(v);
    }

}
