package com.dwarfeng.test.webservice.concurrent.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ConcurrentWebService {

	@WebMethod
	public void concurrentCall();

}
