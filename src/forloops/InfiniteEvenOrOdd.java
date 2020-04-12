package forloops;

import java.util.Scanner;

public class InfiniteEvenOrOdd {

    public static void main ( String[] args ) {

        Scanner keyboard = new Scanner ( System.in );

        int i;
        for (i = 1; i <= 4; i++)
            for (i = 1; i <= 2; i++)
            {
                System.out.println ("loop number :"+i);
                System.out.println ( "Enter your number  :" );
                int number = keyboard.nextInt ();
                int result = ( number % 2 );

                if (result == 1) {
                    System.out.println ( "Your number is odd" );

                } else {
                    System.out.println ( "Your number is even" );
                }
            }

    }


}