package jet.hackerrank.tendaysofstats;

import java.util.Arrays;
import java.util.Scanner;

public class Day1Pt2 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int n = scanner.nextInt();
    private static final int[] X = new int[n];
    private static final int[] F = new int[n];
    private static int[] S;

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            X[i] = scanner.nextInt();
        }
        int frequencySum = 0;
        for (int i = 0; i < n; i++) {
            F[i] = scanner.nextInt();
            frequencySum += F[i];
        }
        S = new int[frequencySum];

        int datasetIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < F[i]; j++) {
                S[datasetIndex] = X[i];
                datasetIndex++;
            }
        }
        Arrays.sort(S);
        float q1 = (float) calculateMedian(0, S.length / 2 - 1);
        float q3 = S.length % 2 == 0 ? (float) calculateMedian(S.length / 2, S.length - 1) :
                (float) calculateMedian(S.length / 2 + 1, S.length - 1);
        System.out.println(q3 - q1);
    }

    private static int calculateMedian(int start, int end) {
        int len = end - start + 1;
        return len % 2 == 0 ?
                (S[start + len / 2 - 1] + S[start + len / 2]) / 2 :
                S[start + len / 2];
    }
}
