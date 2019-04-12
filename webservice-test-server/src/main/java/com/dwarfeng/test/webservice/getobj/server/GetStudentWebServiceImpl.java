package com.dwarfeng.test.webservice.getobj.server;

import javax.jws.WebService;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.test.webservice.getobj.server.struct.Student;

@WebService
public class GetStudentWebServiceImpl implements GetStudentWebService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Student getStudent() {
		CT.trace(String.format("在线程 %s 中 -- 调用了getStudent方法...", Thread.currentThread().getName()));
		return Student.STUDENT_DWARFENG;
	}

}
