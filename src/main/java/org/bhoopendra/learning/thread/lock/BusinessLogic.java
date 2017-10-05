package org.bhoopendra.learning.thread.lock;

public class BusinessLogic {

    public static void logic1()throws InterruptedException{
        synchronized (BusinessLogic.class){
            System.out.println(Thread.currentThread().getName()+"holding lock on "+BusinessLogic.class.getName());
            Thread.sleep(5000);
            System.out.println("method logic1 completed !");
        }
    }

    public void logic2()throws InterruptedException{
        synchronized (BusinessLogic.class){
            System.out.println(Thread.currentThread().getName()+"holding lock on "+BusinessLogic.class.getName());
            Thread.sleep(5000);
            System.out.println("method logic2 completed !");
        }
    }
}
