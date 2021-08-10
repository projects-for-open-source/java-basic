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
import java.util.Iterator;

import com.richard.application.models.Student;

/**
 * @author richard
 */
public class ArrayList5 {

  public static void main(String args[]) {

    // Creating user-defined class objects
    Student s1 = new Student(101, "Sonoo", 23);
    Student s2 = new Student(102, "Ravi", 21);
    Student s3 = new Student(103, "Hanumat", 25);

    // creating arraylist
    ArrayList<Student> al = new ArrayList<Student>();
    al.add(s1);// adding Student class object
    al.add(s2);
    al.add(s3);

    // Getting Iterator
    Iterator<Student> itr = al.iterator();
    // traversing elements of ArrayList object
    while (itr.hasNext()){
      Student st = itr.next();
      System.out.println(st.toString());
      // System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
    }

  }
}
