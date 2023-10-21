import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String []argh)
    {


        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        // the first line of input contains an integer t, denoting the number of test cases
        for(int i=0;i<t;i++)
        {
            // try-catch block is used to handle the exception
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                // if the number is between -128 and 127, it can be fitted in a byte
                // byte is a 8-bit signed two's complement integer  
                if(x>=-32768 && x<=32767)System.out.println("* short");
                // if the number is between -32768 and 32767, it can be fitted in a short
                // short is a 16-bit signed two's complement integer
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                // if the number is between -2147483648 and 2147483647, it can be fitted in an int
                // int is a 32-bit signed two's complement integer
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
                // if the number is between -9223372036854775808 and 9223372036854775807, it can be fitted in a long
                // long is a 64-bit signed two's complement integer
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
