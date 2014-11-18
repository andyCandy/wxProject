
package org.tmforum.mtop.nra.xsd.com.v1;

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
 *     &lt;enumeration value="ACKNOWLEDGED"/>
 *     &lt;enumeration value="UNACKNOWLEDGED"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgeIndicationType")
@XmlEnum
public enum AcknowledgeIndicationType {

    ACKNOWLEDGED,
    UNACKNOWLEDGED,
    NOT_APPLICABLE;

    public String value() {
        return name();
    }

    public static AcknowledgeIndicationType fromValue(String v) {
        return valueOf(v);
    }

}
