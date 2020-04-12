package ifElseStatements;

import java.util.Scanner;

public class AgeValid {


    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( " What is your age : " );
        int age = input.nextInt ();

        if (age >= 0 && age <= 100) {
            if (age > 30) {
                System.out.println ( "Welcome to building" );
            } else {
                System.out.println ( "Sorry try again when you are 30" );
            }
        } else {
            System.out.println ( "Not a valid age" );
        }

    }

}
