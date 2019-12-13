/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level1;

import java.util.Scanner;

/**
 * @author josedr
 */
public class Practice4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter Number 1: ");
        num1 = x.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = x.nextInt();

        int total = num1 * num2;

        System.out.println(num1 + " x " + num2 + " = " + total);

    }
}
