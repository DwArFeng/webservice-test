package com.dwarfeng.test.webservice.block.server;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.jws.WebService;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.dutil.develop.timer.ListTimer;
import com.dwarfeng.dutil.develop.timer.Timer;
import com.dwarfeng.dutil.develop.timer.obv.PlainObverser;
import com.dwarfeng.dutil.develop.timer.plain.FixedRatePlain;

@WebService
public class BlockWebServiceImpl implements BlockWebService {

	private final BlockingQueue<String> queue = new ArrayBlockingQueue<>(100);
	private final Timer timer = new ListTimer();
	private final ReadWriteLock lock = new ReentrantReadWriteLock();

	private final int initialStringSize = 3;
	private final long addingStringPeriod = 60 * 1000;

	public BlockWebServiceImpl() {
		try {
			CT.trace(String.format("初始化完成，添加 %d 个初始值...", initialStringSize));
			for (int i = 0; i < initialStringSize; i++) {
				queue.put(UUID.randomUUID().toString());
			}
			CT.trace(String.format("启动计时器，每 %d 毫秒添加一次新数据", addingStringPeriod));
			timer.schedule(new AddingStringPlain(addingStringPeriod, addingStringPeriod));
		} catch (Exception e) {
			e.printStackTrace();
			CT.trace("服务初始失败，请重新启动...");
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws InterruptedException
	 */
	@Override
	public String getString() throws InterruptedException {
		lock.readLock().lock();
		try {
			String string = queue.take();
			CT.trace(String.format("成功取出一个数据，当前队列中的数据量为 %d", queue.size()));
			return string;
		} finally {
			lock.readLock().unlock();
		}
	}

	private final class AddingStringPlain extends FixedRatePlain {

		public AddingStringPlain(long period, long nextRunOffset) {
			super(period, nextRunOffset);
		}

		public AddingStringPlain(long period, long nextRunOffset, Set<PlainObverser> obversers) {
			super(period, nextRunOffset, obversers);
		}

		@Override
		protected void todo() throws Exception {
			lock.writeLock().lock();
			try {
				if (queue.remainingCapacity() > 0) {
					queue.put(UUID.randomUUID().toString());
					CT.trace(String.format("为队列添加一个数据，当前的数据量为 %d", queue.size()));
				}
			} finally {
				lock.writeLock().unlock();
			}
		}

	}

}
