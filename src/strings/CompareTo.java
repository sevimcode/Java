
//5) User takes two strings from the user.
//        Compare the Strings and print out the String that comes first lexicographically.
package strings;

import java.util.Scanner;

public class CompareTo {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        System.out.println ( "first word" );
        String str = input.nextLine ();
        System.out.println ( "second word" );
        String str2 = input.nextLine ();

        if (str.compareTo ( str2 ) > 0) {
            System.out.println (""+ str2 + " comes first lexicographically");

        }
        else
        {System.out.println (""+ str + " comes first lexicographically");}




        }
}