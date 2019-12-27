package Task2;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int num;
        int reverseNum = 0;

        System.out.print("Enter Number: ");
        num = x.nextInt();

        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            break;
        }

        System.out.println("Reverse number: " + reverseNum);


    }
}
