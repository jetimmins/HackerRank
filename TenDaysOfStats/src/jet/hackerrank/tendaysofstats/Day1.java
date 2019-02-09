package jet.hackerrank.tendaysofstats;

import java.util.Arrays;
import java.util.Scanner;

public class Day1 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int n = scanner.nextInt();
    private static final int[] X = new int[n];

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            X[i] = scanner.nextInt();
        }
        Arrays.sort(X);
        System.out.println(calculateMedian(0, n / 2 - 1));
        System.out.println(calculateMedian(0, n - 1));
        System.out.println(n % 2 == 0 ?
                calculateMedian(n / 2, n - 1) :
                calculateMedian(n / 2 + 1, n - 1));
    }

    private static int calculateMedian(int start, int end) {
        int len = end - start + 1;
        return len % 2 == 0 ?
                (X[start + len / 2 - 1] + X[start + len / 2]) / 2 :
                X[start + len / 2];
    }
}
