/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments1;

/**
 * @author josedr
 */
public class Practice2 {
    public static void main(String[] args) {
        ClassObjDisplay ou = new ClassObjDisplay();

        ou.Display();
    }
}


class Lamp {
    boolean isOn;
    boolean isOff;

    public void On() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    public void Off() {
        isOff = false;
        System.out.println("Light off " + isOff);
    }

    public void DisplayLampStatus() {
        new Lamp().On();
        new Lamp().Off();

    }
}


class ClassObjDisplay {
    public void Display() {
        Lamp obj = new Lamp();

        obj.DisplayLampStatus();
    }
}