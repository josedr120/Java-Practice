/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments1;

import java.util.Scanner;

/**
 * @author josedr
 */

public class Practice3 {
    public static void main(String[] args) {
        Mobile myObj = new Mobile();

        Mobile Obj = new Mobile("Samsung", "Silver", 64);

        System.out.println(myObj);

        System.out.println(Obj);
    }
}


class Mobile {
    Scanner x = new Scanner(System.in);
    private String brand;
    private String color;
    private int camera;

    public Mobile() {
        brand = getBrand();
        color = getColor();
        camera = getCamera();

        System.out.println(brand + " mobile, " + color + " color," + " smartphone having, " + camera + "MP Camera");
    }

    public Mobile(String b, String c, int cm) {
        brand = b;
        color = c;
        camera = cm;

        System.out.println(brand + " mobile, " + color + " color," + " smartphone having, " + camera + "MP Camera");
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        System.out.print("Enter Brand: ");
        brand = x.next();
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the color
     */
    public String getColor() {
        System.out.print("Enter Color: ");
        color = x.next();
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the camera
     */
    public int getCamera() {
        System.out.print("Enter Camera Pixel: ");
        camera = x.nextInt();
        return camera;
    }

    /**
     * @param camera the camera to set
     */
    public void setCamera(int camera) {
        this.camera = camera;
    }
}