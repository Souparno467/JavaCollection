//Author:@Souparno
package com.collection;
//create a list of 5 strings and print that string having length > 3 characters
import java.util.ArrayList;
import java.util.List;
 class StringLength {
     public static void LengthOfString(List<String> list) {
         for (String str : list) {
             if (str.length() > 3) {
                 System.out.println(str);                  //print the string having length > 3 characters
             }
         }
     }
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();      //create a list of 5 strings
            list.add("Java");
            list.add("Python");
            list.add("Jython");
            list.add("JavaScript");
            list.add("C++");

            LengthOfString(list);
        }
 }