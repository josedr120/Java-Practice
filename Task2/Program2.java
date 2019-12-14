package Task2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int num;
        int flag = 0;


        System.out.print("Enter Number: ");
        num = x.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(num + " is prime number");
            }
        }
    }
}
