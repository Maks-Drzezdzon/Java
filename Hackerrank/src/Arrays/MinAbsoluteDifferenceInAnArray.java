package Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MinAbsoluteDifferenceInAnArray {

    public static class Solution {

        // Complete the minimumAbsoluteDifference function below.

        static int minimumAbsoluteDifference(int[] arr) {
            int min_abs_dif = Integer.MAX_VALUE;

            Arrays.sort(arr);

            for(int i=0; i<arr.length-1;i++){
                int current_dif = Math.abs(arr[i]-arr[i+1]);
                min_abs_dif = Math.min(min_abs_dif, current_dif);
            }
            return min_abs_dif;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int result = minimumAbsoluteDifference(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }

}
