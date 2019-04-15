
package com.dwarfeng.test.webservice.block.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dwarfeng.test.webservice.block.server package. 
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

    private final static QName _GetStringResponse_QNAME = new QName("http://server.block.webservice.test.dwarfeng.com/", "getStringResponse");
    private final static QName _InterruptedException_QNAME = new QName("http://server.block.webservice.test.dwarfeng.com/", "InterruptedException");
    private final static QName _GetString_QNAME = new QName("http://server.block.webservice.test.dwarfeng.com/", "getString");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dwarfeng.test.webservice.block.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStringResponse }
     * 
     */
    public GetStringResponse createGetStringResponse() {
        return new GetStringResponse();
    }

    /**
     * Create an instance of {@link GetString }
     * 
     */
    public GetString createGetString() {
        return new GetString();
    }

    /**
     * Create an instance of {@link InterruptedException }
     * 
     */
    public InterruptedException createInterruptedException() {
        return new InterruptedException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.block.webservice.test.dwarfeng.com/", name = "getStringResponse")
    public JAXBElement<GetStringResponse> createGetStringResponse(GetStringResponse value) {
        return new JAXBElement<GetStringResponse>(_GetStringResponse_QNAME, GetStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterruptedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.block.webservice.test.dwarfeng.com/", name = "InterruptedException")
    public JAXBElement<InterruptedException> createInterruptedException(InterruptedException value) {
        return new JAXBElement<InterruptedException>(_InterruptedException_QNAME, InterruptedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.block.webservice.test.dwarfeng.com/", name = "getString")
    public JAXBElement<GetString> createGetString(GetString value) {
        return new JAXBElement<GetString>(_GetString_QNAME, GetString.class, null, value);
    }

}
