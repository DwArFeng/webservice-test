package com.dwarfeng.test.webservice.block.server;

import javax.xml.ws.Endpoint;

import com.dwarfeng.dutil.basic.io.CT;

public class BlockWebServicePublisher {

	private static final String WEBSERVICE_ADDRESS = "http://127.0.0.1:12450/block";

	public static void main(String[] args) {
		Endpoint.publish(WEBSERVICE_ADDRESS, new BlockWebServiceImpl());
		CT.trace("WebService 发布成功");
	}

}
