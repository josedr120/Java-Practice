/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level1;

/**
 * @author josedr
 */
public class Practice8 {
    public static void main(String[] args) {
        int a, b;
        a = 20;
        b = 45;
        System.out.println("Before swapping : a, b = " + a + ", " + +b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b = " + a + ", " + +b);
    }
}
