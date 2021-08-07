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

import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author richard
 */
public class Lambda3 {

  @FunctionalInterface
  interface Fun {
    void foo();
  }

  public static void main(String[] args) throws Exception {

    // Predicates

    Predicate<String> predicate = (s) -> s.length() > 0;

    predicate.test("foo");              // true
    predicate.negate().test("foo");     // false

    Predicate<Boolean> nonNull = Objects::nonNull;
    System.out.println("nonNull: " + nonNull);

    Predicate<Boolean> isNull = Objects::isNull;
    System.out.println("isNull: " + isNull);

    Predicate<String> isEmpty = String::isEmpty;

    Predicate<String> isNotEmpty = isEmpty.negate();
    System.out.println("isNotEmpty: " + isNotEmpty);

    // Functions

    Function<String, Integer> toInteger = Integer::valueOf;
    Function<String, String> backToString = toInteger.andThen(String::valueOf);

    backToString.apply("123");     // "123"

    // Suppliers

    Supplier<Person> personSupplier = Person::new;
    personSupplier.get();   // new Person

    // Consumers

    Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
    greeter.accept(new Person("Luke", "Skywalker"));

    // Comparators

    Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

    Person p1 = new Person("John", "Doe");
    Person p2 = new Person("Alice", "Wonderland");

    comparator.compare(p1, p2);             // > 0
    comparator.reversed().compare(p1, p2);  // < 0

    // Runnables

    Runnable runnable = () -> System.out.println(UUID.randomUUID());
    runnable.run();

    // Callables

    Callable<UUID> callable = UUID::randomUUID;
    callable.call();

  }

}
