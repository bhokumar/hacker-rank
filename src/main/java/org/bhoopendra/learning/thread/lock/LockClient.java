package org.bhoopendra.learning.thread.lock;

/**
 * Created by bhokumar on 7/4/2017.
 */
public class LockClient {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable runnable1 = () ->{
            try {
                System.out.println(Thread.currentThread().getName()+" Number of threads "+counter.inc());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable2 = () ->{
            try {
                System.out.println(Thread.currentThread().getName()+" Number of threads "+counter.inc());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable3 = () ->{
            try {
                System.out.println(Thread.currentThread().getName()+" Number of threads "+counter.inc());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable4 = () ->{
            try {
                System.out.println(Thread.currentThread().getName()+" Number of threads "+counter.inc());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(runnable1,"thread1");
        Thread thread2 = new Thread(runnable2,"thread2");
        Thread thread3 = new Thread(runnable3,"thread3");
        Thread thread4 = new Thread(runnable4,"thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
