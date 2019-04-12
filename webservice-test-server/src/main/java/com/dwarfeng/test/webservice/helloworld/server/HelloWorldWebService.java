package com.dwarfeng.test.webservice.helloworld.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorldWebService {

	@WebMethod
	public String HelloWorld();

}
