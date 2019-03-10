package com.dwarfeng.test.webservice.server.task;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.dutil.develop.backgr.AbstractTask;

/**
 * 用于输出 HelloWorld 字符串的任务。
 * 
 * @author DwArFeng
 * @since 1.8
 */
public class HelloWorldTask extends AbstractTask {

	protected String value;

	@Override
	protected void todo() throws Exception {
		CT.trace(String.format("在线程 %s 中 -- 调用了helloWorld方法...", Thread.currentThread().getName()));
		value = "Hello World!";
	}

	public String getValue() throws InterruptedException {
		awaitFinish();
		return value;
	}

}
