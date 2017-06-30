package org.bhoopendra.learning.thread.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreCriticalSection {
	Semaphore semaphore = null;
	public SemaphoreCriticalSection(final Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	void criticalSection() throws InterruptedException{
		semaphore.acquire();
		System.out.println("Current Thread "+ Thread.currentThread().getName()+" has acquired critical section");
		Thread.sleep(5000);
		semaphore.release();
	}
}
