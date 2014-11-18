
package org.tmforum.mtop.nra.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EquipmentProtectionGroupTypeEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentProtectionGroupTypeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="M_FOR_N"/>
 *     &lt;enumeration value="M:N"/>
 *     &lt;enumeration value="EPG_1_PLUS_1"/>
 *     &lt;enumeration value="EPG_INBD_1_PLUS_1"/>
 *     &lt;enumeration value="EPG_1_FOR_N"/>
 *     &lt;enumeration value="BPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentProtectionGroupTypeEnumType")
@XmlEnum
public enum EquipmentProtectionGroupTypeEnumType {

    MINOR_EXT("MINOR_EXT"),
    M_FOR_N("M_FOR_N"),
    @XmlEnumValue("M:N")
    M_N("M:N"),
    EPG_1_PLUS_1("EPG_1_PLUS_1"),
    EPG_INBD_1_PLUS_1("EPG_INBD_1_PLUS_1"),
    EPG_1_FOR_N("EPG_1_FOR_N"),
    BPS("BPS");
    private final String value;

    EquipmentProtectionGroupTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentProtectionGroupTypeEnumType fromValue(String v) {
        for (EquipmentProtectionGroupTypeEnumType c: EquipmentProtectionGroupTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
