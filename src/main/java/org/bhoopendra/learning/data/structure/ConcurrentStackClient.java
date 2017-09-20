package org.bhoopendra.learning.data.structure;

public class ConcurrentStackClient {
    public static void main(String[] args) {
        ConcurrentStack<Integer> stack = new ConcurrentStack<>();
        stack.push(10);
        stack.push(11);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
