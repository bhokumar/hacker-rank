package org.bhoopendra.learning.stream.examples.terminal.operations;

import org.bhoopendra.learning.stream.beans.Student;
import org.bhoopendra.learning.stream.helper.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMaxByMinBy {

    public static Optional<Student> minBy_1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> max_by_1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {

    }
}
