package jet.thirtydaysofcode;

import java.util.HashMap;
import java.util.Scanner;

public class Day8 {
    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap phoneBook = new HashMap(n);

        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            System.out.println(phoneBook.containsKey(s) ?
                    String.format("%s=%s", s, phoneBook.get(s)) :
                    "Not found");

        }
        in.close();
    }
}
