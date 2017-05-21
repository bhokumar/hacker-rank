package org.bhoopendra.learning.thread;

public class MultiThread {

	public static void main(String[] args) {

		Runnable worker = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}

}

class CustomThread1 extends Thread{
	public void run(){
		System.out.println("Thread is running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}