//1) Write a program that asks a user to enter a number corresponding to the day of the week starting from
// 1 being Sunday, 2 being Monday, etc…
//        If the number is not between 1 and 7 print “invalid day”
//        > input: 7
//        > output: Saturday


package ifElseStatements;


import java.util.Scanner;

public class whichDayitis {
    public static void main ( String[] args ) {  //we can make it with switch case


        Scanner input = new Scanner ( System.in );
        System.out.println (" put your number 1 to 7:");
        int number = input.nextInt ();
        boolean numberday = false;
        String day = null;

        if (number == 1) {
            numberday = true;
            day = "Sunday";
        } else if (number == 2) {
            numberday = true;
            day = "Monday";
        } else if (number == 3) {
            numberday = true;
            day = "Tuesday";
        } else if (number == 4) {
            numberday = true;
            day = "Wednesday";
        } else if (number == 5) {
            numberday = true;
            day = "Thursday";
        } else if (number == 6) {
            numberday = true;
            day = "Friday";
        } else if (number == 7) {
            numberday = true;
            day = "Saturday";
        }
      //  else if numberday=false;  instead of writing in other else if's
    if (numberday){
            System.out.println (day);}
    else
        System.out.println (" invalid number");
    }

}