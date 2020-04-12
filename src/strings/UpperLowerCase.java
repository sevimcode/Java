package strings;

import java.util.Scanner;

public class UpperLowerCase {


    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( " Enter your name: " );
        String name = input.nextLine ();

        String fistLetter = name.substring ( 0,1 );
        fistLetter = fistLetter.toUpperCase ();

        String restoftheword = name.substring ( 1 ).toLowerCase ();
        System.out.println (fistLetter+restoftheword);


    }

}
