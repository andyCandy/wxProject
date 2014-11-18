
package org.tmforum.mtop.nrb.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProtectionSchemeStateEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ProtectionSchemeStateEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINOR_EXT"/>
 *     &lt;enumeration value="PSS_UNKNOWN"/>
 *     &lt;enumeration value="PSS_AUTOMATIC"/>
 *     &lt;enumeration value="PSS_FORCED_OR_LOCKED_OUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtectionSchemeStateEnumType")
@XmlEnum
public enum ProtectionSchemeStateEnumType {

    MINOR_EXT,
    PSS_UNKNOWN,
    PSS_AUTOMATIC,
    PSS_FORCED_OR_LOCKED_OUT;

    public String value() {
        return name();
    }

    public static ProtectionSchemeStateEnumType fromValue(String v) {
        return valueOf(v);
    }

}
