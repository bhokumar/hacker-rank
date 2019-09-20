package org.bhoopendra.learning.stream.examples.optional;

import java.util.Optional;

public class OptionalIsPresent {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("Hello World");
        System.out.println(optional.isPresent());
        optional.ifPresent(System.out::println);
    }
}
