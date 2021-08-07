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
public class Interface1 {

  @FunctionalInterface
  interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
      return Math.sqrt(positive(a));
    }

    static int positive(int a) {
      return a > 0 ? a : 0;
    }
  }

  public static void main(String[] args) {

    Formula formula1 = new Formula() {
      @Override
      public double calculate(int a) {
        return sqrt(a * 100);
      }
    };

    System.out.println(formula1.calculate(1));

    formula1.calculate(100);     // 100.0
    formula1.sqrt(-23);          // 0.0
    Formula.positive(-4);        // 0.0

    // Formula formula2 = (a) -> sqrt( a * 100);
  }

}