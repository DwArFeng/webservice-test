package com.dwarfeng.test.webservice.concurrent.client;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.test.webservice.concurrent.server.ConcurrentWebServiceImpl;
import com.dwarfeng.test.webservice.concurrent.server.ConcurrentWebServiceImplService;

/**
 * 测试 WebService 的并发处理方式。
 * 
 * @author DwArFeng
 * @since 1.8
 */
public class ConcurrentTest {

	private static final class ConcurrentTestRunner implements Runnable {

		private final ConcurrentWebServiceImpl webServiceImpl;
		private final int index;

		public ConcurrentTestRunner(ConcurrentWebServiceImpl webServiceImpl, int index) {
			this.webServiceImpl = webServiceImpl;
			this.index = index;
		}

		@Override
		public void run() {
			CT.trace(String.format("第 %d 号线程 -- 运行开始", index));
			webServiceImpl.concurrentCall();
			CT.trace(String.format("第 %d 号线程 -- 运行结束", index));
		}

	}

	public static void main(String[] args) {
		ConcurrentWebServiceImpl webServiceImplPort = new ConcurrentWebServiceImplService()
				.getConcurrentWebServiceImplPort();

		for (int i = 0; i < 512; i++) {
			new Thread(new ConcurrentTestRunner(webServiceImplPort, i)).start();
		}
	}

}
