
// whenever given address has illinois in it keep asking address
package whileloops;

import java.util.Scanner;

public class While2 {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );

        System.out.println ( "Put your address :" );
        String address = input.nextLine ();
        int count = 0;
        while (address.contains("illinois")) {
            count++;
            System.out.println ("Enter your address :");
            address = input.nextLine ();

        }
        System.out.println (count);
    }}