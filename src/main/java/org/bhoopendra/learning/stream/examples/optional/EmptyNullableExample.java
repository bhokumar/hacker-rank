package org.bhoopendra.learning.stream.examples.optional;

import java.util.Optional;

public class EmptyNullableExample {

    public static Optional<String> ofNullableExample() {
        Optional<String> stringOptiinal = Optional.ofNullable("Hello");
        return stringOptiinal;
    }

    public static Optional<String> ofExample() {
        Optional<String> optionalHello = Optional.of("Hello");
        return optionalHello;
    }

    public static Optional<String> emptyExample() {
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(ofNullableExample());
        System.out.println(ofNullableExample().get());
        System.out.println(ofExample());
        System.out.println(ofExample().get());
        System.out.println(emptyExample());

        if(emptyExample().isPresent()) {
            System.out.println(emptyExample().get());
        }
    }
}
