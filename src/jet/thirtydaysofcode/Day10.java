package jet.thirtydaysofcode;

import java.util.Scanner;

public class Day10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        char[] binary = Integer.toBinaryString(n).toCharArray();
        int count = 0, bestCount = 0;
        for(char c : binary)
        {
            count += c == '1' ? 1 : -count;
            bestCount = count > bestCount ? count : bestCount;
        }
        System.out.println(bestCount);
        scanner.close();
    }
}
