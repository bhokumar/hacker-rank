package org.bhoopendra.learning.stream.examples.terminal.operations;

import org.bhoopendra.learning.stream.helper.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class StreamCounting {

    public static long count() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }

    public static void main(String[] args) {
        System.out.println("Counting example " + count());
    }
}
