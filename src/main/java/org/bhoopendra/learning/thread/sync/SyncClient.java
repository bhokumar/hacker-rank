package org.bhoopendra.learning.thread.sync;

/**
 * Created by bhokumar on 7/7/2017.
 */
public class SyncClient {
    private SyncClient() {
    }
    public static void main(String[] args) {
        final String range1 = "range1";
        final String range2 = "range2";

        Thread thread1 = new Thread(new ThreadRangeAllocator(range1,"Mike1"),"thread1");
        Thread thread2 = new Thread(new ThreadRangeAllocator(range1,"Mike2"),"thread2");
        Thread thread3 = new Thread(new ThreadRangeAllocator(range1,"Mike3"),"thread3");
        Thread thread4 = new Thread(new ThreadRangeAllocator(range2,"Mike4"),"thread4");
        Thread thread5 = new Thread(new ThreadRangeAllocator(range2,"Mike5"),"thread5");
        Thread thread6 = new Thread(new ThreadRangeAllocator(range2,"Mike6"),"thread6");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

    }


}
