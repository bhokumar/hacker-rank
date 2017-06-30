package org.bhoopendra.learning.thread.blockingque;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	BlockingQueue<Integer> blockingQueue = null;;

	public Producer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			blockingQueue.put(10);
			Thread.sleep(1000);
			blockingQueue.put(11);
			Thread.sleep(1000);
			blockingQueue.put(12);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}

}
