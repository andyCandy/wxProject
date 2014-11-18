
package org.tmforum.mtop.nra.xsd.pgp.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AvailabilityStatusEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AvailabilityStatusEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="InTest"/>
 *     &lt;enumeration value="Degraded"/>
 *     &lt;enumeration value="OK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvailabilityStatusEnumType")
@XmlEnum
public enum AvailabilityStatusEnumType {

    MINOR_EXT("MINOR_EXT"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("InTest")
    IN_TEST("InTest"),
    @XmlEnumValue("Degraded")
    DEGRADED("Degraded"),
    OK("OK");
    private final String value;

    AvailabilityStatusEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityStatusEnumType fromValue(String v) {
        for (AvailabilityStatusEnumType c: AvailabilityStatusEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
