package forloops;

import java.util.Scanner;

public class InfiniteEvenOrOdd2 {


        public static void main ( String[] args ) {

            Scanner keyboard = new Scanner ( System.in );

            int i = 1;
            while (i > 0)
                {

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



