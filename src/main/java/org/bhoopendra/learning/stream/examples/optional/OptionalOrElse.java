package org.bhoopendra.learning.stream.examples.optional;

import org.bhoopendra.learning.stream.beans.Student;
import org.bhoopendra.learning.stream.helper.StudentDataBase;

import java.util.Optional;

public class OptionalOrElse {
    public static String optionalOrElse() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    public static String optionalOrElseGet() {
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    public static String optionalOrElseThrow() {
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data available"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }
}
