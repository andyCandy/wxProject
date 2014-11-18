
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TerminationPointRole�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TerminationPointRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CM_END_POINT"/>
 *     &lt;enumeration value="LC_END_POINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TerminationPointRole")
@XmlEnum
public enum TerminationPointRole {

    CM_END_POINT,
    LC_END_POINT;

    public String value() {
        return name();
    }

    public static TerminationPointRole fromValue(String v) {
        return valueOf(v);
    }

}
