/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level2;

/**
 * @author josedr
 */
public class Practice1 {
    public static void main(String[] args) {
        p1PersonClass obj = new p1PersonClass();

        String name = obj.getName();
        int age = obj.getAge();
        String email = obj.getEmail();
        int id = obj.getId();

        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
        System.out.println(id);
    }
}