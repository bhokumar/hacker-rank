package org.bhoopendra.learning.collection.misc;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class NullPointer {
    public static void main(String[] args) {
        final Map<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "first");
        System.out.println(hashMap.get(null));

        final Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(null, "first");
        System.out.println(linkedHashMap.get(null));

        final Map<String, String> hashTable = new Hashtable<>();
        //hashTable.put(null, "first"); // will throw a null pointer exception
        //System.out.println(hashTable.get(null)); // will throw a null pointer exception

        final Map<String, String> treeMap = new TreeMap<>();
        //      treeMap.put(null,"first");  // will throw a null pointer exception
        //   System.out.println(treeMap.get(null)); // will throw a null pointer exception


        final Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        //concurrentHashMap.put(null,"first"); // will throw a null pointer exception
        // System.out.println(concurrentHashMap.get(null)); // will throw a null pointer exception

        final Set<String> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet.remove(null));
        System.out.println(hashSet.remove(null));

        final Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet.remove(null));
        System.out.println(linkedHashSet.remove(null));
        final Set<String> treehSet = new TreeSet<>();
       // treehSet.add(null); // will throw a null pointer exception
       // System.out.println(treehSet.remove(null)); // will throw a null pointer exception

        final List<String> listOfString = new ArrayList<>();
        listOfString.add(null);
        listOfString.add(null);
        System.out.println(listOfString.remove(null));
        System.out.println(listOfString.remove(null));
        System.out.println(listOfString.remove(null));

        System.out.println("################## Linked List ######################");
        final List<String> linkedList = new LinkedList<>();
        linkedList.add(null);
        linkedList.add(null);
        System.out.println(linkedList.remove(null));
        System.out.println(linkedList.remove(null));
        System.out.println(linkedList.remove(null));

        System.out.println("################## Vector List ######################");
        final List<String> vector = new Vector<>();
        vector.add(null);
        vector.add(null);
        System.out.println(vector.remove(null));
        System.out.println(vector.remove(null));
        System.out.println(vector.remove(null));

        System.out.println("################## Copy on Write Array List  ######################");
        final List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(null);
        copyOnWriteArrayList.add(null);
        System.out.println(copyOnWriteArrayList.remove(null));
        System.out.println(copyOnWriteArrayList.remove(null));
        System.out.println(copyOnWriteArrayList.remove(null));

        System.out.println("################## Concurrent skip List Map ######################");
        final Map<String,String> concurrentSkipListMap = new ConcurrentSkipListMap<>();
        //concurrentSkipListMap.put(null,"value"); // will throw a null pointer exception
        //System.out.println(concurrentSkipListMap.get(null)); // will throw a null pointer exception
    }
}
