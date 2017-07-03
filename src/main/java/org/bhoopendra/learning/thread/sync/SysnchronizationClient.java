package org.bhoopendra.learning.thread.sync;

public class SysnchronizationClient {

	public static void main(String[] args) {
		CriticalSections criticalSections = new CriticalSections();
		CriticalSections criticalSections2 = new CriticalSections();
		
		Runnable runnable1 = () -> {
			try {
				CriticalSections.display();
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable runnable2 = () -> {
			try {
				CriticalSections.show();
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable runnable3 = () -> {
			try {
				criticalSections.execute();
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable runnable4 = () -> {
			try {
				criticalSections.execute();
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Runnable runnable5 = () -> {
			try {
				criticalSections2.execute();
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Runnable runnable6 = () -> {
			try {
				criticalSections2.execute();
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Runnable runnable7 = () -> {
			try {
				criticalSections2.test();;
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread thread1 = new Thread(runnable1, "thread1");
		Thread thread2 = new Thread(runnable2, "thread2");
		Thread thread3 = new Thread(runnable3, "thread3");
		Thread thread4 = new Thread(runnable4, "thread4");
		Thread thread5 = new Thread(runnable5, "thread5");
		Thread thread6 = new Thread(runnable6, "thread6");
		Thread thread7 = new Thread(runnable7, "thread7");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();

	}

}

class CriticalSections {
	static void printCurrentThreadName(){
		System.out.println(Thread.currentThread().getName()+" excuting ");
	}
	public synchronized static void show() throws InterruptedException {
		printCurrentThreadName();
		System.out.println("inside show method with static block");
		Thread.sleep(10000);
	}

	public synchronized static void display() throws InterruptedException {
		printCurrentThreadName();
		System.out.println("inside display method with static block");
		Thread.sleep(10000);
	}

	public synchronized void execute() throws InterruptedException {
		printCurrentThreadName();
		System.out.println("Inside excecute method which is  synchronized");
		Thread.sleep(10000);
	}

	public synchronized void submit() throws InterruptedException {
		System.out.println("Inside submit method which is  synchronized");
		Thread.sleep(10000);
	}
	
	public void test() throws InterruptedException {
		printCurrentThreadName();
		System.out.println("Inside submit method which is not  synchronized");
		Thread.sleep(10000);
	}
}
