package Assigments4;

public class Practice3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        int miss = getMissingNum(a, 5);
        System.out.println(miss);
    }

    static int getMissingNum(int[] a, int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++) {
            total -= a[i];
        }
        return total;
    }
}
