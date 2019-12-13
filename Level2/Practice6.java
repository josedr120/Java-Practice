/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level2;

import java.util.Scanner;

interface manipulation {
    void manipulation(int a, int b);
}

interface comp {
    void comp(int a, int b);
}

/**
 * @author josedr
 */
public class Practice6 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);


        System.out.print("Enter Num 1: ");
        int a = y.nextInt();

        System.out.print("Enter Num 2: ");
        int b = y.nextInt();

        Mult obj = new Mult();

        obj.manipulation(a, b);
        obj.comp(a, b);
    }
}

class Mult implements manipulation, comp {
    int a, b;

    public void manipulation(int a, int b) {

        int total = a * b;

        System.out.println("Total: " + total);
    }

    public void comp(int a, int b) {

        if (a > b) {
            System.out.println("Max " + a);
        } else {
            System.out.println("Min " + a);
        }

        if (b > a) {
            System.out.println("Max " + b);
        } else {
            System.out.println("Min " + b);
        }

    }
}