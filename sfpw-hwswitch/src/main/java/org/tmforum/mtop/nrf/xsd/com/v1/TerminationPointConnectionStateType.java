
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TerminationPointConnectionStateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TerminationPointConnectionStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TPCS_NA"/>
 *     &lt;enumeration value="TPCS_SOURCE_CONNECTED"/>
 *     &lt;enumeration value="TPCS_SINK_CONNECTED"/>
 *     &lt;enumeration value="TPCS_BI_CONNECTED"/>
 *     &lt;enumeration value="TPCS_NOT_CONNECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TerminationPointConnectionStateType")
@XmlEnum
public enum TerminationPointConnectionStateType {

    TPCS_NA,
    TPCS_SOURCE_CONNECTED,
    TPCS_SINK_CONNECTED,
    TPCS_BI_CONNECTED,
    TPCS_NOT_CONNECTED;

    public String value() {
        return name();
    }

    public static TerminationPointConnectionStateType fromValue(String v) {
        return valueOf(v);
    }

}
