package whileloops;

import java.util.Random;
import java.util.Scanner;

public class DowhileGuessTheNumber {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );

        Random number = new Random ();
        int generated = number.nextInt ( 101 );
        int guess = 0;
        int count = 0;

        do {
            System.out.println ( "put your guess? " );
            guess = input.nextInt ();
            count++;
            if (guess > generated) {
                System.out.println ( "too high" );

            } else if (guess < generated) {
                System.out.println ( "too low" );

            } else {
                System.out.println ( "your guess after" + count + "tries!" );

            }


        } while (guess != generated);

    }
}

