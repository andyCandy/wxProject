
package org.tmforum.mtop.nrf.xsd.fdfr.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.tmforum.mtop.fmw.xsd.nam.v1.NamingAttributeType;


/**
 * <p>OspfInterfaceType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OspfInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interfaceName" type="{http://www.tmforum.org/mtop/fmw/xsd/nam/v1}NamingAttributeType"/>
 *         &lt;element name="helloInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deadInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transDelay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="drPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="runStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="backupDesignatedRouter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="designatedRouter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OspfInterfaceType", propOrder = {
    "interfaceName",
    "helloInterval",
    "deadInterval",
    "transDelay",
    "drPriority",
    "authType",
    "password",
    "runStatus",
    "backupDesignatedRouter",
    "designatedRouter"
})
public class OspfInterfaceType {

    @XmlElement(required = true)
    protected NamingAttributeType interfaceName;
    protected int helloInterval;
    protected int deadInterval;
    protected int transDelay;
    protected int drPriority;
    @XmlElement(required = true)
    protected String authType;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String runStatus;
    @XmlElement(required = true)
    protected String backupDesignatedRouter;
    @XmlElement(required = true)
    protected String designatedRouter;

    /**
     * ��ȡinterfaceName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NamingAttributeType }
     *     
     */
    public NamingAttributeType getInterfaceName() {
        return interfaceName;
    }

    /**
     * ����interfaceName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NamingAttributeType }
     *     
     */
    public void setInterfaceName(NamingAttributeType value) {
        this.interfaceName = value;
    }

    /**
     * ��ȡhelloInterval���Ե�ֵ��
     * 
     */
    public int getHelloInterval() {
        return helloInterval;
    }

    /**
     * ����helloInterval���Ե�ֵ��
     * 
     */
    public void setHelloInterval(int value) {
        this.helloInterval = value;
    }

    /**
     * ��ȡdeadInterval���Ե�ֵ��
     * 
     */
    public int getDeadInterval() {
        return deadInterval;
    }

    /**
     * ����deadInterval���Ե�ֵ��
     * 
     */
    public void setDeadInterval(int value) {
        this.deadInterval = value;
    }

    /**
     * ��ȡtransDelay���Ե�ֵ��
     * 
     */
    public int getTransDelay() {
        return transDelay;
    }

    /**
     * ����transDelay���Ե�ֵ��
     * 
     */
    public void setTransDelay(int value) {
        this.transDelay = value;
    }

    /**
     * ��ȡdrPriority���Ե�ֵ��
     * 
     */
    public int getDrPriority() {
        return drPriority;
    }

    /**
     * ����drPriority���Ե�ֵ��
     * 
     */
    public void setDrPriority(int value) {
        this.drPriority = value;
    }

    /**
     * ��ȡauthType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * ����authType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * ��ȡpassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����password���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * ��ȡrunStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunStatus() {
        return runStatus;
    }

    /**
     * ����runStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunStatus(String value) {
        this.runStatus = value;
    }

    /**
     * ��ȡbackupDesignatedRouter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupDesignatedRouter() {
        return backupDesignatedRouter;
    }

    /**
     * ����backupDesignatedRouter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupDesignatedRouter(String value) {
        this.backupDesignatedRouter = value;
    }

    /**
     * ��ȡdesignatedRouter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignatedRouter() {
        return designatedRouter;
    }

    /**
     * ����designatedRouter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatedRouter(String value) {
        this.designatedRouter = value;
    }

}
