package com.dwarfeng.test.webservice.helloworld.server;

import javax.xml.ws.Endpoint;

import com.dwarfeng.dutil.basic.io.CT;

public class HelloWorldWebServicePublisher {

	private static final String WEBSERVICE_ADDRESS = "http://127.0.0.1:12450/hello-world";

	public static void main(String[] args) {
		Endpoint.publish(WEBSERVICE_ADDRESS, new HelloWorldWebServiceImpl());
		CT.trace("WebService 发布成功");
	}

}
