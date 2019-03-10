package com.dwarfeng.test.webservice.client;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.test.webservice.server.FooWebServiceImpl;
import com.dwarfeng.test.webservice.server.FooWebServiceImplService;

public class ConcurrentTest {

	private static final class ConcurrentTestRunner implements Runnable {

		private final FooWebServiceImpl fooWebServiceImpl;
		private final int index;

		public ConcurrentTestRunner(FooWebServiceImpl fooWebServiceImpl, int index) {
			this.fooWebServiceImpl = fooWebServiceImpl;
			this.index = index;
		}

		@Override
		public void run() {
			CT.trace(String.format("第 %d 号线程 -- 运行开始", index));
			fooWebServiceImpl.blocker();
			CT.trace(String.format("第 %d 号线程 -- 运行结束", index));
		}

	}

	public static void main(String[] args) {
		FooWebServiceImpl fooWebServiceImplPort = new FooWebServiceImplService().getFooWebServiceImplPort();

		for (int i = 0; i < 30; i++) {
			new Thread(new ConcurrentTestRunner(fooWebServiceImplPort, i)).start();
		}
	}

}
