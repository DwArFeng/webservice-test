package com.dwarfeng.test.webservice.client;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.test.webservice.server.FooWebServiceImpl;
import com.dwarfeng.test.webservice.server.FooWebServiceImplService;

/**
 * 客户端测试。
 * 
 * @author DwArFeng
 * @since 1.8
 */
public class HelloWorldTest {

	public static void main(String[] args) {
		FooWebServiceImpl fooWebServiceImplPort = new FooWebServiceImplService().getFooWebServiceImplPort();

		CT.trace(fooWebServiceImplPort.helloWorld());
	}

}
