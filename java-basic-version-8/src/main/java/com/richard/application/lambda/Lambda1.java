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

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author richard
 */
public class Lambda1 {
  public static void main(String[] args) {
    
    List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        return b.compareTo(a);
      }
    });

    Collections.sort(names, (String a, String b) -> {
      return b.compareTo(a);
    });

    Collections.sort(names, (String a, String b) -> b.compareTo(a));

    Collections.sort(names, (a, b) -> b.compareTo(a));

    System.out.println(names);

    names.sort(Collections.reverseOrder());

    System.out.println(names);

    List<String> names2 = Arrays.asList("peter", null, "anna", "mike", "xenia");
    names2.sort(Comparator.nullsLast(String::compareTo));
    System.out.println(names2);

    List<String> names3 = null;

    Optional.ofNullable(names3).ifPresent(list -> list.sort(Comparator.naturalOrder()));

    System.out.println(names3);
  }
  
}
