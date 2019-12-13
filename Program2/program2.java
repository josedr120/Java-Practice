/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program2;

import java.util.Scanner;

/**
 * @author josedr
 */
public class program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b;

        System.out.print("\nEnter value A: ");
        a = input.nextDouble();

        System.out.print("\nEnter value B: ");
        b = input.nextDouble();

        System.out.print("\nValue A is: " + a);

        System.out.print("\nValue B is: " + b);
    }
}
