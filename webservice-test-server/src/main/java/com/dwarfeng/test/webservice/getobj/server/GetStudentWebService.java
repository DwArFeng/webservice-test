package com.dwarfeng.test.webservice.getobj.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dwarfeng.test.webservice.getobj.server.struct.Student;

@WebService
public interface GetStudentWebService {

	@WebMethod
	public Student getStudent();

}
