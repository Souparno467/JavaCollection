//Author:@Souparno
package com.collection;
// Create an array of 5 integers then store them in a list then write a static method
//which will take a list as parameter and find the sum of the numbers.
import java.util.ArrayList;
import java.util.List;

class Summation {
    public static void display() {
        int[] numbers = {10, 45, 39, 64, 85};
        List<Integer> numberList = new ArrayList<>();
        for (int number : numbers) {
            numberList.add(number);                   // Adding each number to the list
        }
        int sum = calculateSum(numberList);
        System.out.println("The sum of the numbers is: " + sum);
    }

    public static int calculateSum(List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;                   // Calculating the sum of the numbers in the list
        }
        return sum;
    }

    public static void main(String[] args) {
        display();
    }
}