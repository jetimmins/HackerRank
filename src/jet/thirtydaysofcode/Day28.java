package jet.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28 {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int size = 0;
        String[] names = new String[N];
        String emailRegex = "^[a-z\\.]+@gmail\\.com$";
        Pattern p = Pattern.compile(emailRegex);

        for (int i = 0; i < N; i++) {
            String firstName = scanner.next();
            String email = scanner.next();

            Matcher m = p.matcher(email);
            if (m.find()) {
                names[size++] = firstName;
            }
        }
        String[] cleanNames = new String[size];
        System.arraycopy(names, 0, cleanNames, 0, size);
        Arrays.sort(cleanNames);
        for (String element : cleanNames) {
            System.out.println(element);
        }

        scanner.close();
    }
}
