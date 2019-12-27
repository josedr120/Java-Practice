package Task2;

public class Program6 {
    public static void main(String[] args) {
        int num = 10;
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
