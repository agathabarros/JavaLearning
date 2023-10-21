import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution2 {
    private static final Scanner scanner = new Scanner(System.in);
    // scanner is a variable of type Scanner. That means it can be used to get input from the user.
    public static void main(String[] args) {
        int N = scanner.nextInt();
        // scanner.nextInt() reads the next token of the input as an int 
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // if N is odd, print Weird
        // if N is even and in the inclusive range of 2 to 5, print Not Weird
        // if N is even and in the inclusive range of 6 to 20, print Weird
        // if N is even and greater than 20, print Not Weird
        if(N % 2 != 0) {
            System.out.println("Weird");
        } else if(N % 2 == 0 && N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if(N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if(N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }
        scanner.close();
        // close the scanner because we are done with it
    }
}
