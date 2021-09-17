
import java.util.Scanner;
public class NumericTypesOriginal {
    /**
     This program demonstrates how numeric types and operators behave in Java
     Do Task #1 before adding Task#2 where indicated.
     */

        public static void main (String [] args) {
            //TASK #2 Create a Scanner object here
            //identifier declarations

                int Userinput;
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the first score");


            final int NUMBER = 2 ; // number of scores
            int score1 = 100; // first test score
            int score2 = 95; // second test score
            final int BOILING_IN_F = 212; // boiling temperature
            double fToC; // temperature in Celsius
            double average; // arithmetic average
            String output; // line of output to print out
            //Task #2 declare a variable to hold the user’s temperature
            //Task #2 prompt user to input score1

            //Task #2 read score1
            score1 = in.nextInt();
            //Task #2 prompt user to input score2
            System.out.println(" Enter the second score ");
            score2 = in.nextInt();
            //Task #2 read score2
            // Find an arithmetic average
            average = ((double)score1 +score2)/NUMBER;
            output = score1 + " and " + score2 + " have an average of " + average;
            System.out.println(output);
            // Convert Fahrenheit temperatures to Celsius
            fToC = 5/9.0 * (BOILING_IN_F - 32);
            System.out.println("Enter another temperature in Fahrenheit");
                 fToC = in.nextInt();
            double c;
            c =((5)*(fToC-32))/9.0;
            output = BOILING_IN_F + " in Fahrenheit is " + c + " in Celsius.";
            System.out.println(output);
            //Task #2 prompt user to input another temperature
            //Task #2 read the user’s temperature in Fahrenheit
            //Task #2 convert the user’s temperature to Celsius

            //Task #2 print the user’s temperature in Celsius
            System.out.println("Goodbye"); // to show that the program is ended
        }
    }

