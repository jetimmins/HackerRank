package jet.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day26 {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();
        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();
        int monthDiff = actualMonth - expectedMonth;
        int dayDiff = actualDay - expectedDay;
        int fine = 0;

        //if return date on or before date, no fee
        if (actualYear > expectedYear) fine = 10000;
        else if (actualMonth > expectedMonth && actualYear == expectedYear) fine = 500 * monthDiff;
        else if (actualDay > expectedDay && actualMonth == expectedMonth) fine = 15 * dayDiff;
        //if after return date but still in calendar month & year, 15 * days late
        //if out of year, 10000 fine
        //if after calendar month but still year, 500 * months late
        System.out.println(fine);

    }
}
