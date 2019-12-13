package Level2;

public class Practice13 {
    public static void main(String[] args) {
        System.out.println("Main thread is- " + Thread.currentThread().getName());

        Thread t1 = new Thread(new Practice13().new RunnableImpl());
        t1.start();
    }

    public class RunnableImpl implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ", executing run() method!");
        }
    }
}
