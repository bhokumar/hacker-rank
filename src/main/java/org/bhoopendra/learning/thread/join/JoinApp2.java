package org.bhoopendra.learning.thread.join;

public class JoinApp2 {
    public static void main(String[] args)  {
        Thread thread1 = new Thread(()->{
            System.out.println("thread1");
            try {
                Thread.sleep(5000);
            }catch (final InterruptedException e){

            }
        },"thread1");

        Thread thread2 = new Thread(()->{
            System.out.println("thread2");
            try {
                Thread.sleep(5000);
            }catch (final InterruptedException e){

            }
        },"thread2");

        Thread thread3 = new Thread(()->{
            System.out.println("thread3");
            try {
                Thread.sleep(5000);
            }catch (final InterruptedException e){

            }
        },"thread3");

        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (final InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main Thread ended!");
    }
}
