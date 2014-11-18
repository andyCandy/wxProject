
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HolderStateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HolderStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMPTY"/>
 *     &lt;enumeration value="INSTALLED_AND_EXPECTED"/>
 *     &lt;enumeration value="EXPECTED_AND_NOT_INSTALLED"/>
 *     &lt;enumeration value="INSTALLED_AND_NOT_EXPECTED"/>
 *     &lt;enumeration value="MISMATCH_OF_INSTALLED_AND_EXPECTED"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HolderStateType")
@XmlEnum
public enum HolderStateType {

    EMPTY,
    INSTALLED_AND_EXPECTED,
    EXPECTED_AND_NOT_INSTALLED,
    INSTALLED_AND_NOT_EXPECTED,
    MISMATCH_OF_INSTALLED_AND_EXPECTED,
    UNAVAILABLE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static HolderStateType fromValue(String v) {
        return valueOf(v);
    }

}
