package org.bhoopendra.learning.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by bhokumar on 7/6/2017.
 */
public class IteratorClient {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        elements.add(56);
        elements.add(121);
        elements.add(78);
        elements.add(45);
        ListIterator<Integer> iterator2 = elements.listIterator();

        Iterator<Integer> iterator = elements.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //elements.remove(0);
            elements.set(0,57);
        }

        Iterator<Integer> iterator1 = elements.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
