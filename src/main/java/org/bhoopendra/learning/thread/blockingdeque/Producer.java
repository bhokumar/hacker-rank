package org.bhoopendra.learning.thread.blockingdeque;

import java.util.concurrent.BlockingDeque;

public class Producer implements Runnable {

	BlockingDeque<Integer> blockingDeque = null;
	
	public Producer(BlockingDeque<Integer> blockingDeque) {
		this.blockingDeque = blockingDeque;
	}
	
	@Override
	public void run() {
		try {
			blockingDeque.putFirst(11);
			Thread.sleep(1000);
			blockingDeque.putFirst(12);
			Thread.sleep(1000);
			blockingDeque.putFirst(13);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
