
package org.tmforum.mtop.nra.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EquipmentSwitchReasonEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentSwitchReasonEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="VENDOR_EXT"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="FAILURE"/>
 *     &lt;enumeration value="MANUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentSwitchReasonEnumType")
@XmlEnum
public enum EquipmentSwitchReasonEnumType {

    MINOR_EXT,
    VENDOR_EXT,
    NOT_APPLICABLE,
    FAILURE,
    MANUAL;

    public String value() {
        return name();
    }

    public static EquipmentSwitchReasonEnumType fromValue(String v) {
        return valueOf(v);
    }

}
