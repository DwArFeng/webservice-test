package com.dwarfeng.test.webservice.getobj.server;

import javax.xml.ws.Endpoint;

import com.dwarfeng.dutil.basic.io.CT;

public class GetStudentWebServicePublisher {

	private static final String WEBSERVICE_ADDRESS = "http://127.0.0.1:12450/get-student";

	public static void main(String[] args) {
		Endpoint.publish(WEBSERVICE_ADDRESS, new GetStudentWebServiceImpl());
		CT.trace("WebService 发布成功");
	}

}
