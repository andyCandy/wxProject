
package org.tmforum.mtop.nrf.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TerminationPointProtectionAssociationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TerminationPointProtectionAssociationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TPPA_NA"/>
 *     &lt;enumeration value="TPPA_PSR_RELATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TerminationPointProtectionAssociationType")
@XmlEnum
public enum TerminationPointProtectionAssociationType {

    TPPA_NA,
    TPPA_PSR_RELATED;

    public String value() {
        return name();
    }

    public static TerminationPointProtectionAssociationType fromValue(String v) {
        return valueOf(v);
    }

}
