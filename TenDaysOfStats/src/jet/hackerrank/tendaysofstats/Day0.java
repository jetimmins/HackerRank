package jet.hackerrank.tendaysofstats;

import java.util.*;

public class Day0 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int n = scanner.nextInt();
    private static final String format = "%.2f%n";
    public static void main(String[] args) {

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.printf(format, calculateMean(arr));
        System.out.printf(format, calculateMedian(arr));
        System.out.printf(format, calculateMode(arr));
    }

    private static int calculateMode(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            int freq = map.containsKey(i) ? map.get(i) : 0;
            map.put(i, freq);
        }
        Integer max = map.values().stream().max(Comparator.naturalOrder()).get();
    }

    private static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        return n % 2 == 0 ? calculateMean(arr[n / 2], arr[(n / 2) + 1]) :
                            arr[n / 2];
    }

    private static double calculateMean(int... arr) {
        double total = 0;
        for(int i : arr) {
            total += i;
        }
        return total / n;
    }



}
