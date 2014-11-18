
package org.tmforum.mtop.nra.xsd.pgp.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SpringProtocolEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SpringProtocolEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VENDOR_EXT"/>
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="TransOceanic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpringProtocolEnumType")
@XmlEnum
public enum SpringProtocolEnumType {

    VENDOR_EXT("VENDOR_EXT"),
    MINOR_EXT("MINOR_EXT"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("TransOceanic")
    TRANS_OCEANIC("TransOceanic");
    private final String value;

    SpringProtocolEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpringProtocolEnumType fromValue(String v) {
        for (SpringProtocolEnumType c: SpringProtocolEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
