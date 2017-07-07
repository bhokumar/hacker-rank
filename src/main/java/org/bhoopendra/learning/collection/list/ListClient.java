package org.bhoopendra.learning.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by bhokumar on 7/4/2017.
 */
public class ListClient {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> elements = new CopyOnWriteArrayList<>();
        for(int i=-3;i<3;i++){
            integers.add(i);
        }

        for(int i=0;i<3;i++){
            integers.remove((Integer) i);
        }

        for(int item: integers){
            System.out.println(item);
        }
    }
}
