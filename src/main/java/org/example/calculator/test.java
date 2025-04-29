package org.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class test {
  public static void main(String[] args){
    List<Integer> list = new ArrayList<>();
    list.remove(0);

    for(Integer each : list){
      System.out.println(each);
    }

    System.out.println("end");
  }

}
