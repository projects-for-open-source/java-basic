/**
 * @Nickname: Richard
 * @Email: richardvu.work@gmail.com
 * @Skype: richardvu.work@gmail.com
 * @Phone: (+84) 0935710974 - (+84) 0935810974
 * @Country: Viet Nam
 * @Year: 2021
 * @LICENSE: DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.lambda;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * @author richard
 */
public class Lambda5 {

  // Pre-Defined Functional Interfaces
  public static void main(String... args) {

    // BiConsumer Example
    BiConsumer<String, Integer> printKeyAndValue = (key, value) -> System.out.println(key + "-" + value);

    printKeyAndValue.accept("One", 1);
    printKeyAndValue.accept("Two", 2);

    System.out.println("printKeyAndValue: " + printKeyAndValue);
    System.out.println("##################");

    // Java Hash-Map foreach supports BiConsumer
    HashMap<String, Integer> dummyValues = new HashMap<>();
    dummyValues.put("One", 1);
    dummyValues.put("Two", 2);
    dummyValues.put("Three", 3);

    dummyValues.forEach((key, value) -> System.out.println(key + "-" + value));

  }

}
