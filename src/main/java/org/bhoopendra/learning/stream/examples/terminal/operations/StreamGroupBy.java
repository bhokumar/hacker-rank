package org.bhoopendra.learning.stream.examples.terminal.operations;

import org.bhoopendra.learning.stream.beans.Student;
import org.bhoopendra.learning.stream.helper.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamGroupBy {
    public static void groupStudentByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizedGroupingBy() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING": "AVERAGE"));
        System.out.println(studentMap);
    }

    public static void twoLevelOfGrouping_1() {
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, groupingBy(student -> student.getGpa() >= 3.8? "OUTSTANDING":"AVERAGE")));
        System.out.println(studentMap);
    }

    public static void twoLevelOfGrouping_2() {
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public static void twoLevelOfGrouping_3() {
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public static void threeLevelOfGrouping_1() {
        Map<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));

        System.out.println(studentLinkedHashMap);
    }

    public static void main(String[] args) {
        groupStudentByGender();
        customizedGroupingBy();
        twoLevelOfGrouping_1();
        twoLevelOfGrouping_2();
        twoLevelOfGrouping_3();
        threeLevelOfGrouping_1();
    }
}
