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

/**
 * @author richard
 */
public class ArrayList8 {

  /**
   * @param args
   */
  public static void main(String[] args) {

    ArrayList<String> al = new ArrayList<String>();
    al.add("Mango");
    al.add("Apple");
    al.add("Banana");
    al.add("Grapes");
    // accessing the element
    System.out.println("Returning element: " + al.get(1));// it will return the 2nd element, because index starts from 0
    // changing the element
    al.set(1, "Dates");
    // Traversing list
    for (String fruit : al)
      System.out.println(fruit);
  }

}
