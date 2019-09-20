package org.bhoopendra.learning.stream.examples.terminal.operations;

import org.bhoopendra.learning.stream.beans.Student;
import org.bhoopendra.learning.stream.helper.StudentDataBase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

import static java.util.stream.Collectors.*;

public class StreamCounting {

    public static long count() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }

    public static void main(String[] args) {
        System.out.println("Counting example " + count());
        System.out.println(Runtime.getRuntime().availableProcessors());

        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(studentMap);

        Supplier<Integer> integerSupplier = new Random():: nextInt;
    }
}
