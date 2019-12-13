/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level2;

/**
 * @author josedr
 */

// Java program to illustrate 
// tight coupling concept 
public class Practice4 {
    public static void main(String[] args) {
        new Practice4().tightCoupling();
        new Practice4().looseCoupling();
    }

    public void tightCoupling() {
        TightBox tb = new TightBox(5, 5, 5);
        System.out.println(tb.tightVolume);
    }

    public void looseCoupling() {
        looseBox lb = new looseBox(10, 20, 25);
        System.out.println(lb.getLooseVolume());
    }
}

final class looseBox {
    private final int looseVolume;

    looseBox(int length, int width, int height) {
        this.looseVolume = length * width * height;
    }

    public int getLooseVolume() {
        return looseVolume;
    }
}


class TightBox {
    public int tightVolume;

    TightBox(int length, int width, int height) {
        this.tightVolume = length * width * height;
    }
}
