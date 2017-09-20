package org.bhoopendra.learning.data.structure;

public class ConcurrentStack2<E> {

    public void push(final E item){
        
    }

    private static class Node<E>{
        public E item;
        public Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }
}
