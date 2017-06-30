package org.bhoopendra.learning.thread.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerRunnable implements Runnable {

	Exchanger<String> exchanger = null;
	String object = null;
	public ExchangerRunnable(final Exchanger<String> exchanger,final String object) {
		this.exchanger = exchanger;
		this.object = object;
	}
	@Override
	public void run() {
		final String previous = this.object;
		try {
			this.object = this.exchanger.exchange(this.object);
			System.out.println(Thread.currentThread().getName()+" exchanged "+previous+" for "+this.object);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
