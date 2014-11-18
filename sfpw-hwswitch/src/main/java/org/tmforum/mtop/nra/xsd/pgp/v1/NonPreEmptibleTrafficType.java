
package org.tmforum.mtop.nra.xsd.pgp.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NonPreEmptibleTrafficType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="NonPreEmptibleTrafficType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALLOWED"/>
 *     &lt;enumeration value="NOT_ALLOWED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonPreEmptibleTrafficType")
@XmlEnum
public enum NonPreEmptibleTrafficType {

    ALLOWED,
    NOT_ALLOWED;

    public String value() {
        return name();
    }

    public static NonPreEmptibleTrafficType fromValue(String v) {
        return valueOf(v);
    }

}
