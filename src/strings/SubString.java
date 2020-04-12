//9) Creating an email. Ask user to enter two strings. Both of these strings should be at least 6 character long.
//        If they are shorter than that print “Invalid data” and program should end.
//        If the information provided is valid, you will take the first 4 characters of first string
//        and combine them with the last three characters of the second string. At the end of
//        your combined string add “@cybertek.com” and print the final string as your created email.
//        > input: “JamesBond”, Secret
//        > output: jameret@cybertek.com


package strings;

import java.util.Scanner;

public class SubString {

    public static void main ( String[] args ) {


        Scanner input = new Scanner ( System.in );

        System.out.println ( "String 1:" );
        String str1 = input.nextLine ();
        System.out.println ( "String 2:" );
        String str2 = input.nextLine ();

        int length1 = str1.length ();
        int length2 = str2.length ();

        if (length1 >= 6 && length2 >= 6) {
            System.out.println ( "invalid data" );
        } else {
            String yeni = str1.substring ( 0, 4 ); //takes four characters of String1
            String yeni2 = str2.substring ( ( length2 - 3 ), length2 );
            System.out.println ( "" + yeni + yeni2 + "@cybertek" );


        }


    }
}