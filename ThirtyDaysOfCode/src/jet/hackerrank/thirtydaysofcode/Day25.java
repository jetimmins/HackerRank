package jet.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(isPrime(sc.nextInt()));
        }
    }

    static String isPrime(int input) {
        if (input == 1 || input == 0) {
            return "Not prime";
        }
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0)
                return "Not prime";
        }
        return "Prime";
    }
}
