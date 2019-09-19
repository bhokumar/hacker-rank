package org.bhoopendra.learning.stream.examples.terminal.operations;

import org.bhoopendra.learning.stream.beans.Student;
import org.bhoopendra.learning.stream.helper.StudentDataBase;

import java.util.stream.Collectors;

public class StreamOperationsJoining {
    public static String joining_1() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining_3() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(",", "[","]"));
    }

    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println("joining2 "+joining_2());
        System.out.println("Joining3 "+joining_3());
    }
}
