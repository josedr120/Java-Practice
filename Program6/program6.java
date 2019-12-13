/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program6;

import java.util.Scanner;

/**
 * @author josedr
 */
public class program6 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new program6().nameList();
    }

    public void nameList() {
        String name, choice;

        System.out.print("Enter your name: ");
        name = input.next();

        System.out.println("The name list: " + name);

        System.out.print("\nDo you want to continue: (y/n): ");
        choice = input.next();

        switch (choice) {
            case "y":
                new program6().nameList();
                break;

            case "n":
                System.out.println("Bye, Bye");
                break;
        }
    }
}
