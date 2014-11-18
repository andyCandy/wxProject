
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TerminationModeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TerminationModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TM_NA"/>
 *     &lt;enumeration value="TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING"/>
 *     &lt;enumeration value="TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TerminationModeType")
@XmlEnum
public enum TerminationModeType {

    TM_NA,
    TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING,
    TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING;

    public String value() {
        return name();
    }

    public static TerminationModeType fromValue(String v) {
        return valueOf(v);
    }

}
