/**
 * @Nickname: Richard
 * @Email: richardvu.work@gmail.com
 * @Skype: richardvu.work@gmail.com
 * @Phone: (+84) 0935710974 - (+84) 0935810974
 * @Country: Viet Nam
 * @Year: 2021
 * @LICENSE: DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author richard
 */
public class CompletableFuture1 {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<String> future = new CompletableFuture<>();

    future.complete("42");

    future.thenAccept(System.out::println).thenAccept(v -> System.out.println("done"));

  }

}