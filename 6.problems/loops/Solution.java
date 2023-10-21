import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // bufferedReader.readLine() reads a line of input from the user and returns it as a String
        // Integer.parseInt() converts the String to an int
        // trim() removes any leading and trailing white space from the String
        // N is the variable that will hold the int value of the input
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N * i);
            // %d is an integer, %n is a new line
            // N is the variable that holds the int value of the input
            // i is the variable that holds the current value of the loop
            // N * i is the product of N and i
        }



        bufferedReader.close();
    }
}
