package org.bhoopendra.learning.thread.inside;

/**
 * Created by BHOOPENDRA on 7/6/2017.
 */
public class ThreadInsideClient {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            Runnable runnable1 = ()->{
                System.out.println(Thread.currentThread().getName()+" running");
            };
            Thread childThread  = new Thread(runnable1,"tchildThread");
            childThread.start();
            System.out.println(Thread.currentThread().getName()+" running ");
        };
        Thread thread = new Thread(runnable,"parent_thread");
        thread.start();
    }
}
