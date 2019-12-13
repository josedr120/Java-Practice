package Level2;

public class Practice10 {
    public static void main(String[] args) {
        MyTest.add obj1 = new MyTest.add();

        MyTest.sub obj2 = new MyTest.sub();

        MyTest.multi obj3 = new MyTest.multi();
    }
}

abstract class MyTest {

    public MyTest() {
        calculate();
    }

    public abstract void calculate();

    static class add extends MyTest {

        @Override
        public void calculate() {
            System.out.println("a");
        }
    }

    static class sub extends MyTest {

        @Override
        public void calculate() {
            System.out.println("s");
        }
    }

    static class multi extends MyTest {

        @Override
        public void calculate() {
            System.out.println("m");
        }
    }
}