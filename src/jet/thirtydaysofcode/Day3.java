package jet.thirtydaysofcode;

import java.util.Scanner;

public class Day3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        String status = N % 2 == 1 ? "Weird"
                : (N >= 6 && N <= 20) ? "Weird"
                : "Not Weird";
        System.out.println(status);
    }
}
