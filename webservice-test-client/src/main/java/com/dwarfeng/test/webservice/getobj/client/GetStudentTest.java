package com.dwarfeng.test.webservice.getobj.client;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.test.webservice.getobj.server.GetStudentWebServiceImpl;
import com.dwarfeng.test.webservice.getobj.server.GetStudentWebServiceImplService;
import com.dwarfeng.test.webservice.getobj.server.Student;

/**
 * 客户端测试。
 * 
 * @author DwArFeng
 * @since 1.8
 */
public class GetStudentTest {

	public static void main(String[] args) {
		GetStudentWebServiceImpl fooWebServiceImplPort = new GetStudentWebServiceImplService()
				.getGetStudentWebServiceImplPort();

		Student student = fooWebServiceImplPort.getStudent();
		CT.trace(String.format("姓名：%s，性别：%s，生日：%d-%d-%d", student.getName(), student.getGender(),
				student.getBirthDay().getYear(), student.getBirthDay().getMonth(), student.getBirthDay().getDay()));
	}

}
