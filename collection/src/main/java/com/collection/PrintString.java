//Author:@Souparno
package com.collection;
//create a list of 5 strings and print them using for each loop
import java.util.ArrayList;
import java.util.List;
class PrintString {
    public static void Display(List<String> list) {
        for (String str : list) {                             //for each loop
            System.out.println(str);
        }
    }
    public static void main(String[] args) {                         //main method
        List<String> list = new ArrayList<>();  //create a list of strings
        list.add("apple");
        list.add("guava");
        list.add("orange");
        list.add("banana");
        list.add("mango");

        Display(list);
    }
}



