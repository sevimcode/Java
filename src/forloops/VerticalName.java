//Please write a program that asks the name from user using Scanner and print "Welcome, %name" for 15 times.
package forloops;

import java.util.Scanner;

public class VerticalName {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        System.out.println ( "name :" );
        String name = input.nextLine ();

        for (int i=0 ; i <15 ; i++){
            System.out.println ("welcome " + name + " " +i);
        }
        for (int i=0 ; i <15 ; i+=2){   // writes 2 4 6 8
            System.out.println ("welcome " + name + " " +i);
        }

        int length = name.length ();
        for (int i=0 ; i <length ; i++){ // it will print each character at a time

            System.out.println ("welcome " +  name.charAt ( i ) + " " +i);
        }


    }


}
