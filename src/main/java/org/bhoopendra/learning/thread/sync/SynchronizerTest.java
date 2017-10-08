package org.bhoopendra.learning.thread.sync;

public class SynchronizerTest {
    public static void main(String[] args) {
        PrintingValues printingValues = new PrintingValues();
        new Thread(() -> {
            while (true) {
                printingValues.printA();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                printingValues.printB();
            }
        }).start();
    }
}

class PrintingValues {
        // worst solution i have ever created
    private Object object = new Object();

    public void printA() {
        synchronized (object) {
            System.out.println("A");
            notifyAll();
        }
    }

    public void printB() {
        synchronized (object) {
            System.out.println("B");
            notifyAll();
        }
    }

}
