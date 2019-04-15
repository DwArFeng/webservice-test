
package com.dwarfeng.test.webservice.block.server;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BlockWebServiceImpl", targetNamespace = "http://server.block.webservice.test.dwarfeng.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BlockWebServiceImpl {


    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getString", targetNamespace = "http://server.block.webservice.test.dwarfeng.com/", className = "com.dwarfeng.test.webservice.block.server.GetString")
    @ResponseWrapper(localName = "getStringResponse", targetNamespace = "http://server.block.webservice.test.dwarfeng.com/", className = "com.dwarfeng.test.webservice.block.server.GetStringResponse")
    @Action(input = "http://server.block.webservice.test.dwarfeng.com/BlockWebServiceImpl/getStringRequest", output = "http://server.block.webservice.test.dwarfeng.com/BlockWebServiceImpl/getStringResponse", fault = {
        @FaultAction(className = InterruptedException_Exception.class, value = "http://server.block.webservice.test.dwarfeng.com/BlockWebServiceImpl/getString/Fault/InterruptedException")
    })
    public String getString()
        throws InterruptedException_Exception
    ;

}
