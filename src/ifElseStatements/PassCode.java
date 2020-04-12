package ifElseStatements;

import java.util.Scanner;

public class PassCode {


    public static void main ( String[] args ) {
        int passCode = 3241;

        Scanner input = new Scanner ( System.in );
        System.out.println ("what is your password : ");
        int userPass = input.nextInt ();

        if (passCode == userPass)
        {
            System.out.println ( "Welcome to Iphone" );
        }
        else
            {
            System.out.println ( "Try again!" );
            }


    }
}


