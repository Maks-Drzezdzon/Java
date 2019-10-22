import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {
    
    public static class Solution {

        // Complete the maximumToys function below.
        static int maximumToys(int[] prices, int money) {
            Arrays.sort(prices);
            int toys=0;
            int budget=0;
            for(int cost : prices){

                budget = budget + cost;
                if (money < budget) return toys;
                toys++;
            }
            return toys;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] prices = new int[n];

            String[] pricesItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int pricesItem = Integer.parseInt(pricesItems[i]);
                prices[i] = pricesItem;
            }

            int result = maximumToys(prices, k);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }

}
