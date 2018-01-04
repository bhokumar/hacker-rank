package org.bhoopendra.learning.asynchronous;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureClient {
    public static void main(String[] args){
        CompletableFuture.runAsync(()->System.out.println("Hello"));

        System.out.println("In Main");
    }
}
