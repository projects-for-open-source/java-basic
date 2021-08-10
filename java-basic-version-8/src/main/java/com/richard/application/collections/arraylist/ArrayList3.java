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
public class ArrayList3 {

  public static void main(String args[]) {
    ArrayList<String> list = new ArrayList<String>();// Creating arraylist
    list.add("Mango");// Adding object in arraylist
    list.add("Apple");
    list.add("Banana");
    list.add("Grapes");
    // Traversing list through for-each loop
    for (String fruit : list)
      System.out.println(fruit);

  }

}
