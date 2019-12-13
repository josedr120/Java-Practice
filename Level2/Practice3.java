/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level2;

/**
 * @author josedr
 */


interface Student {
    void StudentDetails();

    void StudentMarks();
}

public class Practice3 implements Student {

    public static void main(String[] args) {
        Student obj = new Practice3();

        obj.StudentDetails();
        obj.StudentMarks();
    }

    @Override
    public void StudentDetails() {
        System.out.println("Name: Jose");
        System.out.println("Last Name: Rios");
        System.out.println("Age: 18");
        System.out.println("Status: Active");
    }

    public void StudentMarks() {
        String[] arrMarks = {"A", "A", "C", "B", "B"};

        for (String i : arrMarks) {
            System.out.println(i);
        }

    }

}
