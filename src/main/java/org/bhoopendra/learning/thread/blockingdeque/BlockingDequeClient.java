package org.bhoopendra.learning.thread.blockingdeque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeClient {

	public static void main(String[] args) {
		BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
		new Thread(new Producer(blockingDeque)).start();
		new Thread(new Consumer(blockingDeque)).start();
	}
}
