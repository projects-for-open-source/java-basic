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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author richard
 */
public class ArrayList6 {

  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    al.add("Ravi");
    al.add("Vijay");
    al.add("Ajay");

    try{
      // Serialization
      FileOutputStream fos = new FileOutputStream("file");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(al);
      fos.close();
      oos.close();

      // Deserialization
      FileInputStream fis = new FileInputStream("file");
      try (ObjectInputStream ois = new ObjectInputStream(fis)){
        ArrayList<?> list = (ArrayList<?>) ois.readObject();
        System.out.println(list);
      }
    } catch (Exception e){
      System.out.println(e);
    }
  }

}
