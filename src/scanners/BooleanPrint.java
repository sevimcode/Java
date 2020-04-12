
//Write a program that will ask user to enter two characters.
// Declare a boolean with the following value: charOne > charTwo.
// Print the resulting boolean.
package scanners;

import java.util.Scanner;

public class BooleanPrint {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        char one = input.nextLine ().charAt ( 0 );
        char two = input.nextLine ().charAt ( 0 );
        System.out.println (one>two);


    }
}