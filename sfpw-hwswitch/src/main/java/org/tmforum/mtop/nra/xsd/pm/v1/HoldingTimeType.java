
package org.tmforum.mtop.nra.xsd.pm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HoldingTimeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HoldingTimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="storeTime24hr"/>
 *     &lt;enumeration value="storeTime15min"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HoldingTimeType")
@XmlEnum
public enum HoldingTimeType {

    @XmlEnumValue("storeTime24hr")
    STORE_TIME_24_HR("storeTime24hr"),
    @XmlEnumValue("storeTime15min")
    STORE_TIME_15_MIN("storeTime15min");
    private final String value;

    HoldingTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoldingTimeType fromValue(String v) {
        for (HoldingTimeType c: HoldingTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
