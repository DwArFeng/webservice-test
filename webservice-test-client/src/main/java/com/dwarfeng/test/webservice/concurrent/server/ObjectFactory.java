
package com.dwarfeng.test.webservice.concurrent.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dwarfeng.test.webservice.concurrent.server package. 
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

    private final static QName _ConcurrentCall_QNAME = new QName("http://server.concurrent.webservice.test.dwarfeng.com/", "concurrentCall");
    private final static QName _ConcurrentCallResponse_QNAME = new QName("http://server.concurrent.webservice.test.dwarfeng.com/", "concurrentCallResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dwarfeng.test.webservice.concurrent.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConcurrentCallResponse }
     * 
     */
    public ConcurrentCallResponse createConcurrentCallResponse() {
        return new ConcurrentCallResponse();
    }

    /**
     * Create an instance of {@link ConcurrentCall }
     * 
     */
    public ConcurrentCall createConcurrentCall() {
        return new ConcurrentCall();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcurrentCall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.concurrent.webservice.test.dwarfeng.com/", name = "concurrentCall")
    public JAXBElement<ConcurrentCall> createConcurrentCall(ConcurrentCall value) {
        return new JAXBElement<ConcurrentCall>(_ConcurrentCall_QNAME, ConcurrentCall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcurrentCallResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.concurrent.webservice.test.dwarfeng.com/", name = "concurrentCallResponse")
    public JAXBElement<ConcurrentCallResponse> createConcurrentCallResponse(ConcurrentCallResponse value) {
        return new JAXBElement<ConcurrentCallResponse>(_ConcurrentCallResponse_QNAME, ConcurrentCallResponse.class, null, value);
    }

}
