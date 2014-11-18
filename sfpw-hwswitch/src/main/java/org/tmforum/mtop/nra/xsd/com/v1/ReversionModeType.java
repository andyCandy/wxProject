
package org.tmforum.mtop.nra.xsd.com.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReversionModeType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ReversionModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NON_REVERTIVE"/>
 *     &lt;enumeration value="REVERTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReversionModeType")
@XmlEnum
public enum ReversionModeType {

    UNKNOWN,
    NON_REVERTIVE,
    REVERTIVE;

    public String value() {
        return name();
    }

    public static ReversionModeType fromValue(String v) {
        return valueOf(v);
    }

}
