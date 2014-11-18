
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DirectionalityType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionalityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D_NA"/>
 *     &lt;enumeration value="D_BIDIRECTIONAL"/>
 *     &lt;enumeration value="D_SOURCE"/>
 *     &lt;enumeration value="D_SINK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionalityType")
@XmlEnum
public enum DirectionalityType {

    D_NA,
    D_BIDIRECTIONAL,
    D_SOURCE,
    D_SINK;

    public String value() {
        return name();
    }

    public static DirectionalityType fromValue(String v) {
        return valueOf(v);
    }

}
