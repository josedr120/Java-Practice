package Assigments1;

import java.util.Scanner;

interface manipulate {
    void get_total();

    void DisplayMarklist();
}

public class Practice6 {
    public static void main(String[] args) {
        new MarkSheet().DisplayMarklist();
    }
}

class Student {
    private int Student_id;
    private String Student_name;


    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }
}


class MarkSheet implements manipulate {
    Scanner in = new Scanner(System.in);
    Student obj = new Student();


    int id = obj.getStudent_id();
    String name = obj.getStudent_name();

    int mark1, mark2, mark3, mark4;

    @Override
    public void DisplayMarklist() {
        System.out.print("Enter ID: ");
        id = in.nextInt();

        System.out.print("Enter Name: ");
        name = in.next();

        System.out.print("Enter Mark 1: ");
        mark1 = in.nextInt();
        System.out.print("Enter Mark 2: ");
        mark2 = in.nextInt();
        System.out.print("Enter Mark 3: ");
        mark3 = in.nextInt();
        System.out.print("Enter Mark 4: ");
        mark4 = in.nextInt();


        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
        System.out.println("Subject 4: " + mark4);

        get_total();

    }


    @Override
    public void get_total() {
        int total = mark1 + mark2 + mark3 + mark4;

        System.out.println("Total: " + total);
    }
}