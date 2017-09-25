package org.bhoopendra.learning.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ListClient {
    private static final Logger LOGGER = Logger.getLogger(ListClient.class.getName());
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integers.stream().forEach(System.out::println);
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = List.of(7, 8, 9, 10, 11, 12);
        List<Integer> list3 = List.of(13,14,15,16,17);
        List<String> listOfStrings = list1.stream().map(String::valueOf).collect(Collectors.toList());
        List<List<Integer>> listOfIntegers = List.of(list1,list2,list3);
    }
}