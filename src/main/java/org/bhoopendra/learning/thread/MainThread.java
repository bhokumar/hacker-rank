package org.bhoopendra.learning.thread;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new CopyThread());
		Thread thread2 = new Thread(new PrintThread());
		thread.setDaemon(true);
		thread.start();
		thread.join();
		thread2.start();
		thread2.join();
		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread running");
		}
	}

	public void show() {}

}
