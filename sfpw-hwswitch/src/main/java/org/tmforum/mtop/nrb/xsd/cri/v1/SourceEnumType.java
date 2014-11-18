
package org.tmforum.mtop.nrb.xsd.cri.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SourceEnumType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="SourceEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NETWORK_ME"/>
 *     &lt;enumeration value="OS"/>
 *     &lt;enumeration value="NETWORK_EMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SourceEnumType")
@XmlEnum
public enum SourceEnumType {

    NETWORK_ME,
    OS,
    NETWORK_EMS;

    public String value() {
        return name();
    }

    public static SourceEnumType fromValue(String v) {
        return valueOf(v);
    }

}
