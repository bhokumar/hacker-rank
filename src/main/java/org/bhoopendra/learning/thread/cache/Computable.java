package org.bhoopendra.learning.thread.cache;

public interface Computable <A,V>{
    V compute(A arg) throws InterruptedException;
}
