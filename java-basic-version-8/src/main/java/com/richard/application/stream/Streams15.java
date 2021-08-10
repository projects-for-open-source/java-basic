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

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author richard
 */
public class Streams15 {

  public static void main(String[] args) {

    // 4 apple, 2 banana, others 1
    List<String> items = Arrays.asList("apple", "apple", "apple", "banana", "apple", "orange", "banana", "papaya");

    Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    Map<String, Long> finalMap = new LinkedHashMap<>();

    // Sort a map and add to finalMap
    result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
    .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

    System.out.println(finalMap);

  }

}
