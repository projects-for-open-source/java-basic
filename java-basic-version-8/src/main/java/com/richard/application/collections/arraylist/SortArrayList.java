/**
 * @Nickname: Richard
 * @Email: richardvu.work@gmail.com
 * @Skype: richardvu.work@gmail.com
 * @Phone: (+84) 0935710974 - (+84) 0935810974
 * @Country: Viet Nam
 * @Year: 2021
 * @LICENSE: DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.richard.application.models.Person;
import com.richard.application.models.Student;

/**
 * @author richard
 */
public class SortArrayList {

  public static void main(String args[]) {
    // Creating a list of fruits
    List<String> list1 = new ArrayList<String>();
    list1.add("Mango");
    list1.add("Apple");
    list1.add("Banana");
    list1.add("Grapes");
    // Sorting the list
    Collections.sort(list1);
    // Traversing list through the for-each loop
    for (String fruit : list1){
      System.out.println(fruit);
    }

    System.out.println("Sorting numbers...");
    // Creating a list of numbers
    List<Integer> list2 = new ArrayList<Integer>();
    list2.add(21);
    list2.add(11);
    list2.add(51);
    list2.add(1);
    // Sorting the list
    Collections.sort(list2);
    // Traversing list through the for-each loop
    for (Integer number : list2){
      System.out.println(number);
    }

    // Initial list of elements Person: []
    List<Person> person = new ArrayList<>();
    person.add(new Person("Richard 4", "Vu"));
    person.add(new Person("Richard 3", "Vu"));
    person.add(new Person("Richard 1", "Vu"));
    person.add(new Person("Richard 2", "Vu"));

    for (Person ps : person){
      System.out.println(ps);
    }

    // System.out.println("Sorting Person Object C1...");
    //
    // Collections.sort(person, new Comparator<Person>() {
    // @Override
    // public int compare(Person o1, Person o2) {
    // return o1.getFirstName().compareTo(o2.getFirstName());
    // }
    // });
    //
    // for (Person ps : person){
    // System.out.println(ps);
    // }

    System.out.println("Sorting Person Object C2...");
    Collections.sort(person, (a, b) -> a.getFirstName().compareTo(b.getFirstName()));

    for (Person ps : person){
      System.out.println(ps);
    }

    // Initial list of elements Person: []
    List<Student> students = new ArrayList<>();
    students.add(new Student(4, "Richard 4", 4L));
    students.add(new Student(3, "Richard 3", 3L));
    students.add(new Student(1, "Richard 1", 1L));
    students.add(new Student(2, "Richard 2", 2L));

    for (Student st : students){
      System.out.println(st);
    }

    System.out.println("Sorting Student Object C2...");
    // Collections.sort(students, (a, b) -> b.getRollno() - a.getRollno());
    Collections.sort(students, (a, b) -> (int) b.getAge() - (int) a.getAge());

    for (Student st : students){
      System.out.println(st);
    }

  }

}
