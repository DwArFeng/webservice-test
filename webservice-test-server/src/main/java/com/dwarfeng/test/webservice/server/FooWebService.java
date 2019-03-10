package com.dwarfeng.test.webservice.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dwarfeng.test.webservice.server.struct.Student;

/**
 * 测试用WebService，定义复数方法。
 * 
 * @author DwArFeng
 * @since 1.8
 */
@WebService
public interface FooWebService {

	@WebMethod
	public String HelloWorld();

	@WebMethod
	public Student getStudent();

	@WebMethod
	public void blocker();
}
