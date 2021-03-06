package org.bhoopendra.learning.data.structure;

import java.util.concurrent.atomic.AtomicReference;

public class ConcurrentStack<E> {
    private AtomicReference<Node<E>> top = new AtomicReference<>();
    public void push(final E item){
        final Node<E> newHead = new Node<>(item);
        Node<E> oldHead;
        do{
            oldHead = top.get();
            newHead.next = oldHead;
        }while (!top.compareAndSet(oldHead,newHead));
    }
    public E pop(){
        Node<E> oldHead;
        Node<E> newHead;
        do{
            oldHead = top.get();
            if (oldHead==null)
                return null;
            newHead = oldHead.next;
        }while (!top.compareAndSet(oldHead,newHead));
        return oldHead.item;
    }

    private static class Node<E>{
        private E item;
        private Node<E> next;
        public Node(E item) {
            this.item = item;
        }
    }
}
