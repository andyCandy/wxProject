
package org.tmforum.mtop.nrb.xsd.itu.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>M3100.HolderStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="M3100.HolderStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOLDER_EMPTY"/>
 *     &lt;enumeration value="INTypeHE_ACCEPTABLE_LIST"/>
 *     &lt;enumeration value="NOT_INTypeHE_ACCEPTABLE_LIST"/>
 *     &lt;enumeration value="UNKNOWNTypeYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "M3100.HolderStatusType")
@XmlEnum
public enum M3100HolderStatusType {

    HOLDER_EMPTY("HOLDER_EMPTY"),
    @XmlEnumValue("INTypeHE_ACCEPTABLE_LIST")
    IN_TYPE_HE_ACCEPTABLE_LIST("INTypeHE_ACCEPTABLE_LIST"),
    @XmlEnumValue("NOT_INTypeHE_ACCEPTABLE_LIST")
    NOT_IN_TYPE_HE_ACCEPTABLE_LIST("NOT_INTypeHE_ACCEPTABLE_LIST"),
    @XmlEnumValue("UNKNOWNTypeYPE")
    UNKNOWN_TYPE_YPE("UNKNOWNTypeYPE");
    private final String value;

    M3100HolderStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static M3100HolderStatusType fromValue(String v) {
        for (M3100HolderStatusType c: M3100HolderStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
