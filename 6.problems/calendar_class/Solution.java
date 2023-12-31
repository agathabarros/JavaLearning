import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

     //instance variables is a variable that is declared inside a class but outside a method
        //instance variables are accessible from inside any method in the class
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();

        cal.set(year, month - 1, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekString = "";
        switch(dayOfWeek) {
            case 1:
                dayOfWeekString = "SUNDAY";
                break;
            case 2:
                dayOfWeekString = "MONDAY";
                break;
            case 3:
                dayOfWeekString = "TUESDAY";
                break;
            case 4:
                dayOfWeekString = "WEDNESDAY";
                break;
            case 5:
                dayOfWeekString = "THURSDAY";
                break;
            case 6:
                dayOfWeekString = "FRIDAY";
                break;
            case 7:
                dayOfWeekString = "SATURDAY";
                break;
        }
        return dayOfWeekString;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

