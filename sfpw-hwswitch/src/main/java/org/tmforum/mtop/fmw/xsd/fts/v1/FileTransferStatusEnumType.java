
package org.tmforum.mtop.fmw.xsd.fts.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FileTransferStatusEnumType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
