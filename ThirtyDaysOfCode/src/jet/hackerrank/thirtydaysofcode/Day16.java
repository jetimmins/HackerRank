package jet.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        Integer value;
        try {
            value = Integer.parseInt(S);
            System.out.println(value);
        }
        catch(Exception e) {
            System.out.println("Bad String");
        }
    }
}
