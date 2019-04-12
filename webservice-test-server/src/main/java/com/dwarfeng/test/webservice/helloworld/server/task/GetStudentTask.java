package com.dwarfeng.test.webservice.helloworld.server.task;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.dutil.develop.backgr.AbstractTask;
import com.dwarfeng.test.webservice.getobj.server.struct.Student;

/**
 * 用于输出 HelloWorld 字符串的任务。
 * 
 * @author DwArFeng
 * @since 1.8
 */
public class GetStudentTask extends AbstractTask {

	protected Student value;

	@Override
	protected void todo() throws Exception {
		CT.trace(String.format("在线程 %s 中 -- 调用了getStudent方法...", Thread.currentThread().getName()));
		value = Student.STUDENT_DWARFENG;
	}

	public Student getValue() throws InterruptedException {
		awaitFinish();
		return value;
	}

}
