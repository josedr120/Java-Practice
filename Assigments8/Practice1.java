package Assigments8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee obj = new Employee();

        int id = obj.getEmployee_id();
        String name = obj.getEmployee_name();
        int exp = obj.getEmployee_exp();

        System.out.print("Enter Employee ID: ");
        id = in.nextInt();
        System.out.print("Enter Employee Name: ");
        name = in.next();
        System.out.print("Enter Employee Experience: ");
        exp = in.nextInt();

        if (exp > 10) {
            List<Integer> list = new ArrayList<Integer>();

            list.add(exp);

            System.out.println("Success: Your data is stored here. Thank you!.");
        } else if (exp < 10) {
            System.out.println("Fail: Your are not valid user to store your details.");
        }

    }
}


class Employee {
    private int employee_id;
    private String employee_name;
    private int employee_exp;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEmployee_exp() {
        return employee_exp;
    }

    public void setEmployee_exp(int employee_exp) {
        this.employee_exp = employee_exp;
    }
}