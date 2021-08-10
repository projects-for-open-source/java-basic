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

/**
 * @author richard
 */
public class ArrayList2 {

  public static void main(String args[]) {

    ArrayList<String> list = new ArrayList<String>();// Creating arraylist
    list.add("Mango");// Adding object in arraylist
    list.add("Apple");
    list.add("Banana");
    list.add("Grapes");

    // Traversing list through Iterator
    Iterator<String> itr = list.iterator();// getting the Iterator

    while (itr.hasNext()){// check if iterator has the elements
      System.out.println(itr.next());// printing the element and move to next
    }
  }

}
