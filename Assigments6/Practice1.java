/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments6;

import java.util.TreeSet;


/**
 * @author josedr
 */
public class Practice1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Sunil", 28, 2, "20,000");
        Employee e2 = new Employee(103, "Ajay", 26, 12, "25,860");
        Employee e3 = new Employee(102, "Balu", 20, 1, "10,000");
        Employee e4 = new Employee(104, "Abdul", 27, 8, "35,000");


        TreeSet<Employee> employee = new TreeSet<>();
        employee.add(e2);
        employee.add(e3);
        employee.add(e1);
        employee.add(e4);


        // Sorted List
        System.out.println(employee);
    }
}
