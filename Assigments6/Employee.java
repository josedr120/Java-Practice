/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments6;

/**
 * @author josedr
 */
public class Employee {
    private int id = -1;
    private String name = null;
    private int age = -1;
    private int exp = -1;
    private String salary = null;

    public Employee(int id, String name, int age, int exp, String salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.exp = exp;
        this.salary = salary;
    }

    public int compareTo(Employee o) {
        return this.exp = o.exp;
    }


    @Override
    public String toString() {
        return "Employee : " + id + " - " + name + " - " + " - " + age + "exp" + "salary" + "\n";
    }


}
