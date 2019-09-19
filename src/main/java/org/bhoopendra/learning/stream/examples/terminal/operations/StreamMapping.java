package org.bhoopendra.learning.stream.examples.terminal.operations;

import org.bhoopendra.learning.stream.beans.Student;
import org.bhoopendra.learning.stream.helper.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamMapping {

    public static void main(String[] args) {
        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toList()));

        System.out.println("Named List" + namesList);

        Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toSet()));

        System.out.println("Named Set ... "+ namesSet);
    }
}
