import java.util.*;
import java.io.*;


public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a;
            // theses for loops are used to calculate the sum of the series
            // the first for loop is used to calculate the sum of the first term

            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                // the second for loop is used to calculate the sum of the second term
                // Math.pow(2, j) is used to calculate the power of 2
                // the power of 2 is multiplied by b
                // the sum of the first term is added to the sum of the second term
                
                System.out.print(sum + " ");
            }
            System.out.println();

           

        }
        in.close();
    }
    
}
