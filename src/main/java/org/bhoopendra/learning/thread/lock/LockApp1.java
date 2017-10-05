package org.bhoopendra.learning.thread.lock;

public class LockApp1 {
    public static void main(String[] args) throws InterruptedException {
        BusinessLogic businessLogic = new BusinessLogic();
        BusinessLogic businessLogic2 = new BusinessLogic();
        Thread thread1 = new Thread(() -> {
            try {
                businessLogic.logic2();
            } catch (final InterruptedException e) {
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                businessLogic2.logic1();
            } catch (final InterruptedException e) {
            }
        });

        thread1.start();
        thread2.start();
    }
}
