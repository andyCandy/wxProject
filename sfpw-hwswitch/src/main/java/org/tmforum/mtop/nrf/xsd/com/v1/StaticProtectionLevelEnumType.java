
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StaticProtectionLevelEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="StaticProtectionLevelEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="PREEMPTIBLE"/>
 *     &lt;enumeration value="UNPROTECTED"/>
 *     &lt;enumeration value="PARTIALLY_PROTECTED"/>
 *     &lt;enumeration value="FULLY_PROTECTED"/>
 *     &lt;enumeration value="HIGHLY_PROTECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StaticProtectionLevelEnumType")
@XmlEnum
public enum StaticProtectionLevelEnumType {

    MINOR_EXT,
    PREEMPTIBLE,
    UNPROTECTED,
    PARTIALLY_PROTECTED,
    FULLY_PROTECTED,
    HIGHLY_PROTECTED;

    public String value() {
        return name();
    }

    public static StaticProtectionLevelEnumType fromValue(String v) {
        return valueOf(v);
    }

}
