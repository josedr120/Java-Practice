/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program1;

import java.util.Scanner;

/**
 * @author josedr
 */
public class program1 {
    Scanner input = new Scanner(System.in);
    int num1, num2;

    public static void main(String[] args) {
        new program1().subtractingMenu();
    }

    public void subtractingMenu() {

        int selection;
        System.out.print(" [1] Addition");
        System.out.print(" [2] Subtraction");
        System.out.print(" [3] Multiplication");
        System.out.print(" [4] Division");
        System.out.print(" Select your your method: ");
        selection = input.nextInt();


        switch (selection) {
            case 1:
                System.out.print("Number 1: ");
                num1 = input.nextInt();
                System.out.print("Number 2: ");
                num2 = input.nextInt();

                int totalValAdd = num1 + num2;

                System.out.print("Your Addition is: " + totalValAdd);
                break;
            case 2:
                System.out.print("Number 1: ");
                num1 = input.nextInt();
                System.out.print("Number 2: ");
                num2 = input.nextInt();

                int totalValSub = num1 - num2;

                System.out.print("Your Addition is: " + totalValSub);
                break;

            case 3:
                System.out.print("Number 1: ");
                num1 = input.nextInt();
                System.out.print("Number 2: ");
                num2 = input.nextInt();

                int totalValMult = num1 * num2;

                System.out.print("Your Addition is: " + totalValMult);
                break;

            case 4:
                System.out.print("Number 1: ");
                num1 = input.nextInt();
                System.out.print("Number 2: ");
                num2 = input.nextInt();

                int totalValDiv = num1 / num2;

                System.out.print("Your Addition is: " + totalValDiv);
                break;
        }
    }
}
