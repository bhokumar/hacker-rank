package org.bhoopendra.learning.thread.lock;

/**
 * Created by bhokumar on 7/4/2017.
 */
public class Counter {
    private int count = 0;
    private Lock lock = new Lock();

    public int inc() throws InterruptedException {
        lock.lock();
        int newCount = ++count;
        lock.unlock();
        return newCount;
    }

}
