// whether name contains a in it

package strings;

import java.util.Scanner;

public class NameHasA {

    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( " What is your name: " );
        String name = input.nextLine ();


        if (name.isEmpty ()){
            System.out.println ("invalid name");
        }
         else if (name.contains ( "a" ) || name.contains ( "A" )){
            System.out.println ("Cool name");

        }
         else {
            System.out.println ("okay name");
        }


}
}