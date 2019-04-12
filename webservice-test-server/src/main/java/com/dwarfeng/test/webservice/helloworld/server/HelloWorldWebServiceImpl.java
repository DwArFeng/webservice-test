package com.dwarfeng.test.webservice.helloworld.server;

import javax.jws.WebService;

import com.dwarfeng.dutil.basic.io.CT;

@WebService
public class HelloWorldWebServiceImpl implements HelloWorldWebService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String HelloWorld() {
		CT.trace(String.format("在线程 %s 中 -- 调用了helloWorld方法...", Thread.currentThread().getName()));
		return "Hello World!";
	}

}
