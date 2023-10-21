import java.util.*;
import java.text.*;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        //The Locale class is an instance of information about a specific locale. 

        // Locale is an object that represents a geographical, political, or cultural region.
        // NumberFormat is the abstract base class for all number formats. This class provides the interface for formatting and parsing numbers.
        // getCurrencyInstance(Locale) Returns a currency format for the specified locale.
        // format(double) Formats a double to produce a string.
    
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}