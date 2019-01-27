package jet.thirtydaysofcode;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int inputs = in.nextInt();

        for(int curr = 0; curr < inputs; curr++) {
            StringBuilder odds = new StringBuilder();
            StringBuilder evens = new StringBuilder();

            String input = in.next();

            for(int i = 0; i < input.length(); i++) {
                String chunk = input.substring(i, i+1);
                if(i % 2 == 0) {
                    evens.append(chunk);
                } else {
                    odds.append(chunk);
                }
            }
            System.out.println(evens.toString() + " " + odds.toString());
        }
    }
}
