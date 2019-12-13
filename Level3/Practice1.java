package Level3;

import java.io.IOException;

public class Practice1 implements Runnable {
    Thread t;

    public static void main(String[] args) {
        Thread t = new Thread(new Practice1());
        t.start();
    }

    @Override
    public void run() {
        try {
            Runtime.getRuntime().exec("code");
            Thread.sleep(1000);
            Runtime.getRuntime().exec("killall code");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
