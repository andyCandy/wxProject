
package org.tmforum.mtop.nra.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SwitchReasonType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SwitchReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="RESTORED"/>
 *     &lt;enumeration value="SIGNAL_FAIL"/>
 *     &lt;enumeration value="SIGNAL_MISMATCH"/>
 *     &lt;enumeration value="SIGNAL_DEGRADE"/>
 *     &lt;enumeration value="AUTOMATIC_SWITCH"/>
 *     &lt;enumeration value="MANUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwitchReasonType")
@XmlEnum
public enum SwitchReasonType {

    NOT_APPLICABLE,
    RESTORED,
    SIGNAL_FAIL,
    SIGNAL_MISMATCH,
    SIGNAL_DEGRADE,
    AUTOMATIC_SWITCH,
    MANUAL;

    public String value() {
        return name();
    }

    public static SwitchReasonType fromValue(String v) {
        return valueOf(v);
    }

}
