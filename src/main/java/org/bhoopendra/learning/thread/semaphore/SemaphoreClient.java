package org.bhoopendra.learning.thread.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreClient {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(1);
		SemaphoreRunnable semaphoreRunnable1 = new SemaphoreRunnable(semaphore);
		SemaphoreRunnable semaphoreRunnable2 = new SemaphoreRunnable(semaphore);
		new Thread(semaphoreRunnable1,"thread1").start();
		new Thread(semaphoreRunnable2,"thread2").start();
	}

}
