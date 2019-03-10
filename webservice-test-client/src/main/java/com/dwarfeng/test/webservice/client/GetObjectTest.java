package com.dwarfeng.test.webservice.client;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.test.webservice.server.FooWebServiceImpl;
import com.dwarfeng.test.webservice.server.FooWebServiceImplService;
import com.dwarfeng.test.webservice.server.Student;

/**
 * 客户端测试。
 * 
 * @author DwArFeng
 * @since 1.8
 */
public class GetObjectTest {

	public static void main(String[] args) {
		FooWebServiceImpl fooWebServiceImplPort = new FooWebServiceImplService().getFooWebServiceImplPort();

		Student student = fooWebServiceImplPort.getStudent();
		CT.trace(String.format("姓名：%s，性别：%s，生日：%d-%d-%d", student.getName(), student.getGender(),
				student.getBirthDay().getYear(), student.getBirthDay().getMonth(), student.getBirthDay().getDay()));
	}

}
