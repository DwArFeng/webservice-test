package com.dwarfeng.test.webservice.helloworld.client;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.test.webservice.helloworld.server.HelloWorldWebServiceImpl;
import com.dwarfeng.test.webservice.helloworld.server.HelloWorldWebServiceImplService;

/**
 * 客户端测试。
 * 
 * @author DwArFeng
 * @since 1.8
 */
public class HelloWorldTest {

	public static void main(String[] args) {
		HelloWorldWebServiceImpl fooWebServiceImplPort = new HelloWorldWebServiceImplService()
				.getHelloWorldWebServiceImplPort();

		CT.trace(fooWebServiceImplPort.helloWorld());
	}

}
