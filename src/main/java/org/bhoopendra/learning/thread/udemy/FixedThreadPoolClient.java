package org.bhoopendra.learning.thread.udemy;

import org.bhoopendra.learning.thread.udemy.common.LoopTaskA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolClient {
    public static void main(String[] args) {
        System.out.println("Main Thread starts here");

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());


        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());

        executorService.shutdown();

        //executorService.execute(new LoopTaskA());

        System.out.println("Main Thread ends here");
    }
}
