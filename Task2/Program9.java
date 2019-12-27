package Task2;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int num1, num2;

        try {
            System.out.print("Enter Number 1: ");
            num1 = x.nextInt();
            System.out.print("Enter Number 2: ");
            num2 = x.nextInt();

            System.out.println(num1);
            System.out.println(num2);
        } catch (NumberFormatException e) {
            e.getMessage();
        }

    }
}
