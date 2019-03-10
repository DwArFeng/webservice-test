package com.dwarfeng.test.webservice.server;

import javax.xml.ws.Endpoint;

import com.dwarfeng.dutil.basic.io.CT;

/**
 * FooWebService的发布器，使用此类发布该WebService。
 * 
 * @author DwArFeng
 * @since 1.8
 */
public class FooWebServicePublisher {

	private static final String WEBSERVICE_ADDRESS = "http://192.168.0.105:8989/FooWebService";

	public static void main(String[] args) {
		Endpoint.publish(WEBSERVICE_ADDRESS, new FooWebServiceImpl());
		CT.trace("WebService 发布成功");
	}

}
