/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level1;

/**
 * @author josedr
 */
public class Practice16 {
    String name = "";
    int IntNumber = 0;
    double DoubleNumber = 708.509767862;
    boolean BooleanSta = false;

    static void myMethod1() {
        System.out.println("This is from a void method.");
    }

    static String myMethod2() {
        System.out.println("This is from a String method.");

        return null;
    }

    static int myMethod3() {
        int numInt = 1457;

        System.out.println("This is from a int method " + numInt);

        return numInt;
    }

    static double myMethod4() {
        double numDouble = 14.98873;

        System.out.println("This isn from a Double method " + numDouble);

        return numDouble;
    }

    static boolean myMethod5() {
        int a = 20;
        int b = 10;

        if (a >= b) {
            System.out.println("This is from a boolean method {TRUE}");
        } else {
            System.out.println("This is from a boolean method {FALSE}");
        }

        return true;
    }

    public static void main(String[] args) {
        Practice16 ob = new Practice16();

        myMethod1();
        myMethod2();
        myMethod3();
        myMethod4();
        myMethod5();

        ob.MyInstanceMethod1("Jose Method");
        ob.MyInstanceMethod2(1450);
        ob.MyInstanceMethod3(708.509767862);
        ob.MyInstanceMethod4(true);
        System.out.println("My Instance Method String " + ob.name);
        System.out.println("My Instance Method Int " + ob.IntNumber);
        System.out.println("My Instance Method Double " + ob.DoubleNumber);
        System.out.println("My Instance Method Boolean " + ob.BooleanSta);
    }

    public void MyInstanceMethod1(String name) {
        this.name = name;
    }

    public void MyInstanceMethod2(int Intnumber) {
        this.IntNumber = IntNumber;
    }

    public void MyInstanceMethod3(double DoubleNumber) {
        this.DoubleNumber = DoubleNumber;
    }

    public void MyInstanceMethod4(boolean BooleanSta) {
        this.BooleanSta = BooleanSta;
    }
}
