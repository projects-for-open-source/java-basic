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

/**
 * @author richard
 */
public class Lambda4 {
  static int outerStaticNum;

  int outerNum;

  void testScopes() {
    int num = 1;

    Lambda2.Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

    String convert = stringConverter.convert(2);
    System.out.println(convert);    // 3

    Lambda2.Converter<Integer, String> stringConverter2 = (from) -> {
      outerNum = 13;
      return String.valueOf(from);
    };

    System.out.println("stringConverter2: " + stringConverter2);

    String[] array = new String[1];
    Lambda2.Converter<Integer, String> stringConverter3 = (from) -> {
      array[0] = "Hi there";
      return String.valueOf(from);
    };

    stringConverter3.convert(23);

    System.out.println(array[0]);
  }

  public static void main(String[] args) {
    new Lambda4().testScopes();
  }

}
