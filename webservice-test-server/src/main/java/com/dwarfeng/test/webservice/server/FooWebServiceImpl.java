package com.dwarfeng.test.webservice.server;

import java.util.Collections;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;

import javax.jws.WebService;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.dutil.basic.threads.NumberedThreadFactory;
import com.dwarfeng.dutil.develop.backgr.Background;
import com.dwarfeng.dutil.develop.backgr.ExecutorServiceBackground;
import com.dwarfeng.test.webservice.server.struct.Student;
import com.dwarfeng.test.webservice.server.task.GetStudentTask;
import com.dwarfeng.test.webservice.server.task.HelloWorldTask;

/**
 * FooWebService的一种实现，使用多线程并发完成方法。
 * 
 * @author DwArFeng
 * @since 1.8
 */
@WebService
public class FooWebServiceImpl implements FooWebService {

	private final Background background = new ExecutorServiceBackground(
			Executors.newFixedThreadPool(4, new NumberedThreadFactory("webservice")),
			Collections.newSetFromMap(new WeakHashMap<>()));

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String HelloWorld() {
		HelloWorldTask task = new HelloWorldTask();
		background.submit(task);
		try {
			return task.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Student getStudent() {
		GetStudentTask task = new GetStudentTask();
		background.submit(task);
		try {
			return task.getValue();
		} catch (InterruptedException e) {
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void blocker() {
		CT.trace(String.format("在线程 %s 中 -- 调用了blocker方法...", Thread.currentThread().getName()));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
