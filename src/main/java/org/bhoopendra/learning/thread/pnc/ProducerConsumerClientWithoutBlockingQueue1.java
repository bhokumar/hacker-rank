package org.bhoopendra.learning.thread.pnc;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by BHOOPENDRA on 7/9/2017.
 */
public class ProducerConsumerClientWithoutBlockingQueue1 {
    public static void main(String[] args) {
        final Queue<Integer> sharedQueue = new LinkedList<>();
        Thread thread = new Thread(new Producer1(sharedQueue,4),"producer");
        Thread thread1 = new Thread(new Consumer1(sharedQueue),"consumer");
        thread.start();
        thread1.start();

    }

}

class Producer1 implements Runnable{
    private Queue<Integer> sharedQueue;
    private int maxSize;

    public Producer1(final Queue<Integer> sharedQueue, final int maxSize) {
        this.sharedQueue = sharedQueue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void produce(final int item) throws InterruptedException {
        synchronized (sharedQueue) {
            while (sharedQueue.size() == maxSize) {
                    sharedQueue.wait();
                    Thread.sleep(10000);
            }
            sharedQueue.add(item);
            System.out.println("produced item : "+item);
            sharedQueue.notifyAll();
        }
    }
}

class Consumer1 implements Runnable{
    private Queue<Integer> sharedQueue;

    public Consumer1(Queue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {
        for (int i=0;i<10;i++){
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        synchronized (sharedQueue){
            while (sharedQueue.size()==0){
                    System.out.println("consumer thread is waiting to item to be produced"+sharedQueue.size());
                    sharedQueue.wait();
            }
            System.out.println("Element removed"+sharedQueue.remove());
            sharedQueue.notifyAll();
        }
    }
}
