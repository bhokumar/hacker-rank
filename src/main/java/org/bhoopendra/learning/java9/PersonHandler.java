package org.bhoopendra.learning.java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonHandler {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("bob",Gender.MALE,46),
                new Person("bob",Gender.MALE,47),
                new Person("bob",Gender.MALE,48),
                new Person("bob",Gender.MALE,49),
                new Person("bob",Gender.MALE,50),
                new Person("bob",Gender.MALE,51),
                new Person("bob",Gender.MALE,52),
                new Person("bob",Gender.MALE,53),
                new Person("bob",Gender.MALE,54),
                new Person("bob",Gender.MALE,55),
                new Person("bob",Gender.MALE,56));
        System.out.println(boundedSum(10,100));
        persons.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(System.out::println);
        //persons.stream().collect(Collectors.groupingBy(Person::getName),Collectors.toList())
    }

    private static int boundedSum(final int k,final int n){
        return Stream.iterate(k,e->e+1).filter(e->e%2==0).filter(e->Math.sqrt(e)>20).mapToInt(e->e*2).limit(n).sum();
    }
}
