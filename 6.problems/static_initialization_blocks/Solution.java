import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// public class is a keyword that is used to define a class, in this case, Solution
// Solution is the name of the class
// methods are defined inside the class
// methods are used to perform certain actions
// public means that the method can be called from other classes
// static means that the method can be called without creating an object of the class
// void means that the method has no return value
// main is the name of the method
// String[] args is a parameter of the main method
public class Solution {
    Scanner scan = new Scanner(System.in);
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();

        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        
    }


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


