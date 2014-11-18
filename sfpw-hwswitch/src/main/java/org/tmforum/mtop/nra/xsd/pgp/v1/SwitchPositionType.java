
package org.tmforum.mtop.nra.xsd.pgp.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SwitchPositionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SwitchPositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IDLE"/>
 *     &lt;enumeration value="PASSTypeHROUGH"/>
 *     &lt;enumeration value="SWITCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwitchPositionType")
@XmlEnum
public enum SwitchPositionType {

    IDLE("IDLE"),
    @XmlEnumValue("PASSTypeHROUGH")
    PASS_TYPE_HROUGH("PASSTypeHROUGH"),
    SWITCH("SWITCH");
    private final String value;

    SwitchPositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwitchPositionType fromValue(String v) {
        for (SwitchPositionType c: SwitchPositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
