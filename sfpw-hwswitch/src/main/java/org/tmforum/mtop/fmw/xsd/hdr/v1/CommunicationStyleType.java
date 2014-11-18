
package org.tmforum.mtop.fmw.xsd.hdr.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CommunicationStyleType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationStyleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MSG"/>
 *     &lt;enumeration value="RPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationStyleType")
@XmlEnum
public enum CommunicationStyleType {

    MSG,
    RPC;

    public String value() {
        return name();
    }

    public static CommunicationStyleType fromValue(String v) {
        return valueOf(v);
    }

}
