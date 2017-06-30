package org.bhoopendra.learning.thread.forknjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolRecursiveAction {

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(16);
		MyRecursiveAction myRecursiveAction = new MyRecursiveAction(24);
		forkJoinPool.execute(myRecursiveAction);
	}

}
