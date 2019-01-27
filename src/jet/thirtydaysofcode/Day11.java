package jet.thirtydaysofcode;

import java.util.Scanner;

public class Day11 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int sum;
        int bestSum = Integer.MIN_VALUE;
        for(int row = 0; row < arr[0].length - 2; row++) {
            for(int col = 0; col < arr[1].length -2; col++) {
                sum = arr[row][col] + arr[row][col+1] + arr[row][col+2]
                        + arr[row+1][col+1]
                        + arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];

                if(sum > bestSum) {
                    bestSum = sum;
                }
            }
        }
        System.out.println(bestSum);
        scanner.close();
    }
}
