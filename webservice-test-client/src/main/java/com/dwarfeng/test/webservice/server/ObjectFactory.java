
package com.dwarfeng.test.webservice.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dwarfeng.test.webservice.server package. 
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

    private final static QName _BlockerResponse_QNAME = new QName("http://server.webservice.test.dwarfeng.com/", "blockerResponse");
    private final static QName _Blocker_QNAME = new QName("http://server.webservice.test.dwarfeng.com/", "blocker");
    private final static QName _GetStudentResponse_QNAME = new QName("http://server.webservice.test.dwarfeng.com/", "getStudentResponse");
    private final static QName _HelloWorldResponse_QNAME = new QName("http://server.webservice.test.dwarfeng.com/", "HelloWorldResponse");
    private final static QName _GetStudent_QNAME = new QName("http://server.webservice.test.dwarfeng.com/", "getStudent");
    private final static QName _HelloWorld_QNAME = new QName("http://server.webservice.test.dwarfeng.com/", "HelloWorld");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dwarfeng.test.webservice.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Blocker }
     * 
     */
    public Blocker createBlocker() {
        return new Blocker();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link BlockerResponse }
     * 
     */
    public BlockerResponse createBlockerResponse() {
        return new BlockerResponse();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link GetStudent }
     * 
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

    /**
     * Create an instance of {@link HelloWorld }
     * 
     */
    public HelloWorld createHelloWorld() {
        return new HelloWorld();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.webservice.test.dwarfeng.com/", name = "blockerResponse")
    public JAXBElement<BlockerResponse> createBlockerResponse(BlockerResponse value) {
        return new JAXBElement<BlockerResponse>(_BlockerResponse_QNAME, BlockerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Blocker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.webservice.test.dwarfeng.com/", name = "blocker")
    public JAXBElement<Blocker> createBlocker(Blocker value) {
        return new JAXBElement<Blocker>(_Blocker_QNAME, Blocker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.webservice.test.dwarfeng.com/", name = "getStudentResponse")
    public JAXBElement<GetStudentResponse> createGetStudentResponse(GetStudentResponse value) {
        return new JAXBElement<GetStudentResponse>(_GetStudentResponse_QNAME, GetStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.webservice.test.dwarfeng.com/", name = "HelloWorldResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldResponse_QNAME, HelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.webservice.test.dwarfeng.com/", name = "getStudent")
    public JAXBElement<GetStudent> createGetStudent(GetStudent value) {
        return new JAXBElement<GetStudent>(_GetStudent_QNAME, GetStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.webservice.test.dwarfeng.com/", name = "HelloWorld")
    public JAXBElement<HelloWorld> createHelloWorld(HelloWorld value) {
        return new JAXBElement<HelloWorld>(_HelloWorld_QNAME, HelloWorld.class, null, value);
    }

}
