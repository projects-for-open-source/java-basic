/**
 * @Nickname: Richard
 * @Email: richardvu.work@gmail.com
 * @Skype: richardvu.work@gmail.com
 * @Phone: (+84) 0935710974 - (+84) 0935810974
 * @Country: Viet Nam
 * @Year: 2021
 * @LICENSE: DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.richard.application.models.Student;

/**
 * @author richard
 */
public class Streams19 {

  public static void main(String args[]) {

    // create a list of Student
    List<Student> students = new ArrayList<>();
    students.add(new Student(4, "Richard 4", 4L));
    students.add(new Student(3, "Richard 3", 3L));
    students.add(new Student(1, "Richard 1", 1L));
    students.add(new Student(2, "Richard 2", 2L));

    // get all student name
    List<String> studentsName1 = students.stream().map((st) -> st.getName()).collect(Collectors.toList());
    List<String> studentsName2 = students.stream().map((st) -> st.getName()).sorted().collect(Collectors.toList());
    System.out.println("studentsName1: " + studentsName1);
    System.out.println("studentsName2: " + studentsName2);

    // get all student when id = 4
    int id = 4;
    List<Student> students4 = students.stream().filter(st -> st.getRollno() == id).collect(Collectors.toList());
    System.out.println("studentsName: " + students4);

    // create a list of String
    List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Start");
    System.out.println("names: " + names);

    // demonstration of filter method
    List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
    System.out.println("result: " + result);

    // demonstration of sorted method
    List<String> show = names.stream().sorted().collect(Collectors.toList());
    System.out.println("show: " + show);

    // create a list of integers
    List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
    System.out.println("numbers: " + numbers);

    // collect method returns a set
    Set<Integer> squareSet = numbers.stream().collect(Collectors.toSet());
    System.out.println("squareSet: " + squareSet);

    // demonstration of forEach method
    // number.stream().map(x -> x * x).forEach(y -> System.out.println("y: " + y));
    //
    // // demonstration of reduce method
    // int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
    //
    // System.out.println("even: " + even);

  }

}