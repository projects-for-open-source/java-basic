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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author richard
 */
public class ConcurrentUtils {

  public static void stop(ExecutorService executor) {
    try{
      executor.shutdown();
      executor.awaitTermination(60, TimeUnit.SECONDS);
    } catch (InterruptedException e){
      System.err.println("termination interrupted");
    } finally{
      if (!executor.isTerminated()){
        System.err.println("killing non-finished tasks");
      }
      executor.shutdownNow();
    }
  }

  public static void sleep(int seconds) {
    try{
      TimeUnit.SECONDS.sleep(seconds);
    } catch (InterruptedException e){
      throw new IllegalStateException(e);
    }
  }
}
