package com.dwarfeng.test.webservice.concurrent.server;

import javax.xml.ws.Endpoint;

import com.dwarfeng.dutil.basic.io.CT;

/**
 * FooWebService的发布器，使用此类发布该WebService。
 * 
 * @author DwArFeng
 * @since 1.8
 */
public class ConcurrentWebServicePublisher {

	private static final String WEBSERVICE_ADDRESS = "http://127.0.0.1:12450/concurrent";

	public static void main(String[] args) {
		Endpoint.publish(WEBSERVICE_ADDRESS, new ConcurrentWebServiceImpl());
		CT.trace("WebService 发布成功");
	}

}
