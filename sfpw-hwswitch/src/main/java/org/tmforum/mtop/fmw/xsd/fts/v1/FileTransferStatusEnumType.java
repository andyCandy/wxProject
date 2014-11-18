
package org.tmforum.mtop.fmw.xsd.fts.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FileTransferStatusEnumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FileTransferStatusEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FT_IN_PROGRESS"/>
 *     &lt;enumeration value="FT_FAILED"/>
 *     &lt;enumeration value="FT_COMPLETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileTransferStatusEnumType")
@XmlEnum
public enum FileTransferStatusEnumType {

    FT_IN_PROGRESS,
    FT_FAILED,
    FT_COMPLETED;

    public String value() {
        return name();
    }

    public static FileTransferStatusEnumType fromValue(String v) {
        return valueOf(v);
    }

}
