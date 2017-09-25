package org.bhoopendra.learning.java9;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListClient {
    private static final Logger LOGGER = Logger.getLogger(ListClient.class.getName());

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integers.stream().forEach(System.out::println);
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = List.of(7, 8, 9, 10, 11, 12);
        List<Integer> list3 = List.of(13, 14, 15, 16, 17);
        int doubleSum = list1.stream()
                .filter(item -> item % 2 == 0)
                .map(i -> 2 * i)
                .reduce(0, (e, a) -> e + a);
        System.out.println(doubleSum);
        List<String> listOfStrings = list1.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        List<List<Integer>> listOfIntegers = List.of(list1, list2, list3);
        List<Integer> integers1 = listOfIntegers
                .stream()
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());
        integers1.stream().forEach(System.out::println);
        System.out.println("###################### Use of Drop while ##############");
        List<Integer> integers2 = list1.stream().dropWhile(i -> i % 2 == 1).collect(Collectors.toList());


        integers2.stream().forEach(System.out::println);

        Stream.of(2, 4, 6, 8, 9, 10, 12)
                .dropWhile(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("###################### Use of take while ##############");
        List<Integer> integers3 = list1.stream().takeWhile(i->i%2==0).collect(Collectors.toList());
        integers3.stream().forEach(System.out::println);

    }
}