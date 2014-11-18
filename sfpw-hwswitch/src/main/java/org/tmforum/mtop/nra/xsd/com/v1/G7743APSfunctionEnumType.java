
package org.tmforum.mtop.nra.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>G_774_3_APSfunctionEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="G_774_3_APSfunctionEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="VENDOR_EXT"/>
 *     &lt;enumeration value="G.783"/>
 *     &lt;enumeration value="Legacy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "G_774_3_APSfunctionEnumType")
@XmlEnum
public enum G7743APSfunctionEnumType {

    MINOR_EXT("MINOR_EXT"),
    VENDOR_EXT("VENDOR_EXT"),
    @XmlEnumValue("G.783")
    G_783("G.783"),
    @XmlEnumValue("Legacy")
    LEGACY("Legacy");
    private final String value;

    G7743APSfunctionEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static G7743APSfunctionEnumType fromValue(String v) {
        for (G7743APSfunctionEnumType c: G7743APSfunctionEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
