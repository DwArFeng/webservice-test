
package com.dwarfeng.test.webservice.getobj.server;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetStudentWebServiceImpl", targetNamespace = "http://server.getobj.webservice.test.dwarfeng.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetStudentWebServiceImpl {


    /**
     * 
     * @return
     *     returns com.dwarfeng.test.webservice.getobj.server.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudent", targetNamespace = "http://server.getobj.webservice.test.dwarfeng.com/", className = "com.dwarfeng.test.webservice.getobj.server.GetStudent")
    @ResponseWrapper(localName = "getStudentResponse", targetNamespace = "http://server.getobj.webservice.test.dwarfeng.com/", className = "com.dwarfeng.test.webservice.getobj.server.GetStudentResponse")
    @Action(input = "http://server.getobj.webservice.test.dwarfeng.com/GetStudentWebServiceImpl/getStudentRequest", output = "http://server.getobj.webservice.test.dwarfeng.com/GetStudentWebServiceImpl/getStudentResponse")
    public Student getStudent();

}