
package org.tmforum.mtop.vs.xsd.rr.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>E2EServiceEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="E2EServiceEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E_LINE"/>
 *     &lt;enumeration value="E_LAN"/>
 *     &lt;enumeration value="VPLS"/>
 *     &lt;enumeration value="PWE3_CES"/>
 *     &lt;enumeration value="PWE3_EES"/>
 *     &lt;enumeration value="PWE3_AES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "E2EServiceEnumType")
@XmlEnum
public enum E2EServiceEnumType {

    E_LINE("E_LINE"),
    E_LAN("E_LAN"),
    VPLS("VPLS"),
    @XmlEnumValue("PWE3_CES")
    PWE_3_CES("PWE3_CES"),
    @XmlEnumValue("PWE3_EES")
    PWE_3_EES("PWE3_EES"),
    @XmlEnumValue("PWE3_AES")
    PWE_3_AES("PWE3_AES");
    private final String value;

    E2EServiceEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static E2EServiceEnumType fromValue(String v) {
        for (E2EServiceEnumType c: E2EServiceEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
