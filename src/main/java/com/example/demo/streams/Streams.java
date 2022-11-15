package com.example.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.example.demo.streams.Accommodation.*;
import static com.example.demo.streams.Branch.*;

public class Streams {

    public static void main(String[] args) {

        // create test data
        Student student1 = new Student("Ankit", DAY_BOARDING, 7.5, MECH, 100.0);
        Student student2 = new Student("Pranjal", HOSTEL, 6.1, EEE, 450.0);
        Student student3 = new Student("Shambhavi", HOSTEL, 6.8, MECH, 780.0);
        Student student4 = new Student("Siddarth", HOSTEL, 8.3, CHEMICAL, 67.0);
        Student student5 = new Student("Tanya", DAY_BOARDING, 8.5, CS, 90.0);
        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);


        // get all students whose gpa > 7
        List<String> studentsWithGPAGtSeven = students.stream()
                .filter(student -> student.getGpa() > 7.0).map(Student::getName).collect(Collectors.toList());


        // get list of students from EEE branch as a string
        List<String> studentsEEE = students.stream()
                .filter(student -> student.getBranch() == EEE).map(Student::getName).collect(Collectors.toList());

//        System.out.println(studentsEEE);

        // group all students based on their accommodation
        Map<Branch, List<Student>> studentsGroupedByBranch = students.stream().collect(Collectors.groupingBy(Student::getBranch));

        // find student with max Gpa.
        Optional<Student> studentsWithMaxGpa = students.stream().max((s1, s2) -> (int) (s1.getGpa() - s2.getGpa()));
//        studentsWithMaxGpa.ifPresent(student -> System.out.println(student.getName()));

        // fetch total cash all students have
        Optional<Double> totalCash = students.stream().map(Student::getAvailableCash).reduce((s1, s2) -> s1 + s2);
        totalCash.ifPresent(System.out::println);

    }
}
