
package org.tmforum.mtop.fmw.xsd.hdr.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompressionEnumType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="CompressionEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_COMPRESSION"/>
 *     &lt;enumeration value="GZIP"/>
 *     &lt;enumeration value="VENDOR_EXT"/>
 *     &lt;enumeration value="MINOR_EXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompressionEnumType")
@XmlEnum
public enum CompressionEnumType {

    NO_COMPRESSION,
    GZIP,
    VENDOR_EXT,
    MINOR_EXT;

    public String value() {
        return name();
    }

    public static CompressionEnumType fromValue(String v) {
        return valueOf(v);
    }

}
