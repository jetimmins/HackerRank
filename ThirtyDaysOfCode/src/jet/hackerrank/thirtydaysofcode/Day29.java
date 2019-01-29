package jet.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            int max = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    int result = i & j;
                    if (result < k) {
                        max = Math.max(max, result);
                    }
                    if (max == k - 1) {
                        break;
                    }
                }
            }
            System.out.println(max);
        }
        scanner.close();
    }
}
