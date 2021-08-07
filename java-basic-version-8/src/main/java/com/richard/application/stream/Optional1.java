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

import java.util.Optional;

/**
 * @author richard
 */
public class Optional1 {

  public static void main(String[] args) {
    String str = "bam";
    Optional<String> optional = Optional.of(str);

    optional.isPresent();           // true
    optional.get();                 // "bam"
    optional.orElse("fallback");    // "bam"

    optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"

    System.out.println();
  }

}
