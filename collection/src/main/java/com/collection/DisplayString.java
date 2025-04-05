//Author:@Souparno
package com.collection;
//create a list of 5 strings and print them using lambda
import java.util.ArrayList;
import java.util.List;
 class DisplayString {
     public static void PrintString(List<String> list) {
         list.forEach(s -> System.out.println(s));          // lambda expression
     }
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();     // create a list
            list.add("Sherlock Holmes");
            list.add("Feluda");
            list.add("Byomkesh Bakshi");
            list.add("kiriti Roy");
            list.add("hercule Poirot");
            PrintString(list);
        }
 }