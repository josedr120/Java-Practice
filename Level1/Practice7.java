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
public class Practice7 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int num;

        System.out.print("Enter Number: ");
        num = x.nextInt();


        boolean u = GlobalMethods.verifyNumber(num);

        if (u == true) {
            System.out.println(num + " is positive.");
        } else {
            System.out.println(num + " is negative.");
        }


    }
}
