package Level2;

public class Practice14 {
    public static void main(String[] args) {
        employee em = new employee();
        department de = new department();

        Thread ej = new Thread(new employee());
        ej.start();
    }
}


class employee implements Runnable {
    @Override
    public void run() {
        Thread t1 = new Thread();
        department d1 = new department();

        System.out.println("Ramu");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Rajesh");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Subash");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Guna");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class department implements Runnable {

    @Override
    public void run() {
        Thread t2 = new Thread();
        employee e1 = new employee();

        System.out.println("Developing");

        try {
            Thread.sleep(2000);
            e1.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Accounts");

        try {
            Thread.sleep(2000);
            e1.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Marketing");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Sales");
    }
}