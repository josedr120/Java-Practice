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
public class Practice17 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String name, yesorno;

        System.out.print("Enter name: ");
        name = x.nextLine();
        System.out.print("Do you want to continue (Y/N): ");
        yesorno = x.next();

        switch (yesorno) {
            case "Y":
                Practice17.main(args);
                GlobalMethods.displayNames(name);
                break;
            case "N":
                System.out.println(name);
                break;
        }
    }
}
