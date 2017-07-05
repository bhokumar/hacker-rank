package org.bhoopendra.learning.thread.join;

/**
 * Created by bhokumar on 7/5/2017.
 */
public class JoinClient {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = ()->{
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+" running");
            }
        };

        Thread thread = new Thread(runnable,"thread1");
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" running");
            thread.join();
        }
    }

}
