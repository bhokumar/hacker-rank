package org.bhoopendra.learning.stream.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMap {

    public static List<Integer> mapToObject() {
        return IntStream.rangeClosed(1,10).
                mapToObj(Integer::valueOf).
                collect(Collectors.toList());
    }

    public static long mapToLong() {
         return IntStream.rangeClosed(1, 10)
                .mapToLong(i-> i).sum();
    }

    public static double mapToDoble() {
        return IntStream.rangeClosed(1, 10)
                .mapToDouble(i-> i).sum();
    }

    public static void main(String[] args) {
        System.out.println(mapToObject());
        System.out.println(mapToDoble());
        System.out.println(mapToLong());
    }
}
