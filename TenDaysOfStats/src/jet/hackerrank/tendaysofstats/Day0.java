package jet.hackerrank.tendaysofstats;

import java.util.*;

public class Day0 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int n = scanner.nextInt();
    private static final String format = "%.2f%n";

    public static void main(String[] args) {

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.printf(format, calculateMean(arr));
        System.out.printf(format, calculateMedian(arr));
        System.out.println(calculateMode(arr));
    }

    private static int calculateMode(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFrequency = 0;
        int mode = Integer.MAX_VALUE;
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
            int frequency = map.get(i);
            if (mostFrequent(i, frequency, mode, maxFrequency)) {
                maxFrequency = frequency;
                mode = i;
            }
        }
        return mode;
    }

    private static boolean mostFrequent(int i, int frequency, int mode, int maxFrequency) {
        return (frequency > maxFrequency) || (frequency == maxFrequency && i < mode);
    }

    private static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        return n % 2 == 0 ? calculateMean(arr[n / 2], arr[(n / 2) - 1]) :
                arr[n / 2];
    }

    private static double calculateMean(int... arr) {
        double total = 0;
        for (int i : arr) {
            total += i;
        }
        return total / arr.length;
    }
}
