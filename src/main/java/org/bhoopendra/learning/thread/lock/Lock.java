package org.bhoopendra.learning.thread.lock;

/**
 * Created by bhokumar on 7/4/2017.
 */
public class Lock {
    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked){
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock(){
        isLocked = false;
        notify();
    }
}
