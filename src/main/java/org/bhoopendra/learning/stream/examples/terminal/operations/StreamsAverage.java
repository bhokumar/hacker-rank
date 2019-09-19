package org.bhoopendra.learning.stream.examples.terminal.operations;

import org.bhoopendra.learning.stream.beans.Student;
import org.bhoopendra.learning.stream.helper.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsAverage {
    public static int sum() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double average() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("Sum of all values " + sum());
        System.out.println("Average values " + average());
    }
}
