//3) Ask user to enter their number (Take it as a String). A number can only be valid
//        if it is 10 characters long or is 12 characters with the “(“ and “)” characters in the 1st or 5th characters.
//        Then make sure the number provided contains only numbers and not any other characters.
//        If the number meets the length requirements and has all valid characters print “Valid phone number”
//        If the length requirement is not met or the number contains invalid characters then print “Invalid phone number”
//


package nestedloops;

import java.util.Scanner;

public class ValidPhoneNumber {

    public static void main ( String[] args ) {

        boolean check = false;

        Scanner input = new Scanner ( System.in );
        System.out.print ( "phone number : " );
        String number = input.nextLine ();

        if (number.length () == 10) {
            check = true;
        } else if (number.length () == 12) {

            if (number.charAt ( 0 ) == '(' && number.charAt ( 4 ) == ')') {
                check = true;
                number = number.replace ( "(", "" ).replace ( ")", "" ); // replacing the () with empty

            }
        }

        int count = 0;
        if (check) {
            for (int i = 0; i < number.length (); i++) {

                char c = number.charAt ( i );


                if (c >= 47 && c <= 58) {   // character.isDigit(char c); checks whether char is number or not returns boolean
                    count++;
                }

            }


            if (count == number.length ()) {
                System.out.println ( "Valid Number" );
            } else {
                System.out.println ( "Invalid Number" );
            }

        }else{
            System.out.println ( "Invalid number format" );
        }
     }
    }












