package Assigments3;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        new Employee();

        new finalKeyword();
    }
}

class Employee {
    final int count = 5;
    String em_name;
    String em_email;
    String em_designation;

    public Employee() {
        Scanner x = new Scanner(System.in);

        for (int i = 0; i <= count; i++) {
            System.out.print("Enter Name: ");
            em_name = x.next();
            System.out.print("Enter Email: ");
            em_email = x.next();
            System.out.print("Enter Designation: ");
            em_designation = x.next();

            System.out.println("===================================================");

            System.out.println("Name: " + em_name);
            System.out.println("Email: " + em_email);
            System.out.println("Designation: " + em_designation);

            System.out.println("===================================================");

            if (i == 5) {
                System.out.println("Stop adding details !,\n Maximum employee lists are reached");
            }

        }
    }
}


class finalKeyword {
    public finalKeyword() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // final with for-each statement
        // legal statement
        for (final int i : arr)
            System.out.print(i + " ");
    }
}
