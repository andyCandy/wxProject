
package org.tmforum.mtop.fmw.xsd.msg.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmforum.mtop.fmw.xsd.msg.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InvalidInput_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "invalidInput");
    private final static QName _UnableToComply_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "unableToComply");
    private final static QName _UnsupportedCompressionFormat_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "unsupportedCompressionFormat");
    private final static QName _TooManyOpenIterators_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "tooManyOpenIterators");
    private final static QName _NotImplemented_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "notImplemented");
    private final static QName _UserlabelInUse_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "userlabelInUse");
    private final static QName _AccessDenied_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "accessDenied");
    private final static QName _CapacityExceeded_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "capacityExceeded");
    private final static QName _ObjectInUse_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "objectInUse");
    private final static QName _CommLoss_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "commLoss");
    private final static QName _UnsupportedRoutingConstraints_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "unsupportedRoutingConstraints");
    private final static QName _EntityNotFound_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "entityNotFound");
    private final static QName _TimeslotInUse_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "timeslotInUse");
    private final static QName _InvalidTopic_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "invalidTopic");
    private final static QName _TpInvalidEndPoint_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "tpInvalidEndPoint");
    private final static QName _NotificationServiceProblem_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "notificationServiceProblem");
    private final static QName _UnsupportedPackingFormat_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "unsupportedPackingFormat");
    private final static QName _ProtectionEffortNotMet_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "protectionEffortNotMet");
    private final static QName _InvalidFilterDefinition_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "invalidFilterDefinition");
    private final static QName _InternalError_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "internalError");
    private final static QName _NotInValidState_QNAME = new QName("http://www.tmforum.org/mtop/fmw/xsd/msg/v1", "notInValidState");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmforum.mtop.fmw.xsd.msg.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BaseExceptionMessageType }
     * 
     */
    public BaseExceptionMessageType createBaseExceptionMessageType() {
        return new BaseExceptionMessageType();
    }

    /**
     * Create an instance of {@link GetAllDataIteratorRequestType }
     * 
     */
    public GetAllDataIteratorRequestType createGetAllDataIteratorRequestType() {
        return new GetAllDataIteratorRequestType();
    }

    /**
     * Create an instance of {@link GetAllDataIteratorExceptionType }
     * 
     */
    public GetAllDataIteratorExceptionType createGetAllDataIteratorExceptionType() {
        return new GetAllDataIteratorExceptionType();
    }

    /**
     * Create an instance of {@link AllExceptionsType }
     * 
     */
    public AllExceptionsType createAllExceptionsType() {
        return new AllExceptionsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "invalidInput")
    public JAXBElement<BaseExceptionMessageType> createInvalidInput(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_InvalidInput_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "unableToComply")
    public JAXBElement<BaseExceptionMessageType> createUnableToComply(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_UnableToComply_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "unsupportedCompressionFormat")
    public JAXBElement<BaseExceptionMessageType> createUnsupportedCompressionFormat(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_UnsupportedCompressionFormat_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "tooManyOpenIterators")
    public JAXBElement<BaseExceptionMessageType> createTooManyOpenIterators(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_TooManyOpenIterators_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "notImplemented")
    public JAXBElement<BaseExceptionMessageType> createNotImplemented(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_NotImplemented_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "userlabelInUse")
    public JAXBElement<BaseExceptionMessageType> createUserlabelInUse(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_UserlabelInUse_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "accessDenied")
    public JAXBElement<BaseExceptionMessageType> createAccessDenied(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_AccessDenied_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "capacityExceeded")
    public JAXBElement<BaseExceptionMessageType> createCapacityExceeded(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_CapacityExceeded_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "objectInUse")
    public JAXBElement<BaseExceptionMessageType> createObjectInUse(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_ObjectInUse_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "commLoss")
    public JAXBElement<BaseExceptionMessageType> createCommLoss(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_CommLoss_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "unsupportedRoutingConstraints")
    public JAXBElement<BaseExceptionMessageType> createUnsupportedRoutingConstraints(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_UnsupportedRoutingConstraints_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "entityNotFound")
    public JAXBElement<BaseExceptionMessageType> createEntityNotFound(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_EntityNotFound_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "timeslotInUse")
    public JAXBElement<BaseExceptionMessageType> createTimeslotInUse(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_TimeslotInUse_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "invalidTopic")
    public JAXBElement<BaseExceptionMessageType> createInvalidTopic(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_InvalidTopic_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "tpInvalidEndPoint")
    public JAXBElement<BaseExceptionMessageType> createTpInvalidEndPoint(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_TpInvalidEndPoint_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "notificationServiceProblem")
    public JAXBElement<BaseExceptionMessageType> createNotificationServiceProblem(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_NotificationServiceProblem_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "unsupportedPackingFormat")
    public JAXBElement<BaseExceptionMessageType> createUnsupportedPackingFormat(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_UnsupportedPackingFormat_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "protectionEffortNotMet")
    public JAXBElement<BaseExceptionMessageType> createProtectionEffortNotMet(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_ProtectionEffortNotMet_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "invalidFilterDefinition")
    public JAXBElement<BaseExceptionMessageType> createInvalidFilterDefinition(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_InvalidFilterDefinition_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "internalError")
    public JAXBElement<BaseExceptionMessageType> createInternalError(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_InternalError_QNAME, BaseExceptionMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseExceptionMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmforum.org/mtop/fmw/xsd/msg/v1", name = "notInValidState")
    public JAXBElement<BaseExceptionMessageType> createNotInValidState(BaseExceptionMessageType value) {
        return new JAXBElement<BaseExceptionMessageType>(_NotInValidState_QNAME, BaseExceptionMessageType.class, null, value);
    }

}
