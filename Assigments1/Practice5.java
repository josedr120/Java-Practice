package Assigments1;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter Number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = input.nextInt();

        int total = num1 * num2;

        System.out.println(num1 + " x " + num2 + " = " + total);
    }
}
