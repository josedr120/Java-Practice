/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level2;

/**
 * @author josedr
 */
public class Practice5 {
    public static void main(String[] args) {
        Two set = new Two();
        set.print_single();
        set.print_inheritance();
    }
}


class One {
    public void print_single() {
        System.out.println("Single ");
    }
}

class Two extends One {
    public void print_inheritance() {
        System.out.println("Inheritance");
    }
}