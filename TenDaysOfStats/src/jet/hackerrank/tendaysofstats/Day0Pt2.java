package jet.hackerrank.tendaysofstats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day0Pt2 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int N;
    private static int[] X;
    private static int[] W;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(reader.readLine());
        X = readIntArray();
        W = readIntArray();

        System.out.printf("%.1f", getWeightedMean());
    }

    private static int[] readIntArray() throws IOException {
        return Arrays.stream(reader.readLine().split("\\s"))
                .mapToInt(Integer::parseInt).toArray();
    }

    private static float getWeightedMean() {
        float numerator = 0;
        float denominator = 0;
        for (int i = 0; i < N; i++) {
            numerator += X[i] * W[i];
            denominator += W[i];
        }
        return numerator / denominator;
    }
}
