
package org.tmforum.mtop.nra.xsd.pm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InstanceEnumType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="InstanceEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATA"/>
 *     &lt;enumeration value="TCA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InstanceEnumType")
@XmlEnum
public enum InstanceEnumType {

    DATA,
    TCA;

    public String value() {
        return name();
    }

    public static InstanceEnumType fromValue(String v) {
        return valueOf(v);
    }

}
