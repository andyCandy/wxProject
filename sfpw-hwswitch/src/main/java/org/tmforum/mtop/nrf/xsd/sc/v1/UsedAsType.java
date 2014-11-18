
package org.tmforum.mtop.nrf.xsd.sc.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UsedAsType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="UsedAsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UA_WORKING"/>
 *     &lt;enumeration value="UA_PROTECTION"/>
 *     &lt;enumeration value="UA_DNI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsedAsType")
@XmlEnum
public enum UsedAsType {

    UA_WORKING,
    UA_PROTECTION,
    UA_DNI;

    public String value() {
        return name();
    }

    public static UsedAsType fromValue(String v) {
        return valueOf(v);
    }

}
