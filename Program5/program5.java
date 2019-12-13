/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program5;

import java.util.Scanner;

/**
 * @author josedr
 */
public class program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String selection;
        System.out.print("What is the correct way to declre a varibale to store an integer value in Java?");
        System.out.print(" [a] int 1x=10");
        System.out.print(" [b] int x=10");
        System.out.print(" [c] float x=10.0f");
        System.out.print(" [d] string x='10'");
        System.out.print("\nEnter your choice: ");
        selection = input.next();

        switch (selection) {
            case "a":
                System.out.println(" {int 1x=10} ");
                break;

            case "b":
                System.out.println(" {int x=10} ");
                break;

            case "c":
                System.out.println(" {float x=10.0f} ");
                break;

            case "d":
                System.out.print(" {string x='10'} ");
                break;
        }

    }
}
