package ifElseStatements;

import java.util.Scanner;

public class PassCodeValidation {

    public static void main ( String[] args ) {
            int passCode = 3241;

            Scanner input = new Scanner ( System.in );
            System.out.println ( "what is your password : " );
            int userPassCode = input.nextInt ();


            if (passCode == userPassCode) {
                System.out.println ( " Welcome to iphone" );
            } else if (userPassCode < 0) {
                System.out.println ( " No negative number" );

            } else if (userPassCode > 9999) {
                System.out.println ( " You entered more than 4 digit" );

            } else if (userPassCode < 1000) {
                System.out.println ( " You entered less than 4 digit" );

            } else {
                System.out.println ( " Try again!" );
            }




    }
}