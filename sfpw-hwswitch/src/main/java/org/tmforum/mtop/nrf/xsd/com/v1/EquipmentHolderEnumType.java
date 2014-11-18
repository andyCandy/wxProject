
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EquipmentHolderEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentHolderEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="rack"/>
 *     &lt;enumeration value="shelf"/>
 *     &lt;enumeration value="sub_shelf"/>
 *     &lt;enumeration value="slot"/>
 *     &lt;enumeration value="sub_slot"/>
 *     &lt;enumeration value="remote_unit"/>
 *     &lt;enumeration value="remote_slots"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentHolderEnumType")
@XmlEnum
public enum EquipmentHolderEnumType {

    MINOR_EXT("MINOR_EXT"),
    @XmlEnumValue("rack")
    RACK("rack"),
    @XmlEnumValue("shelf")
    SHELF("shelf"),
    @XmlEnumValue("sub_shelf")
    SUB_SHELF("sub_shelf"),
    @XmlEnumValue("slot")
    SLOT("slot"),
    @XmlEnumValue("sub_slot")
    SUB_SLOT("sub_slot"),
    @XmlEnumValue("remote_unit")
    REMOTE_UNIT("remote_unit"),
    @XmlEnumValue("remote_slots")
    REMOTE_SLOTS("remote_slots");
    private final String value;

    EquipmentHolderEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentHolderEnumType fromValue(String v) {
        for (EquipmentHolderEnumType c: EquipmentHolderEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
