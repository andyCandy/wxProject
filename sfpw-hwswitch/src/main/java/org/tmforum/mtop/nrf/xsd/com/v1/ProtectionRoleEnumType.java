
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProtectionRoleEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectionRoleEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="BACKUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtectionRoleEnumType")
@XmlEnum
public enum ProtectionRoleEnumType {

    MINOR_EXT,
    NA,
    PRIMARY,
    BACKUP;

    public String value() {
        return name();
    }

    public static ProtectionRoleEnumType fromValue(String v) {
        return valueOf(v);
    }

}
