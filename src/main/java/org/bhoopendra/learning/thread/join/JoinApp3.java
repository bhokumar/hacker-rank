package org.bhoopendra.learning.thread.join;

public class JoinApp3 extends Thread {
    private static JoinApp3 joinApp3;

    @Override
    public void run(){
        synchronized (joinApp3){
            System.out.println(Thread.currentThread().getName()+" is acquired lock on "+joinApp3);
            try {
                Thread.sleep(5000);
            }catch (final InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName()+" completed");
        }
    }

    public static void main(String[] args)throws InterruptedException {
        joinApp3 = new JoinApp3();
        joinApp3.setName("thread1");
        joinApp3.start();
        synchronized (joinApp3){
            System.out.println(Thread.currentThread().getName()+"has acquired lock on "+joinApp3);
            Thread.sleep(3000);
            joinApp3.join();
            System.out.println(Thread.currentThread().getName()+" completed");
        }
    }
}
