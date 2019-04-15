package com.dwarfeng.test.webservice.block.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BlockWebService {

	@WebMethod
	public String getString() throws InterruptedException;

}
