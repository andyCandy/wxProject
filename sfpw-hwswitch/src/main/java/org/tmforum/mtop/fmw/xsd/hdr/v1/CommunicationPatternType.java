
package org.tmforum.mtop.fmw.xsd.hdr.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CommunicationPatternType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationPatternType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SimpleResponse"/>
 *     &lt;enumeration value="MultipleBatchResponse"/>
 *     &lt;enumeration value="BulkResponse"/>
 *     &lt;enumeration value="Notification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationPatternType")
@XmlEnum
public enum CommunicationPatternType {

    @XmlEnumValue("SimpleResponse")
    SIMPLE_RESPONSE("SimpleResponse"),
    @XmlEnumValue("MultipleBatchResponse")
    MULTIPLE_BATCH_RESPONSE("MultipleBatchResponse"),
    @XmlEnumValue("BulkResponse")
    BULK_RESPONSE("BulkResponse"),
    @XmlEnumValue("Notification")
    NOTIFICATION("Notification");
    private final String value;

    CommunicationPatternType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationPatternType fromValue(String v) {
        for (CommunicationPatternType c: CommunicationPatternType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
