//11) User is asked to enter an account number. You will check if these account numbers are valid.
//        > If the account number begins with a “2” the account number should be 7 characters long
//        > If the account number begins with a “5” the account number should be 10 characters long
//        —> If the account number does not begin
//        with a 2 or a 5 OR the account number lengths do not meet the expected results print “ Invalid account number”
//


package strings;

import java.util.Scanner;

public class StartWith2 {

    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );
        System.out.println ( "account number :" );
        String account = input.nextLine ();

        boolean check = account.startsWith ( "2" ) && account.length () == 7;
        boolean check1 = account.startsWith ( "5" ) && account.length () == 10;

        if (check || check1) { // you can not put and because they are not true at the same time.
            System.out.println ( "Valid account" );
        }
      else System.out.println ("Invalid account");

    }
}