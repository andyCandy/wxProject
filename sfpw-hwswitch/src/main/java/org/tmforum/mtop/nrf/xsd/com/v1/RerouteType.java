
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RerouteType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="RerouteType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RR_NA"/>
 *     &lt;enumeration value="RR_NO"/>
 *     &lt;enumeration value="RR_YES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RerouteType")
@XmlEnum
public enum RerouteType {

    RR_NA,
    RR_NO,
    RR_YES;

    public String value() {
        return name();
    }

    public static RerouteType fromValue(String v) {
        return valueOf(v);
    }

}
