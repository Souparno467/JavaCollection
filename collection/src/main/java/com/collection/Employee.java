//Author:@Souparno
package com.collection;
// create a Employee class with name and salary then add 5 employees in a list
//   then write a static method which will take a list and print total salary for them
import java.util.List;
import java.util.ArrayList;

class Employee {
    private String name;
    private int salary;             // Instance variables

    public Employee(String name, int salary) {
        this.name = name;                     // Constructor
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static void printTotalSalary(List<Employee> employees) {  // Static method to calculate total salary
        int totalSalary = 0;
        for (Employee employee : employees) {               // Loop through the list of employees
            totalSalary += employee.getSalary();
        }
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {  // Main method
        List<Employee> employees = new ArrayList<>();  // Creating a list of employees
        employees.add(new Employee("Souparno", 50000));
        employees.add(new Employee("Aditya", 60000));
        employees.add(new Employee("Tamoghno", 55000));
        employees.add(new Employee("Sayantani", 70000));
        employees.add(new Employee("Tamojeet", 65000));

        printTotalSalary(employees);
    }
}