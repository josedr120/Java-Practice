package Level2;

interface abstraction {
    void abs();
}

interface subtraction {
    void subs();
}

interface multiplication {
    void mult();
}

interface division {
    void div();
}

public class Practice9 {
    public static void main(String[] args) {
        calculator obj = new calculator();

        obj.abs();
        obj.subs();
        obj.mult();
        obj.div();
    }
}

class calculator implements abstraction, subtraction, multiplication, division {

    @Override
    public void abs() {
        int a = 5, b = 10;

        int sum = a + b;

        System.out.println(sum);
    }

    @Override
    public void subs() {
        int a = 90, b = 150;

        int rest = b - a;

        System.out.println(rest);
    }

    @Override
    public void mult() {
        int a = 9, b = 5;

        int mult = b * a;

        System.out.println(mult);
    }

    @Override
    public void div() {
        int a = 15, b = 5;

        int div = a / b;

        System.out.println(div);
    }
}