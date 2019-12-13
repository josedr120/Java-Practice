/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level2;

/**
 * @author josedr
 */
public class Practice2 {


    public static void main(String[] args) {

        ConstructorObj obj = new ConstructorObj();


    }


    static class ConstructorObj {

        p2StundentClass obj1 = new p2StundentClass();

        String roll = obj1.getStuRoll();
        String name = obj1.getStuName();
        String email = obj1.getStuEmail();
        int id = obj1.getStuId();
        String city = obj1.getStuCity();


        ConstructorObj() {
            System.out.println(name);
            System.out.println(id);
            System.out.println(city);
            System.out.println(roll);
            System.out.println(email);
        }

        ConstructorObj(String namew, String cityw, String rollw, String emailw) {
            email = emailw;
            city = cityw;
            roll = rollw;
            name = namew;
        }

        ConstructorObj(int idw) {
            id = idw;
        }


    }


}