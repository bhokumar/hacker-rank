package org.bhoopendra.learning.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarierClient {

	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(2);
		new Thread(new Thread1(barrier)).start();
		new Thread(new Thread2(barrier)).start();
	}
}
