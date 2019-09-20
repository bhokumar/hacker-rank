package org.bhoopendra.learning.stream.examples.optional;

import org.bhoopendra.learning.stream.beans.Bike;
import org.bhoopendra.learning.stream.beans.Student;
import org.bhoopendra.learning.stream.helper.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMap {
    // filter

    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional.filter(student -> student.getGpa()>=3.5)
                .ifPresent(System.out::println);
    }

    // map

    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()) {
            Optional<String> studentName =
                    studentOptional
                            .filter(student -> student.getGpa()>=3.5)
                            .map(Student::getName);
            System.out.println(studentName);
        }

    }
    // flatMap

    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = studentOptional.filter(student -> student.getGpa()>=3.5).flatMap(Student::getBike).map(Bike::getName);
        name.ifPresent(s-> System.out.println("Name is : "+ s));
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
