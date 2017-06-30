package org.bhoopendra.learning.thread.blockingque;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueClient {

	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		BlockingQueue<Integer> que1 = new LinkedBlockingQueue<>();
		Producer producer = new Producer(que1);
		Consumer consumer = new Consumer(que1);
		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
