
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProtectionEffortType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectionEffortType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EFFORT_WHATEVER"/>
 *     &lt;enumeration value="EFFORT_SAME_OR_BETTER"/>
 *     &lt;enumeration value="EFFORT_SAME_OR_WORSE"/>
 *     &lt;enumeration value="EFFORT_SAME "/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtectionEffortType")
@XmlEnum
public enum ProtectionEffortType {

    EFFORT_WHATEVER("EFFORT_WHATEVER"),
    EFFORT_SAME_OR_BETTER("EFFORT_SAME_OR_BETTER"),
    EFFORT_SAME_OR_WORSE("EFFORT_SAME_OR_WORSE"),
    @XmlEnumValue("EFFORT_SAME ")
    EFFORT_SAME("EFFORT_SAME ");
    private final String value;

    ProtectionEffortType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtectionEffortType fromValue(String v) {
        for (ProtectionEffortType c: ProtectionEffortType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
