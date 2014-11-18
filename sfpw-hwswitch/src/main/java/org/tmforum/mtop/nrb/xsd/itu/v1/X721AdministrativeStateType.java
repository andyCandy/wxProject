
package org.tmforum.mtop.nrb.xsd.itu.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>X721.AdministrativeStateType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="X721.AdministrativeStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOCKED"/>
 *     &lt;enumeration value="UNLOCKED"/>
 *     &lt;enumeration value="SHUTTING_DOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "X721.AdministrativeStateType")
@XmlEnum
public enum X721AdministrativeStateType {

    LOCKED,
    UNLOCKED,
    SHUTTING_DOWN;

    public String value() {
        return name();
    }

    public static X721AdministrativeStateType fromValue(String v) {
        return valueOf(v);
    }

}
