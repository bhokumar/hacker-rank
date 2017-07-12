package org.bhoopendra.learning.thread.deadlock;

/**
 * Created by bhokumar on 7/12/2017.
 */
public class DeadLockTest2 {
    public static void main(String[] args) {
        Object sharedObject1 = new Object();
        Object sharedObject2 = new Object();
        Thread thread1 = new Thread(new P(sharedObject1,sharedObject2),"thread1");
        Thread thread2 = new Thread(new C(sharedObject1,sharedObject2),"thread2");
        thread1.start();
        thread2.start();
    }
}

class P implements Runnable{
    private Object sharedObject1;
    private Object sharedObject2;

    public P(Object sharedObject1, Object sharedObject2) {
        this.sharedObject1 = sharedObject1;
        this.sharedObject2 = sharedObject2;
    }

    @Override
    public void run() {
        synchronized (sharedObject1){
            System.out.println(Thread.currentThread().getName()+" is holding shared object object1");
            System.out.println(Thread.currentThread().getName()+"  is waiting to get lock on object2");
            synchronized (sharedObject2){
                System.out.println(Thread.currentThread().getName()+" is holding shared object object2");
            }
        }

    }
}

class C implements Runnable{
    private Object sharedObject1;
    private Object sharedObject2;

    public C(Object sharedObject1, Object sharedObject2) {
        this.sharedObject1 = sharedObject1;
        this.sharedObject2 = sharedObject2;
    }

    @Override
    public void run() {
        synchronized (sharedObject2){
            System.out.println(Thread.currentThread().getName()+" is holding shared object object2");
            System.out.println(Thread.currentThread().getName()+"  is waiting to get lock on object1");
            synchronized (sharedObject1){
                System.out.println(Thread.currentThread().getName()+" is holding shared object object1");
            }
        }
    }
}