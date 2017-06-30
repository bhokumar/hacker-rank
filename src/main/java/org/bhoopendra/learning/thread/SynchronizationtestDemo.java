package org.bhoopendra.learning.thread;

public class SynchronizationtestDemo {

	public static void main(String[] args) {
		SynchronizationtestDemo s = new SynchronizationtestDemo();
		SynchronizationtestDemo s1 = new SynchronizationtestDemo();
		Thread thread1 = new Thread(){
			public void run(){
				try {
					s.display();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread2 = new Thread(){
			public void run(){
					s1.show();
			}
		};
		
		thread1.start();
		thread2.start();
	}

	public synchronized void show(){
		System.out.println("::::in show method:::");
	}
	
	public synchronized void display() throws InterruptedException{
		System.out.println("::::in display method:::");
		Thread.sleep(10000);
	}
	
	
}
