package org.bhoopendra.learning.thread.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerClient {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<>();
		ExchangerRunnable exchangerRunnable1 = new ExchangerRunnable(exchanger, "hello");
		ExchangerRunnable exchangerRunnable2 = new ExchangerRunnable(exchanger, "hi");
		new Thread(exchangerRunnable1,"thread1").start();
		new Thread(exchangerRunnable2,"thread2").start();
	}
}
