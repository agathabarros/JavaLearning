import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i = 0; i < 3 ; i++){
                String s1=sc.next();
                int x = sc.nextInt();

                //Complete this line
                System.out.printf("%-15s%03d%n", s1, x);
                // %s is a string, %d is an integer, %n is a new line
                // -15 means left-justified, padded with spaces to a width of 15
                // 03 means zero-padded to a width of 3
    

            }
            System.out.println("================================");
        }
}
