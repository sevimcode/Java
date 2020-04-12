package whileloops;

import java.util.Scanner;

public class While1 {
    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );


            System.out.println ( "Please enter number" );
            int number = input.nextInt ();
            int i = 0;
            while (i <= number) {
                System.out.println ( i );
            i++;

            }


        }
    }