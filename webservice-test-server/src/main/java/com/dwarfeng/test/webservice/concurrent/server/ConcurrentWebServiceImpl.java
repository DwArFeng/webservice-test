package com.dwarfeng.test.webservice.concurrent.server;

import javax.jws.WebService;

import com.dwarfeng.dutil.basic.io.CT;

@WebService
public class ConcurrentWebServiceImpl implements ConcurrentWebService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void concurrentCall() {
		CT.trace(String.format("在线程 %s 中 -- 调用了blocker方法...", Thread.currentThread().getName()));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
