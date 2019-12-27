package Task2;

public class Program7 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 10, 8, 12};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }
}
