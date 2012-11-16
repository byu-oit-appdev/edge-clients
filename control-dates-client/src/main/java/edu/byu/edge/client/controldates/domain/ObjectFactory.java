//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.16 at 12:58:24 PM MST 
//


package edu.byu.edge.client.controldates.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.byu.edge.client.controldates.domain package. 
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

    private final static QName _ControlDatesWSService_QNAME = new QName("uri://byu/c/ae/prod/controls/cgi/controlDatesWS.cgi", "ControlDatesWSService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.byu.edge.client.controldates.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link DateListType }
     * 
     */
    public DateListType createDateListType() {
        return new DateListType();
    }

    /**
     * Create an instance of {@link DateRowType }
     * 
     */
    public DateRowType createDateRowType() {
        return new DateRowType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link ControlDatesWSServiceType }
     * 
     */
    public ControlDatesWSServiceType createControlDatesWSServiceType() {
        return new ControlDatesWSServiceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlDatesWSServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri://byu/c/ae/prod/controls/cgi/controlDatesWS.cgi", name = "ControlDatesWSService")
    public JAXBElement<ControlDatesWSServiceType> createControlDatesWSService(ControlDatesWSServiceType value) {
        return new JAXBElement<ControlDatesWSServiceType>(_ControlDatesWSService_QNAME, ControlDatesWSServiceType.class, null, value);
    }

}
