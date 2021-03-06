
package org.tmforum.mtop.nra.xsd.tca.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AcknowledgeIndicationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgeIndicationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVENT_ACKNOWLEDGED"/>
 *     &lt;enumeration value="EVENT_UNACKNOWLEDGED"/>
 *     &lt;enumeration value="NA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgeIndicationType")
@XmlEnum
public enum AcknowledgeIndicationType {

    EVENT_ACKNOWLEDGED,
    EVENT_UNACKNOWLEDGED,
    NA;

    public String value() {
        return name();
    }

    public static AcknowledgeIndicationType fromValue(String v) {
        return valueOf(v);
    }

}
