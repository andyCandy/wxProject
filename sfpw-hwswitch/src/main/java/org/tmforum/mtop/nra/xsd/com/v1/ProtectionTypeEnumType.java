
package org.tmforum.mtop.nra.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProtectionTypeEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectionTypeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="VENDOR_EXT"/>
 *     &lt;enumeration value="MSP_APS"/>
 *     &lt;enumeration value="PGT_MSP_1_PLUS_1"/>
 *     &lt;enumeration value="PGT_MSP_1_FOR_N"/>
 *     &lt;enumeration value="PGT_2_FIBER_BLSR"/>
 *     &lt;enumeration value="PGT_4_FIBER_BLSR"/>
 *     &lt;enumeration value="PT_1VN"/>
 *     &lt;enumeration value="PT_1P1"/>
 *     &lt;enumeration value="PT_SNCP"/>
 *     &lt;enumeration value="PT_UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtectionTypeEnumType")
@XmlEnum
public enum ProtectionTypeEnumType {

    MINOR_EXT("MINOR_EXT"),
    VENDOR_EXT("VENDOR_EXT"),
    MSP_APS("MSP_APS"),
    PGT_MSP_1_PLUS_1("PGT_MSP_1_PLUS_1"),
    PGT_MSP_1_FOR_N("PGT_MSP_1_FOR_N"),
    PGT_2_FIBER_BLSR("PGT_2_FIBER_BLSR"),
    PGT_4_FIBER_BLSR("PGT_4_FIBER_BLSR"),
    @XmlEnumValue("PT_1VN")
    PT_1_VN("PT_1VN"),
    @XmlEnumValue("PT_1P1")
    PT_1_P_1("PT_1P1"),
    PT_SNCP("PT_SNCP"),
    PT_UNKNOWN("PT_UNKNOWN");
    private final String value;

    ProtectionTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtectionTypeEnumType fromValue(String v) {
        for (ProtectionTypeEnumType c: ProtectionTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
