
package org.tmforum.mtop.nrb.xsd.itu.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>M3100.ArcStateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="M3100.ArcStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALM"/>
 *     &lt;enumeration value="NALM"/>
 *     &lt;enumeration value="NALMTypeIMED_INHIBIT"/>
 *     &lt;enumeration value="NALM_QUALIFIED_INHIBIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "M3100.ArcStateType")
@XmlEnum
public enum M3100ArcStateType {

    ALM("ALM"),
    NALM("NALM"),
    @XmlEnumValue("NALMTypeIMED_INHIBIT")
    NALM_TYPE_IMED_INHIBIT("NALMTypeIMED_INHIBIT"),
    NALM_QUALIFIED_INHIBIT("NALM_QUALIFIED_INHIBIT");
    private final String value;

    M3100ArcStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static M3100ArcStateType fromValue(String v) {
        for (M3100ArcStateType c: M3100ArcStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
