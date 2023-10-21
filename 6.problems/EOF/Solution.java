import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*"In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where 
no more data can be read from a data source." — 
(Wikipedia: End-of-file)*/
public class Solution {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int i = 0;
        // scan.hasNext() returns true if this scanner has another token in its input
        while(scan.hasNext()) {
            i++;
            System.out.println(i + " " + scan.nextLine());
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}