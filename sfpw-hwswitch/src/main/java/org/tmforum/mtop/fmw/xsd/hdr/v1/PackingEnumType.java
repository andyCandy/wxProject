
package org.tmforum.mtop.fmw.xsd.hdr.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PackingEnumType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="PackingEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_PACKING"/>
 *     &lt;enumeration value="ZIP"/>
 *     &lt;enumeration value="TAR"/>
 *     &lt;enumeration value="VENDOR_EXT"/>
 *     &lt;enumeration value="MINOR_EXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackingEnumType")
@XmlEnum
public enum PackingEnumType {

    NO_PACKING,
    ZIP,
    TAR,
    VENDOR_EXT,
    MINOR_EXT;

    public String value() {
        return name();
    }

    public static PackingEnumType fromValue(String v) {
        return valueOf(v);
    }

}
