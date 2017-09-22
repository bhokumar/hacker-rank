package org.bhoopendra.learning.thread.cache;

import java.math.BigInteger;

public class CacheClient {
    public static void main(String[] args)throws InterruptedException {
        ExpensiveFunction expensiveFunction = new ExpensiveFunction();
        /*Memorizer<String,BigInteger> resultCalculater = new Memorizer<>(expensiveFunction);
        System.out.println(resultCalculater.compute("67429848"));
        System.out.println(resultCalculater.compute("67429848"));
        System.out.println(resultCalculater.compute("67429849"));

        Memorizer2<String,BigInteger> memorizer = new Memorizer2<>(expensiveFunction);
        System.out.println(memorizer.compute("67429848"));
        System.out.println(memorizer.compute("67429848"));
        System.out.println(memorizer.compute("67429849"));*/

        Memorizer3<String,BigInteger> memorizer3 = new Memorizer3<>(expensiveFunction);
        System.out.println(memorizer3.compute("67429848"));
        System.out.println(memorizer3.compute("67429848"));
        System.out.println(memorizer3.compute("67429849"));
    }
}
