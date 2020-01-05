package Assigments7;

import java.util.HashMap;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentList = new HashMap<Integer, String>();

        studentList.put(101, "Karthi");
        studentList.put(102, "Jose");
        studentList.put(103, "Jothi");
        studentList.put(104, "David");
        studentList.put(105, "Maki");

        System.out.println(studentList);

        Scanner in = new Scanner(System.in);
        int stu_id;
        String stu_name;
        int m1, m2, md1, md2;

        try {
            System.out.println("******************************************");

            System.out.println("Let’s check the user Get access or not");

            System.out.println("******************************************");


            System.out.print("Enter Student ID: ");
            stu_id = in.nextInt();
            System.out.print("Enter Student Name: ");
            stu_name = in.next();

            if (!studentList.containsKey(stu_id) && !studentList.containsKey(stu_name)) {
                throw new CustomEx1("You don’t have access to use the application");
            } else {
                throw new CustomEx1("Access provided");
            }

        } catch (CustomEx1 e) {
            System.out.println(e);
        }

        try {
            System.out.print("Enter Mark 1: ");
            m1 = in.nextInt();
            System.out.print("Enter Mark 2: ");
            m2 = in.nextInt();

            int total1 = m1 + m2;


            System.out.println("Total Mark: " + total1);

            System.out.println("Enter value for divide marks: ");
            System.out.print("Mark 1: ");
            md1 = in.nextInt();
            System.out.print("Mark 2: ");
            md2 = in.nextInt();

            int total2 = m1 / m2;

            if (total2 == 0) {
                System.out.println("M1: " + md1 + "\n" + "M2: " + md2);
                throw new NumberFormatException("Divide by Zero Not possible!\n");
            } else {
                System.out.println("Hey! you made it, BOIII.");
            }


        } catch (NumberFormatException n) {
            System.out.println(n);
        }
    }
}

class CustomEx1 extends Exception {
    String message;

    CustomEx1(String msg) {
        this.message = msg;
    }

    public String toString() {
        return (message);
    }
}
