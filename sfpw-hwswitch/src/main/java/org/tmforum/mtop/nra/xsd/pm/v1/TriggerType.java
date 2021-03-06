
package org.tmforum.mtop.nra.xsd.pm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TriggerType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="raise"/>
 *     &lt;enumeration value="clear"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriggerType")
@XmlEnum
public enum TriggerType {

    @XmlEnumValue("raise")
    RAISE("raise"),
    @XmlEnumValue("clear")
    CLEAR("clear");
    private final String value;

    TriggerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerType fromValue(String v) {
        for (TriggerType c: TriggerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
