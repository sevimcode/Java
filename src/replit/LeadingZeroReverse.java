package replit;

import java.util.Scanner;

public class LeadingZeroReverse {


    public static void main ( String[] args ) {


        System.out.println ( "Enter a valid 2-4 digit number: " );
        Scanner input = new Scanner ( System.in );
        String value = input.next ();
        int valueInt = Integer.parseInt ( value );


        String valueReversed = new StringBuilder ( value ).reverse ().toString ();

        System.out.println ( "Reversed numbers are: " + valueReversed );

    }
}


