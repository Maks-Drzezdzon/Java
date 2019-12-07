package Strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static class Solution {

        // Complete the isBalanced function below.
        static String isBalanced(String s) {
            Stack<Character> stack = new Stack();

            for (int i =0; i<s.length();i++){

                if (s.charAt(i) =='(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                    stack.push(s.charAt(i));
                }else{
                    if (stack.isEmpty()){
                        return "NO";
                    }else{
                        char popped_val = stack.pop();
                        if (s.charAt(i) ==')' && popped_val != '('){
                            return "NO";
                        }else if(s.charAt(i) ==']' && popped_val != '['){
                            return "NO";
                        }else if(s.charAt(i) =='}' && popped_val != '{'){
                            return "NO";
                        }
                    }
                }
            }

            if (stack.isEmpty()){
                return "YES";
            }else{
                return "NO";
            }
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int tItr = 0; tItr < t; tItr++) {
                String s = scanner.nextLine();

                String result = isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            scanner.close();
        }
    }

}