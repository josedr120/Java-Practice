/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import java.util.Scanner;

/**
 * @author josedr
 */
public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Enter your Age: ");
        age = input.nextInt();

        if (age >= 18) {
            System.out.print("You are eligable to vote :)");
        } else {
            System.out.print("You are not eligable to vote :(");
        }
    }
}
