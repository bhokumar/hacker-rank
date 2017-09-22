package org.bhoopendra.learning.collection;

import java.util.ArrayList;
import java.util.Vector;

public class ListClient {
    public static void main(String[] args) {
        Vector vector = new Vector();
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        vector.add("a");
        vector.add(arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        System.out.println(vector.remove(arrayList1));// foolishness of Manisha
    }
}
