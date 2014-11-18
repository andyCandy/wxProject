
package org.tmforum.mtop.nra.xsd.pgp.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SwitchModeEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SwitchModeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VENDOR_EXT"/>
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="SingleEnded"/>
 *     &lt;enumeration value="DualEnded"/>
 *     &lt;enumeration value="G841_NonStandard"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwitchModeEnumType")
@XmlEnum
public enum SwitchModeEnumType {

    VENDOR_EXT("VENDOR_EXT"),
    MINOR_EXT("MINOR_EXT"),
    @XmlEnumValue("SingleEnded")
    SINGLE_ENDED("SingleEnded"),
    @XmlEnumValue("DualEnded")
    DUAL_ENDED("DualEnded"),
    @XmlEnumValue("G841_NonStandard")
    G_841_NON_STANDARD("G841_NonStandard"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SwitchModeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwitchModeEnumType fromValue(String v) {
        for (SwitchModeEnumType c: SwitchModeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
