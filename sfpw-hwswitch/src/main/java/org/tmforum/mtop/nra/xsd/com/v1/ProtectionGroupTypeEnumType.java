
package org.tmforum.mtop.nra.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProtectionGroupTypeEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectionGroupTypeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="PGT_MSP_1_PLUS_1"/>
 *     &lt;enumeration value="PGT_MSP_1_FOR_N"/>
 *     &lt;enumeration value="PGT_2_FIBER_BLSR"/>
 *     &lt;enumeration value="PGT_4_FIBER_BLSR"/>
 *     &lt;enumeration value="PGT_1VN"/>
 *     &lt;enumeration value="PGT_1P1"/>
 *     &lt;enumeration value="PGT_UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtectionGroupTypeEnumType")
@XmlEnum
public enum ProtectionGroupTypeEnumType {

    MINOR_EXT("MINOR_EXT"),
    PGT_MSP_1_PLUS_1("PGT_MSP_1_PLUS_1"),
    PGT_MSP_1_FOR_N("PGT_MSP_1_FOR_N"),
    PGT_2_FIBER_BLSR("PGT_2_FIBER_BLSR"),
    PGT_4_FIBER_BLSR("PGT_4_FIBER_BLSR"),
    @XmlEnumValue("PGT_1VN")
    PGT_1_VN("PGT_1VN"),
    @XmlEnumValue("PGT_1P1")
    PGT_1_P_1("PGT_1P1"),
    PGT_UNKNOWN("PGT_UNKNOWN");
    private final String value;

    ProtectionGroupTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtectionGroupTypeEnumType fromValue(String v) {
        for (ProtectionGroupTypeEnumType c: ProtectionGroupTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
