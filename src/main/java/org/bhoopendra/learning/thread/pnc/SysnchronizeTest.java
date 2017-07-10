package org.bhoopendra.learning.thread.pnc;

/**
 * Created by BHOOPENDRA on 7/9/2017.
 */
public class SysnchronizeTest {
    public static void main(String[] args) {
        Object object = new Object();
        new Thread(new ProducerTest(object)).start();
        new Thread(new ConsumerTest(object)).start();
    }
}

class ProducerTest implements Runnable{

    private Object object;

    public ProducerTest(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        try {
            produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void produce() throws InterruptedException {
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+"waiting");
            object.wait();
            System.out.println(Thread.currentThread().getName()+" going to sleep");
            Thread.sleep(10000);
            System.out.println("producer thread waked up");
        }
    }


}

class ConsumerTest implements Runnable{
    private Object object;

    public ConsumerTest(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        try {
            consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void consume() throws InterruptedException {

        synchronized (object) {
            System.out.println("consumer got the execution");
            Thread.sleep(5000);
            System.out.println("consumer has finioshed its execution");
            object.notify();
        }
    }
}